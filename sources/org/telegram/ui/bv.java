package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.Property;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class bv extends FrameLayout {
    public int a;
    public boolean b;
    public boolean c;
    public int d;
    public int e;
    public VelocityTracker f;
    public boolean h;
    public final /* synthetic */ dv n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bv(dv dvVar, Context context) {
        super(context);
        this.n = dvVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a() {
        AnimatorSet animatorSet;
        dv dvVar = this.n;
        cv[] cvVarArr = dvVar.f;
        if (!dvVar.n) {
            return false;
        }
        if (!dvVar.s) {
            if (Math.abs(cvVarArr[1].getTranslationX()) < 1.0f) {
                cvVarArr[0].setTranslationX(r2.getMeasuredWidth() * (dvVar.r ? -1 : 1));
                cvVarArr[1].setTranslationX(0.0f);
                animatorSet = dvVar.h;
                if (animatorSet != null) {
                }
                dvVar.n = false;
            }
            return dvVar.n;
        }
        if (Math.abs(cvVarArr[0].getTranslationX()) < 1.0f) {
            cvVarArr[0].setTranslationX(0.0f);
            cvVarArr[1].setTranslationX(cvVarArr[0].getMeasuredWidth() * (dvVar.r ? 1 : -1));
            animatorSet = dvVar.h;
            if (animatorSet != null) {
                animatorSet.cancel();
                dvVar.h = null;
            }
            dvVar.n = false;
        }
        return dvVar.n;
    }

    public final boolean b(MotionEvent motionEvent, boolean z10) {
        org.telegram.ui.ActionBar.l lVar;
        dv dvVar = this.n;
        cv[] cvVarArr = dvVar.f;
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = dvVar.e;
        int i10 = scrollSlidingTextTabStrip.O.get(scrollSlidingTextTabStrip.n + (z10 ? 1 : -1), -1);
        if (i10 < 0) {
            return false;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        this.c = false;
        this.b = true;
        this.d = (int) motionEvent.getX();
        lVar = ((org.telegram.ui.ActionBar.k2) dvVar).actionBar;
        lVar.setEnabled(false);
        dvVar.e.setEnabled(false);
        cv cvVar = cvVarArr[1];
        cvVar.f = i10;
        cvVar.setVisibility(0);
        dvVar.r = z10;
        dvVar.q0(true);
        if (z10) {
            cvVarArr[1].setTranslationX(cvVarArr[0].getMeasuredWidth());
            return true;
        }
        cvVarArr[1].setTranslationX(-cvVarArr[0].getMeasuredWidth());
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.z4 z4Var;
        org.telegram.ui.ActionBar.z4 z4Var2;
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        super.dispatchDraw(canvas);
        dv dvVar = this.n;
        z4Var = ((org.telegram.ui.ActionBar.k2) dvVar).parentLayout;
        if (z4Var != null) {
            z4Var2 = ((org.telegram.ui.ActionBar.k2) dvVar).parentLayout;
            lVar = ((org.telegram.ui.ActionBar.k2) dvVar).actionBar;
            int measuredHeight = lVar.getMeasuredHeight();
            lVar2 = ((org.telegram.ui.ActionBar.k2) dvVar).actionBar;
            ((ActionBarLayout) z4Var2).q(canvas, measuredHeight + ((int) lVar2.getTranslationY()));
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        dv dvVar = this.n;
        Paint paint = dvVar.d;
        paint.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.d6, false));
        lVar = ((org.telegram.ui.ActionBar.k2) dvVar).actionBar;
        float measuredHeight = lVar.getMeasuredHeight();
        lVar2 = ((org.telegram.ui.ActionBar.k2) dvVar).actionBar;
        canvas.drawRect(0.0f, lVar2.getTranslationY() + measuredHeight, getMeasuredWidth(), getMeasuredHeight(), paint);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return a() || this.n.e.H || onTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        org.telegram.ui.ActionBar.l lVar3;
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        dv dvVar = this.n;
        cv[] cvVarArr = dvVar.f;
        lVar = ((org.telegram.ui.ActionBar.k2) dvVar).actionBar;
        measureChildWithMargins(lVar, i10, 0, i11, 0);
        lVar2 = ((org.telegram.ui.ActionBar.k2) dvVar).actionBar;
        int measuredHeight = lVar2.getMeasuredHeight();
        this.h = true;
        for (int i12 = 0; i12 < cvVarArr.length; i12++) {
            cv cvVar = cvVarArr[i12];
            if (cvVar != null) {
                org.telegram.ui.Components.tk0 tk0Var = cvVar.d;
                if (tk0Var != null) {
                    tk0Var.setPadding(0, measuredHeight, 0, 0);
                }
                ag.b1 b1Var = cvVarArr[i12].e;
                if (b1Var != null) {
                    b1Var.setPadding(0, measuredHeight, 0, 0);
                }
            }
        }
        this.h = false;
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt != null && childAt.getVisibility() != 8) {
                lVar3 = ((org.telegram.ui.ActionBar.k2) dvVar).actionBar;
                if (childAt != lVar3) {
                    measureChildWithMargins(childAt, i10, 0, i11, 0);
                }
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.z4 z4Var;
        float f7;
        float f10;
        org.telegram.ui.ActionBar.l lVar;
        float measuredWidth;
        boolean z10;
        dv dvVar = this.n;
        cv[] cvVarArr = dvVar.f;
        z4Var = ((org.telegram.ui.ActionBar.k2) dvVar).parentLayout;
        if (((ActionBarLayout) z4Var).i() || a()) {
            return false;
        }
        if (motionEvent != null) {
            if (this.f == null) {
                this.f = VelocityTracker.obtain();
            }
            this.f.addMovement(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && !this.b && !this.c) {
            this.a = motionEvent.getPointerId(0);
            this.c = true;
            this.d = (int) motionEvent.getX();
            this.e = (int) motionEvent.getY();
            this.f.clear();
        } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.a) {
            int x10 = (int) (motionEvent.getX() - this.d);
            int abs = Math.abs(((int) motionEvent.getY()) - this.e);
            if (this.b && (((z10 = dvVar.r) && x10 > 0) || (!z10 && x10 < 0))) {
                if (!b(motionEvent, x10 < 0)) {
                    this.c = true;
                    this.b = false;
                    cvVarArr[0].setTranslationX(0.0f);
                    cvVarArr[1].setTranslationX(dvVar.r ? cvVarArr[0].getMeasuredWidth() : -cvVarArr[0].getMeasuredWidth());
                    dvVar.e.i(0.0f, cvVarArr[1].f);
                }
            }
            if (!this.c || this.b) {
                if (this.b) {
                    cvVarArr[0].setTranslationX(x10);
                    if (dvVar.r) {
                        cvVarArr[1].setTranslationX(cvVarArr[0].getMeasuredWidth() + x10);
                    } else {
                        cvVarArr[1].setTranslationX(x10 - cvVarArr[0].getMeasuredWidth());
                    }
                    dvVar.e.i(Math.abs(x10) / cvVarArr[0].getMeasuredWidth(), cvVarArr[1].f);
                }
            } else if (Math.abs(x10) >= org.telegram.messenger.i0.a1(true, 0.3f) && Math.abs(x10) > abs) {
                b(motionEvent, x10 < 0);
            }
        } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.a && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
            this.f.computeCurrentVelocity(1000, dvVar.w);
            if (motionEvent == null || motionEvent.getAction() == 3) {
                f7 = 0.0f;
                f10 = 0.0f;
            } else {
                f7 = this.f.getXVelocity();
                f10 = this.f.getYVelocity();
                if (!this.b && Math.abs(f7) >= 3000.0f && Math.abs(f7) > Math.abs(f10)) {
                    b(motionEvent, f7 < 0.0f);
                }
            }
            if (this.b) {
                float x11 = cvVarArr[0].getX();
                dvVar.h = new AnimatorSet();
                boolean z11 = Math.abs(x11) < ((float) cvVarArr[0].getMeasuredWidth()) / 3.0f && (Math.abs(f7) < 3500.0f || Math.abs(f7) < Math.abs(f10));
                dvVar.s = z11;
                Property property = View.TRANSLATION_X;
                if (z11) {
                    measuredWidth = Math.abs(x11);
                    if (dvVar.r) {
                        dvVar.h.playTogether(ObjectAnimator.ofFloat(cvVarArr[0], (Property<cv, Float>) property, 0.0f), ObjectAnimator.ofFloat(cvVarArr[1], (Property<cv, Float>) property, r1.getMeasuredWidth()));
                    } else {
                        dvVar.h.playTogether(ObjectAnimator.ofFloat(cvVarArr[0], (Property<cv, Float>) property, 0.0f), ObjectAnimator.ofFloat(cvVarArr[1], (Property<cv, Float>) property, -r1.getMeasuredWidth()));
                    }
                } else {
                    measuredWidth = cvVarArr[0].getMeasuredWidth() - Math.abs(x11);
                    if (dvVar.r) {
                        dvVar.h.playTogether(ObjectAnimator.ofFloat(cvVarArr[0], (Property<cv, Float>) property, -r9.getMeasuredWidth()), ObjectAnimator.ofFloat(cvVarArr[1], (Property<cv, Float>) property, 0.0f));
                    } else {
                        dvVar.h.playTogether(ObjectAnimator.ofFloat(cvVarArr[0], (Property<cv, Float>) property, r9.getMeasuredWidth()), ObjectAnimator.ofFloat(cvVarArr[1], (Property<cv, Float>) property, 0.0f));
                    }
                }
                dvVar.h.setInterpolator(dv.y);
                int measuredWidth2 = getMeasuredWidth();
                float f11 = measuredWidth2 / 2;
                float I = (org.telegram.messenger.i0.I(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth2)) * f11) + f11;
                dvVar.h.setDuration(Math.max(org.telegram.messenger.zs.g2, Math.min(Math.abs(f7) > 0.0f ? Math.round(Math.abs(I / r4) * 1000.0f) * 4 : (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f), 600)));
                dvVar.h.addListener(new org.telegram.ui.Components.voip.h2(this, 4));
                dvVar.h.start();
                dvVar.n = true;
                this.b = false;
            } else {
                this.c = false;
                lVar = ((org.telegram.ui.ActionBar.k2) dvVar).actionBar;
                lVar.setEnabled(true);
                dvVar.e.setEnabled(true);
            }
            VelocityTracker velocityTracker = this.f;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f = null;
            }
        }
        return this.b;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.h) {
            return;
        }
        super.requestLayout();
    }
}
