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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public class l81 extends FrameLayout {
    public static final kr0 P = new kr0(1);
    public float B;
    public boolean C;
    public final int D;
    public boolean E;
    public boolean F;
    public final AnimationNotificationsLocker G;
    public final float H;
    public c81 I;
    public a81 J;
    public final eg.b1 K;
    public final Rect L;
    public boolean M;
    public ValueAnimator N;
    public float O;
    public final org.telegram.ui.ActionBar.f6 a;
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

    public l81(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.c = 1.0f;
        this.h = new SparseArray();
        this.G = new AnimationNotificationsLocker();
        this.K = new eg.b1(this, 8);
        this.L = new Rect();
        this.M = true;
        this.a = f6Var;
        this.H = AndroidUtilities.getPixelsInCM(0.3f, true);
        this.D = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        this.f = new int[2];
        this.e = new View[2];
        setClipChildren(true);
    }

    public static sl0 p(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt instanceof sl0) {
                return (sl0) childAt;
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
        boolean z4;
        View q10;
        a81 a81Var = this.J;
        if (a81Var == null || !a81Var.G) {
            if (motionEvent != null) {
                if (this.v == null) {
                    this.v = VelocityTracker.obtain();
                }
                this.v.addMovement(motionEvent);
            }
            View[] viewArr = this.e;
            int i10 = 1;
            if (motionEvent != null && motionEvent.getAction() == 0 && m()) {
                this.E = true;
                v();
                this.n = motionEvent.getPointerId(0);
                int x10 = (int) motionEvent.getX();
                this.r = x10;
                if (!this.y) {
                    if (viewArr[1] != null) {
                        if (x10 < viewArr[1].getTranslationX() + r5.getMeasuredWidth()) {
                            F();
                            this.y = true;
                            this.B = viewArr[0].getTranslationX();
                        } else {
                            this.B = viewArr[0].getTranslationX();
                        }
                    }
                } else if (x10 < viewArr[0].getTranslationX() + viewArr[0].getMeasuredWidth()) {
                    this.B = viewArr[0].getTranslationX();
                } else {
                    F();
                    this.y = false;
                    this.B = viewArr[0].getTranslationX();
                }
                this.w.removeAllListeners();
                this.w.cancel();
                this.x = false;
            } else if (motionEvent != null && motionEvent.getAction() == 0) {
                this.B = 0.0f;
            }
            if (this.E || motionEvent == null || (q10 = q(this, motionEvent.getX(), motionEvent.getY())) == null || (!q10.canScrollHorizontally(1) && !q10.canScrollHorizontally(-1))) {
                if (motionEvent != null && motionEvent.getAction() == 0 && !this.E && !this.F) {
                    this.n = motionEvent.getPointerId(0);
                    this.F = true;
                    this.r = (int) motionEvent.getX();
                    this.s = (int) motionEvent.getY();
                } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.n) {
                    int x11 = (int) ((motionEvent.getX() - this.r) + this.B);
                    int abs = Math.abs(((int) motionEvent.getY()) - this.s);
                    if (this.E && (((z4 = this.y) && x11 > 0) || (!z4 && x11 < 0))) {
                        if (!B(motionEvent, x11 < 0)) {
                            this.F = true;
                            this.E = false;
                            E(viewArr[0], 0.0f);
                            View view = viewArr[1];
                            if (view != null) {
                                E(view, this.y ? viewArr[0].getMeasuredWidth() : -viewArr[0].getMeasuredWidth());
                            }
                            this.d = 0;
                            this.c = 1.0f;
                            a81 a81Var2 = this.J;
                            if (a81Var2 != null) {
                                a81Var2.e(1.0f, 0, this.b);
                            }
                            w(false);
                        }
                    }
                    if (this.F && !this.E) {
                        int x12 = (int) (motionEvent.getX() - this.r);
                        if (Math.abs(x12) >= this.H && Math.abs(x12) > abs) {
                            B(motionEvent, x11 < 0);
                        }
                    } else if (this.E) {
                        float abs2 = Math.abs(x11) / viewArr[0].getMeasuredWidth();
                        if (this.d == -1) {
                            this.O = abs2;
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
                        a81 a81Var3 = this.J;
                        if (a81Var3 != null) {
                            a81Var3.e(f13, this.d, this.b);
                        }
                        w(false);
                    }
                } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.n && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                    VelocityTracker velocityTracker = this.v;
                    if (velocityTracker != null) {
                        velocityTracker.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, this.D);
                    }
                    if (motionEvent == null || motionEvent.getAction() == 3) {
                        f10 = 0.0f;
                        f11 = 0.0f;
                    } else {
                        f10 = this.v.getXVelocity();
                        f11 = this.v.getYVelocity();
                        if (!this.E && Math.abs(f10) >= 3000.0f && Math.abs(f10) > Math.abs(f11)) {
                            B(motionEvent, f10 < 0.0f);
                        }
                    }
                    if (this.E) {
                        float x13 = viewArr[0].getX();
                        this.w = new AnimatorSet();
                        if (this.B == 0.0f) {
                            this.C = Math.abs(x13) < ((float) viewArr[0].getMeasuredWidth()) / 3.0f && (Math.abs(f10) < 3500.0f || Math.abs(f10) < Math.abs(f11));
                        } else if (Math.abs(f10) > 1500.0f) {
                            boolean z10 = this.y ? false : false;
                            this.C = z10;
                        } else if (this.y) {
                            View view3 = viewArr[1];
                            if (view3 != null) {
                                this.C = view3.getX() > ((float) (viewArr[0].getMeasuredWidth() >> 1));
                            } else {
                                this.C = false;
                            }
                        } else {
                            this.C = viewArr[0].getX() < ((float) (viewArr[0].getMeasuredWidth() >> 1));
                        }
                        if (this.C) {
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
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.O, this.C ? 0.0f : 1.0f);
                            ofFloat.addUpdateListener(new y71(this, i10));
                            this.w.playTogether(ofFloat);
                        }
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat2.addUpdateListener(this.K);
                        this.w.playTogether(ofFloat2);
                        this.w.setInterpolator(P);
                        float measuredWidth = getMeasuredWidth() / 2;
                        float sin = (((float) Math.sin((Math.min(1.0f, (f12 * 1.0f) / r2) - 0.5f) * 0.47123894f)) * measuredWidth) + measuredWidth;
                        this.w.setDuration(Math.max(ImageReceiver.DEFAULT_CROSSFADE_DURATION, Math.min(Math.abs(f10) > 0.0f ? Math.round(Math.abs(sin / r4) * 1000.0f) * 4 : (int) (((f12 / getMeasuredWidth()) + 1.0f) * 100.0f), 600)));
                        this.w.addListener(new z71(this, i10));
                        this.w.start();
                        this.x = true;
                        this.E = false;
                        w(false);
                    } else {
                        this.F = false;
                        a81 a81Var4 = this.J;
                        if (a81Var4 != null) {
                            a81Var4.setEnabled(true);
                        }
                    }
                    VelocityTracker velocityTracker2 = this.v;
                    if (velocityTracker2 != null) {
                        velocityTracker2.recycle();
                        this.v = null;
                    }
                }
                if (this.E || this.F) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean B(MotionEvent motionEvent, boolean z4) {
        if (!z4 && this.b == 0) {
            this.O = 0.0f;
            return false;
        }
        if ((z4 && this.b == this.I.e() - 1) || this.N != null || !i(motionEvent) || ((z4 && !k(motionEvent)) || (!z4 && !j(motionEvent)))) {
            return false;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        this.F = false;
        this.E = true;
        v();
        this.r = (int) (motionEvent.getX() + this.B);
        a81 a81Var = this.J;
        if (a81Var != null) {
            a81Var.setEnabled(false);
        }
        this.G.lock();
        this.y = z4;
        this.d = this.b + (z4 ? 1 : -1);
        I(1);
        View view = this.e[1];
        if (view != null) {
            if (z4) {
                E(view, r5[0].getMeasuredWidth());
            } else {
                E(view, -r5[0].getMeasuredWidth());
            }
        }
        w(false);
        return true;
    }

    public final void C(boolean z4) {
        onTouchEvent(null);
        c81 c81Var = this.I;
        c81Var.getClass();
        if (!(c81Var instanceof org.telegram.ui.g7)) {
            z4 = false;
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
        if (this.I.e() == 0) {
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
        if (this.b > this.I.e() - 1) {
            this.b = this.I.e() - 1;
        }
        if (this.b < 0) {
            this.b = 0;
        }
        int h = this.I.h(this.b);
        int[] iArr = this.f;
        iArr[0] = h;
        View d = this.I.d(h);
        viewArr[0] = d;
        this.I.b(d, this.b, iArr[0]);
        addView(viewArr[0]);
        viewArr[0].setVisibility(0);
        if ((viewArr[0].getTag() == null ? 0 : ((Integer) viewArr[0].getTag()).intValue()) == intValue) {
            z4 = false;
        }
        if (z4) {
            this.J.getClass();
        }
        o(z4);
        if (!z4) {
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
        a81 a81Var = this.J;
        a81Var.a = 0.0f;
        a81Var.v.f1();
        this.J.invalidate();
        int i10 = 2;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new y71(this, i10));
        this.w.playTogether(ofFloat);
        this.w.setInterpolator(P);
        this.w.setDuration(220L);
        this.w.addListener(new z71(this, i10));
        this.J.setEnabled(false);
        this.x = true;
        this.w.start();
    }

    public final void D(int i10) {
        if (i10 != this.b) {
            ValueAnimator valueAnimator = this.N;
            if (valueAnimator == null || this.d != i10) {
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.N = null;
                }
                int i11 = 0;
                boolean z4 = this.b < i10;
                this.y = z4;
                this.d = i10;
                I(1);
                y(i10, z4);
                View[] viewArr = this.e;
                View view = viewArr[0];
                int measuredWidth = view != null ? view.getMeasuredWidth() : 0;
                if (z4) {
                    E(viewArr[1], measuredWidth);
                } else {
                    E(viewArr[1], -measuredWidth);
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.N = ofFloat;
                ofFloat.addUpdateListener(new y71(this, i11));
                this.N.addListener(new z71(this, i11));
                this.N.setDuration(getManualScrollDuration());
                this.N.setInterpolator(nr.h);
                this.N.start();
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
        int i10 = this.b;
        int i11 = this.d;
        this.b = i11;
        this.d = i10;
        this.c = 1.0f - this.c;
        int[] iArr = this.f;
        int i12 = iArr[0];
        iArr[0] = iArr[1];
        iArr[1] = i12;
        t(view2, view, i11, i10);
    }

    public int G() {
        return 16;
    }

    public final ValueAnimator H(View view, float f10) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(view.getTranslationX(), f10);
        ofFloat.addUpdateListener(new dx0(this, view, 1));
        ofFloat.addListener(new b81(this, view, f10));
        return ofFloat;
    }

    public final void I(int i10) {
        int i11 = i10 == 0 ? this.b : this.d;
        if (i11 < 0 || i11 >= this.I.e()) {
            return;
        }
        View[] viewArr = this.e;
        View view = viewArr[i10];
        SparseArray sparseArray = this.h;
        int[] iArr = this.f;
        if (view == null) {
            int h = this.I.h(i11);
            iArr[i10] = h;
            View view2 = (View) sparseArray.get(h);
            if (view2 == null) {
                view2 = this.I.d(iArr[i10]);
            } else {
                sparseArray.remove(iArr[i10]);
            }
            if (view2.getParent() != null) {
                ((ViewGroup) view2.getParent()).removeView(view2);
            }
            addView(view2);
            view2.setTranslationX(getMeasuredWidth());
            viewArr[i10] = view2;
            this.I.b(view2, i11, iArr[i10]);
            viewArr[i10].setVisibility(0);
            return;
        }
        if (iArr[i10] == this.I.h(i11)) {
            this.I.b(viewArr[i10], i11, iArr[i10]);
            viewArr[i10].setVisibility(0);
            return;
        }
        sparseArray.put(iArr[i10], viewArr[i10]);
        viewArr[i10].setVisibility(8);
        removeView(viewArr[i10]);
        int h9 = this.I.h(i11);
        iArr[i10] = h9;
        View view3 = (View) sparseArray.get(h9);
        if (view3 == null) {
            view3 = this.I.d(iArr[i10]);
        } else {
            sparseArray.remove(iArr[i10]);
        }
        addView(view3);
        viewArr[i10] = view3;
        view3.setVisibility(0);
        c81 c81Var = this.I;
        c81Var.b(viewArr[i10], i11, c81Var.h(i11));
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i10) {
        if (i10 != 0) {
            if (!this.x && !this.E) {
                boolean z4 = i10 > 0;
                if ((z4 || this.b != 0) && (!z4 || this.b != this.I.e() - 1)) {
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
            velocityTracker.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, this.D);
        }
        if (this.E) {
            View[] viewArr = this.e;
            float x10 = viewArr[0].getX();
            this.w = new AnimatorSet();
            if (this.B == 0.0f) {
                this.C = Math.abs(x10) < ((float) viewArr[0].getMeasuredWidth()) / 3.0f && (Math.abs(0.0f) < 3500.0f || Math.abs(0.0f) < Math.abs(0.0f));
            } else if (Math.abs(0.0f) > 1500.0f) {
                this.C = false;
            } else if (this.y) {
                View view = viewArr[1];
                if (view != null) {
                    this.C = view.getX() > ((float) (viewArr[0].getMeasuredWidth() >> 1));
                } else {
                    this.C = false;
                }
            } else {
                this.C = viewArr[0].getX() < ((float) (viewArr[0].getMeasuredWidth() >> 1));
            }
            if (this.C) {
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
            int i10 = 3;
            if (this.d < 0) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.O, this.C ? 0.0f : 1.0f);
                ofFloat.addUpdateListener(new y71(this, i10));
                this.w.playTogether(ofFloat);
            }
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat2.addUpdateListener(this.K);
            this.w.playTogether(ofFloat2);
            this.w.setInterpolator(P);
            float measuredWidth = getMeasuredWidth() / 2;
            float sin = (((float) Math.sin((Math.min(1.0f, (f10 * 1.0f) / r0) - 0.5f) * 0.47123894f)) * measuredWidth) + measuredWidth;
            this.w.setDuration(Math.max(ImageReceiver.DEFAULT_CROSSFADE_DURATION, Math.min(Math.abs(0.0f) > 0.0f ? Math.round(Math.abs(sin / r6) * 1000.0f) * 4 : (int) (((f10 / getMeasuredWidth()) + 1.0f) * 100.0f), 600)));
            this.w.addListener(new z71(this, i10));
            this.w.start();
            this.x = true;
            this.E = false;
            w(false);
        } else {
            this.F = false;
            a81 a81Var = this.J;
            if (a81Var != null) {
                a81Var.setEnabled(true);
            }
        }
        VelocityTracker velocityTracker2 = this.v;
        if (velocityTracker2 != null) {
            velocityTracker2.recycle();
            this.v = null;
        }
    }

    public final boolean m() {
        boolean z4;
        if (!this.x) {
            return false;
        }
        boolean z10 = this.C;
        View[] viewArr = this.e;
        if (z10) {
            if (Math.abs(viewArr[0].getTranslationX()) < 1.0f) {
                E(viewArr[0], 0.0f);
                View view = viewArr[1];
                if (view != null) {
                    E(view, viewArr[0].getMeasuredWidth() * (this.y ? 1 : -1));
                }
                z4 = true;
            }
            z4 = false;
        } else {
            if (Math.abs(viewArr[1].getTranslationX()) < 1.0f) {
                E(viewArr[0], r0.getMeasuredWidth() * (this.y ? -1 : 1));
                View view2 = viewArr[1];
                if (view2 != null) {
                    E(view2, 0.0f);
                }
                z4 = true;
            }
            z4 = false;
        }
        w(true);
        if (z4) {
            AnimatorSet animatorSet = this.w;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.w = null;
            }
            this.x = false;
        }
        return this.x;
    }

    public final k81 n(int i10, boolean z4) {
        a81 a81Var = new a81(this, getContext(), z4, i10, this.a);
        this.J = a81Var;
        a81Var.r = G();
        this.J.setDelegate(new o2.o(this, 8));
        o(false);
        return this.J;
    }

    public final void o(boolean z4) {
        a81 a81Var;
        if (this.I == null || (a81Var = this.J) == null) {
            return;
        }
        a81Var.h.clear();
        a81Var.V.clear();
        a81Var.W.clear();
        a81Var.a0.clear();
        a81Var.b0.clear();
        a81Var.E = 0;
        for (int i10 = 0; i10 < this.I.e(); i10++) {
            this.I.getClass();
            this.J.a(this.I.f(i10), this.I.g(i10));
        }
        h();
        if (z4) {
            lh.e1 e1Var = this.J.v;
            TransitionSet transitionSet = new TransitionSet();
            ChangeBounds changeBounds = new ChangeBounds();
            changeBounds.setDuration(150L);
            transitionSet.addTransition(new Fade().setDuration(150L)).addTransition(changeBounds);
            transitionSet.setOrdering(0);
            transitionSet.setInterpolator((TimeInterpolator) nr.f);
            TransitionManager.beginDelayedTransition(e1Var, transitionSet);
        }
        this.J.x.l();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        a81 a81Var = this.J;
        if (a81Var != null && a81Var.G) {
            return false;
        }
        if (m()) {
            return true;
        }
        onTouchEvent(motionEvent);
        return this.E;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return A(motionEvent);
    }

    public final View q(ViewGroup viewGroup, float f10, float f11) {
        View q10;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt.getVisibility() == 0) {
                Rect rect = this.L;
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

    public final float r(int i10) {
        return getMeasuredWidth() == 0 ? k7.n.b(1 - Math.abs(getCurrentPosition() - i10), 0, 1) : k7.n.a(1.0f - Math.abs(getPositionAnimated() - i10), 0.0f, 1.0f);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z4) {
        if (this.M && this.F && !this.E) {
            onTouchEvent(null);
        }
        super.requestDisallowInterceptTouchEvent(z4);
    }

    public void setAdapter(c81 c81Var) {
        this.I = c81Var;
        int h = c81Var.h(this.b);
        int[] iArr = this.f;
        iArr[0] = h;
        View d = c81Var.d(h);
        View[] viewArr = this.e;
        viewArr[0] = d;
        if (d == null && this.b != 0) {
            this.b = 0;
            int h9 = c81Var.h(0);
            iArr[0] = h9;
            viewArr[0] = c81Var.d(h9);
        }
        c81Var.b(viewArr[0], this.b, iArr[0]);
        addView(viewArr[0]);
        viewArr[0].setVisibility(0);
        o(false);
    }

    public void setAllowDisallowInterceptTouch(boolean z4) {
        this.M = z4;
    }

    public void setPosition(int i10) {
        if (this.I == null) {
            this.b = i10;
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
        int i11 = this.b;
        if (i11 != i10) {
            this.b = i10;
            this.d = 0;
            this.c = 1.0f;
            View view2 = viewArr[0];
            I(0);
            t(viewArr[0], view2, this.b, i11);
            E(viewArr[0], 0.0f);
            a81 a81Var = this.J;
            if (a81Var != null) {
                a81Var.e(this.c, this.b, this.d);
            }
            w(true);
        }
    }

    public void y(int i10, boolean z4) {
        x(i10);
    }

    public void h() {
    }

    public void s() {
    }

    public void u() {
    }

    public void v() {
    }

    public void w(boolean z4) {
    }

    public void x(int i10) {
    }

    public void z(int i10) {
    }

    public void t(View view, View view2, int i10, int i11) {
    }
}
