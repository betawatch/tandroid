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

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class av extends FrameLayout {
    public int a;
    public boolean b;
    public boolean c;
    public int d;
    public int e;
    public VelocityTracker f;
    public boolean h;
    public final /* synthetic */ cv n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public av(cv cvVar, Context context) {
        super(context);
        this.n = cvVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a() {
        AnimatorSet animatorSet;
        cv cvVar = this.n;
        bv[] bvVarArr = cvVar.f;
        if (!cvVar.n) {
            return false;
        }
        if (!cvVar.s) {
            if (Math.abs(bvVarArr[1].getTranslationX()) < 1.0f) {
                bvVarArr[0].setTranslationX(r2.getMeasuredWidth() * (cvVar.r ? -1 : 1));
                bvVarArr[1].setTranslationX(0.0f);
                animatorSet = cvVar.h;
                if (animatorSet != null) {
                }
                cvVar.n = false;
            }
            return cvVar.n;
        }
        if (Math.abs(bvVarArr[0].getTranslationX()) < 1.0f) {
            bvVarArr[0].setTranslationX(0.0f);
            bvVarArr[1].setTranslationX(bvVarArr[0].getMeasuredWidth() * (cvVar.r ? 1 : -1));
            animatorSet = cvVar.h;
            if (animatorSet != null) {
                animatorSet.cancel();
                cvVar.h = null;
            }
            cvVar.n = false;
        }
        return cvVar.n;
    }

    public final boolean b(MotionEvent motionEvent, boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        cv cvVar = this.n;
        bv[] bvVarArr = cvVar.f;
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = cvVar.e;
        int i10 = scrollSlidingTextTabStrip.O.get(scrollSlidingTextTabStrip.n + (z10 ? 1 : -1), -1);
        if (i10 < 0) {
            return false;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        this.c = false;
        this.b = true;
        this.d = (int) motionEvent.getX();
        kVar = ((org.telegram.ui.ActionBar.o2) cvVar).actionBar;
        kVar.setEnabled(false);
        cvVar.e.setEnabled(false);
        bv bvVar = bvVarArr[1];
        bvVar.f = i10;
        bvVar.setVisibility(0);
        cvVar.r = z10;
        cvVar.m0(true);
        if (z10) {
            bvVarArr[1].setTranslationX(bvVarArr[0].getMeasuredWidth());
            return true;
        }
        bvVarArr[1].setTranslationX(-bvVarArr[0].getMeasuredWidth());
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.h5 h5Var;
        org.telegram.ui.ActionBar.h5 h5Var2;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        super.dispatchDraw(canvas);
        cv cvVar = this.n;
        h5Var = ((org.telegram.ui.ActionBar.o2) cvVar).parentLayout;
        if (h5Var != null) {
            h5Var2 = ((org.telegram.ui.ActionBar.o2) cvVar).parentLayout;
            kVar = ((org.telegram.ui.ActionBar.o2) cvVar).actionBar;
            int measuredHeight = kVar.getMeasuredHeight();
            kVar2 = ((org.telegram.ui.ActionBar.o2) cvVar).actionBar;
            ((ActionBarLayout) h5Var2).q(canvas, measuredHeight + ((int) kVar2.getTranslationY()));
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        cv cvVar = this.n;
        Paint paint = cvVar.d;
        paint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.d6, false));
        kVar = ((org.telegram.ui.ActionBar.o2) cvVar).actionBar;
        float measuredHeight = kVar.getMeasuredHeight();
        kVar2 = ((org.telegram.ui.ActionBar.o2) cvVar).actionBar;
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
        cv cvVar = this.n;
        bv[] bvVarArr = cvVar.f;
        kVar = ((org.telegram.ui.ActionBar.o2) cvVar).actionBar;
        measureChildWithMargins(kVar, i10, 0, i11, 0);
        kVar2 = ((org.telegram.ui.ActionBar.o2) cvVar).actionBar;
        int measuredHeight = kVar2.getMeasuredHeight();
        this.h = true;
        for (int i12 = 0; i12 < bvVarArr.length; i12++) {
            bv bvVar = bvVarArr[i12];
            if (bvVar != null) {
                org.telegram.ui.Components.mm0 mm0Var = bvVar.d;
                if (mm0Var != null) {
                    mm0Var.setPadding(0, measuredHeight, 0, 0);
                }
                ai.u1 u1Var = bvVarArr[i12].e;
                if (u1Var != null) {
                    u1Var.setPadding(0, measuredHeight, 0, 0);
                }
            }
        }
        this.h = false;
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt != null && childAt.getVisibility() != 8) {
                kVar3 = ((org.telegram.ui.ActionBar.o2) cvVar).actionBar;
                if (childAt != kVar3) {
                    measureChildWithMargins(childAt, i10, 0, i11, 0);
                }
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.h5 h5Var;
        float f7;
        float f10;
        org.telegram.ui.ActionBar.k kVar;
        float measuredWidth;
        boolean z10;
        cv cvVar = this.n;
        bv[] bvVarArr = cvVar.f;
        h5Var = ((org.telegram.ui.ActionBar.o2) cvVar).parentLayout;
        if (((ActionBarLayout) h5Var).i() || a()) {
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
            if (this.b && (((z10 = cvVar.r) && x10 > 0) || (!z10 && x10 < 0))) {
                if (!b(motionEvent, x10 < 0)) {
                    this.c = true;
                    this.b = false;
                    bvVarArr[0].setTranslationX(0.0f);
                    bvVarArr[1].setTranslationX(cvVar.r ? bvVarArr[0].getMeasuredWidth() : -bvVarArr[0].getMeasuredWidth());
                    cvVar.e.i(0.0f, bvVarArr[1].f);
                }
            }
            if (!this.c || this.b) {
                if (this.b) {
                    bvVarArr[0].setTranslationX(x10);
                    if (cvVar.r) {
                        bvVarArr[1].setTranslationX(bvVarArr[0].getMeasuredWidth() + x10);
                    } else {
                        bvVarArr[1].setTranslationX(x10 - bvVarArr[0].getMeasuredWidth());
                    }
                    cvVar.e.i(Math.abs(x10) / bvVarArr[0].getMeasuredWidth(), bvVarArr[1].f);
                }
            } else if (Math.abs(x10) >= AndroidUtilities.getPixelsInCM(0.3f, true) && Math.abs(x10) > abs) {
                b(motionEvent, x10 < 0);
            }
        } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.a && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
            this.f.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, cvVar.v);
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
                float x11 = bvVarArr[0].getX();
                cvVar.h = new AnimatorSet();
                boolean z11 = Math.abs(x11) < ((float) bvVarArr[0].getMeasuredWidth()) / 3.0f && (Math.abs(f7) < 3500.0f || Math.abs(f7) < Math.abs(f10));
                cvVar.s = z11;
                Property property = View.TRANSLATION_X;
                if (z11) {
                    measuredWidth = Math.abs(x11);
                    if (cvVar.r) {
                        cvVar.h.playTogether(ObjectAnimator.ofFloat(bvVarArr[0], (Property<bv, Float>) property, 0.0f), ObjectAnimator.ofFloat(bvVarArr[1], (Property<bv, Float>) property, r1.getMeasuredWidth()));
                    } else {
                        cvVar.h.playTogether(ObjectAnimator.ofFloat(bvVarArr[0], (Property<bv, Float>) property, 0.0f), ObjectAnimator.ofFloat(bvVarArr[1], (Property<bv, Float>) property, -r1.getMeasuredWidth()));
                    }
                } else {
                    measuredWidth = bvVarArr[0].getMeasuredWidth() - Math.abs(x11);
                    if (cvVar.r) {
                        cvVar.h.playTogether(ObjectAnimator.ofFloat(bvVarArr[0], (Property<bv, Float>) property, -r9.getMeasuredWidth()), ObjectAnimator.ofFloat(bvVarArr[1], (Property<bv, Float>) property, 0.0f));
                    } else {
                        cvVar.h.playTogether(ObjectAnimator.ofFloat(bvVarArr[0], (Property<bv, Float>) property, r9.getMeasuredWidth()), ObjectAnimator.ofFloat(bvVarArr[1], (Property<bv, Float>) property, 0.0f));
                    }
                }
                cvVar.h.setInterpolator(cv.x);
                int measuredWidth2 = getMeasuredWidth();
                float f11 = measuredWidth2 / 2;
                float distanceInfluenceForSnapDuration = (AndroidUtilities.distanceInfluenceForSnapDuration(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth2)) * f11) + f11;
                cvVar.h.setDuration(Math.max(ImageReceiver.DEFAULT_CROSSFADE_DURATION, Math.min(Math.abs(f7) > 0.0f ? Math.round(Math.abs(distanceInfluenceForSnapDuration / r4) * 1000.0f) * 4 : (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f), 600)));
                cvVar.h.addListener(new org.telegram.ui.Components.p31(this, 22));
                cvVar.h.start();
                cvVar.n = true;
                this.b = false;
            } else {
                this.c = false;
                kVar = ((org.telegram.ui.ActionBar.o2) cvVar).actionBar;
                kVar.setEnabled(true);
                cvVar.e.setEnabled(true);
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
