package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class my0 extends FrameLayout {
    public static long R;
    public static final /* synthetic */ int S = 0;
    public float E;
    public wv F;
    public int G;
    public int H;
    public boolean I;
    public boolean J;
    public int K;
    public int L;
    public VelocityTracker M;
    public boolean N;
    public float O;
    public float P;
    public Paint Q;
    public wv a;
    public View b;
    public l0 c;
    public org.telegram.ui.ActionBar.k d;
    public float e;
    public boolean f;
    public ValueAnimator h;
    public g2.g n;
    public boolean r;
    public int s;
    public boolean w;
    public org.telegram.ui.ActionBar.q4 x;
    public q1.g y;

    public static void f(org.telegram.ui.ActionBar.d2 d2Var, org.telegram.ui.ActionBar.d2 d2Var2, float f10) {
        if (d2Var == null && d2Var2 == null) {
            return;
        }
        int measuredWidth = d2Var != null ? d2Var.getFragmentView().getMeasuredWidth() : d2Var2.getFragmentView().getMeasuredWidth();
        if (d2Var != null) {
            if (d2Var.getFragmentView() != null) {
                d2Var.getFragmentView().setAlpha(1.0f - f10);
                d2Var.getFragmentView().setTranslationX(measuredWidth * 0.6f * f10);
            }
            d2Var.setPreviewOpenedProgress(1.0f - f10);
        }
        if (d2Var2 != null) {
            if (d2Var2.getFragmentView() != null) {
                d2Var2.getFragmentView().setAlpha(1.0f);
                d2Var2.getFragmentView().setTranslationX((1.0f - f10) * measuredWidth);
            }
            d2Var2.setPreviewReplaceProgress(f10);
        }
    }

    public static int getRightPaddingSize() {
        return org.telegram.messenger.az.p1 ? 74 : 76;
    }

    public final void a() {
        if (this.f) {
            e(false);
            b();
        }
    }

    public final void b() {
        int i3 = 0;
        this.f = false;
        if (org.telegram.messenger.az.c()) {
            this.n.d();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.e, 0.0f);
            this.h = ofFloat;
            ofFloat.addUpdateListener(new jy0(this, 0));
            this.h.addListener(new ly0(this, i3));
            this.h.setDuration(250L);
            this.h.setInterpolator(org.telegram.ui.Components.xq.f);
            this.h.start();
            return;
        }
        this.e = 0.0f;
        g();
        wv wvVar = this.a;
        if (wvVar != null) {
            wvVar.onPause();
            this.a.onFragmentDestroy();
            removeAllViews();
            this.a = null;
            org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.r4, new Object[0]);
        }
        d(false);
    }

    public final boolean c() {
        return this.a != null;
    }

    public abstract void d(boolean z10);

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.w) {
            f(this.F, this.a, this.E);
            invalidate();
        }
        super.dispatchDraw(canvas);
        float f10 = this.e;
        org.telegram.ui.ActionBar.k kVar = this.d;
        float alpha = (kVar == null || kVar.getActionMode() == null) ? 0.0f : this.d.getActionMode().getAlpha();
        org.telegram.ui.ActionBar.k kVar2 = this.d;
        float max = Math.max(alpha, kVar2 == null ? 0.0f : kVar2.p0) * f10;
        if (this.a == null || this.d == null || max <= 0.0f) {
            return;
        }
        if (this.Q == null) {
            this.Q = new Paint();
        }
        this.Q.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.w8, false));
        if (max == 1.0f) {
            canvas.save();
        } else {
            canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), this.P, (int) (max * 255.0f), 31);
        }
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), this.P, this.Q);
        canvas.translate(this.d.getX(), this.d.getY());
        canvas.save();
        canvas.translate(this.d.getBackButton().getX(), this.d.getBackButton().getY());
        this.d.getBackButton().draw(canvas);
        canvas.restore();
        if (this.d.getActionMode() != null) {
            if (max != this.d.getActionMode().getAlpha() * this.e) {
                this.d.draw(canvas);
                canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), this.P, (int) (this.d.getActionMode().getAlpha() * 255.0f), 31);
                this.d.getActionMode().draw(canvas);
                canvas.restore();
            } else {
                this.d.getActionMode().draw(canvas);
            }
        } else {
            this.d.draw(canvas);
        }
        canvas.restore();
        invalidate();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.ActionBar.k kVar = this.d;
        if (view == kVar && kVar.getActionMode() != null && this.d.getActionMode().getAlpha() == 1.0f) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    public abstract void e(boolean z10);

    public final void g() {
        if (this.w || !c()) {
            return;
        }
        setOpenProgress(this.e);
        View view = this.b;
        if (view != null) {
            view.setTranslationX((1.0f - this.e) * (getMeasuredWidth() - org.telegram.messenger.g0.L(getRightPaddingSize())));
        }
        org.telegram.ui.ActionBar.k kVar = this.d;
        if (kVar != null) {
            kVar.setTranslationX((1.0f - this.e) * org.telegram.messenger.g0.L(48.0f));
        }
        wv wvVar = this.a;
        if (wvVar != null) {
            wvVar.setPreviewOpenedProgress(this.e);
        }
        invalidate();
    }

    public long getCurrentFragmetDialogId() {
        return R;
    }

    public org.telegram.ui.ActionBar.d2 getFragment() {
        return this.a;
    }

    public View getFragmentView() {
        return this.b;
    }

    public abstract boolean getOccupyStatusbar();

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return onTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        int i11 = getOccupyStatusbar() ? org.telegram.messenger.g0.m : 0;
        View view = this.b;
        if (view != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            layoutParams.leftMargin = org.telegram.messenger.g0.L(getRightPaddingSize());
            layoutParams.topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i11 + this.s;
        }
        org.telegram.ui.ActionBar.k kVar = this.d;
        if (kVar != null) {
            ((FrameLayout.LayoutParams) kVar.getLayoutParams()).topMargin = i11;
        }
        super.onMeasure(i3, i10);
        int measuredWidth = (getMeasuredWidth() + getMeasuredHeight()) << 16;
        if (this.G != measuredWidth) {
            this.G = measuredWidth;
            g();
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.q4 q4Var = this.x;
        if ((q4Var != null && ((ActionBarLayout) q4Var).y()) || !c() || !this.N) {
            return false;
        }
        int i3 = 1;
        if (motionEvent != null && motionEvent.getAction() == 0) {
            this.H = motionEvent.getPointerId(0);
            this.I = true;
            this.K = (int) motionEvent.getX();
            this.L = (int) motionEvent.getY();
            VelocityTracker velocityTracker = this.M;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.H) {
            if (this.M == null) {
                this.M = VelocityTracker.obtain();
            }
            int max = Math.max(0, (int) (motionEvent.getX() - this.K));
            int abs = Math.abs(((int) motionEvent.getY()) - this.L);
            this.M.addMovement(motionEvent);
            if (!this.I || this.J || max < org.telegram.messenger.g0.a1(true, 0.4f) || Math.abs(max) / 3 <= abs) {
                if (this.J) {
                    float f10 = max;
                    this.O = f10;
                    this.e = Utilities.i(1.0f - (f10 / getMeasuredWidth()), 1.0f, 0.0f);
                    g();
                }
            } else if (ActionBarLayout.u(this, motionEvent.getX(), motionEvent.getY()) == null) {
                this.I = false;
                this.J = true;
                this.K = (int) motionEvent.getX();
                e(false);
            } else {
                this.I = false;
            }
        } else if (motionEvent != null && motionEvent.getPointerId(0) == this.H && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6)) {
            if (this.M == null) {
                this.M = VelocityTracker.obtain();
            }
            this.M.computeCurrentVelocity(1000);
            if (this.J) {
                float f11 = this.O;
                float xVelocity = this.M.getXVelocity();
                float yVelocity = this.M.getYVelocity();
                if (f11 >= getMeasuredWidth() / 3.0f || (xVelocity >= 3500.0f && xVelocity >= yVelocity)) {
                    b();
                } else {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.e, 1.0f);
                    this.h = ofFloat;
                    ofFloat.addUpdateListener(new jy0(this, 2));
                    this.h.addListener(new ly0(this, i3));
                    this.h.setDuration(250L);
                    this.h.setInterpolator(org.telegram.ui.Components.xq.f);
                    this.h.start();
                }
            }
            this.I = false;
            this.J = false;
            VelocityTracker velocityTracker2 = this.M;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.M = null;
            }
        } else if (motionEvent == null) {
            this.I = false;
            this.J = false;
            VelocityTracker velocityTracker3 = this.M;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.M = null;
            }
        }
        return this.J;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        super.removeView(view);
        if (view == this.b) {
            a();
        }
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        super.removeViewInLayout(view);
        if (view == this.b) {
            a();
        }
    }

    public void setCurrentTop(int i3) {
        this.P = i3;
        View view = this.b;
        if (view != null) {
            view.setTranslationY((i3 - view.getTop()) + this.s);
        }
        l0 l0Var = this.c;
        if (l0Var != null) {
            l0Var.setTranslationY(i3 - l0Var.getTop());
        }
    }

    public void setFragmentViewPadding(int i3) {
        this.s = i3;
    }

    public void setTransitionPaddingBottom(int i3) {
        wv wvVar = this.a;
        if (com.google.android.recaptcha.internal.a.u(wvVar)) {
            float f10 = i3;
            wvVar.Y0 = f10;
            wvVar.h.setTranslationY(((-f10) - wvVar.g1) - wvVar.f1);
        }
    }

    public void setOpenProgress(float f10) {
    }
}
