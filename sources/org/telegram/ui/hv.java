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

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class hv extends FrameLayout {
    public int a;
    public boolean b;
    public boolean c;
    public int d;
    public int e;
    public VelocityTracker f;
    public boolean h;
    public final /* synthetic */ jv n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hv(jv jvVar, Context context) {
        super(context);
        this.n = jvVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a() {
        AnimatorSet animatorSet;
        jv jvVar = this.n;
        iv[] ivVarArr = jvVar.f;
        if (!jvVar.n) {
            return false;
        }
        if (!jvVar.s) {
            if (Math.abs(ivVarArr[1].getTranslationX()) < 1.0f) {
                ivVarArr[0].setTranslationX(r2.getMeasuredWidth() * (jvVar.r ? -1 : 1));
                ivVarArr[1].setTranslationX(0.0f);
                animatorSet = jvVar.h;
                if (animatorSet != null) {
                }
                jvVar.n = false;
            }
            return jvVar.n;
        }
        if (Math.abs(ivVarArr[0].getTranslationX()) < 1.0f) {
            ivVarArr[0].setTranslationX(0.0f);
            ivVarArr[1].setTranslationX(ivVarArr[0].getMeasuredWidth() * (jvVar.r ? 1 : -1));
            animatorSet = jvVar.h;
            if (animatorSet != null) {
                animatorSet.cancel();
                jvVar.h = null;
            }
            jvVar.n = false;
        }
        return jvVar.n;
    }

    public final boolean b(MotionEvent motionEvent, boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        jv jvVar = this.n;
        iv[] ivVarArr = jvVar.f;
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = jvVar.e;
        int i10 = scrollSlidingTextTabStrip.O.get(scrollSlidingTextTabStrip.n + (z10 ? 1 : -1), -1);
        if (i10 < 0) {
            return false;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        this.c = false;
        this.b = true;
        this.d = (int) motionEvent.getX();
        kVar = ((org.telegram.ui.ActionBar.m2) jvVar).actionBar;
        kVar.setEnabled(false);
        jvVar.e.setEnabled(false);
        iv ivVar = ivVarArr[1];
        ivVar.f = i10;
        ivVar.setVisibility(0);
        jvVar.r = z10;
        jvVar.m0(true);
        if (z10) {
            ivVarArr[1].setTranslationX(ivVarArr[0].getMeasuredWidth());
            return true;
        }
        ivVarArr[1].setTranslationX(-ivVarArr[0].getMeasuredWidth());
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.b5 b5Var2;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        super.dispatchDraw(canvas);
        jv jvVar = this.n;
        b5Var = ((org.telegram.ui.ActionBar.m2) jvVar).parentLayout;
        if (b5Var != null) {
            b5Var2 = ((org.telegram.ui.ActionBar.m2) jvVar).parentLayout;
            kVar = ((org.telegram.ui.ActionBar.m2) jvVar).actionBar;
            int measuredHeight = kVar.getMeasuredHeight();
            kVar2 = ((org.telegram.ui.ActionBar.m2) jvVar).actionBar;
            ((ActionBarLayout) b5Var2).q(canvas, measuredHeight + ((int) kVar2.getTranslationY()));
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        jv jvVar = this.n;
        Paint paint = jvVar.d;
        paint.setColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.d6, false));
        kVar = ((org.telegram.ui.ActionBar.m2) jvVar).actionBar;
        float measuredHeight = kVar.getMeasuredHeight();
        kVar2 = ((org.telegram.ui.ActionBar.m2) jvVar).actionBar;
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
        jv jvVar = this.n;
        iv[] ivVarArr = jvVar.f;
        kVar = ((org.telegram.ui.ActionBar.m2) jvVar).actionBar;
        measureChildWithMargins(kVar, i10, 0, i11, 0);
        kVar2 = ((org.telegram.ui.ActionBar.m2) jvVar).actionBar;
        int measuredHeight = kVar2.getMeasuredHeight();
        this.h = true;
        for (int i12 = 0; i12 < ivVarArr.length; i12++) {
            iv ivVar = ivVarArr[i12];
            if (ivVar != null) {
                org.telegram.ui.Components.wl0 wl0Var = ivVar.d;
                if (wl0Var != null) {
                    wl0Var.setPadding(0, measuredHeight, 0, 0);
                }
                ai.w0 w0Var = ivVarArr[i12].e;
                if (w0Var != null) {
                    w0Var.setPadding(0, measuredHeight, 0, 0);
                }
            }
        }
        this.h = false;
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt != null && childAt.getVisibility() != 8) {
                kVar3 = ((org.telegram.ui.ActionBar.m2) jvVar).actionBar;
                if (childAt != kVar3) {
                    measureChildWithMargins(childAt, i10, 0, i11, 0);
                }
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.b5 b5Var;
        float f7;
        float f10;
        org.telegram.ui.ActionBar.k kVar;
        float measuredWidth;
        boolean z10;
        jv jvVar = this.n;
        iv[] ivVarArr = jvVar.f;
        b5Var = ((org.telegram.ui.ActionBar.m2) jvVar).parentLayout;
        if (((ActionBarLayout) b5Var).j() || a()) {
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
            if (this.b && (((z10 = jvVar.r) && x10 > 0) || (!z10 && x10 < 0))) {
                if (!b(motionEvent, x10 < 0)) {
                    this.c = true;
                    this.b = false;
                    ivVarArr[0].setTranslationX(0.0f);
                    ivVarArr[1].setTranslationX(jvVar.r ? ivVarArr[0].getMeasuredWidth() : -ivVarArr[0].getMeasuredWidth());
                    jvVar.e.j(0.0f, ivVarArr[1].f);
                }
            }
            if (!this.c || this.b) {
                if (this.b) {
                    ivVarArr[0].setTranslationX(x10);
                    if (jvVar.r) {
                        ivVarArr[1].setTranslationX(ivVarArr[0].getMeasuredWidth() + x10);
                    } else {
                        ivVarArr[1].setTranslationX(x10 - ivVarArr[0].getMeasuredWidth());
                    }
                    jvVar.e.j(Math.abs(x10) / ivVarArr[0].getMeasuredWidth(), ivVarArr[1].f);
                }
            } else if (Math.abs(x10) >= AndroidUtilities.getPixelsInCM(0.3f, true) && Math.abs(x10) > abs) {
                b(motionEvent, x10 < 0);
            }
        } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.a && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
            this.f.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, jvVar.v);
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
                float x11 = ivVarArr[0].getX();
                jvVar.h = new AnimatorSet();
                boolean z11 = Math.abs(x11) < ((float) ivVarArr[0].getMeasuredWidth()) / 3.0f && (Math.abs(f7) < 3500.0f || Math.abs(f7) < Math.abs(f10));
                jvVar.s = z11;
                Property property = View.TRANSLATION_X;
                if (z11) {
                    measuredWidth = Math.abs(x11);
                    if (jvVar.r) {
                        jvVar.h.playTogether(ObjectAnimator.ofFloat(ivVarArr[0], (Property<iv, Float>) property, 0.0f), ObjectAnimator.ofFloat(ivVarArr[1], (Property<iv, Float>) property, r1.getMeasuredWidth()));
                    } else {
                        jvVar.h.playTogether(ObjectAnimator.ofFloat(ivVarArr[0], (Property<iv, Float>) property, 0.0f), ObjectAnimator.ofFloat(ivVarArr[1], (Property<iv, Float>) property, -r1.getMeasuredWidth()));
                    }
                } else {
                    measuredWidth = ivVarArr[0].getMeasuredWidth() - Math.abs(x11);
                    if (jvVar.r) {
                        jvVar.h.playTogether(ObjectAnimator.ofFloat(ivVarArr[0], (Property<iv, Float>) property, -r9.getMeasuredWidth()), ObjectAnimator.ofFloat(ivVarArr[1], (Property<iv, Float>) property, 0.0f));
                    } else {
                        jvVar.h.playTogether(ObjectAnimator.ofFloat(ivVarArr[0], (Property<iv, Float>) property, r9.getMeasuredWidth()), ObjectAnimator.ofFloat(ivVarArr[1], (Property<iv, Float>) property, 0.0f));
                    }
                }
                jvVar.h.setInterpolator(jv.x);
                int measuredWidth2 = getMeasuredWidth();
                float f11 = measuredWidth2 / 2;
                float distanceInfluenceForSnapDuration = (AndroidUtilities.distanceInfluenceForSnapDuration(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth2)) * f11) + f11;
                jvVar.h.setDuration(Math.max(ImageReceiver.DEFAULT_CROSSFADE_DURATION, Math.min(Math.abs(f7) > 0.0f ? Math.round(Math.abs(distanceInfluenceForSnapDuration / r4) * 1000.0f) * 4 : (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f), 600)));
                jvVar.h.addListener(new org.telegram.ui.Components.q81(this, 16));
                jvVar.h.start();
                jvVar.n = true;
                this.b = false;
            } else {
                this.c = false;
                kVar = ((org.telegram.ui.ActionBar.m2) jvVar).actionBar;
                kVar.setEnabled(true);
                jvVar.e.setEnabled(true);
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
