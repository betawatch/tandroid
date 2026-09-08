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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class mv extends FrameLayout {
    public int a;
    public boolean b;
    public boolean c;
    public int d;
    public int e;
    public VelocityTracker f;
    public boolean h;
    public final /* synthetic */ ov n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mv(ov ovVar, Context context) {
        super(context);
        this.n = ovVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a() {
        AnimatorSet animatorSet;
        ov ovVar = this.n;
        nv[] nvVarArr = ovVar.f;
        if (!ovVar.n) {
            return false;
        }
        if (!ovVar.s) {
            if (Math.abs(nvVarArr[1].getTranslationX()) < 1.0f) {
                nvVarArr[0].setTranslationX(r2.getMeasuredWidth() * (ovVar.r ? -1 : 1));
                nvVarArr[1].setTranslationX(0.0f);
                animatorSet = ovVar.h;
                if (animatorSet != null) {
                }
                ovVar.n = false;
            }
            return ovVar.n;
        }
        if (Math.abs(nvVarArr[0].getTranslationX()) < 1.0f) {
            nvVarArr[0].setTranslationX(0.0f);
            nvVarArr[1].setTranslationX(nvVarArr[0].getMeasuredWidth() * (ovVar.r ? 1 : -1));
            animatorSet = ovVar.h;
            if (animatorSet != null) {
                animatorSet.cancel();
                ovVar.h = null;
            }
            ovVar.n = false;
        }
        return ovVar.n;
    }

    public final boolean b(MotionEvent motionEvent, boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        ov ovVar = this.n;
        nv[] nvVarArr = ovVar.f;
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = ovVar.e;
        int i10 = scrollSlidingTextTabStrip.O.get(scrollSlidingTextTabStrip.n + (z10 ? 1 : -1), -1);
        if (i10 < 0) {
            return false;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        this.c = false;
        this.b = true;
        this.d = (int) motionEvent.getX();
        kVar = ((org.telegram.ui.ActionBar.n2) ovVar).actionBar;
        kVar.setEnabled(false);
        ovVar.e.setEnabled(false);
        nv nvVar = nvVarArr[1];
        nvVar.f = i10;
        nvVar.setVisibility(0);
        ovVar.r = z10;
        ovVar.m0(true);
        if (z10) {
            nvVarArr[1].setTranslationX(nvVarArr[0].getMeasuredWidth());
            return true;
        }
        nvVarArr[1].setTranslationX(-nvVarArr[0].getMeasuredWidth());
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.d5 d5Var;
        org.telegram.ui.ActionBar.d5 d5Var2;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        super.dispatchDraw(canvas);
        ov ovVar = this.n;
        d5Var = ((org.telegram.ui.ActionBar.n2) ovVar).parentLayout;
        if (d5Var != null) {
            d5Var2 = ((org.telegram.ui.ActionBar.n2) ovVar).parentLayout;
            kVar = ((org.telegram.ui.ActionBar.n2) ovVar).actionBar;
            int measuredHeight = kVar.getMeasuredHeight();
            kVar2 = ((org.telegram.ui.ActionBar.n2) ovVar).actionBar;
            ((ActionBarLayout) d5Var2).q(canvas, measuredHeight + ((int) kVar2.getTranslationY()));
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        ov ovVar = this.n;
        Paint paint = ovVar.d;
        paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
        kVar = ((org.telegram.ui.ActionBar.n2) ovVar).actionBar;
        float measuredHeight = kVar.getMeasuredHeight();
        kVar2 = ((org.telegram.ui.ActionBar.n2) ovVar).actionBar;
        canvas.drawRect(0.0f, kVar2.getTranslationY() + measuredHeight, getMeasuredWidth(), getMeasuredHeight(), paint);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return a() || this.n.e.H || onTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        ov ovVar = this.n;
        nv[] nvVarArr = ovVar.f;
        kVar = ((org.telegram.ui.ActionBar.n2) ovVar).actionBar;
        measureChildWithMargins(kVar, i10, 0, i11, 0);
        kVar2 = ((org.telegram.ui.ActionBar.n2) ovVar).actionBar;
        int measuredHeight = kVar2.getMeasuredHeight();
        this.h = true;
        for (int i12 = 0; i12 < nvVarArr.length; i12++) {
            nv nvVar = nvVarArr[i12];
            if (nvVar != null) {
                org.telegram.ui.Components.ll0 ll0Var = nvVar.d;
                if (ll0Var != null) {
                    ll0Var.setPadding(0, measuredHeight, 0, 0);
                }
                bi.o0 o0Var = nvVarArr[i12].e;
                if (o0Var != null) {
                    o0Var.setPadding(0, measuredHeight, 0, 0);
                }
            }
        }
        this.h = false;
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt != null && childAt.getVisibility() != 8) {
                kVar3 = ((org.telegram.ui.ActionBar.n2) ovVar).actionBar;
                if (childAt != kVar3) {
                    measureChildWithMargins(childAt, i10, 0, i11, 0);
                }
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.d5 d5Var;
        float f7;
        float f10;
        org.telegram.ui.ActionBar.k kVar;
        float measuredWidth;
        boolean z10;
        ov ovVar = this.n;
        nv[] nvVarArr = ovVar.f;
        d5Var = ((org.telegram.ui.ActionBar.n2) ovVar).parentLayout;
        if (((ActionBarLayout) d5Var).j() || a()) {
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
            if (this.b && (((z10 = ovVar.r) && x10 > 0) || (!z10 && x10 < 0))) {
                if (!b(motionEvent, x10 < 0)) {
                    this.c = true;
                    this.b = false;
                    nvVarArr[0].setTranslationX(0.0f);
                    nvVarArr[1].setTranslationX(ovVar.r ? nvVarArr[0].getMeasuredWidth() : -nvVarArr[0].getMeasuredWidth());
                    ovVar.e.j(0.0f, nvVarArr[1].f);
                }
            }
            if (!this.c || this.b) {
                if (this.b) {
                    nvVarArr[0].setTranslationX(x10);
                    if (ovVar.r) {
                        nvVarArr[1].setTranslationX(nvVarArr[0].getMeasuredWidth() + x10);
                    } else {
                        nvVarArr[1].setTranslationX(x10 - nvVarArr[0].getMeasuredWidth());
                    }
                    ovVar.e.j(Math.abs(x10) / nvVarArr[0].getMeasuredWidth(), nvVarArr[1].f);
                }
            } else if (Math.abs(x10) >= AndroidUtilities.getPixelsInCM(0.3f, true) && Math.abs(x10) > abs) {
                b(motionEvent, x10 < 0);
            }
        } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.a && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
            this.f.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, ovVar.v);
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
                float x11 = nvVarArr[0].getX();
                ovVar.h = new AnimatorSet();
                boolean z11 = Math.abs(x11) < ((float) nvVarArr[0].getMeasuredWidth()) / 3.0f && (Math.abs(f7) < 3500.0f || Math.abs(f7) < Math.abs(f10));
                ovVar.s = z11;
                Property property = View.TRANSLATION_X;
                if (z11) {
                    measuredWidth = Math.abs(x11);
                    if (ovVar.r) {
                        ovVar.h.playTogether(ObjectAnimator.ofFloat(nvVarArr[0], (Property<nv, Float>) property, 0.0f), ObjectAnimator.ofFloat(nvVarArr[1], (Property<nv, Float>) property, r1.getMeasuredWidth()));
                    } else {
                        ovVar.h.playTogether(ObjectAnimator.ofFloat(nvVarArr[0], (Property<nv, Float>) property, 0.0f), ObjectAnimator.ofFloat(nvVarArr[1], (Property<nv, Float>) property, -r1.getMeasuredWidth()));
                    }
                } else {
                    measuredWidth = nvVarArr[0].getMeasuredWidth() - Math.abs(x11);
                    if (ovVar.r) {
                        ovVar.h.playTogether(ObjectAnimator.ofFloat(nvVarArr[0], (Property<nv, Float>) property, -r9.getMeasuredWidth()), ObjectAnimator.ofFloat(nvVarArr[1], (Property<nv, Float>) property, 0.0f));
                    } else {
                        ovVar.h.playTogether(ObjectAnimator.ofFloat(nvVarArr[0], (Property<nv, Float>) property, r9.getMeasuredWidth()), ObjectAnimator.ofFloat(nvVarArr[1], (Property<nv, Float>) property, 0.0f));
                    }
                }
                ovVar.h.setInterpolator(ov.x);
                int measuredWidth2 = getMeasuredWidth();
                float f11 = measuredWidth2 / 2;
                float distanceInfluenceForSnapDuration = (AndroidUtilities.distanceInfluenceForSnapDuration(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth2)) * f11) + f11;
                ovVar.h.setDuration(Math.max(ImageReceiver.DEFAULT_CROSSFADE_DURATION, Math.min(Math.abs(f7) > 0.0f ? Math.round(Math.abs(distanceInfluenceForSnapDuration / r4) * 1000.0f) * 4 : (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f), 600)));
                ovVar.h.addListener(new org.telegram.ui.Components.k61(this, 18));
                ovVar.h.start();
                ovVar.n = true;
                this.b = false;
            } else {
                this.c = false;
                kVar = ((org.telegram.ui.ActionBar.n2) ovVar).actionBar;
                kVar.setEnabled(true);
                ovVar.e.setEnabled(true);
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
