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
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public class v61 extends FrameLayout {
    public static final qp0 U = new qp0(1);
    public boolean D;
    public float E;
    public boolean F;
    public final int G;
    public boolean H;
    public boolean I;
    public final h2.f J;
    public final float K;
    public m61 L;
    public k61 M;
    public final di.m4 N;
    public final Rect O;
    public boolean P;
    public final ArrayList Q;
    public final ArrayList R;
    public ValueAnimator S;
    public float T;
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
    public VelocityTracker w;
    public AnimatorSet x;
    public boolean y;

    public v61(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.c = 1.0f;
        this.h = new SparseArray();
        this.J = new h2.f((int[]) null);
        this.N = new di.m4(this, 10);
        this.O = new Rect();
        this.P = true;
        this.Q = new ArrayList();
        this.R = new ArrayList();
        this.a = f6Var;
        this.K = org.telegram.messenger.g0.a1(true, 0.3f);
        this.G = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        this.f = new int[2];
        this.e = new View[2];
        setClipChildren(true);
    }

    public static pj0 p(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
            View childAt = viewGroup.getChildAt(i7);
            if (childAt instanceof pj0) {
                return (pj0) childAt;
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
    public boolean B(MotionEvent motionEvent) {
        float f10;
        float f11;
        float f12;
        boolean z9;
        View q10;
        k61 k61Var = this.M;
        if (k61Var == null || !k61Var.J) {
            if (motionEvent != null) {
                if (this.w == null) {
                    this.w = VelocityTracker.obtain();
                }
                this.w.addMovement(motionEvent);
            }
            View[] viewArr = this.e;
            int i7 = 1;
            if (motionEvent != null && motionEvent.getAction() == 0 && m()) {
                this.H = true;
                v();
                this.n = motionEvent.getPointerId(0);
                int x10 = (int) motionEvent.getX();
                this.r = x10;
                if (!this.D) {
                    if (viewArr[1] != null) {
                        if (x10 < viewArr[1].getTranslationX() + r5.getMeasuredWidth()) {
                            G();
                            this.D = true;
                            this.E = viewArr[0].getTranslationX();
                        } else {
                            this.E = viewArr[0].getTranslationX();
                        }
                    }
                } else if (x10 < viewArr[0].getTranslationX() + viewArr[0].getMeasuredWidth()) {
                    this.E = viewArr[0].getTranslationX();
                } else {
                    G();
                    this.D = false;
                    this.E = viewArr[0].getTranslationX();
                }
                this.x.removeAllListeners();
                this.x.cancel();
                this.y = false;
            } else if (motionEvent != null && motionEvent.getAction() == 0) {
                this.E = 0.0f;
            }
            if (this.H || motionEvent == null || (q10 = q(this, motionEvent.getX(), motionEvent.getY())) == null || (!q10.canScrollHorizontally(1) && !q10.canScrollHorizontally(-1))) {
                if (motionEvent != null && motionEvent.getAction() == 0 && !this.H && !this.I) {
                    this.n = motionEvent.getPointerId(0);
                    this.I = true;
                    this.r = (int) motionEvent.getX();
                    this.s = (int) motionEvent.getY();
                } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.n) {
                    int x11 = (int) ((motionEvent.getX() - this.r) + this.E);
                    int abs = Math.abs(((int) motionEvent.getY()) - this.s);
                    if (this.H && (((z9 = this.D) && x11 > 0) || (!z9 && x11 < 0))) {
                        if (!C(motionEvent, x11 < 0)) {
                            this.I = true;
                            this.H = false;
                            F(viewArr[0], 0.0f);
                            View view = viewArr[1];
                            if (view != null) {
                                F(view, this.D ? viewArr[0].getMeasuredWidth() : -viewArr[0].getMeasuredWidth());
                            }
                            this.d = 0;
                            this.c = 1.0f;
                            k61 k61Var2 = this.M;
                            if (k61Var2 != null) {
                                k61Var2.e(1.0f, 0, this.b);
                            }
                            x(false);
                        }
                    }
                    if (this.I && !this.H) {
                        int x12 = (int) (motionEvent.getX() - this.r);
                        if (Math.abs(x12) >= this.K && Math.abs(x12) > abs) {
                            C(motionEvent, x11 < 0);
                        }
                    } else if (this.H) {
                        float abs2 = Math.abs(x11) / viewArr[0].getMeasuredWidth();
                        if (this.d == -1) {
                            this.T = abs2;
                        } else {
                            F(viewArr[0], x11);
                            View view2 = viewArr[1];
                            if (view2 != null) {
                                if (this.D) {
                                    F(view2, viewArr[0].getMeasuredWidth() + x11);
                                } else {
                                    F(view2, x11 - viewArr[0].getMeasuredWidth());
                                }
                            }
                        }
                        float f13 = 1.0f - abs2;
                        this.c = f13;
                        k61 k61Var3 = this.M;
                        if (k61Var3 != null) {
                            k61Var3.e(f13, this.d, this.b);
                        }
                        x(false);
                    }
                } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.n && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                    VelocityTracker velocityTracker = this.w;
                    if (velocityTracker != null) {
                        velocityTracker.computeCurrentVelocity(1000, this.G);
                    }
                    if (motionEvent == null || motionEvent.getAction() == 3) {
                        f10 = 0.0f;
                        f11 = 0.0f;
                    } else {
                        f10 = this.w.getXVelocity();
                        f11 = this.w.getYVelocity();
                        if (!this.H && Math.abs(f10) >= 3000.0f && Math.abs(f10) > Math.abs(f11)) {
                            C(motionEvent, f10 < 0.0f);
                        }
                    }
                    if (this.H) {
                        float x13 = viewArr[0].getX();
                        this.x = new AnimatorSet();
                        if (this.E == 0.0f) {
                            this.F = Math.abs(x13) < ((float) viewArr[0].getMeasuredWidth()) / 3.0f && (Math.abs(f10) < 3500.0f || Math.abs(f10) < Math.abs(f11));
                        } else if (Math.abs(f10) > 1500.0f) {
                            boolean z10 = this.D ? false : false;
                            this.F = z10;
                        } else if (this.D) {
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
                            f12 = Math.abs(x13);
                            if (this.D) {
                                this.x.playTogether(I(viewArr[0], 0.0f));
                                View view4 = viewArr[1];
                                if (view4 != null) {
                                    this.x.playTogether(I(view4, view4.getMeasuredWidth()));
                                }
                            } else {
                                this.x.playTogether(I(viewArr[0], 0.0f));
                                View view5 = viewArr[1];
                                if (view5 != null) {
                                    this.x.playTogether(I(view5, -view5.getMeasuredWidth()));
                                }
                            }
                        } else if (this.d >= 0) {
                            f12 = viewArr[0].getMeasuredWidth() - Math.abs(x13);
                            if (this.D) {
                                this.x.playTogether(I(viewArr[0], -r8.getMeasuredWidth()));
                                View view6 = viewArr[1];
                                if (view6 != null) {
                                    this.x.playTogether(I(view6, 0.0f));
                                }
                            } else {
                                this.x.playTogether(I(viewArr[0], r8.getMeasuredWidth()));
                                View view7 = viewArr[1];
                                if (view7 != null) {
                                    this.x.playTogether(I(view7, 0.0f));
                                }
                            }
                        } else {
                            f12 = 0.0f;
                        }
                        if (this.d < 0) {
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.T, this.F ? 0.0f : 1.0f);
                            ofFloat.addUpdateListener(new i61(this, i7));
                            this.x.playTogether(ofFloat);
                        }
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat2.addUpdateListener(this.N);
                        this.x.playTogether(ofFloat2);
                        this.x.setInterpolator(U);
                        float measuredWidth = getMeasuredWidth() / 2;
                        float sin = (((float) Math.sin((Math.min(1.0f, (f12 * 1.0f) / r2) - 0.5f) * 0.47123894f)) * measuredWidth) + measuredWidth;
                        this.x.setDuration(Math.max(org.telegram.messenger.qs.g2, Math.min(Math.abs(f10) > 0.0f ? Math.round(Math.abs(sin / r4) * 1000.0f) * 4 : (int) (((f12 / getMeasuredWidth()) + 1.0f) * 100.0f), 600)));
                        this.x.addListener(new j61(this, i7));
                        this.x.start();
                        this.y = true;
                        this.H = false;
                        x(false);
                    } else {
                        this.I = false;
                        k61 k61Var4 = this.M;
                        if (k61Var4 != null) {
                            k61Var4.setEnabled(true);
                        }
                    }
                    VelocityTracker velocityTracker2 = this.w;
                    if (velocityTracker2 != null) {
                        velocityTracker2.recycle();
                        this.w = null;
                    }
                }
                if (this.H || this.I) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean C(MotionEvent motionEvent, boolean z9) {
        if (!z9 && this.b == 0) {
            this.T = 0.0f;
            return false;
        }
        if ((z9 && this.b == this.L.e() - 1) || this.S != null || !b(motionEvent) || ((z9 && !k(motionEvent)) || (!z9 && !j(motionEvent)))) {
            return false;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        this.I = false;
        this.H = true;
        v();
        this.r = (int) (motionEvent.getX() + this.E);
        k61 k61Var = this.M;
        if (k61Var != null) {
            k61Var.setEnabled(false);
        }
        this.J.d();
        this.D = z9;
        this.d = this.b + (z9 ? 1 : -1);
        K(1);
        View view = this.e[1];
        if (view != null) {
            if (z9) {
                F(view, r5[0].getMeasuredWidth());
            } else {
                F(view, -r5[0].getMeasuredWidth());
            }
        }
        x(false);
        return true;
    }

    public final void D(boolean z9) {
        onTouchEvent(null);
        m61 m61Var = this.L;
        m61Var.getClass();
        if (!(m61Var instanceof org.telegram.ui.d7)) {
            z9 = false;
        }
        AnimatorSet animatorSet = this.x;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.x = null;
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
            z9 = false;
        }
        if (z9) {
            this.M.getClass();
        }
        o(z9);
        if (!z9) {
            View view5 = viewArr[1];
            if (view5 != null) {
                removeView(view5);
                viewArr[1] = null;
                return;
            }
            return;
        }
        this.x = new AnimatorSet();
        View view6 = viewArr[1];
        if (view6 != null) {
            F(view6, 0.0f);
        }
        View view7 = viewArr[0];
        if (view7 != null) {
            F(view7, -getMeasuredWidth());
        }
        View view8 = viewArr[1];
        if (view8 != null) {
            this.x.playTogether(I(view8, getMeasuredWidth()));
        }
        View view9 = viewArr[0];
        if (view9 != null) {
            this.x.playTogether(I(view9, 0.0f));
        }
        x(true);
        k61 k61Var = this.M;
        k61Var.a = 0.0f;
        k61Var.w.g1();
        this.M.invalidate();
        int i7 = 2;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new i61(this, i7));
        this.x.playTogether(ofFloat);
        this.x.setInterpolator(U);
        this.x.setDuration(220L);
        this.x.addListener(new j61(this, i7));
        this.M.setEnabled(false);
        this.y = true;
        this.x.start();
    }

    public final boolean E(int i7) {
        ValueAnimator valueAnimator;
        int i10 = 0;
        if (i7 == this.b || ((valueAnimator = this.S) != null && this.d == i7)) {
            return false;
        }
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.S = null;
        }
        boolean z9 = this.b < i7;
        this.D = z9;
        this.d = i7;
        K(1);
        z(i7, z9);
        View[] viewArr = this.e;
        View view = viewArr[0];
        int measuredWidth = view != null ? view.getMeasuredWidth() : 0;
        if (z9) {
            F(viewArr[1], measuredWidth);
        } else {
            F(viewArr[1], -measuredWidth);
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.S = ofFloat;
        ofFloat.addUpdateListener(new i61(this, i10));
        this.S.addListener(new j61(this, i10));
        this.S.setDuration(getManualScrollDuration());
        this.S.setInterpolator(xq.h);
        this.S.start();
        return true;
    }

    public void F(View view, float f10) {
        int i7;
        int round = Math.round(f10);
        int round2 = Math.round(view.getTranslationX());
        view.setTranslationX(round);
        if (view != this.e[0] || (i7 = round2 - round) == 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.R;
            if (i10 >= arrayList.size()) {
                return;
            }
            ((oi.g) arrayList.get(i10)).a.h(i7, 0);
            i10++;
        }
    }

    public void G() {
        View[] viewArr = this.e;
        View view = viewArr[0];
        View view2 = viewArr[1];
        viewArr[0] = view2;
        viewArr[1] = view;
        int i7 = this.b;
        int i10 = this.d;
        this.b = i10;
        this.d = i7;
        this.c = 1.0f - this.c;
        int[] iArr = this.f;
        int i11 = iArr[0];
        iArr[0] = iArr[1];
        iArr[1] = i11;
        t(view2, view, i10, i7);
    }

    public int H() {
        return 16;
    }

    public final ValueAnimator I(View view, float f10) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(view.getTranslationX(), f10);
        ofFloat.addUpdateListener(new ev0(this, view, 1));
        ofFloat.addListener(new l61(this, view, f10));
        return ofFloat;
    }

    public final void J() {
        int[] iArr = this.f;
        if (iArr[0] != this.L.h(this.b)) {
            K(0);
            View[] viewArr = this.e;
            View view = viewArr[1];
            if (view != null) {
                this.h.put(iArr[1], view);
                removeView(viewArr[1]);
                viewArr[1] = null;
            }
            F(viewArr[0], 0.0f);
            x(true);
        }
    }

    public final void K(int i7) {
        int i10 = i7 == 0 ? this.b : this.d;
        if (i10 < 0 || i10 >= this.L.e()) {
            return;
        }
        View[] viewArr = this.e;
        View view = viewArr[i7];
        SparseArray sparseArray = this.h;
        int[] iArr = this.f;
        if (view == null) {
            int h = this.L.h(i10);
            iArr[i7] = h;
            View view2 = (View) sparseArray.get(h);
            if (view2 == null) {
                view2 = this.L.d(iArr[i7]);
            } else {
                sparseArray.remove(iArr[i7]);
            }
            if (view2.getParent() != null) {
                ((ViewGroup) view2.getParent()).removeView(view2);
            }
            addView(view2);
            view2.setTranslationX(i7 != 0 ? getMeasuredWidth() : 0.0f);
            viewArr[i7] = view2;
            this.L.b(view2, i10, iArr[i7]);
            viewArr[i7].setVisibility(0);
            return;
        }
        if (iArr[i7] == this.L.h(i10)) {
            this.L.b(viewArr[i7], i10, iArr[i7]);
            viewArr[i7].setVisibility(0);
            return;
        }
        sparseArray.put(iArr[i7], viewArr[i7]);
        viewArr[i7].setVisibility(8);
        removeView(viewArr[i7]);
        int h7 = this.L.h(i10);
        iArr[i7] = h7;
        View view3 = (View) sparseArray.get(h7);
        if (view3 == null) {
            view3 = this.L.d(iArr[i7]);
        } else {
            sparseArray.remove(iArr[i7]);
        }
        view3.setTranslationX(i7 != 0 ? getMeasuredWidth() : 0.0f);
        addView(view3);
        viewArr[i7] = view3;
        view3.setVisibility(0);
        m61 m61Var = this.L;
        m61Var.b(viewArr[i7], i10, m61Var.h(i10));
    }

    public boolean b(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i7) {
        if (i7 != 0) {
            if (!this.y && !this.H) {
                boolean z9 = i7 > 0;
                if ((z9 || this.b != 0) && (!z9 || this.b != this.L.e() - 1)) {
                }
            }
            return true;
        }
        return false;
    }

    public float getAvailableTranslationX() {
        return org.telegram.messenger.g0.q.x;
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
        return Utilities.i(1.0f - Math.abs(viewArr[0].getTranslationX() / getAvailableTranslationX()), 1.0f, 0.0f);
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
        return Utilities.i(1.0f - Math.abs(viewArr[1].getTranslationX() / getAvailableTranslationX()), 1.0f, 0.0f);
    }

    public float getPositionAnimated() {
        float f10;
        View[] viewArr = this.e;
        View view = viewArr[0];
        if (view == null || view.getVisibility() != 0) {
            f10 = 0.0f;
        } else {
            f10 = (this.b * Utilities.i(1.0f - Math.abs(viewArr[0].getTranslationX() / getAvailableTranslationX()), 1.0f, 0.0f)) + 0.0f;
        }
        View view2 = viewArr[1];
        if (view2 == null || view2.getVisibility() != 0) {
            return f10;
        }
        return (this.d * Utilities.i(1.0f - Math.abs(viewArr[1].getTranslationX() / getAvailableTranslationX()), 1.0f, 0.0f)) + f10;
    }

    public View[] getViewPages() {
        return this.e;
    }

    public boolean j(MotionEvent motionEvent) {
        return true;
    }

    public boolean k(MotionEvent motionEvent) {
        return b(motionEvent);
    }

    public final void l() {
        float f10;
        VelocityTracker velocityTracker = this.w;
        if (velocityTracker != null) {
            velocityTracker.computeCurrentVelocity(1000, this.G);
        }
        if (this.H) {
            View[] viewArr = this.e;
            float x10 = viewArr[0].getX();
            this.x = new AnimatorSet();
            if (this.E == 0.0f) {
                this.F = Math.abs(x10) < ((float) viewArr[0].getMeasuredWidth()) / 3.0f && (Math.abs(0.0f) < 3500.0f || Math.abs(0.0f) < Math.abs(0.0f));
            } else if (Math.abs(0.0f) > 1500.0f) {
                this.F = false;
            } else if (this.D) {
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
                f10 = Math.abs(x10);
                if (this.D) {
                    this.x.playTogether(I(viewArr[0], 0.0f));
                    View view2 = viewArr[1];
                    if (view2 != null) {
                        this.x.playTogether(I(view2, view2.getMeasuredWidth()));
                    }
                } else {
                    this.x.playTogether(I(viewArr[0], 0.0f));
                    View view3 = viewArr[1];
                    if (view3 != null) {
                        this.x.playTogether(I(view3, -view3.getMeasuredWidth()));
                    }
                }
            } else if (this.d >= 0) {
                f10 = viewArr[0].getMeasuredWidth() - Math.abs(x10);
                if (this.D) {
                    this.x.playTogether(I(viewArr[0], -r6.getMeasuredWidth()));
                    View view4 = viewArr[1];
                    if (view4 != null) {
                        this.x.playTogether(I(view4, 0.0f));
                    }
                } else {
                    this.x.playTogether(I(viewArr[0], r6.getMeasuredWidth()));
                    View view5 = viewArr[1];
                    if (view5 != null) {
                        this.x.playTogether(I(view5, 0.0f));
                    }
                }
            } else {
                f10 = 0.0f;
            }
            int i7 = 3;
            if (this.d < 0) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.T, this.F ? 0.0f : 1.0f);
                ofFloat.addUpdateListener(new i61(this, i7));
                this.x.playTogether(ofFloat);
            }
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat2.addUpdateListener(this.N);
            this.x.playTogether(ofFloat2);
            this.x.setInterpolator(U);
            float measuredWidth = getMeasuredWidth() / 2;
            float sin = (((float) Math.sin((Math.min(1.0f, (f10 * 1.0f) / r0) - 0.5f) * 0.47123894f)) * measuredWidth) + measuredWidth;
            this.x.setDuration(Math.max(org.telegram.messenger.qs.g2, Math.min(Math.abs(0.0f) > 0.0f ? Math.round(Math.abs(sin / r6) * 1000.0f) * 4 : (int) (((f10 / getMeasuredWidth()) + 1.0f) * 100.0f), 600)));
            this.x.addListener(new j61(this, i7));
            this.x.start();
            this.y = true;
            this.H = false;
            x(false);
        } else {
            this.I = false;
            k61 k61Var = this.M;
            if (k61Var != null) {
                k61Var.setEnabled(true);
            }
        }
        VelocityTracker velocityTracker2 = this.w;
        if (velocityTracker2 != null) {
            velocityTracker2.recycle();
            this.w = null;
        }
    }

    public final boolean m() {
        boolean z9;
        if (!this.y) {
            return false;
        }
        boolean z10 = this.F;
        View[] viewArr = this.e;
        if (z10) {
            if (Math.abs(viewArr[0].getTranslationX()) < 1.0f) {
                F(viewArr[0], 0.0f);
                View view = viewArr[1];
                if (view != null) {
                    F(view, viewArr[0].getMeasuredWidth() * (this.D ? 1 : -1));
                }
                z9 = true;
            }
            z9 = false;
        } else {
            if (Math.abs(viewArr[1].getTranslationX()) < 1.0f) {
                F(viewArr[0], r0.getMeasuredWidth() * (this.D ? -1 : 1));
                View view2 = viewArr[1];
                if (view2 != null) {
                    F(view2, 0.0f);
                }
                z9 = true;
            }
            z9 = false;
        }
        x(true);
        if (z9) {
            AnimatorSet animatorSet = this.x;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.x = null;
            }
            this.y = false;
        }
        return this.y;
    }

    public final u61 n(int i7, boolean z9) {
        k61 k61Var = new k61(this, getContext(), z9, i7, this.a);
        this.M = k61Var;
        k61Var.r = H();
        this.M.setDelegate(new n(this));
        o(false);
        return this.M;
    }

    public final void o(boolean z9) {
        k61 k61Var;
        if (this.L == null || (k61Var = this.M) == null) {
            return;
        }
        k61Var.h.clear();
        k61Var.b0.clear();
        k61Var.c0.clear();
        k61Var.d0.clear();
        k61Var.e0.clear();
        k61Var.H = 0;
        for (int i7 = 0; i7 < this.L.e(); i7++) {
            this.L.getClass();
            this.M.a(this.L.f(i7), this.L.g(i7));
        }
        a();
        if (z9) {
            bi.q1 q1Var = this.M.w;
            TransitionSet transitionSet = new TransitionSet();
            ChangeBounds changeBounds = new ChangeBounds();
            changeBounds.setDuration(150L);
            transitionSet.addTransition(new Fade().setDuration(150L)).addTransition(changeBounds);
            transitionSet.setOrdering(0);
            transitionSet.setInterpolator((TimeInterpolator) xq.f);
            TransitionManager.beginDelayedTransition(q1Var, transitionSet);
        }
        this.M.y.f();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        k61 k61Var = this.M;
        if (k61Var != null && k61Var.J) {
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
        return B(motionEvent);
    }

    public final View q(ViewGroup viewGroup, float f10, float f11) {
        View q10;
        int childCount = viewGroup.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = viewGroup.getChildAt(i7);
            if (childAt.getVisibility() == 0) {
                Rect rect = this.O;
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

    public final float r(int i7) {
        return getMeasuredWidth() == 0 ? c8.j9.b(1 - Math.abs(getCurrentPosition() - i7), 0, 1) : c8.j9.a(1.0f - Math.abs(getPositionAnimated() - i7), 0.0f, 1.0f);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z9) {
        if (this.P && this.I && !this.H) {
            onTouchEvent(null);
        }
        super.requestDisallowInterceptTouchEvent(z9);
    }

    public void setAdapter(m61 m61Var) {
        this.L = m61Var;
        int h = m61Var.h(this.b);
        int[] iArr = this.f;
        iArr[0] = h;
        View d = m61Var.d(h);
        View[] viewArr = this.e;
        viewArr[0] = d;
        if (d == null && this.b != 0) {
            this.b = 0;
            int h7 = m61Var.h(0);
            iArr[0] = h7;
            viewArr[0] = m61Var.d(h7);
        }
        m61Var.b(viewArr[0], this.b, iArr[0]);
        addView(viewArr[0]);
        viewArr[0].setVisibility(0);
        o(false);
    }

    public void setAllowDisallowInterceptTouch(boolean z9) {
        this.P = z9;
    }

    public void setPosition(int i7) {
        if (this.L == null) {
            this.b = i7;
            x(false);
        }
        AnimatorSet animatorSet = this.x;
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
        if (i10 != i7) {
            this.b = i7;
            this.d = 0;
            this.c = 1.0f;
            View view2 = viewArr[0];
            K(0);
            t(viewArr[0], view2, this.b, i10);
            F(viewArr[0], 0.0f);
            k61 k61Var = this.M;
            if (k61Var != null) {
                k61Var.e(this.c, this.d, this.b);
            }
            x(true);
        }
    }

    public final void x(boolean z9) {
        Iterator it = this.Q.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        w(z9);
    }

    public void z(int i7, boolean z9) {
        y(i7);
    }

    public void A(int i7) {
    }

    public void w(boolean z9) {
    }

    public void y(int i7) {
    }

    public void a() {
    }

    public void s() {
    }

    public void u() {
    }

    public void v() {
    }

    public void t(View view, View view2, int i7, int i10) {
    }
}
