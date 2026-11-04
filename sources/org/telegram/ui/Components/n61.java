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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class n61 extends FrameLayout {
    public static final qp0 V = new qp0(1);
    public boolean E;
    public float F;
    public boolean G;
    public final int H;
    public boolean I;
    public boolean J;
    public final g2.g K;
    public final float L;
    public f61 M;
    public d61 N;
    public final ei.n4 O;
    public final Rect P;
    public boolean Q;
    public final ArrayList R;
    public final ArrayList S;
    public ValueAnimator T;
    public float U;
    public final org.telegram.ui.ActionBar.e6 a;
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

    public n61(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.c = 1.0f;
        this.h = new SparseArray();
        this.K = new g2.g((int[]) null);
        this.O = new ei.n4(this, 10);
        this.P = new Rect();
        this.Q = true;
        this.R = new ArrayList();
        this.S = new ArrayList();
        this.a = e6Var;
        this.L = org.telegram.messenger.g0.a1(true, 0.3f);
        this.H = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        this.f = new int[2];
        this.e = new View[2];
        setClipChildren(true);
    }

    public static tj0 l(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
            View childAt = viewGroup.getChildAt(i3);
            if (childAt instanceof tj0) {
                return (tj0) childAt;
            }
            if (childAt instanceof ViewGroup) {
                l(childAt);
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
    public boolean A(MotionEvent motionEvent) {
        float f10;
        float f11;
        float f12;
        boolean z10;
        View m10;
        d61 d61Var = this.N;
        if (d61Var == null || !d61Var.K) {
            if (motionEvent != null) {
                if (this.w == null) {
                    this.w = VelocityTracker.obtain();
                }
                this.w.addMovement(motionEvent);
            }
            View[] viewArr = this.e;
            int i3 = 1;
            if (motionEvent != null && motionEvent.getAction() == 0 && i()) {
                this.I = true;
                t();
                this.n = motionEvent.getPointerId(0);
                int x10 = (int) motionEvent.getX();
                this.r = x10;
                if (!this.E) {
                    if (viewArr[1] != null) {
                        if (x10 < viewArr[1].getTranslationX() + r5.getMeasuredWidth()) {
                            F();
                            this.E = true;
                            this.F = viewArr[0].getTranslationX();
                        } else {
                            this.F = viewArr[0].getTranslationX();
                        }
                    }
                } else if (x10 < viewArr[0].getTranslationX() + viewArr[0].getMeasuredWidth()) {
                    this.F = viewArr[0].getTranslationX();
                } else {
                    F();
                    this.E = false;
                    this.F = viewArr[0].getTranslationX();
                }
                this.x.removeAllListeners();
                this.x.cancel();
                this.y = false;
            } else if (motionEvent != null && motionEvent.getAction() == 0) {
                this.F = 0.0f;
            }
            if (this.I || motionEvent == null || (m10 = m(this, motionEvent.getX(), motionEvent.getY())) == null || (!m10.canScrollHorizontally(1) && !m10.canScrollHorizontally(-1))) {
                if (motionEvent != null && motionEvent.getAction() == 0 && !this.I && !this.J) {
                    this.n = motionEvent.getPointerId(0);
                    this.J = true;
                    this.r = (int) motionEvent.getX();
                    this.s = (int) motionEvent.getY();
                } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.n) {
                    int x11 = (int) ((motionEvent.getX() - this.r) + this.F);
                    int abs = Math.abs(((int) motionEvent.getY()) - this.s);
                    if (this.I && (((z10 = this.E) && x11 > 0) || (!z10 && x11 < 0))) {
                        if (!B(motionEvent, x11 < 0)) {
                            this.J = true;
                            this.I = false;
                            E(viewArr[0], 0.0f);
                            View view = viewArr[1];
                            if (view != null) {
                                E(view, this.E ? viewArr[0].getMeasuredWidth() : -viewArr[0].getMeasuredWidth());
                            }
                            this.d = 0;
                            this.c = 1.0f;
                            d61 d61Var2 = this.N;
                            if (d61Var2 != null) {
                                d61Var2.e(1.0f, 0, this.b);
                            }
                            v(false);
                        }
                    }
                    if (this.J && !this.I) {
                        int x12 = (int) (motionEvent.getX() - this.r);
                        if (Math.abs(x12) >= this.L && Math.abs(x12) > abs) {
                            B(motionEvent, x11 < 0);
                        }
                    } else if (this.I) {
                        float abs2 = Math.abs(x11) / viewArr[0].getMeasuredWidth();
                        if (this.d == -1) {
                            this.U = abs2;
                        } else {
                            E(viewArr[0], x11);
                            View view2 = viewArr[1];
                            if (view2 != null) {
                                if (this.E) {
                                    E(view2, viewArr[0].getMeasuredWidth() + x11);
                                } else {
                                    E(view2, x11 - viewArr[0].getMeasuredWidth());
                                }
                            }
                        }
                        float f13 = 1.0f - abs2;
                        this.c = f13;
                        d61 d61Var3 = this.N;
                        if (d61Var3 != null) {
                            d61Var3.e(f13, this.d, this.b);
                        }
                        v(false);
                    }
                } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.n && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                    VelocityTracker velocityTracker = this.w;
                    if (velocityTracker != null) {
                        velocityTracker.computeCurrentVelocity(1000, this.H);
                    }
                    if (motionEvent == null || motionEvent.getAction() == 3) {
                        f10 = 0.0f;
                        f11 = 0.0f;
                    } else {
                        f10 = this.w.getXVelocity();
                        f11 = this.w.getYVelocity();
                        if (!this.I && Math.abs(f10) >= 3000.0f && Math.abs(f10) > Math.abs(f11)) {
                            B(motionEvent, f10 < 0.0f);
                        }
                    }
                    if (this.I) {
                        float x13 = viewArr[0].getX();
                        this.x = new AnimatorSet();
                        if (this.F == 0.0f) {
                            this.G = Math.abs(x13) < ((float) viewArr[0].getMeasuredWidth()) / 3.0f && (Math.abs(f10) < 3500.0f || Math.abs(f10) < Math.abs(f11));
                        } else if (Math.abs(f10) > 1500.0f) {
                            boolean z11 = this.E ? false : false;
                            this.G = z11;
                        } else if (this.E) {
                            View view3 = viewArr[1];
                            if (view3 != null) {
                                this.G = view3.getX() > ((float) (viewArr[0].getMeasuredWidth() >> 1));
                            } else {
                                this.G = false;
                            }
                        } else {
                            this.G = viewArr[0].getX() < ((float) (viewArr[0].getMeasuredWidth() >> 1));
                        }
                        if (this.G) {
                            f12 = Math.abs(x13);
                            if (this.E) {
                                this.x.playTogether(H(viewArr[0], 0.0f));
                                View view4 = viewArr[1];
                                if (view4 != null) {
                                    this.x.playTogether(H(view4, view4.getMeasuredWidth()));
                                }
                            } else {
                                this.x.playTogether(H(viewArr[0], 0.0f));
                                View view5 = viewArr[1];
                                if (view5 != null) {
                                    this.x.playTogether(H(view5, -view5.getMeasuredWidth()));
                                }
                            }
                        } else if (this.d >= 0) {
                            f12 = viewArr[0].getMeasuredWidth() - Math.abs(x13);
                            if (this.E) {
                                this.x.playTogether(H(viewArr[0], -r8.getMeasuredWidth()));
                                View view6 = viewArr[1];
                                if (view6 != null) {
                                    this.x.playTogether(H(view6, 0.0f));
                                }
                            } else {
                                this.x.playTogether(H(viewArr[0], r8.getMeasuredWidth()));
                                View view7 = viewArr[1];
                                if (view7 != null) {
                                    this.x.playTogether(H(view7, 0.0f));
                                }
                            }
                        } else {
                            f12 = 0.0f;
                        }
                        if (this.d < 0) {
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.U, this.G ? 0.0f : 1.0f);
                            ofFloat.addUpdateListener(new b61(this, i3));
                            this.x.playTogether(ofFloat);
                        }
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat2.addUpdateListener(this.O);
                        this.x.playTogether(ofFloat2);
                        this.x.setInterpolator(V);
                        float measuredWidth = getMeasuredWidth() / 2;
                        float sin = (((float) Math.sin((Math.min(1.0f, (f12 * 1.0f) / r2) - 0.5f) * 0.47123894f)) * measuredWidth) + measuredWidth;
                        this.x.setDuration(Math.max(org.telegram.messenger.hs.g2, Math.min(Math.abs(f10) > 0.0f ? Math.round(Math.abs(sin / r4) * 1000.0f) * 4 : (int) (((f12 / getMeasuredWidth()) + 1.0f) * 100.0f), 600)));
                        this.x.addListener(new c61(this, i3));
                        this.x.start();
                        this.y = true;
                        this.I = false;
                        v(false);
                    } else {
                        this.J = false;
                        d61 d61Var4 = this.N;
                        if (d61Var4 != null) {
                            d61Var4.setEnabled(true);
                        }
                    }
                    VelocityTracker velocityTracker2 = this.w;
                    if (velocityTracker2 != null) {
                        velocityTracker2.recycle();
                        this.w = null;
                    }
                }
                if (this.I || this.J) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean B(MotionEvent motionEvent, boolean z10) {
        if (!z10 && this.b == 0) {
            this.U = 0.0f;
            return false;
        }
        if ((z10 && this.b == this.M.e() - 1) || this.T != null || !c(motionEvent) || ((z10 && !f(motionEvent)) || (!z10 && !e(motionEvent)))) {
            return false;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        this.J = false;
        this.I = true;
        t();
        this.r = (int) (motionEvent.getX() + this.F);
        d61 d61Var = this.N;
        if (d61Var != null) {
            d61Var.setEnabled(false);
        }
        this.K.d();
        this.E = z10;
        this.d = this.b + (z10 ? 1 : -1);
        K(1);
        View view = this.e[1];
        if (view != null) {
            if (z10) {
                E(view, r5[0].getMeasuredWidth());
            } else {
                E(view, -r5[0].getMeasuredWidth());
            }
        }
        v(false);
        return true;
    }

    public final void C(boolean z10) {
        onTouchEvent(null);
        f61 f61Var = this.M;
        f61Var.getClass();
        if (!(f61Var instanceof org.telegram.ui.e7)) {
            z10 = false;
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
        if (this.M.e() == 0) {
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
        if (this.b > this.M.e() - 1) {
            this.b = this.M.e() - 1;
        }
        if (this.b < 0) {
            this.b = 0;
        }
        int h = this.M.h(this.b);
        int[] iArr = this.f;
        iArr[0] = h;
        View d = this.M.d(h);
        viewArr[0] = d;
        this.M.b(d, this.b, iArr[0]);
        addView(viewArr[0]);
        viewArr[0].setVisibility(0);
        if ((viewArr[0].getTag() == null ? 0 : ((Integer) viewArr[0].getTag()).intValue()) == intValue) {
            z10 = false;
        }
        if (z10) {
            this.N.getClass();
        }
        k(z10);
        if (!z10) {
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
            E(view6, 0.0f);
        }
        View view7 = viewArr[0];
        if (view7 != null) {
            E(view7, -getMeasuredWidth());
        }
        View view8 = viewArr[1];
        if (view8 != null) {
            this.x.playTogether(H(view8, getMeasuredWidth()));
        }
        View view9 = viewArr[0];
        if (view9 != null) {
            this.x.playTogether(H(view9, 0.0f));
        }
        v(true);
        d61 d61Var = this.N;
        d61Var.a = 0.0f;
        d61Var.w.g1();
        this.N.invalidate();
        int i3 = 2;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new b61(this, i3));
        this.x.playTogether(ofFloat);
        this.x.setInterpolator(V);
        this.x.setDuration(220L);
        this.x.addListener(new c61(this, i3));
        this.N.setEnabled(false);
        this.y = true;
        this.x.start();
    }

    public final boolean D(int i3) {
        ValueAnimator valueAnimator;
        int i10 = 0;
        if (i3 == this.b || ((valueAnimator = this.T) != null && this.d == i3)) {
            return false;
        }
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.T = null;
        }
        boolean z10 = this.b < i3;
        this.E = z10;
        this.d = i3;
        K(1);
        y(i3, z10);
        View[] viewArr = this.e;
        View view = viewArr[0];
        int measuredWidth = view != null ? view.getMeasuredWidth() : 0;
        if (z10) {
            E(viewArr[1], measuredWidth);
        } else {
            E(viewArr[1], -measuredWidth);
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.T = ofFloat;
        ofFloat.addUpdateListener(new b61(this, i10));
        this.T.addListener(new c61(this, i10));
        this.T.setDuration(getManualScrollDuration());
        this.T.setInterpolator(xq.h);
        this.T.start();
        return true;
    }

    public void E(View view, float f10) {
        int i3;
        int round = Math.round(f10);
        int round2 = Math.round(view.getTranslationX());
        view.setTranslationX(round);
        if (view != this.e[0] || (i3 = round2 - round) == 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.S;
            if (i10 >= arrayList.size()) {
                return;
            }
            ((pi.g) arrayList.get(i10)).a.h(i3, 0);
            i10++;
        }
    }

    public void F() {
        View[] viewArr = this.e;
        View view = viewArr[0];
        View view2 = viewArr[1];
        viewArr[0] = view2;
        viewArr[1] = view;
        int i3 = this.b;
        int i10 = this.d;
        this.b = i10;
        this.d = i3;
        this.c = 1.0f - this.c;
        int[] iArr = this.f;
        int i11 = iArr[0];
        iArr[0] = iArr[1];
        iArr[1] = i11;
        r(view2, view, i10, i3);
    }

    public int G() {
        return 16;
    }

    public final ValueAnimator H(View view, float f10) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(view.getTranslationX(), f10);
        ofFloat.addUpdateListener(new dv0(this, view, 1));
        ofFloat.addListener(new e61(this, view, f10));
        return ofFloat;
    }

    public final void J() {
        int[] iArr = this.f;
        if (iArr[0] != this.M.h(this.b)) {
            K(0);
            View[] viewArr = this.e;
            View view = viewArr[1];
            if (view != null) {
                this.h.put(iArr[1], view);
                removeView(viewArr[1]);
                viewArr[1] = null;
            }
            E(viewArr[0], 0.0f);
            v(true);
        }
    }

    public final void K(int i3) {
        int i10 = i3 == 0 ? this.b : this.d;
        if (i10 < 0 || i10 >= this.M.e()) {
            return;
        }
        View[] viewArr = this.e;
        View view = viewArr[i3];
        SparseArray sparseArray = this.h;
        int[] iArr = this.f;
        if (view == null) {
            int h = this.M.h(i10);
            iArr[i3] = h;
            View view2 = (View) sparseArray.get(h);
            if (view2 == null) {
                view2 = this.M.d(iArr[i3]);
            } else {
                sparseArray.remove(iArr[i3]);
            }
            if (view2.getParent() != null) {
                ((ViewGroup) view2.getParent()).removeView(view2);
            }
            addView(view2);
            view2.setTranslationX(i3 != 0 ? getMeasuredWidth() : 0.0f);
            viewArr[i3] = view2;
            this.M.b(view2, i10, iArr[i3]);
            viewArr[i3].setVisibility(0);
            return;
        }
        if (iArr[i3] == this.M.h(i10)) {
            this.M.b(viewArr[i3], i10, iArr[i3]);
            viewArr[i3].setVisibility(0);
            return;
        }
        sparseArray.put(iArr[i3], viewArr[i3]);
        viewArr[i3].setVisibility(8);
        removeView(viewArr[i3]);
        int h7 = this.M.h(i10);
        iArr[i3] = h7;
        View view3 = (View) sparseArray.get(h7);
        if (view3 == null) {
            view3 = this.M.d(iArr[i3]);
        } else {
            sparseArray.remove(iArr[i3]);
        }
        view3.setTranslationX(i3 != 0 ? getMeasuredWidth() : 0.0f);
        addView(view3);
        viewArr[i3] = view3;
        view3.setVisibility(0);
        f61 f61Var = this.M;
        f61Var.b(viewArr[i3], i10, f61Var.h(i10));
    }

    public boolean c(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i3) {
        if (i3 != 0) {
            if (!this.y && !this.I) {
                boolean z10 = i3 > 0;
                if ((z10 || this.b != 0) && (!z10 || this.b != this.M.e() - 1)) {
                }
            }
            return true;
        }
        return false;
    }

    public boolean e(MotionEvent motionEvent) {
        return true;
    }

    public boolean f(MotionEvent motionEvent) {
        return c(motionEvent);
    }

    public final void g() {
        float f10;
        VelocityTracker velocityTracker = this.w;
        if (velocityTracker != null) {
            velocityTracker.computeCurrentVelocity(1000, this.H);
        }
        if (this.I) {
            View[] viewArr = this.e;
            float x10 = viewArr[0].getX();
            this.x = new AnimatorSet();
            if (this.F == 0.0f) {
                this.G = Math.abs(x10) < ((float) viewArr[0].getMeasuredWidth()) / 3.0f && (Math.abs(0.0f) < 3500.0f || Math.abs(0.0f) < Math.abs(0.0f));
            } else if (Math.abs(0.0f) > 1500.0f) {
                this.G = false;
            } else if (this.E) {
                View view = viewArr[1];
                if (view != null) {
                    this.G = view.getX() > ((float) (viewArr[0].getMeasuredWidth() >> 1));
                } else {
                    this.G = false;
                }
            } else {
                this.G = viewArr[0].getX() < ((float) (viewArr[0].getMeasuredWidth() >> 1));
            }
            if (this.G) {
                f10 = Math.abs(x10);
                if (this.E) {
                    this.x.playTogether(H(viewArr[0], 0.0f));
                    View view2 = viewArr[1];
                    if (view2 != null) {
                        this.x.playTogether(H(view2, view2.getMeasuredWidth()));
                    }
                } else {
                    this.x.playTogether(H(viewArr[0], 0.0f));
                    View view3 = viewArr[1];
                    if (view3 != null) {
                        this.x.playTogether(H(view3, -view3.getMeasuredWidth()));
                    }
                }
            } else if (this.d >= 0) {
                f10 = viewArr[0].getMeasuredWidth() - Math.abs(x10);
                if (this.E) {
                    this.x.playTogether(H(viewArr[0], -r6.getMeasuredWidth()));
                    View view4 = viewArr[1];
                    if (view4 != null) {
                        this.x.playTogether(H(view4, 0.0f));
                    }
                } else {
                    this.x.playTogether(H(viewArr[0], r6.getMeasuredWidth()));
                    View view5 = viewArr[1];
                    if (view5 != null) {
                        this.x.playTogether(H(view5, 0.0f));
                    }
                }
            } else {
                f10 = 0.0f;
            }
            int i3 = 3;
            if (this.d < 0) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.U, this.G ? 0.0f : 1.0f);
                ofFloat.addUpdateListener(new b61(this, i3));
                this.x.playTogether(ofFloat);
            }
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat2.addUpdateListener(this.O);
            this.x.playTogether(ofFloat2);
            this.x.setInterpolator(V);
            float measuredWidth = getMeasuredWidth() / 2;
            float sin = (((float) Math.sin((Math.min(1.0f, (f10 * 1.0f) / r0) - 0.5f) * 0.47123894f)) * measuredWidth) + measuredWidth;
            this.x.setDuration(Math.max(org.telegram.messenger.hs.g2, Math.min(Math.abs(0.0f) > 0.0f ? Math.round(Math.abs(sin / r6) * 1000.0f) * 4 : (int) (((f10 / getMeasuredWidth()) + 1.0f) * 100.0f), 600)));
            this.x.addListener(new c61(this, i3));
            this.x.start();
            this.y = true;
            this.I = false;
            v(false);
        } else {
            this.J = false;
            d61 d61Var = this.N;
            if (d61Var != null) {
                d61Var.setEnabled(true);
            }
        }
        VelocityTracker velocityTracker2 = this.w;
        if (velocityTracker2 != null) {
            velocityTracker2.recycle();
            this.w = null;
        }
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

    public final boolean i() {
        boolean z10;
        if (!this.y) {
            return false;
        }
        boolean z11 = this.G;
        View[] viewArr = this.e;
        if (z11) {
            if (Math.abs(viewArr[0].getTranslationX()) < 1.0f) {
                E(viewArr[0], 0.0f);
                View view = viewArr[1];
                if (view != null) {
                    E(view, viewArr[0].getMeasuredWidth() * (this.E ? 1 : -1));
                }
                z10 = true;
            }
            z10 = false;
        } else {
            if (Math.abs(viewArr[1].getTranslationX()) < 1.0f) {
                E(viewArr[0], r0.getMeasuredWidth() * (this.E ? -1 : 1));
                View view2 = viewArr[1];
                if (view2 != null) {
                    E(view2, 0.0f);
                }
                z10 = true;
            }
            z10 = false;
        }
        v(true);
        if (z10) {
            AnimatorSet animatorSet = this.x;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.x = null;
            }
            this.y = false;
        }
        return this.y;
    }

    public final m61 j(int i3, boolean z10) {
        d61 d61Var = new d61(this, getContext(), z10, i3, this.a);
        this.N = d61Var;
        d61Var.r = G();
        this.N.setDelegate(new y00(this));
        k(false);
        return this.N;
    }

    public final void k(boolean z10) {
        d61 d61Var;
        if (this.M == null || (d61Var = this.N) == null) {
            return;
        }
        d61Var.h.clear();
        d61Var.c0.clear();
        d61Var.d0.clear();
        d61Var.e0.clear();
        d61Var.f0.clear();
        d61Var.I = 0;
        for (int i3 = 0; i3 < this.M.e(); i3++) {
            this.M.getClass();
            this.N.a(this.M.f(i3), this.M.g(i3));
        }
        a();
        if (z10) {
            ci.j1 j1Var = this.N.w;
            TransitionSet transitionSet = new TransitionSet();
            ChangeBounds changeBounds = new ChangeBounds();
            changeBounds.setDuration(150L);
            transitionSet.addTransition(new Fade().setDuration(150L)).addTransition(changeBounds);
            transitionSet.setOrdering(0);
            transitionSet.setInterpolator((TimeInterpolator) xq.f);
            TransitionManager.beginDelayedTransition(j1Var, transitionSet);
        }
        this.N.y.f();
    }

    public final View m(ViewGroup viewGroup, float f10, float f11) {
        View m10;
        int childCount = viewGroup.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = viewGroup.getChildAt(i3);
            if (childAt.getVisibility() == 0) {
                Rect rect = this.P;
                childAt.getHitRect(rect);
                if (!rect.contains((int) f10, (int) f11)) {
                    continue;
                } else {
                    if (childAt.canScrollHorizontally(-1)) {
                        return childAt;
                    }
                    if ((childAt instanceof ViewGroup) && (m10 = m((ViewGroup) childAt, f10 - rect.left, f11 - rect.top)) != null) {
                        return m10;
                    }
                }
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        d61 d61Var = this.N;
        if (d61Var != null && d61Var.K) {
            return false;
        }
        if (i()) {
            return true;
        }
        onTouchEvent(motionEvent);
        return this.I;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return A(motionEvent);
    }

    public final float p(int i3) {
        return getMeasuredWidth() == 0 ? b8.be.b(1 - Math.abs(getCurrentPosition() - i3), 0, 1) : b8.be.a(1.0f - Math.abs(getPositionAnimated() - i3), 0.0f, 1.0f);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        if (this.Q && this.J && !this.I) {
            onTouchEvent(null);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    public void setAdapter(f61 f61Var) {
        this.M = f61Var;
        int h = f61Var.h(this.b);
        int[] iArr = this.f;
        iArr[0] = h;
        View d = f61Var.d(h);
        View[] viewArr = this.e;
        viewArr[0] = d;
        if (d == null && this.b != 0) {
            this.b = 0;
            int h7 = f61Var.h(0);
            iArr[0] = h7;
            viewArr[0] = f61Var.d(h7);
        }
        f61Var.b(viewArr[0], this.b, iArr[0]);
        addView(viewArr[0]);
        viewArr[0].setVisibility(0);
        k(false);
    }

    public void setAllowDisallowInterceptTouch(boolean z10) {
        this.Q = z10;
    }

    public void setPosition(int i3) {
        if (this.M == null) {
            this.b = i3;
            v(false);
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
        if (i10 != i3) {
            this.b = i3;
            this.d = 0;
            this.c = 1.0f;
            View view2 = viewArr[0];
            K(0);
            r(viewArr[0], view2, this.b, i10);
            E(viewArr[0], 0.0f);
            d61 d61Var = this.N;
            if (d61Var != null) {
                d61Var.e(this.c, this.d, this.b);
            }
            v(true);
        }
    }

    public final void v(boolean z10) {
        Iterator it = this.R.iterator();
        if (it.hasNext()) {
            throw a1.g.m(it);
        }
        u(z10);
    }

    public void y(int i3, boolean z10) {
        x(i3);
    }

    public void u(boolean z10) {
    }

    public void x(int i3) {
    }

    public void z(int i3) {
    }

    public void a() {
    }

    public void q() {
    }

    public void s() {
    }

    public void t() {
    }

    public void r(View view, View view2, int i3, int i10) {
    }
}
