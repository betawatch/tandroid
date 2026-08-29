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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public abstract class h31 extends FrameLayout {
    public static long M;
    public static final /* synthetic */ int N = 0;
    public hx A;
    public int B;
    public int C;
    public boolean D;
    public boolean E;
    public int F;
    public int G;
    public VelocityTracker H;
    public boolean I;
    public float J;
    public float K;
    public Paint L;
    public hx a;
    public View b;
    public n0 c;
    public org.telegram.ui.ActionBar.l d;
    public float e;
    public boolean f;
    public ValueAnimator h;
    public AnimationNotificationsLocker n;
    public boolean r;
    public int s;
    public boolean v;
    public org.telegram.ui.ActionBar.b5 w;
    public o1.k x;
    public float y;

    public static void f(org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.o2 o2Var2, float f9) {
        if (o2Var == null && o2Var2 == null) {
            return;
        }
        int measuredWidth = o2Var != null ? o2Var.getFragmentView().getMeasuredWidth() : o2Var2.getFragmentView().getMeasuredWidth();
        if (o2Var != null) {
            if (o2Var.getFragmentView() != null) {
                o2Var.getFragmentView().setAlpha(1.0f - f9);
                o2Var.getFragmentView().setTranslationX(measuredWidth * 0.6f * f9);
            }
            o2Var.setPreviewOpenedProgress(1.0f - f9);
        }
        if (o2Var2 != null) {
            if (o2Var2.getFragmentView() != null) {
                o2Var2.getFragmentView().setAlpha(1.0f);
                o2Var2.getFragmentView().setTranslationX((1.0f - f9) * measuredWidth);
            }
            o2Var2.setPreviewReplaceProgress(f9);
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
            ofFloat.addUpdateListener(new e31(this, 0));
            this.h.addListener(new g31(this, i10));
            this.h.setDuration(250L);
            this.h.setInterpolator(org.telegram.ui.Components.jr.f);
            this.h.start();
            return;
        }
        this.e = 0.0f;
        g();
        hx hxVar = this.a;
        if (hxVar != null) {
            hxVar.onPause();
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
            f(this.A, this.a, this.y);
            invalidate();
        }
        super.dispatchDraw(canvas);
        float f9 = this.e;
        org.telegram.ui.ActionBar.l lVar = this.d;
        float alpha = (lVar == null || lVar.getActionMode() == null) ? 0.0f : this.d.getActionMode().getAlpha();
        org.telegram.ui.ActionBar.l lVar2 = this.d;
        float max = Math.max(alpha, lVar2 == null ? 0.0f : lVar2.k0) * f9;
        if (this.a == null || this.d == null || max <= 0.0f) {
            return;
        }
        if (this.L == null) {
            this.L = new Paint();
        }
        this.L.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.w8, false));
        if (max == 1.0f) {
            canvas.save();
        } else {
            canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), this.K, (int) (max * 255.0f), 31);
        }
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), this.K, this.L);
        canvas.translate(this.d.getX(), this.d.getY());
        canvas.save();
        canvas.translate(this.d.getBackButton().getX(), this.d.getBackButton().getY());
        this.d.getBackButton().draw(canvas);
        canvas.restore();
        if (this.d.getActionMode() != null) {
            if (max != this.d.getActionMode().getAlpha() * this.e) {
                this.d.draw(canvas);
                canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), this.K, (int) (this.d.getActionMode().getAlpha() * 255.0f), 31);
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
        org.telegram.ui.ActionBar.l lVar = this.d;
        if (view == lVar && lVar.getActionMode() != null && this.d.getActionMode().getAlpha() == 1.0f) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
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
        org.telegram.ui.ActionBar.l lVar = this.d;
        if (lVar != null) {
            lVar.setTranslationX((1.0f - this.e) * AndroidUtilities.dp(48.0f));
        }
        hx hxVar = this.a;
        if (hxVar != null) {
            hxVar.setPreviewOpenedProgress(this.e);
        }
        invalidate();
    }

    public long getCurrentFragmetDialogId() {
        return M;
    }

    public org.telegram.ui.ActionBar.o2 getFragment() {
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
            layoutParams.topMargin = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + i12 + this.s;
        }
        org.telegram.ui.ActionBar.l lVar = this.d;
        if (lVar != null) {
            ((FrameLayout.LayoutParams) lVar.getLayoutParams()).topMargin = i12;
        }
        super.onMeasure(i10, i11);
        int measuredWidth = (getMeasuredWidth() + getMeasuredHeight()) << 16;
        if (this.B != measuredWidth) {
            this.B = measuredWidth;
            g();
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.b5 b5Var = this.w;
        if ((b5Var != null && ((ActionBarLayout) b5Var).y()) || !c() || !this.I) {
            return false;
        }
        int i10 = 1;
        if (motionEvent != null && motionEvent.getAction() == 0) {
            this.C = motionEvent.getPointerId(0);
            this.D = true;
            this.F = (int) motionEvent.getX();
            this.G = (int) motionEvent.getY();
            VelocityTracker velocityTracker = this.H;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.C) {
            if (this.H == null) {
                this.H = VelocityTracker.obtain();
            }
            int max = Math.max(0, (int) (motionEvent.getX() - this.F));
            int abs = Math.abs(((int) motionEvent.getY()) - this.G);
            this.H.addMovement(motionEvent);
            if (!this.D || this.E || max < AndroidUtilities.getPixelsInCM(0.4f, true) || Math.abs(max) / 3 <= abs) {
                if (this.E) {
                    float f9 = max;
                    this.J = f9;
                    this.e = Utilities.clamp(1.0f - (f9 / getMeasuredWidth()), 1.0f, 0.0f);
                    g();
                }
            } else if (ActionBarLayout.u(this, motionEvent.getX(), motionEvent.getY()) == null) {
                this.D = false;
                this.E = true;
                this.F = (int) motionEvent.getX();
                e(false);
            } else {
                this.D = false;
            }
        } else if (motionEvent != null && motionEvent.getPointerId(0) == this.C && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6)) {
            if (this.H == null) {
                this.H = VelocityTracker.obtain();
            }
            this.H.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT);
            if (this.E) {
                float f10 = this.J;
                float xVelocity = this.H.getXVelocity();
                float yVelocity = this.H.getYVelocity();
                if (f10 >= getMeasuredWidth() / 3.0f || (xVelocity >= 3500.0f && xVelocity >= yVelocity)) {
                    b();
                } else {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.e, 1.0f);
                    this.h = ofFloat;
                    ofFloat.addUpdateListener(new e31(this, 2));
                    this.h.addListener(new g31(this, i10));
                    this.h.setDuration(250L);
                    this.h.setInterpolator(org.telegram.ui.Components.jr.f);
                    this.h.start();
                }
            }
            this.D = false;
            this.E = false;
            VelocityTracker velocityTracker2 = this.H;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.H = null;
            }
        } else if (motionEvent == null) {
            this.D = false;
            this.E = false;
            VelocityTracker velocityTracker3 = this.H;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.H = null;
            }
        }
        return this.E;
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
        this.K = i10;
        View view = this.b;
        if (view != null) {
            view.setTranslationY((i10 - view.getTop()) + this.s);
        }
        n0 n0Var = this.c;
        if (n0Var != null) {
            n0Var.setTranslationY(i10 - n0Var.getTop());
        }
    }

    public void setFragmentViewPadding(int i10) {
        this.s = i10;
    }

    public void setTransitionPaddingBottom(int i10) {
        hx hxVar = this.a;
        if (com.google.android.recaptcha.internal.a.u(hxVar)) {
            float f9 = i10;
            hxVar.T0 = f9;
            hxVar.h.setTranslationY(((-f9) - hxVar.a1) - hxVar.Z0);
        }
    }

    public void setOpenProgress(float f9) {
    }
}
