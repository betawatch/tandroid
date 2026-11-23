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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class bu extends FrameLayout {
    public int a;
    public boolean b;
    public boolean c;
    public int d;
    public int e;
    public VelocityTracker f;
    public boolean h;
    public final /* synthetic */ du n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bu(du duVar, Context context) {
        super(context);
        this.n = duVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a() {
        AnimatorSet animatorSet;
        du duVar = this.n;
        cu[] cuVarArr = duVar.f;
        if (!duVar.n) {
            return false;
        }
        if (!duVar.s) {
            if (Math.abs(cuVarArr[1].getTranslationX()) < 1.0f) {
                cuVarArr[0].setTranslationX(r2.getMeasuredWidth() * (duVar.r ? -1 : 1));
                cuVarArr[1].setTranslationX(0.0f);
                animatorSet = duVar.h;
                if (animatorSet != null) {
                }
                duVar.n = false;
            }
            return duVar.n;
        }
        if (Math.abs(cuVarArr[0].getTranslationX()) < 1.0f) {
            cuVarArr[0].setTranslationX(0.0f);
            cuVarArr[1].setTranslationX(cuVarArr[0].getMeasuredWidth() * (duVar.r ? 1 : -1));
            animatorSet = duVar.h;
            if (animatorSet != null) {
                animatorSet.cancel();
                duVar.h = null;
            }
            duVar.n = false;
        }
        return duVar.n;
    }

    public final boolean b(MotionEvent motionEvent, boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        du duVar = this.n;
        cu[] cuVarArr = duVar.f;
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = duVar.e;
        int i7 = scrollSlidingTextTabStrip.P.get(scrollSlidingTextTabStrip.n + (z10 ? 1 : -1), -1);
        if (i7 < 0) {
            return false;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        this.c = false;
        this.b = true;
        this.d = (int) motionEvent.getX();
        kVar = ((org.telegram.ui.ActionBar.g2) duVar).actionBar;
        kVar.setEnabled(false);
        duVar.e.setEnabled(false);
        cu cuVar = cuVarArr[1];
        cuVar.f = i7;
        cuVar.setVisibility(0);
        duVar.r = z10;
        duVar.r0(true);
        if (z10) {
            cuVarArr[1].setTranslationX(cuVarArr[0].getMeasuredWidth());
            return true;
        }
        cuVarArr[1].setTranslationX(-cuVarArr[0].getMeasuredWidth());
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.r4 r4Var;
        org.telegram.ui.ActionBar.r4 r4Var2;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        super.dispatchDraw(canvas);
        du duVar = this.n;
        r4Var = ((org.telegram.ui.ActionBar.g2) duVar).parentLayout;
        if (r4Var != null) {
            r4Var2 = ((org.telegram.ui.ActionBar.g2) duVar).parentLayout;
            kVar = ((org.telegram.ui.ActionBar.g2) duVar).actionBar;
            int measuredHeight = kVar.getMeasuredHeight();
            kVar2 = ((org.telegram.ui.ActionBar.g2) duVar).actionBar;
            ((ActionBarLayout) r4Var2).q(canvas, measuredHeight + ((int) kVar2.getTranslationY()));
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        du duVar = this.n;
        Paint paint = duVar.d;
        paint.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.d6, false));
        kVar = ((org.telegram.ui.ActionBar.g2) duVar).actionBar;
        float measuredHeight = kVar.getMeasuredHeight();
        kVar2 = ((org.telegram.ui.ActionBar.g2) duVar).actionBar;
        canvas.drawRect(0.0f, kVar2.getTranslationY() + measuredHeight, getMeasuredWidth(), getMeasuredHeight(), paint);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return a() || this.n.e.I || onTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        setMeasuredDimension(View.MeasureSpec.getSize(i7), View.MeasureSpec.getSize(i10));
        du duVar = this.n;
        cu[] cuVarArr = duVar.f;
        kVar = ((org.telegram.ui.ActionBar.g2) duVar).actionBar;
        measureChildWithMargins(kVar, i7, 0, i10, 0);
        kVar2 = ((org.telegram.ui.ActionBar.g2) duVar).actionBar;
        int measuredHeight = kVar2.getMeasuredHeight();
        this.h = true;
        for (int i11 = 0; i11 < cuVarArr.length; i11++) {
            cu cuVar = cuVarArr[i11];
            if (cuVar != null) {
                org.telegram.ui.Components.ek0 ek0Var = cuVar.d;
                if (ek0Var != null) {
                    ek0Var.setPadding(0, measuredHeight, 0, 0);
                }
                di.b1 b1Var = cuVarArr[i11].e;
                if (b1Var != null) {
                    b1Var.setPadding(0, measuredHeight, 0, 0);
                }
            }
        }
        this.h = false;
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt != null && childAt.getVisibility() != 8) {
                kVar3 = ((org.telegram.ui.ActionBar.g2) duVar).actionBar;
                if (childAt != kVar3) {
                    measureChildWithMargins(childAt, i7, 0, i10, 0);
                }
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.r4 r4Var;
        float f10;
        float f11;
        org.telegram.ui.ActionBar.k kVar;
        float measuredWidth;
        boolean z10;
        du duVar = this.n;
        cu[] cuVarArr = duVar.f;
        r4Var = ((org.telegram.ui.ActionBar.g2) duVar).parentLayout;
        if (((ActionBarLayout) r4Var).i() || a()) {
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
            if (this.b && (((z10 = duVar.r) && x10 > 0) || (!z10 && x10 < 0))) {
                if (!b(motionEvent, x10 < 0)) {
                    this.c = true;
                    this.b = false;
                    cuVarArr[0].setTranslationX(0.0f);
                    cuVarArr[1].setTranslationX(duVar.r ? cuVarArr[0].getMeasuredWidth() : -cuVarArr[0].getMeasuredWidth());
                    duVar.e.i(0.0f, cuVarArr[1].f);
                }
            }
            if (!this.c || this.b) {
                if (this.b) {
                    cuVarArr[0].setTranslationX(x10);
                    if (duVar.r) {
                        cuVarArr[1].setTranslationX(cuVarArr[0].getMeasuredWidth() + x10);
                    } else {
                        cuVarArr[1].setTranslationX(x10 - cuVarArr[0].getMeasuredWidth());
                    }
                    duVar.e.i(Math.abs(x10) / cuVarArr[0].getMeasuredWidth(), cuVarArr[1].f);
                }
            } else if (Math.abs(x10) >= org.telegram.messenger.g0.a1(true, 0.3f) && Math.abs(x10) > abs) {
                b(motionEvent, x10 < 0);
            }
        } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.a && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
            this.f.computeCurrentVelocity(1000, duVar.w);
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
                float x11 = cuVarArr[0].getX();
                duVar.h = new AnimatorSet();
                boolean z11 = Math.abs(x11) < ((float) cuVarArr[0].getMeasuredWidth()) / 3.0f && (Math.abs(f10) < 3500.0f || Math.abs(f10) < Math.abs(f11));
                duVar.s = z11;
                Property property = View.TRANSLATION_X;
                if (z11) {
                    measuredWidth = Math.abs(x11);
                    if (duVar.r) {
                        duVar.h.playTogether(ObjectAnimator.ofFloat(cuVarArr[0], (Property<cu, Float>) property, 0.0f), ObjectAnimator.ofFloat(cuVarArr[1], (Property<cu, Float>) property, r1.getMeasuredWidth()));
                    } else {
                        duVar.h.playTogether(ObjectAnimator.ofFloat(cuVarArr[0], (Property<cu, Float>) property, 0.0f), ObjectAnimator.ofFloat(cuVarArr[1], (Property<cu, Float>) property, -r1.getMeasuredWidth()));
                    }
                } else {
                    measuredWidth = cuVarArr[0].getMeasuredWidth() - Math.abs(x11);
                    if (duVar.r) {
                        duVar.h.playTogether(ObjectAnimator.ofFloat(cuVarArr[0], (Property<cu, Float>) property, -r9.getMeasuredWidth()), ObjectAnimator.ofFloat(cuVarArr[1], (Property<cu, Float>) property, 0.0f));
                    } else {
                        duVar.h.playTogether(ObjectAnimator.ofFloat(cuVarArr[0], (Property<cu, Float>) property, r9.getMeasuredWidth()), ObjectAnimator.ofFloat(cuVarArr[1], (Property<cu, Float>) property, 0.0f));
                    }
                }
                duVar.h.setInterpolator(du.y);
                int measuredWidth2 = getMeasuredWidth();
                float f12 = measuredWidth2 / 2;
                float I = (org.telegram.messenger.g0.I(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth2)) * f12) + f12;
                duVar.h.setDuration(Math.max(org.telegram.messenger.ks.g2, Math.min(Math.abs(f10) > 0.0f ? Math.round(Math.abs(I / r4) * 1000.0f) * 4 : (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f), 600)));
                duVar.h.addListener(new org.telegram.ui.Cells.x9(this, 24));
                duVar.h.start();
                duVar.n = true;
                this.b = false;
            } else {
                this.c = false;
                kVar = ((org.telegram.ui.ActionBar.g2) duVar).actionBar;
                kVar.setEnabled(true);
                duVar.e.setEnabled(true);
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
