package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.transition.ChangeBounds;
import android.transition.Fade;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class n71 extends FrameLayout {
    public static final rq0 O = new rq0(1);
    public float A;
    public boolean B;
    public final int C;
    public boolean D;
    public boolean E;
    public final AnimationNotificationsLocker F;
    public final float G;
    public e71 H;
    public c71 I;
    public final f2.f0 J;
    public final Rect K;
    public boolean L;
    public ValueAnimator M;
    public float N;
    public final org.telegram.ui.ActionBar.b6 a;
    public int b;
    public float c;
    public int d;
    public final View[] e;
    public final int[] f;
    public final SparseArray h;
    public int n;
    public int r;
    public int s;
    public VelocityTracker v;
    public AnimatorSet w;
    public boolean x;
    public boolean y;

    public n71(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.c = 1.0f;
        this.h = new SparseArray();
        this.F = new AnimationNotificationsLocker();
        this.J = new f2.f0(this, 8);
        this.K = new Rect();
        this.L = true;
        this.a = b6Var;
        this.G = AndroidUtilities.getPixelsInCM(0.3f, true);
        this.C = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        this.f = new int[2];
        this.e = new View[2];
        setClipChildren(true);
    }

    public static wk0 p(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i9 = 0; i9 < viewGroup.getChildCount(); i9++) {
            View childAt = viewGroup.getChildAt(i9);
            if (childAt instanceof wk0) {
                return (wk0) childAt;
            }
            if (childAt instanceof ViewGroup) {
                p(childAt);
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:140:0x027f, code lost:
    
        r7 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean A(MotionEvent motionEvent) {
        float f10;
        float f11;
        float f12;
        boolean z10;
        View q10;
        c71 c71Var = this.I;
        if (c71Var == null || !c71Var.F) {
            if (motionEvent != null) {
                if (this.v == null) {
                    this.v = VelocityTracker.obtain();
                }
                this.v.addMovement(motionEvent);
            }
            View[] viewArr = this.e;
            int i9 = 1;
            if (motionEvent != null && motionEvent.getAction() == 0 && m()) {
                this.D = true;
                v();
                this.n = motionEvent.getPointerId(0);
                int x10 = (int) motionEvent.getX();
                this.r = x10;
                if (!this.y) {
                    if (viewArr[1] != null) {
                        if (x10 < viewArr[1].getTranslationX() + r5.getMeasuredWidth()) {
                            F();
                            this.y = true;
                            this.A = viewArr[0].getTranslationX();
                        } else {
                            this.A = viewArr[0].getTranslationX();
                        }
                    }
                } else if (x10 < viewArr[0].getTranslationX() + viewArr[0].getMeasuredWidth()) {
                    this.A = viewArr[0].getTranslationX();
                } else {
                    F();
                    this.y = false;
                    this.A = viewArr[0].getTranslationX();
                }
                this.w.removeAllListeners();
                this.w.cancel();
                this.x = false;
            } else if (motionEvent != null && motionEvent.getAction() == 0) {
                this.A = 0.0f;
            }
            if (this.D || motionEvent == null || (q10 = q(this, motionEvent.getX(), motionEvent.getY())) == null || (!q10.canScrollHorizontally(1) && !q10.canScrollHorizontally(-1))) {
                if (motionEvent != null && motionEvent.getAction() == 0 && !this.D && !this.E) {
                    this.n = motionEvent.getPointerId(0);
                    this.E = true;
                    this.r = (int) motionEvent.getX();
                    this.s = (int) motionEvent.getY();
                } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.n) {
                    int x11 = (int) ((motionEvent.getX() - this.r) + this.A);
                    int abs = Math.abs(((int) motionEvent.getY()) - this.s);
                    if (this.D && (((z10 = this.y) && x11 > 0) || (!z10 && x11 < 0))) {
                        if (!B(motionEvent, x11 < 0)) {
                            this.E = true;
                            this.D = false;
                            E(viewArr[0], 0.0f);
                            View view = viewArr[1];
                            if (view != null) {
                                E(view, this.y ? viewArr[0].getMeasuredWidth() : -viewArr[0].getMeasuredWidth());
                            }
                            this.d = 0;
                            this.c = 1.0f;
                            c71 c71Var2 = this.I;
                            if (c71Var2 != null) {
                                c71Var2.e(1.0f, 0, this.b);
                            }
                            w(false);
                        }
                    }
                    if (this.E && !this.D) {
                        int x12 = (int) (motionEvent.getX() - this.r);
                        if (Math.abs(x12) >= this.G && Math.abs(x12) > abs) {
                            B(motionEvent, x11 < 0);
                        }
                    } else if (this.D) {
                        float abs2 = Math.abs(x11) / viewArr[0].getMeasuredWidth();
                        if (this.d == -1) {
                            this.N = abs2;
                        } else {
                            E(viewArr[0], x11);
                            View view2 = viewArr[1];
                            if (view2 != null) {
                                if (this.y) {
                                    E(view2, viewArr[0].getMeasuredWidth() + x11);
                                } else {
                                    E(view2, x11 - viewArr[0].getMeasuredWidth());
                                }
                            }
                        }
                        float f13 = 1.0f - abs2;
                        this.c = f13;
                        c71 c71Var3 = this.I;
                        if (c71Var3 != null) {
                            c71Var3.e(f13, this.d, this.b);
                        }
                        w(false);
                    }
                } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.n && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                    VelocityTracker velocityTracker = this.v;
                    if (velocityTracker != null) {
                        velocityTracker.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, this.C);
                    }
                    if (motionEvent == null || motionEvent.getAction() == 3) {
                        f10 = 0.0f;
                        f11 = 0.0f;
                    } else {
                        f10 = this.v.getXVelocity();
                        f11 = this.v.getYVelocity();
                        if (!this.D && Math.abs(f10) >= 3000.0f && Math.abs(f10) > Math.abs(f11)) {
                            B(motionEvent, f10 < 0.0f);
                        }
                    }
                    if (this.D) {
                        float x13 = viewArr[0].getX();
                        this.w = new AnimatorSet();
                        if (this.A == 0.0f) {
                            this.B = Math.abs(x13) < ((float) viewArr[0].getMeasuredWidth()) / 3.0f && (Math.abs(f10) < 3500.0f || Math.abs(f10) < Math.abs(f11));
                        } else if (Math.abs(f10) > 1500.0f) {
                            boolean z11 = this.y ? false : false;
                            this.B = z11;
                        } else if (this.y) {
                            View view3 = viewArr[1];
                            if (view3 != null) {
                                this.B = view3.getX() > ((float) (viewArr[0].getMeasuredWidth() >> 1));
                            } else {
                                this.B = false;
                            }
                        } else {
                            this.B = viewArr[0].getX() < ((float) (viewArr[0].getMeasuredWidth() >> 1));
                        }
                        if (this.B) {
                            f12 = Math.abs(x13);
                            if (this.y) {
                                this.w.playTogether(H(viewArr[0], 0.0f));
                                View view4 = viewArr[1];
                                if (view4 != null) {
                                    this.w.playTogether(H(view4, view4.getMeasuredWidth()));
                                }
                            } else {
                                this.w.playTogether(H(viewArr[0], 0.0f));
                                View view5 = viewArr[1];
                                if (view5 != null) {
                                    this.w.playTogether(H(view5, -view5.getMeasuredWidth()));
                                }
                            }
                        } else if (this.d >= 0) {
                            f12 = viewArr[0].getMeasuredWidth() - Math.abs(x13);
                            if (this.y) {
                                this.w.playTogether(H(viewArr[0], -r8.getMeasuredWidth()));
                                View view6 = viewArr[1];
                                if (view6 != null) {
                                    this.w.playTogether(H(view6, 0.0f));
                                }
                            } else {
                                this.w.playTogether(H(viewArr[0], r8.getMeasuredWidth()));
                                View view7 = viewArr[1];
                                if (view7 != null) {
                                    this.w.playTogether(H(view7, 0.0f));
                                }
                            }
                        } else {
                            f12 = 0.0f;
                        }
                        if (this.d < 0) {
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.N, this.B ? 0.0f : 1.0f);
                            ofFloat.addUpdateListener(new a71(this, i9));
                            this.w.playTogether(ofFloat);
                        }
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat2.addUpdateListener(this.J);
                        this.w.playTogether(ofFloat2);
                        this.w.setInterpolator(O);
                        float measuredWidth = getMeasuredWidth() / 2;
                        float sin = (((float) Math.sin((Math.min(1.0f, (f12 * 1.0f) / r2) - 0.5f) * 0.47123894f)) * measuredWidth) + measuredWidth;
                        this.w.setDuration(Math.max(ImageReceiver.DEFAULT_CROSSFADE_DURATION, Math.min(Math.abs(f10) > 0.0f ? Math.round(Math.abs(sin / r4) * 1000.0f) * 4 : (int) (((f12 / getMeasuredWidth()) + 1.0f) * 100.0f), 600)));
                        this.w.addListener(new b71(this, i9));
                        this.w.start();
                        this.x = true;
                        this.D = false;
                        w(false);
                    } else {
                        this.E = false;
                        c71 c71Var4 = this.I;
                        if (c71Var4 != null) {
                            c71Var4.setEnabled(true);
                        }
                    }
                    VelocityTracker velocityTracker2 = this.v;
                    if (velocityTracker2 != null) {
                        velocityTracker2.recycle();
                        this.v = null;
                    }
                }
                if (this.D || this.E) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean B(MotionEvent motionEvent, boolean z10) {
        if (!z10 && this.b == 0) {
            this.N = 0.0f;
            return false;
        }
        if ((z10 && this.b == this.H.e() - 1) || this.M != null || !i(motionEvent) || ((z10 && !k(motionEvent)) || (!z10 && !j(motionEvent)))) {
            return false;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        this.E = false;
        this.D = true;
        v();
        this.r = (int) (motionEvent.getX() + this.A);
        c71 c71Var = this.I;
        if (c71Var != null) {
            c71Var.setEnabled(false);
        }
        this.F.lock();
        this.y = z10;
        this.d = this.b + (z10 ? 1 : -1);
        I(1);
        View view = this.e[1];
        if (view != null) {
            if (z10) {
                E(view, r5[0].getMeasuredWidth());
            } else {
                E(view, -r5[0].getMeasuredWidth());
            }
        }
        w(false);
        return true;
    }

    public final void C(boolean z10) {
        onTouchEvent(null);
        e71 e71Var = this.H;
        e71Var.getClass();
        if (!(e71Var instanceof org.telegram.ui.d7)) {
            z10 = false;
        }
        AnimatorSet animatorSet = this.w;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.w = null;
        }
        View[] viewArr = this.e;
        View view = viewArr[1];
        if (view != null) {
            removeView(view);
            viewArr[1] = null;
        }
        View view2 = viewArr[0];
        viewArr[1] = view2;
        int intValue = (view2 == null || view2.getTag() == null) ? 0 : ((Integer) viewArr[1].getTag()).intValue();
        if (this.H.e() == 0) {
            View view3 = viewArr[1];
            if (view3 != null) {
                removeView(view3);
                viewArr[1] = null;
            }
            View view4 = viewArr[0];
            if (view4 != null) {
                removeView(view4);
                viewArr[0] = null;
                return;
            }
            return;
        }
        if (this.b > this.H.e() - 1) {
            this.b = this.H.e() - 1;
        }
        if (this.b < 0) {
            this.b = 0;
        }
        int h = this.H.h(this.b);
        int[] iArr = this.f;
        iArr[0] = h;
        View d = this.H.d(h);
        viewArr[0] = d;
        this.H.b(d, this.b, iArr[0]);
        addView(viewArr[0]);
        viewArr[0].setVisibility(0);
        if ((viewArr[0].getTag() == null ? 0 : ((Integer) viewArr[0].getTag()).intValue()) == intValue) {
            z10 = false;
        }
        if (z10) {
            this.I.getClass();
        }
        o(z10);
        if (!z10) {
            View view5 = viewArr[1];
            if (view5 != null) {
                removeView(view5);
                viewArr[1] = null;
                return;
            }
            return;
        }
        this.w = new AnimatorSet();
        View view6 = viewArr[1];
        if (view6 != null) {
            E(view6, 0.0f);
        }
        View view7 = viewArr[0];
        if (view7 != null) {
            E(view7, -getMeasuredWidth());
        }
        View view8 = viewArr[1];
        if (view8 != null) {
            this.w.playTogether(H(view8, getMeasuredWidth()));
        }
        View view9 = viewArr[0];
        if (view9 != null) {
            this.w.playTogether(H(view9, 0.0f));
        }
        w(true);
        c71 c71Var = this.I;
        c71Var.a = 0.0f;
        c71Var.v.f1();
        this.I.invalidate();
        int i9 = 2;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new a71(this, i9));
        this.w.playTogether(ofFloat);
        this.w.setInterpolator(O);
        this.w.setDuration(220L);
        this.w.addListener(new b71(this, i9));
        this.I.setEnabled(false);
        this.x = true;
        this.w.start();
    }

    public final void D(int i9) {
        if (i9 != this.b) {
            ValueAnimator valueAnimator = this.M;
            if (valueAnimator == null || this.d != i9) {
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.M = null;
                }
                int i10 = 0;
                boolean z10 = this.b < i9;
                this.y = z10;
                this.d = i9;
                I(1);
                y(i9, z10);
                View[] viewArr = this.e;
                View view = viewArr[0];
                int measuredWidth = view != null ? view.getMeasuredWidth() : 0;
                if (z10) {
                    E(viewArr[1], measuredWidth);
                } else {
                    E(viewArr[1], -measuredWidth);
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.M = ofFloat;
                ofFloat.addUpdateListener(new a71(this, i10));
                this.M.addListener(new b71(this, i10));
                this.M.setDuration(getManualScrollDuration());
                this.M.setInterpolator(gr.h);
                this.M.start();
            }
        }
    }

    public void E(View view, float f10) {
        view.setTranslationX(f10);
    }

    public void F() {
        View[] viewArr = this.e;
        View view = viewArr[0];
        View view2 = viewArr[1];
        viewArr[0] = view2;
        viewArr[1] = view;
        int i9 = this.b;
        int i10 = this.d;
        this.b = i10;
        this.d = i9;
        this.c = 1.0f - this.c;
        int[] iArr = this.f;
        int i11 = iArr[0];
        iArr[0] = iArr[1];
        iArr[1] = i11;
        t(view2, view, i10, i9);
    }

    public int G() {
        return 16;
    }

    public final ValueAnimator H(View view, float f10) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(view.getTranslationX(), f10);
        ofFloat.addUpdateListener(new kw0(this, view, 1));
        ofFloat.addListener(new d71(this, view, f10));
        return ofFloat;
    }

    public final void I(int i9) {
        int i10 = i9 == 0 ? this.b : this.d;
        if (i10 < 0 || i10 >= this.H.e()) {
            return;
        }
        View[] viewArr = this.e;
        View view = viewArr[i9];
        SparseArray sparseArray = this.h;
        int[] iArr = this.f;
        if (view == null) {
            int h = this.H.h(i10);
            iArr[i9] = h;
            View view2 = (View) sparseArray.get(h);
            if (view2 == null) {
                view2 = this.H.d(iArr[i9]);
            } else {
                sparseArray.remove(iArr[i9]);
            }
            if (view2.getParent() != null) {
                ((ViewGroup) view2.getParent()).removeView(view2);
            }
            addView(view2);
            view2.setTranslationX(getMeasuredWidth());
            viewArr[i9] = view2;
            this.H.b(view2, i10, iArr[i9]);
            viewArr[i9].setVisibility(0);
            return;
        }
        if (iArr[i9] == this.H.h(i10)) {
            this.H.b(viewArr[i9], i10, iArr[i9]);
            viewArr[i9].setVisibility(0);
            return;
        }
        sparseArray.put(iArr[i9], viewArr[i9]);
        viewArr[i9].setVisibility(8);
        removeView(viewArr[i9]);
        int h10 = this.H.h(i10);
        iArr[i9] = h10;
        View view3 = (View) sparseArray.get(h10);
        if (view3 == null) {
            view3 = this.H.d(iArr[i9]);
        } else {
            sparseArray.remove(iArr[i9]);
        }
        addView(view3);
        viewArr[i9] = view3;
        view3.setVisibility(0);
        e71 e71Var = this.H;
        e71Var.b(viewArr[i9], i10, e71Var.h(i10));
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i9) {
        if (i9 != 0) {
            if (!this.x && !this.D) {
                boolean z10 = i9 > 0;
                if ((z10 || this.b != 0) && (!z10 || this.b != this.H.e() - 1)) {
                }
            }
            return true;
        }
        return false;
    }

    public float getAvailableTranslationX() {
        return AndroidUtilities.displaySize.x;
    }

    public int getCurrentPosition() {
        return this.b;
    }

    public float getCurrentPositionAlpha() {
        View[] viewArr = this.e;
        View view = viewArr[0];
        if (view == null || view.getVisibility() != 0) {
            return 0.0f;
        }
        return Utilities.clamp(1.0f - Math.abs(viewArr[0].getTranslationX() / getAvailableTranslationX()), 1.0f, 0.0f);
    }

    public View getCurrentView() {
        return this.e[0];
    }

    public long getManualScrollDuration() {
        return 540L;
    }

    public int getNextPosition() {
        return this.d;
    }

    public float getNextPositionAlpha() {
        View[] viewArr = this.e;
        View view = viewArr[1];
        if (view == null || view.getVisibility() != 0) {
            return 0.0f;
        }
        return Utilities.clamp(1.0f - Math.abs(viewArr[1].getTranslationX() / getAvailableTranslationX()), 1.0f, 0.0f);
    }

    public float getPositionAnimated() {
        float f10;
        View[] viewArr = this.e;
        View view = viewArr[0];
        if (view == null || view.getVisibility() != 0) {
            f10 = 0.0f;
        } else {
            f10 = (this.b * Utilities.clamp(1.0f - Math.abs(viewArr[0].getTranslationX() / getAvailableTranslationX()), 1.0f, 0.0f)) + 0.0f;
        }
        View view2 = viewArr[1];
        if (view2 == null || view2.getVisibility() != 0) {
            return f10;
        }
        return (this.d * Utilities.clamp(1.0f - Math.abs(viewArr[1].getTranslationX() / getAvailableTranslationX()), 1.0f, 0.0f)) + f10;
    }

    public View[] getViewPages() {
        return this.e;
    }

    public boolean i(MotionEvent motionEvent) {
        return true;
    }

    public boolean j(MotionEvent motionEvent) {
        return true;
    }

    public boolean k(MotionEvent motionEvent) {
        return i(motionEvent);
    }

    public final void l() {
        float f10;
        VelocityTracker velocityTracker = this.v;
        if (velocityTracker != null) {
            velocityTracker.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, this.C);
        }
        if (this.D) {
            View[] viewArr = this.e;
            float x10 = viewArr[0].getX();
            this.w = new AnimatorSet();
            if (this.A == 0.0f) {
                this.B = Math.abs(x10) < ((float) viewArr[0].getMeasuredWidth()) / 3.0f && (Math.abs(0.0f) < 3500.0f || Math.abs(0.0f) < Math.abs(0.0f));
            } else if (Math.abs(0.0f) > 1500.0f) {
                this.B = false;
            } else if (this.y) {
                View view = viewArr[1];
                if (view != null) {
                    this.B = view.getX() > ((float) (viewArr[0].getMeasuredWidth() >> 1));
                } else {
                    this.B = false;
                }
            } else {
                this.B = viewArr[0].getX() < ((float) (viewArr[0].getMeasuredWidth() >> 1));
            }
            if (this.B) {
                f10 = Math.abs(x10);
                if (this.y) {
                    this.w.playTogether(H(viewArr[0], 0.0f));
                    View view2 = viewArr[1];
                    if (view2 != null) {
                        this.w.playTogether(H(view2, view2.getMeasuredWidth()));
                    }
                } else {
                    this.w.playTogether(H(viewArr[0], 0.0f));
                    View view3 = viewArr[1];
                    if (view3 != null) {
                        this.w.playTogether(H(view3, -view3.getMeasuredWidth()));
                    }
                }
            } else if (this.d >= 0) {
                f10 = viewArr[0].getMeasuredWidth() - Math.abs(x10);
                if (this.y) {
                    this.w.playTogether(H(viewArr[0], -r6.getMeasuredWidth()));
                    View view4 = viewArr[1];
                    if (view4 != null) {
                        this.w.playTogether(H(view4, 0.0f));
                    }
                } else {
                    this.w.playTogether(H(viewArr[0], r6.getMeasuredWidth()));
                    View view5 = viewArr[1];
                    if (view5 != null) {
                        this.w.playTogether(H(view5, 0.0f));
                    }
                }
            } else {
                f10 = 0.0f;
            }
            int i9 = 3;
            if (this.d < 0) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.N, this.B ? 0.0f : 1.0f);
                ofFloat.addUpdateListener(new a71(this, i9));
                this.w.playTogether(ofFloat);
            }
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat2.addUpdateListener(this.J);
            this.w.playTogether(ofFloat2);
            this.w.setInterpolator(O);
            float measuredWidth = getMeasuredWidth() / 2;
            float sin = (((float) Math.sin((Math.min(1.0f, (f10 * 1.0f) / r0) - 0.5f) * 0.47123894f)) * measuredWidth) + measuredWidth;
            this.w.setDuration(Math.max(ImageReceiver.DEFAULT_CROSSFADE_DURATION, Math.min(Math.abs(0.0f) > 0.0f ? Math.round(Math.abs(sin / r6) * 1000.0f) * 4 : (int) (((f10 / getMeasuredWidth()) + 1.0f) * 100.0f), 600)));
            this.w.addListener(new b71(this, i9));
            this.w.start();
            this.x = true;
            this.D = false;
            w(false);
        } else {
            this.E = false;
            c71 c71Var = this.I;
            if (c71Var != null) {
                c71Var.setEnabled(true);
            }
        }
        VelocityTracker velocityTracker2 = this.v;
        if (velocityTracker2 != null) {
            velocityTracker2.recycle();
            this.v = null;
        }
    }

    public final boolean m() {
        boolean z10;
        if (!this.x) {
            return false;
        }
        boolean z11 = this.B;
        View[] viewArr = this.e;
        if (z11) {
            if (Math.abs(viewArr[0].getTranslationX()) < 1.0f) {
                E(viewArr[0], 0.0f);
                View view = viewArr[1];
                if (view != null) {
                    E(view, viewArr[0].getMeasuredWidth() * (this.y ? 1 : -1));
                }
                z10 = true;
            }
            z10 = false;
        } else {
            if (Math.abs(viewArr[1].getTranslationX()) < 1.0f) {
                E(viewArr[0], r0.getMeasuredWidth() * (this.y ? -1 : 1));
                View view2 = viewArr[1];
                if (view2 != null) {
                    E(view2, 0.0f);
                }
                z10 = true;
            }
            z10 = false;
        }
        w(true);
        if (z10) {
            AnimatorSet animatorSet = this.w;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.w = null;
            }
            this.x = false;
        }
        return this.x;
    }

    public final m71 n(int i9, boolean z10) {
        c71 c71Var = new c71(this, getContext(), z10, i9, this.a);
        this.I = c71Var;
        c71Var.r = G();
        this.I.setDelegate(new n2.p(this, 11));
        o(false);
        return this.I;
    }

    public final void o(boolean z10) {
        c71 c71Var;
        if (this.H == null || (c71Var = this.I) == null) {
            return;
        }
        c71Var.h.clear();
        c71Var.U.clear();
        c71Var.V.clear();
        c71Var.W.clear();
        c71Var.a0.clear();
        c71Var.D = 0;
        for (int i9 = 0; i9 < this.H.e(); i9++) {
            this.H.getClass();
            this.I.a(this.H.f(i9), this.H.g(i9));
        }
        h();
        if (z10) {
            gh.f1 f1Var = this.I.v;
            TransitionSet transitionSet = new TransitionSet();
            ChangeBounds changeBounds = new ChangeBounds();
            changeBounds.setDuration(150L);
            transitionSet.addTransition(new Fade().setDuration(150L)).addTransition(changeBounds);
            transitionSet.setOrdering(0);
            transitionSet.setInterpolator((TimeInterpolator) gr.f);
            TransitionManager.beginDelayedTransition(f1Var, transitionSet);
        }
        this.I.x.l();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        c71 c71Var = this.I;
        if (c71Var != null && c71Var.F) {
            return false;
        }
        if (m()) {
            return true;
        }
        onTouchEvent(motionEvent);
        return this.D;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return A(motionEvent);
    }

    public final View q(ViewGroup viewGroup, float f10, float f11) {
        View q10;
        int childCount = viewGroup.getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = viewGroup.getChildAt(i9);
            if (childAt.getVisibility() == 0) {
                Rect rect = this.K;
                childAt.getHitRect(rect);
                if (!rect.contains((int) f10, (int) f11)) {
                    continue;
                } else {
                    if (childAt.canScrollHorizontally(-1)) {
                        return childAt;
                    }
                    if ((childAt instanceof ViewGroup) && (q10 = q((ViewGroup) childAt, f10 - rect.left, f11 - rect.top)) != null) {
                        return q10;
                    }
                }
            }
        }
        return null;
    }

    public final float r(int i9) {
        return getMeasuredWidth() == 0 ? g7.n.b(1 - Math.abs(getCurrentPosition() - i9), 0, 1) : g7.n.a(1.0f - Math.abs(getPositionAnimated() - i9), 0.0f, 1.0f);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        if (this.L && this.E && !this.D) {
            onTouchEvent(null);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    public void setAdapter(e71 e71Var) {
        this.H = e71Var;
        int h = e71Var.h(this.b);
        int[] iArr = this.f;
        iArr[0] = h;
        View d = e71Var.d(h);
        View[] viewArr = this.e;
        viewArr[0] = d;
        if (d == null && this.b != 0) {
            this.b = 0;
            int h10 = e71Var.h(0);
            iArr[0] = h10;
            viewArr[0] = e71Var.d(h10);
        }
        e71Var.b(viewArr[0], this.b, iArr[0]);
        addView(viewArr[0]);
        viewArr[0].setVisibility(0);
        o(false);
    }

    public void setAllowDisallowInterceptTouch(boolean z10) {
        this.L = z10;
    }

    public void setPosition(int i9) {
        if (this.H == null) {
            this.b = i9;
            w(false);
        }
        AnimatorSet animatorSet = this.w;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        View[] viewArr = this.e;
        View view = viewArr[1];
        if (view != null) {
            this.h.put(this.f[1], view);
            removeView(viewArr[1]);
            viewArr[1] = null;
        }
        int i10 = this.b;
        if (i10 != i9) {
            this.b = i9;
            this.d = 0;
            this.c = 1.0f;
            View view2 = viewArr[0];
            I(0);
            t(viewArr[0], view2, this.b, i10);
            E(viewArr[0], 0.0f);
            c71 c71Var = this.I;
            if (c71Var != null) {
                c71Var.e(this.c, this.b, this.d);
            }
            w(true);
        }
    }

    public void y(int i9, boolean z10) {
        x(i9);
    }

    public void h() {
    }

    public void s() {
    }

    public void u() {
    }

    public void v() {
    }

    public void w(boolean z10) {
    }

    public void x(int i9) {
    }

    public void z(int i9) {
    }

    public void t(View view, View view2, int i9, int i10) {
    }
}
