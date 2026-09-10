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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class nv extends FrameLayout {
    public int a;
    public boolean b;
    public boolean c;
    public int d;
    public int e;
    public VelocityTracker f;
    public boolean h;
    public final /* synthetic */ pv n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nv(pv pvVar, Context context) {
        super(context);
        this.n = pvVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a() {
        AnimatorSet animatorSet;
        pv pvVar = this.n;
        ov[] ovVarArr = pvVar.f;
        if (!pvVar.n) {
            return false;
        }
        if (!pvVar.s) {
            if (Math.abs(ovVarArr[1].getTranslationX()) < 1.0f) {
                ovVarArr[0].setTranslationX(r2.getMeasuredWidth() * (pvVar.r ? -1 : 1));
                ovVarArr[1].setTranslationX(0.0f);
                animatorSet = pvVar.h;
                if (animatorSet != null) {
                }
                pvVar.n = false;
            }
            return pvVar.n;
        }
        if (Math.abs(ovVarArr[0].getTranslationX()) < 1.0f) {
            ovVarArr[0].setTranslationX(0.0f);
            ovVarArr[1].setTranslationX(ovVarArr[0].getMeasuredWidth() * (pvVar.r ? 1 : -1));
            animatorSet = pvVar.h;
            if (animatorSet != null) {
                animatorSet.cancel();
                pvVar.h = null;
            }
            pvVar.n = false;
        }
        return pvVar.n;
    }

    public final boolean b(MotionEvent motionEvent, boolean z10) {
        org.telegram.ui.ActionBar.l lVar;
        pv pvVar = this.n;
        ov[] ovVarArr = pvVar.f;
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = pvVar.e;
        int i10 = scrollSlidingTextTabStrip.O.get(scrollSlidingTextTabStrip.n + (z10 ? 1 : -1), -1);
        if (i10 < 0) {
            return false;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        this.c = false;
        this.b = true;
        this.d = (int) motionEvent.getX();
        lVar = ((org.telegram.ui.ActionBar.p2) pvVar).actionBar;
        lVar.setEnabled(false);
        pvVar.e.setEnabled(false);
        ov ovVar = ovVarArr[1];
        ovVar.f = i10;
        ovVar.setVisibility(0);
        pvVar.r = z10;
        pvVar.m0(true);
        if (z10) {
            ovVarArr[1].setTranslationX(ovVarArr[0].getMeasuredWidth());
            return true;
        }
        ovVarArr[1].setTranslationX(-ovVarArr[0].getMeasuredWidth());
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.f5 f5Var;
        org.telegram.ui.ActionBar.f5 f5Var2;
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        super.dispatchDraw(canvas);
        pv pvVar = this.n;
        f5Var = ((org.telegram.ui.ActionBar.p2) pvVar).parentLayout;
        if (f5Var != null) {
            f5Var2 = ((org.telegram.ui.ActionBar.p2) pvVar).parentLayout;
            lVar = ((org.telegram.ui.ActionBar.p2) pvVar).actionBar;
            int measuredHeight = lVar.getMeasuredHeight();
            lVar2 = ((org.telegram.ui.ActionBar.p2) pvVar).actionBar;
            ((ActionBarLayout) f5Var2).q(canvas, measuredHeight + ((int) lVar2.getTranslationY()));
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        pv pvVar = this.n;
        Paint paint = pvVar.d;
        paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
        lVar = ((org.telegram.ui.ActionBar.p2) pvVar).actionBar;
        float measuredHeight = lVar.getMeasuredHeight();
        lVar2 = ((org.telegram.ui.ActionBar.p2) pvVar).actionBar;
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
        pv pvVar = this.n;
        ov[] ovVarArr = pvVar.f;
        lVar = ((org.telegram.ui.ActionBar.p2) pvVar).actionBar;
        measureChildWithMargins(lVar, i10, 0, i11, 0);
        lVar2 = ((org.telegram.ui.ActionBar.p2) pvVar).actionBar;
        int measuredHeight = lVar2.getMeasuredHeight();
        this.h = true;
        for (int i12 = 0; i12 < ovVarArr.length; i12++) {
            ov ovVar = ovVarArr[i12];
            if (ovVar != null) {
                org.telegram.ui.Components.vl0 vl0Var = ovVar.d;
                if (vl0Var != null) {
                    vl0Var.setPadding(0, measuredHeight, 0, 0);
                }
                bi.y1 y1Var = ovVarArr[i12].e;
                if (y1Var != null) {
                    y1Var.setPadding(0, measuredHeight, 0, 0);
                }
            }
        }
        this.h = false;
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt != null && childAt.getVisibility() != 8) {
                lVar3 = ((org.telegram.ui.ActionBar.p2) pvVar).actionBar;
                if (childAt != lVar3) {
                    measureChildWithMargins(childAt, i10, 0, i11, 0);
                }
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.f5 f5Var;
        float f7;
        float f10;
        org.telegram.ui.ActionBar.l lVar;
        float measuredWidth;
        boolean z10;
        pv pvVar = this.n;
        ov[] ovVarArr = pvVar.f;
        f5Var = ((org.telegram.ui.ActionBar.p2) pvVar).parentLayout;
        if (((ActionBarLayout) f5Var).j() || a()) {
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
            if (this.b && (((z10 = pvVar.r) && x10 > 0) || (!z10 && x10 < 0))) {
                if (!b(motionEvent, x10 < 0)) {
                    this.c = true;
                    this.b = false;
                    ovVarArr[0].setTranslationX(0.0f);
                    ovVarArr[1].setTranslationX(pvVar.r ? ovVarArr[0].getMeasuredWidth() : -ovVarArr[0].getMeasuredWidth());
                    pvVar.e.j(0.0f, ovVarArr[1].f);
                }
            }
            if (!this.c || this.b) {
                if (this.b) {
                    ovVarArr[0].setTranslationX(x10);
                    if (pvVar.r) {
                        ovVarArr[1].setTranslationX(ovVarArr[0].getMeasuredWidth() + x10);
                    } else {
                        ovVarArr[1].setTranslationX(x10 - ovVarArr[0].getMeasuredWidth());
                    }
                    pvVar.e.j(Math.abs(x10) / ovVarArr[0].getMeasuredWidth(), ovVarArr[1].f);
                }
            } else if (Math.abs(x10) >= AndroidUtilities.getPixelsInCM(0.3f, true) && Math.abs(x10) > abs) {
                b(motionEvent, x10 < 0);
            }
        } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.a && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
            this.f.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, pvVar.v);
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
                float x11 = ovVarArr[0].getX();
                pvVar.h = new AnimatorSet();
                boolean z11 = Math.abs(x11) < ((float) ovVarArr[0].getMeasuredWidth()) / 3.0f && (Math.abs(f7) < 3500.0f || Math.abs(f7) < Math.abs(f10));
                pvVar.s = z11;
                Property property = View.TRANSLATION_X;
                if (z11) {
                    measuredWidth = Math.abs(x11);
                    if (pvVar.r) {
                        pvVar.h.playTogether(ObjectAnimator.ofFloat(ovVarArr[0], (Property<ov, Float>) property, 0.0f), ObjectAnimator.ofFloat(ovVarArr[1], (Property<ov, Float>) property, r1.getMeasuredWidth()));
                    } else {
                        pvVar.h.playTogether(ObjectAnimator.ofFloat(ovVarArr[0], (Property<ov, Float>) property, 0.0f), ObjectAnimator.ofFloat(ovVarArr[1], (Property<ov, Float>) property, -r1.getMeasuredWidth()));
                    }
                } else {
                    measuredWidth = ovVarArr[0].getMeasuredWidth() - Math.abs(x11);
                    if (pvVar.r) {
                        pvVar.h.playTogether(ObjectAnimator.ofFloat(ovVarArr[0], (Property<ov, Float>) property, -r9.getMeasuredWidth()), ObjectAnimator.ofFloat(ovVarArr[1], (Property<ov, Float>) property, 0.0f));
                    } else {
                        pvVar.h.playTogether(ObjectAnimator.ofFloat(ovVarArr[0], (Property<ov, Float>) property, r9.getMeasuredWidth()), ObjectAnimator.ofFloat(ovVarArr[1], (Property<ov, Float>) property, 0.0f));
                    }
                }
                pvVar.h.setInterpolator(pv.x);
                int measuredWidth2 = getMeasuredWidth();
                float f11 = measuredWidth2 / 2;
                float distanceInfluenceForSnapDuration = (AndroidUtilities.distanceInfluenceForSnapDuration(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth2)) * f11) + f11;
                pvVar.h.setDuration(Math.max(ImageReceiver.DEFAULT_CROSSFADE_DURATION, Math.min(Math.abs(f7) > 0.0f ? Math.round(Math.abs(distanceInfluenceForSnapDuration / r4) * 1000.0f) * 4 : (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f), 600)));
                pvVar.h.addListener(new org.telegram.ui.Components.voip.v2(this, 5));
                pvVar.h.start();
                pvVar.n = true;
                this.b = false;
            } else {
                this.c = false;
                lVar = ((org.telegram.ui.ActionBar.p2) pvVar).actionBar;
                lVar.setEnabled(true);
                pvVar.e.setEnabled(true);
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
