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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class au extends FrameLayout {
    public int a;
    public boolean b;
    public boolean c;
    public int d;
    public int e;
    public VelocityTracker f;
    public boolean h;
    public final /* synthetic */ cu n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public au(cu cuVar, Context context) {
        super(context);
        this.n = cuVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a() {
        AnimatorSet animatorSet;
        cu cuVar = this.n;
        bu[] buVarArr = cuVar.f;
        if (!cuVar.n) {
            return false;
        }
        if (!cuVar.s) {
            if (Math.abs(buVarArr[1].getTranslationX()) < 1.0f) {
                buVarArr[0].setTranslationX(r2.getMeasuredWidth() * (cuVar.r ? -1 : 1));
                buVarArr[1].setTranslationX(0.0f);
                animatorSet = cuVar.h;
                if (animatorSet != null) {
                }
                cuVar.n = false;
            }
            return cuVar.n;
        }
        if (Math.abs(buVarArr[0].getTranslationX()) < 1.0f) {
            buVarArr[0].setTranslationX(0.0f);
            buVarArr[1].setTranslationX(buVarArr[0].getMeasuredWidth() * (cuVar.r ? 1 : -1));
            animatorSet = cuVar.h;
            if (animatorSet != null) {
                animatorSet.cancel();
                cuVar.h = null;
            }
            cuVar.n = false;
        }
        return cuVar.n;
    }

    public final boolean b(MotionEvent motionEvent, boolean z9) {
        org.telegram.ui.ActionBar.k kVar;
        cu cuVar = this.n;
        bu[] buVarArr = cuVar.f;
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = cuVar.e;
        int i7 = scrollSlidingTextTabStrip.O.get(scrollSlidingTextTabStrip.n + (z9 ? 1 : -1), -1);
        if (i7 < 0) {
            return false;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        this.c = false;
        this.b = true;
        this.d = (int) motionEvent.getX();
        kVar = ((org.telegram.ui.ActionBar.f2) cuVar).actionBar;
        kVar.setEnabled(false);
        cuVar.e.setEnabled(false);
        bu buVar = buVarArr[1];
        buVar.f = i7;
        buVar.setVisibility(0);
        cuVar.r = z9;
        cuVar.r0(true);
        if (z9) {
            buVarArr[1].setTranslationX(buVarArr[0].getMeasuredWidth());
            return true;
        }
        buVarArr[1].setTranslationX(-buVarArr[0].getMeasuredWidth());
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.q4 q4Var;
        org.telegram.ui.ActionBar.q4 q4Var2;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        super.dispatchDraw(canvas);
        cu cuVar = this.n;
        q4Var = ((org.telegram.ui.ActionBar.f2) cuVar).parentLayout;
        if (q4Var != null) {
            q4Var2 = ((org.telegram.ui.ActionBar.f2) cuVar).parentLayout;
            kVar = ((org.telegram.ui.ActionBar.f2) cuVar).actionBar;
            int measuredHeight = kVar.getMeasuredHeight();
            kVar2 = ((org.telegram.ui.ActionBar.f2) cuVar).actionBar;
            ((ActionBarLayout) q4Var2).q(canvas, measuredHeight + ((int) kVar2.getTranslationY()));
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        cu cuVar = this.n;
        Paint paint = cuVar.d;
        paint.setColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.d6, false));
        kVar = ((org.telegram.ui.ActionBar.f2) cuVar).actionBar;
        float measuredHeight = kVar.getMeasuredHeight();
        kVar2 = ((org.telegram.ui.ActionBar.f2) cuVar).actionBar;
        canvas.drawRect(0.0f, kVar2.getTranslationY() + measuredHeight, getMeasuredWidth(), getMeasuredHeight(), paint);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return a() || this.n.e.H || onTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        setMeasuredDimension(View.MeasureSpec.getSize(i7), View.MeasureSpec.getSize(i10));
        cu cuVar = this.n;
        bu[] buVarArr = cuVar.f;
        kVar = ((org.telegram.ui.ActionBar.f2) cuVar).actionBar;
        measureChildWithMargins(kVar, i7, 0, i10, 0);
        kVar2 = ((org.telegram.ui.ActionBar.f2) cuVar).actionBar;
        int measuredHeight = kVar2.getMeasuredHeight();
        this.h = true;
        for (int i11 = 0; i11 < buVarArr.length; i11++) {
            bu buVar = buVarArr[i11];
            if (buVar != null) {
                org.telegram.ui.Components.qj0 qj0Var = buVar.d;
                if (qj0Var != null) {
                    qj0Var.setPadding(0, measuredHeight, 0, 0);
                }
                bi.q1 q1Var = buVarArr[i11].e;
                if (q1Var != null) {
                    q1Var.setPadding(0, measuredHeight, 0, 0);
                }
            }
        }
        this.h = false;
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt != null && childAt.getVisibility() != 8) {
                kVar3 = ((org.telegram.ui.ActionBar.f2) cuVar).actionBar;
                if (childAt != kVar3) {
                    measureChildWithMargins(childAt, i7, 0, i10, 0);
                }
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.q4 q4Var;
        float f10;
        float f11;
        org.telegram.ui.ActionBar.k kVar;
        float measuredWidth;
        boolean z9;
        cu cuVar = this.n;
        bu[] buVarArr = cuVar.f;
        q4Var = ((org.telegram.ui.ActionBar.f2) cuVar).parentLayout;
        if (((ActionBarLayout) q4Var).i() || a()) {
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
            if (this.b && (((z9 = cuVar.r) && x10 > 0) || (!z9 && x10 < 0))) {
                if (!b(motionEvent, x10 < 0)) {
                    this.c = true;
                    this.b = false;
                    buVarArr[0].setTranslationX(0.0f);
                    buVarArr[1].setTranslationX(cuVar.r ? buVarArr[0].getMeasuredWidth() : -buVarArr[0].getMeasuredWidth());
                    cuVar.e.i(0.0f, buVarArr[1].f);
                }
            }
            if (!this.c || this.b) {
                if (this.b) {
                    buVarArr[0].setTranslationX(x10);
                    if (cuVar.r) {
                        buVarArr[1].setTranslationX(buVarArr[0].getMeasuredWidth() + x10);
                    } else {
                        buVarArr[1].setTranslationX(x10 - buVarArr[0].getMeasuredWidth());
                    }
                    cuVar.e.i(Math.abs(x10) / buVarArr[0].getMeasuredWidth(), buVarArr[1].f);
                }
            } else if (Math.abs(x10) >= org.telegram.messenger.g0.a1(true, 0.3f) && Math.abs(x10) > abs) {
                b(motionEvent, x10 < 0);
            }
        } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.a && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
            this.f.computeCurrentVelocity(1000, cuVar.w);
            if (motionEvent == null || motionEvent.getAction() == 3) {
                f10 = 0.0f;
                f11 = 0.0f;
            } else {
                f10 = this.f.getXVelocity();
                f11 = this.f.getYVelocity();
                if (!this.b && Math.abs(f10) >= 3000.0f && Math.abs(f10) > Math.abs(f11)) {
                    b(motionEvent, f10 < 0.0f);
                }
            }
            if (this.b) {
                float x11 = buVarArr[0].getX();
                cuVar.h = new AnimatorSet();
                boolean z10 = Math.abs(x11) < ((float) buVarArr[0].getMeasuredWidth()) / 3.0f && (Math.abs(f10) < 3500.0f || Math.abs(f10) < Math.abs(f11));
                cuVar.s = z10;
                Property property = View.TRANSLATION_X;
                if (z10) {
                    measuredWidth = Math.abs(x11);
                    if (cuVar.r) {
                        cuVar.h.playTogether(ObjectAnimator.ofFloat(buVarArr[0], (Property<bu, Float>) property, 0.0f), ObjectAnimator.ofFloat(buVarArr[1], (Property<bu, Float>) property, r1.getMeasuredWidth()));
                    } else {
                        cuVar.h.playTogether(ObjectAnimator.ofFloat(buVarArr[0], (Property<bu, Float>) property, 0.0f), ObjectAnimator.ofFloat(buVarArr[1], (Property<bu, Float>) property, -r1.getMeasuredWidth()));
                    }
                } else {
                    measuredWidth = buVarArr[0].getMeasuredWidth() - Math.abs(x11);
                    if (cuVar.r) {
                        cuVar.h.playTogether(ObjectAnimator.ofFloat(buVarArr[0], (Property<bu, Float>) property, -r9.getMeasuredWidth()), ObjectAnimator.ofFloat(buVarArr[1], (Property<bu, Float>) property, 0.0f));
                    } else {
                        cuVar.h.playTogether(ObjectAnimator.ofFloat(buVarArr[0], (Property<bu, Float>) property, r9.getMeasuredWidth()), ObjectAnimator.ofFloat(buVarArr[1], (Property<bu, Float>) property, 0.0f));
                    }
                }
                cuVar.h.setInterpolator(cu.y);
                int measuredWidth2 = getMeasuredWidth();
                float f12 = measuredWidth2 / 2;
                float I = (org.telegram.messenger.g0.I(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth2)) * f12) + f12;
                cuVar.h.setDuration(Math.max(org.telegram.messenger.qs.g2, Math.min(Math.abs(f10) > 0.0f ? Math.round(Math.abs(I / r4) * 1000.0f) * 4 : (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f), 600)));
                cuVar.h.addListener(new va(this, 23));
                cuVar.h.start();
                cuVar.n = true;
                this.b = false;
            } else {
                this.c = false;
                kVar = ((org.telegram.ui.ActionBar.f2) cuVar).actionBar;
                kVar.setEnabled(true);
                cuVar.e.setEnabled(true);
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
