package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public abstract class o41 extends FrameLayout {
    public static long Q;
    public static final /* synthetic */ int R = 0;
    public vx E;
    public int F;
    public int G;
    public boolean H;
    public boolean I;
    public int J;
    public int K;
    public VelocityTracker L;
    public boolean M;
    public float N;
    public float O;
    public Paint P;
    public vx a;
    public View b;
    public j0 c;
    public org.telegram.ui.ActionBar.k d;
    public float e;
    public boolean f;
    public ValueAnimator h;
    public AnimationNotificationsLocker n;
    public boolean r;
    public int s;
    public boolean v;
    public org.telegram.ui.ActionBar.d5 w;
    public o1.k x;
    public float y;

    public static void f(org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.n2 n2Var2, float f7) {
        if (n2Var == null && n2Var2 == null) {
            return;
        }
        int measuredWidth = n2Var != null ? n2Var.getFragmentView().getMeasuredWidth() : n2Var2.getFragmentView().getMeasuredWidth();
        if (n2Var != null) {
            if (n2Var.getFragmentView() != null) {
                n2Var.getFragmentView().setAlpha(1.0f - f7);
                n2Var.getFragmentView().setTranslationX(measuredWidth * 0.6f * f7);
            }
            n2Var.setPreviewOpenedProgress(1.0f - f7);
        }
        if (n2Var2 != null) {
            if (n2Var2.getFragmentView() != null) {
                n2Var2.getFragmentView().setAlpha(1.0f);
                n2Var2.getFragmentView().setTranslationX((1.0f - f7) * measuredWidth);
            }
            n2Var2.setPreviewReplaceProgress(f7);
        }
    }

    public static int getRightPaddingSize() {
        return SharedConfig.useThreeLinesLayout ? 74 : 76;
    }

    public final void a() {
        if (this.f) {
            e(false);
            b();
        }
    }

    public final void b() {
        int i10 = 0;
        this.f = false;
        if (SharedConfig.animationsEnabled()) {
            this.n.lock();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.e, 0.0f);
            this.h = ofFloat;
            ofFloat.addUpdateListener(new l41(this, 0));
            this.h.addListener(new n41(this, i10));
            this.h.setDuration(250L);
            this.h.setInterpolator(org.telegram.ui.Components.pr.f);
            this.h.start();
            return;
        }
        this.e = 0.0f;
        g();
        vx vxVar = this.a;
        if (vxVar != null) {
            vxVar.onPause();
            this.a.onFragmentDestroy();
            removeAllViews();
            this.a = null;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        }
        d(false);
    }

    public final boolean c() {
        return this.a != null;
    }

    public abstract void d(boolean z10);

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.v) {
            f(this.E, this.a, this.y);
            invalidate();
        }
        super.dispatchDraw(canvas);
        float f7 = this.e;
        org.telegram.ui.ActionBar.k kVar = this.d;
        float alpha = (kVar == null || kVar.getActionMode() == null) ? 0.0f : this.d.getActionMode().getAlpha();
        org.telegram.ui.ActionBar.k kVar2 = this.d;
        float max = Math.max(alpha, kVar2 == null ? 0.0f : kVar2.o0) * f7;
        if (this.a == null || this.d == null || max <= 0.0f) {
            return;
        }
        if (this.P == null) {
            this.P = new Paint();
        }
        this.P.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.w8, false));
        if (max == 1.0f) {
            canvas.save();
        } else {
            canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), this.O, (int) (max * 255.0f), 31);
        }
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), this.O, this.P);
        canvas.translate(this.d.getX(), this.d.getY());
        canvas.save();
        canvas.translate(this.d.getBackButton().getX(), this.d.getBackButton().getY());
        this.d.getBackButton().draw(canvas);
        canvas.restore();
        if (this.d.getActionMode() != null) {
            if (max != this.d.getActionMode().getAlpha() * this.e) {
                this.d.draw(canvas);
                canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), this.O, (int) (this.d.getActionMode().getAlpha() * 255.0f), 31);
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
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.ActionBar.k kVar = this.d;
        if (view == kVar && kVar.getActionMode() != null && this.d.getActionMode().getAlpha() == 1.0f) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    public abstract void e(boolean z10);

    public final void g() {
        if (this.v || !c()) {
            return;
        }
        setOpenProgress(this.e);
        View view = this.b;
        if (view != null) {
            view.setTranslationX((1.0f - this.e) * (getMeasuredWidth() - AndroidUtilities.dp(getRightPaddingSize())));
        }
        org.telegram.ui.ActionBar.k kVar = this.d;
        if (kVar != null) {
            kVar.setTranslationX((1.0f - this.e) * AndroidUtilities.dp(48.0f));
        }
        vx vxVar = this.a;
        if (vxVar != null) {
            vxVar.setPreviewOpenedProgress(this.e);
        }
        invalidate();
    }

    public long getCurrentFragmetDialogId() {
        return Q;
    }

    public org.telegram.ui.ActionBar.n2 getFragment() {
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
    public final void onMeasure(int i10, int i11) {
        int i12 = getOccupyStatusbar() ? AndroidUtilities.statusBarHeight : 0;
        View view = this.b;
        if (view != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            layoutParams.leftMargin = AndroidUtilities.dp(getRightPaddingSize());
            layoutParams.topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i12 + this.s;
        }
        org.telegram.ui.ActionBar.k kVar = this.d;
        if (kVar != null) {
            ((FrameLayout.LayoutParams) kVar.getLayoutParams()).topMargin = i12;
        }
        super.onMeasure(i10, i11);
        int measuredWidth = (getMeasuredWidth() + getMeasuredHeight()) << 16;
        if (this.F != measuredWidth) {
            this.F = measuredWidth;
            g();
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.d5 d5Var = this.w;
        if ((d5Var != null && ((ActionBarLayout) d5Var).y()) || !c() || !this.M) {
            return false;
        }
        int i10 = 1;
        if (motionEvent != null && motionEvent.getAction() == 0) {
            this.G = motionEvent.getPointerId(0);
            this.H = true;
            this.J = (int) motionEvent.getX();
            this.K = (int) motionEvent.getY();
            VelocityTracker velocityTracker = this.L;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.G) {
            if (this.L == null) {
                this.L = VelocityTracker.obtain();
            }
            int max = Math.max(0, (int) (motionEvent.getX() - this.J));
            int abs = Math.abs(((int) motionEvent.getY()) - this.K);
            this.L.addMovement(motionEvent);
            if (!this.H || this.I || max < AndroidUtilities.getPixelsInCM(0.4f, true) || Math.abs(max) / 3 <= abs) {
                if (this.I) {
                    float f7 = max;
                    this.N = f7;
                    this.e = Utilities.clamp(1.0f - (f7 / getMeasuredWidth()), 1.0f, 0.0f);
                    g();
                }
            } else if (ActionBarLayout.u(this, motionEvent.getX(), motionEvent.getY()) == null) {
                this.H = false;
                this.I = true;
                this.J = (int) motionEvent.getX();
                e(false);
            } else {
                this.H = false;
            }
        } else if (motionEvent != null && motionEvent.getPointerId(0) == this.G && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6)) {
            if (this.L == null) {
                this.L = VelocityTracker.obtain();
            }
            this.L.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT);
            if (this.I) {
                float f10 = this.N;
                float xVelocity = this.L.getXVelocity();
                float yVelocity = this.L.getYVelocity();
                if (f10 >= getMeasuredWidth() / 3.0f || (xVelocity >= 3500.0f && xVelocity >= yVelocity)) {
                    b();
                } else {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.e, 1.0f);
                    this.h = ofFloat;
                    ofFloat.addUpdateListener(new l41(this, 2));
                    this.h.addListener(new n41(this, i10));
                    this.h.setDuration(250L);
                    this.h.setInterpolator(org.telegram.ui.Components.pr.f);
                    this.h.start();
                }
            }
            this.H = false;
            this.I = false;
            VelocityTracker velocityTracker2 = this.L;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.L = null;
            }
        } else if (motionEvent == null) {
            this.H = false;
            this.I = false;
            VelocityTracker velocityTracker3 = this.L;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.L = null;
            }
        }
        return this.I;
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

    public void setCurrentTop(int i10) {
        this.O = i10;
        View view = this.b;
        if (view != null) {
            view.setTranslationY((i10 - view.getTop()) + this.s);
        }
        j0 j0Var = this.c;
        if (j0Var != null) {
            j0Var.setTranslationY(i10 - j0Var.getTop());
        }
    }

    public void setFragmentViewPadding(int i10) {
        this.s = i10;
    }

    public void setTransitionPaddingBottom(int i10) {
        vx vxVar = this.a;
        if (com.google.android.gms.internal.vision.e2.u(vxVar)) {
            float f7 = i10;
            vxVar.X0 = f7;
            vxVar.h.setTranslationY(((-f7) - vxVar.e1) - vxVar.d1);
        }
    }

    public void setOpenProgress(float f7) {
    }
}
