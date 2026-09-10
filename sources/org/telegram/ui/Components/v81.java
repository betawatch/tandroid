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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public class v81 extends FrameLayout {
    public static final sr0 S = new sr0(1);
    public float E;
    public boolean F;
    public final int G;
    public boolean H;
    public boolean I;
    public final AnimationNotificationsLocker J;
    public final float K;
    public n81 L;
    public l81 M;
    public final ai.m N;
    public final Rect O;
    public boolean P;
    public ValueAnimator Q;
    public float R;
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

    public v81(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.c = 1.0f;
        this.h = new SparseArray();
        this.J = new AnimationNotificationsLocker();
        this.N = new ai.m(this, 8);
        this.O = new Rect();
        this.P = true;
        this.a = f6Var;
        this.K = AndroidUtilities.getPixelsInCM(0.3f, true);
        this.G = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        this.f = new int[2];
        this.e = new View[2];
        setClipChildren(true);
    }

    public static vl0 p(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt instanceof vl0) {
                return (vl0) childAt;
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
        float f7;
        float f10;
        float f11;
        boolean z10;
        View q6;
        l81 l81Var = this.M;
        if (l81Var == null || !l81Var.J) {
            if (motionEvent != null) {
                if (this.v == null) {
                    this.v = VelocityTracker.obtain();
                }
                this.v.addMovement(motionEvent);
            }
            View[] viewArr = this.e;
            int i10 = 1;
            if (motionEvent != null && motionEvent.getAction() == 0 && m()) {
                this.H = true;
                v();
                this.n = motionEvent.getPointerId(0);
                int x10 = (int) motionEvent.getX();
                this.r = x10;
                if (!this.y) {
                    if (viewArr[1] != null) {
                        if (x10 < viewArr[1].getTranslationX() + r5.getMeasuredWidth()) {
                            F();
                            this.y = true;
                            this.E = viewArr[0].getTranslationX();
                        } else {
                            this.E = viewArr[0].getTranslationX();
                        }
                    }
                } else if (x10 < viewArr[0].getTranslationX() + viewArr[0].getMeasuredWidth()) {
                    this.E = viewArr[0].getTranslationX();
                } else {
                    F();
                    this.y = false;
                    this.E = viewArr[0].getTranslationX();
                }
                this.w.removeAllListeners();
                this.w.cancel();
                this.x = false;
            } else if (motionEvent != null && motionEvent.getAction() == 0) {
                this.E = 0.0f;
            }
            if (this.H || motionEvent == null || (q6 = q(this, motionEvent.getX(), motionEvent.getY())) == null || (!q6.canScrollHorizontally(1) && !q6.canScrollHorizontally(-1))) {
                if (motionEvent != null && motionEvent.getAction() == 0 && !this.H && !this.I) {
                    this.n = motionEvent.getPointerId(0);
                    this.I = true;
                    this.r = (int) motionEvent.getX();
                    this.s = (int) motionEvent.getY();
                } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.n) {
                    int x11 = (int) ((motionEvent.getX() - this.r) + this.E);
                    int abs = Math.abs(((int) motionEvent.getY()) - this.s);
                    if (this.H && (((z10 = this.y) && x11 > 0) || (!z10 && x11 < 0))) {
                        if (!B(motionEvent, x11 < 0)) {
                            this.I = true;
                            this.H = false;
                            E(viewArr[0], 0.0f);
                            View view = viewArr[1];
                            if (view != null) {
                                E(view, this.y ? viewArr[0].getMeasuredWidth() : -viewArr[0].getMeasuredWidth());
                            }
                            this.d = 0;
                            this.c = 1.0f;
                            l81 l81Var2 = this.M;
                            if (l81Var2 != null) {
                                l81Var2.e(1.0f, 0, this.b);
                            }
                            w(false);
                        }
                    }
                    if (this.I && !this.H) {
                        int x12 = (int) (motionEvent.getX() - this.r);
                        if (Math.abs(x12) >= this.K && Math.abs(x12) > abs) {
                            B(motionEvent, x11 < 0);
                        }
                    } else if (this.H) {
                        float abs2 = Math.abs(x11) / viewArr[0].getMeasuredWidth();
                        if (this.d == -1) {
                            this.R = abs2;
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
                        float f12 = 1.0f - abs2;
                        this.c = f12;
                        l81 l81Var3 = this.M;
                        if (l81Var3 != null) {
                            l81Var3.e(f12, this.d, this.b);
                        }
                        w(false);
                    }
                } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.n && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                    VelocityTracker velocityTracker = this.v;
                    if (velocityTracker != null) {
                        velocityTracker.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, this.G);
                    }
                    if (motionEvent == null || motionEvent.getAction() == 3) {
                        f7 = 0.0f;
                        f10 = 0.0f;
                    } else {
                        f7 = this.v.getXVelocity();
                        f10 = this.v.getYVelocity();
                        if (!this.H && Math.abs(f7) >= 3000.0f && Math.abs(f7) > Math.abs(f10)) {
                            B(motionEvent, f7 < 0.0f);
                        }
                    }
                    if (this.H) {
                        float x13 = viewArr[0].getX();
                        this.w = new AnimatorSet();
                        if (this.E == 0.0f) {
                            this.F = Math.abs(x13) < ((float) viewArr[0].getMeasuredWidth()) / 3.0f && (Math.abs(f7) < 3500.0f || Math.abs(f7) < Math.abs(f10));
                        } else if (Math.abs(f7) > 1500.0f) {
                            boolean z11 = this.y ? false : false;
                            this.F = z11;
                        } else if (this.y) {
                            View view3 = viewArr[1];
                            if (view3 != null) {
                                this.F = view3.getX() > ((float) (viewArr[0].getMeasuredWidth() >> 1));
                            } else {
                                this.F = false;
                            }
                        } else {
                            this.F = viewArr[0].getX() < ((float) (viewArr[0].getMeasuredWidth() >> 1));
                        }
                        if (this.F) {
                            f11 = Math.abs(x13);
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
                            f11 = viewArr[0].getMeasuredWidth() - Math.abs(x13);
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
                            f11 = 0.0f;
                        }
                        if (this.d < 0) {
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.R, this.F ? 0.0f : 1.0f);
                            ofFloat.addUpdateListener(new j81(this, i10));
                            this.w.playTogether(ofFloat);
                        }
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat2.addUpdateListener(this.N);
                        this.w.playTogether(ofFloat2);
                        this.w.setInterpolator(S);
                        float measuredWidth = getMeasuredWidth() / 2;
                        float sin = (((float) Math.sin((Math.min(1.0f, (f11 * 1.0f) / r2) - 0.5f) * 0.47123894f)) * measuredWidth) + measuredWidth;
                        this.w.setDuration(Math.max(ImageReceiver.DEFAULT_CROSSFADE_DURATION, Math.min(Math.abs(f7) > 0.0f ? Math.round(Math.abs(sin / r4) * 1000.0f) * 4 : (int) (((f11 / getMeasuredWidth()) + 1.0f) * 100.0f), 600)));
                        this.w.addListener(new k81(this, i10));
                        this.w.start();
                        this.x = true;
                        this.H = false;
                        w(false);
                    } else {
                        this.I = false;
                        l81 l81Var4 = this.M;
                        if (l81Var4 != null) {
                            l81Var4.setEnabled(true);
                        }
                    }
                    VelocityTracker velocityTracker2 = this.v;
                    if (velocityTracker2 != null) {
                        velocityTracker2.recycle();
                        this.v = null;
                    }
                }
                if (this.H || this.I) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean B(MotionEvent motionEvent, boolean z10) {
        if (!z10 && this.b == 0) {
            this.R = 0.0f;
            return false;
        }
        if ((z10 && this.b == this.L.e() - 1) || this.Q != null || !i(motionEvent) || ((z10 && !k(motionEvent)) || (!z10 && !j(motionEvent)))) {
            return false;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        this.I = false;
        this.H = true;
        v();
        this.r = (int) (motionEvent.getX() + this.E);
        l81 l81Var = this.M;
        if (l81Var != null) {
            l81Var.setEnabled(false);
        }
        this.J.lock();
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
        n81 n81Var = this.L;
        n81Var.getClass();
        if (!(n81Var instanceof org.telegram.ui.d7)) {
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
        if (this.L.e() == 0) {
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
        if (this.b > this.L.e() - 1) {
            this.b = this.L.e() - 1;
        }
        if (this.b < 0) {
            this.b = 0;
        }
        int h = this.L.h(this.b);
        int[] iArr = this.f;
        iArr[0] = h;
        View d = this.L.d(h);
        viewArr[0] = d;
        this.L.b(d, this.b, iArr[0]);
        addView(viewArr[0]);
        viewArr[0].setVisibility(0);
        if ((viewArr[0].getTag() == null ? 0 : ((Integer) viewArr[0].getTag()).intValue()) == intValue) {
            z10 = false;
        }
        if (z10) {
            this.M.getClass();
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
        l81 l81Var = this.M;
        l81Var.a = 0.0f;
        l81Var.v.e1();
        this.M.invalidate();
        int i10 = 2;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new j81(this, i10));
        this.w.playTogether(ofFloat);
        this.w.setInterpolator(S);
        this.w.setDuration(220L);
        this.w.addListener(new k81(this, i10));
        this.M.setEnabled(false);
        this.x = true;
        this.w.start();
    }

    public final void D(int i10) {
        if (i10 != this.b) {
            ValueAnimator valueAnimator = this.Q;
            if (valueAnimator == null || this.d != i10) {
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.Q = null;
                }
                int i11 = 0;
                boolean z10 = this.b < i10;
                this.y = z10;
                this.d = i10;
                I(1);
                y(i10, z10);
                View[] viewArr = this.e;
                View view = viewArr[0];
                int measuredWidth = view != null ? view.getMeasuredWidth() : 0;
                if (z10) {
                    E(viewArr[1], measuredWidth);
                } else {
                    E(viewArr[1], -measuredWidth);
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.Q = ofFloat;
                ofFloat.addUpdateListener(new j81(this, i11));
                this.Q.addListener(new k81(this, i11));
                this.Q.setDuration(getManualScrollDuration());
                this.Q.setInterpolator(wr.h);
                this.Q.start();
            }
        }
    }

    public void E(View view, float f7) {
        view.setTranslationX(f7);
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

    public final ValueAnimator H(View view, float f7) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(view.getTranslationX(), f7);
        ofFloat.addUpdateListener(new nx0(this, view, 1));
        ofFloat.addListener(new m81(this, view, f7));
        return ofFloat;
    }

    public final void I(int i10) {
        int i11 = i10 == 0 ? this.b : this.d;
        if (i11 < 0 || i11 >= this.L.e()) {
            return;
        }
        View[] viewArr = this.e;
        View view = viewArr[i10];
        SparseArray sparseArray = this.h;
        int[] iArr = this.f;
        if (view == null) {
            int h = this.L.h(i11);
            iArr[i10] = h;
            View view2 = (View) sparseArray.get(h);
            if (view2 == null) {
                view2 = this.L.d(iArr[i10]);
            } else {
                sparseArray.remove(iArr[i10]);
            }
            if (view2.getParent() != null) {
                ((ViewGroup) view2.getParent()).removeView(view2);
            }
            addView(view2);
            view2.setTranslationX(getMeasuredWidth());
            viewArr[i10] = view2;
            this.L.b(view2, i11, iArr[i10]);
            viewArr[i10].setVisibility(0);
            return;
        }
        if (iArr[i10] == this.L.h(i11)) {
            this.L.b(viewArr[i10], i11, iArr[i10]);
            viewArr[i10].setVisibility(0);
            return;
        }
        sparseArray.put(iArr[i10], viewArr[i10]);
        viewArr[i10].setVisibility(8);
        removeView(viewArr[i10]);
        int h10 = this.L.h(i11);
        iArr[i10] = h10;
        View view3 = (View) sparseArray.get(h10);
        if (view3 == null) {
            view3 = this.L.d(iArr[i10]);
        } else {
            sparseArray.remove(iArr[i10]);
        }
        addView(view3);
        viewArr[i10] = view3;
        view3.setVisibility(0);
        n81 n81Var = this.L;
        n81Var.b(viewArr[i10], i11, n81Var.h(i11));
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i10) {
        if (i10 != 0) {
            if (!this.x && !this.H) {
                boolean z10 = i10 > 0;
                if ((z10 || this.b != 0) && (!z10 || this.b != this.L.e() - 1)) {
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
        float f7;
        View[] viewArr = this.e;
        View view = viewArr[0];
        if (view == null || view.getVisibility() != 0) {
            f7 = 0.0f;
        } else {
            f7 = (this.b * Utilities.clamp(1.0f - Math.abs(viewArr[0].getTranslationX() / getAvailableTranslationX()), 1.0f, 0.0f)) + 0.0f;
        }
        View view2 = viewArr[1];
        if (view2 == null || view2.getVisibility() != 0) {
            return f7;
        }
        return (this.d * Utilities.clamp(1.0f - Math.abs(viewArr[1].getTranslationX() / getAvailableTranslationX()), 1.0f, 0.0f)) + f7;
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
        float f7;
        VelocityTracker velocityTracker = this.v;
        if (velocityTracker != null) {
            velocityTracker.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, this.G);
        }
        if (this.H) {
            View[] viewArr = this.e;
            float x10 = viewArr[0].getX();
            this.w = new AnimatorSet();
            if (this.E == 0.0f) {
                this.F = Math.abs(x10) < ((float) viewArr[0].getMeasuredWidth()) / 3.0f && (Math.abs(0.0f) < 3500.0f || Math.abs(0.0f) < Math.abs(0.0f));
            } else if (Math.abs(0.0f) > 1500.0f) {
                this.F = false;
            } else if (this.y) {
                View view = viewArr[1];
                if (view != null) {
                    this.F = view.getX() > ((float) (viewArr[0].getMeasuredWidth() >> 1));
                } else {
                    this.F = false;
                }
            } else {
                this.F = viewArr[0].getX() < ((float) (viewArr[0].getMeasuredWidth() >> 1));
            }
            if (this.F) {
                f7 = Math.abs(x10);
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
                f7 = viewArr[0].getMeasuredWidth() - Math.abs(x10);
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
                f7 = 0.0f;
            }
            int i10 = 3;
            if (this.d < 0) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.R, this.F ? 0.0f : 1.0f);
                ofFloat.addUpdateListener(new j81(this, i10));
                this.w.playTogether(ofFloat);
            }
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat2.addUpdateListener(this.N);
            this.w.playTogether(ofFloat2);
            this.w.setInterpolator(S);
            float measuredWidth = getMeasuredWidth() / 2;
            float sin = (((float) Math.sin((Math.min(1.0f, (f7 * 1.0f) / r0) - 0.5f) * 0.47123894f)) * measuredWidth) + measuredWidth;
            this.w.setDuration(Math.max(ImageReceiver.DEFAULT_CROSSFADE_DURATION, Math.min(Math.abs(0.0f) > 0.0f ? Math.round(Math.abs(sin / r6) * 1000.0f) * 4 : (int) (((f7 / getMeasuredWidth()) + 1.0f) * 100.0f), 600)));
            this.w.addListener(new k81(this, i10));
            this.w.start();
            this.x = true;
            this.H = false;
            w(false);
        } else {
            this.I = false;
            l81 l81Var = this.M;
            if (l81Var != null) {
                l81Var.setEnabled(true);
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
        boolean z11 = this.F;
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

    public final u81 n(int i10, boolean z10) {
        l81 l81Var = new l81(this, getContext(), z10, i10, this.a);
        this.M = l81Var;
        l81Var.r = G();
        this.M.setDelegate(new l2.h(this, 12));
        o(false);
        return this.M;
    }

    public final void o(boolean z10) {
        l81 l81Var;
        if (this.L == null || (l81Var = this.M) == null) {
            return;
        }
        l81Var.h.clear();
        l81Var.b0.clear();
        l81Var.c0.clear();
        l81Var.d0.clear();
        l81Var.e0.clear();
        l81Var.H = 0;
        for (int i10 = 0; i10 < this.L.e(); i10++) {
            this.L.getClass();
            this.M.a(this.L.f(i10), this.L.g(i10));
        }
        h();
        if (z10) {
            bi.y1 y1Var = this.M.v;
            TransitionSet transitionSet = new TransitionSet();
            ChangeBounds changeBounds = new ChangeBounds();
            changeBounds.setDuration(150L);
            transitionSet.addTransition(new Fade().setDuration(150L)).addTransition(changeBounds);
            transitionSet.setOrdering(0);
            transitionSet.setInterpolator((TimeInterpolator) wr.f);
            TransitionManager.beginDelayedTransition(y1Var, transitionSet);
        }
        this.M.x.l();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        l81 l81Var = this.M;
        if (l81Var != null && l81Var.J) {
            return false;
        }
        if (m()) {
            return true;
        }
        onTouchEvent(motionEvent);
        return this.H;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return A(motionEvent);
    }

    public final View q(ViewGroup viewGroup, float f7, float f10) {
        View q6;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt.getVisibility() == 0) {
                Rect rect = this.O;
                childAt.getHitRect(rect);
                if (!rect.contains((int) f7, (int) f10)) {
                    continue;
                } else {
                    if (childAt.canScrollHorizontally(-1)) {
                        return childAt;
                    }
                    if ((childAt instanceof ViewGroup) && (q6 = q((ViewGroup) childAt, f7 - rect.left, f10 - rect.top)) != null) {
                        return q6;
                    }
                }
            }
        }
        return null;
    }

    public final float r(int i10) {
        return getMeasuredWidth() == 0 ? w7.q.b(1 - Math.abs(getCurrentPosition() - i10), 0, 1) : w7.q.a(1.0f - Math.abs(getPositionAnimated() - i10), 0.0f, 1.0f);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        if (this.P && this.I && !this.H) {
            onTouchEvent(null);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    public void setAdapter(n81 n81Var) {
        this.L = n81Var;
        int h = n81Var.h(this.b);
        int[] iArr = this.f;
        iArr[0] = h;
        View d = n81Var.d(h);
        View[] viewArr = this.e;
        viewArr[0] = d;
        if (d == null && this.b != 0) {
            this.b = 0;
            int h10 = n81Var.h(0);
            iArr[0] = h10;
            viewArr[0] = n81Var.d(h10);
        }
        n81Var.b(viewArr[0], this.b, iArr[0]);
        addView(viewArr[0]);
        viewArr[0].setVisibility(0);
        o(false);
    }

    public void setAllowDisallowInterceptTouch(boolean z10) {
        this.P = z10;
    }

    public void setPosition(int i10) {
        if (this.L == null) {
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
            l81 l81Var = this.M;
            if (l81Var != null) {
                l81Var.e(this.c, this.b, this.d);
            }
            w(true);
        }
    }

    public void y(int i10, boolean z10) {
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

    public void w(boolean z10) {
    }

    public void x(int i10) {
    }

    public void z(int i10) {
    }

    public void t(View view, View view2, int i10, int i11) {
    }
}
