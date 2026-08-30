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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class iv extends FrameLayout {
    public int a;
    public boolean b;
    public boolean c;
    public int d;
    public int e;
    public VelocityTracker f;
    public boolean h;
    public final /* synthetic */ kv n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iv(kv kvVar, Context context) {
        super(context);
        this.n = kvVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a() {
        AnimatorSet animatorSet;
        kv kvVar = this.n;
        jv[] jvVarArr = kvVar.f;
        if (!kvVar.n) {
            return false;
        }
        if (!kvVar.s) {
            if (Math.abs(jvVarArr[1].getTranslationX()) < 1.0f) {
                jvVarArr[0].setTranslationX(r2.getMeasuredWidth() * (kvVar.r ? -1 : 1));
                jvVarArr[1].setTranslationX(0.0f);
                animatorSet = kvVar.h;
                if (animatorSet != null) {
                }
                kvVar.n = false;
            }
            return kvVar.n;
        }
        if (Math.abs(jvVarArr[0].getTranslationX()) < 1.0f) {
            jvVarArr[0].setTranslationX(0.0f);
            jvVarArr[1].setTranslationX(jvVarArr[0].getMeasuredWidth() * (kvVar.r ? 1 : -1));
            animatorSet = kvVar.h;
            if (animatorSet != null) {
                animatorSet.cancel();
                kvVar.h = null;
            }
            kvVar.n = false;
        }
        return kvVar.n;
    }

    public final boolean b(MotionEvent motionEvent, boolean z4) {
        org.telegram.ui.ActionBar.k kVar;
        kv kvVar = this.n;
        jv[] jvVarArr = kvVar.f;
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = kvVar.e;
        int i10 = scrollSlidingTextTabStrip.L.get(scrollSlidingTextTabStrip.n + (z4 ? 1 : -1), -1);
        if (i10 < 0) {
            return false;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        this.c = false;
        this.b = true;
        this.d = (int) motionEvent.getX();
        kVar = ((org.telegram.ui.ActionBar.p2) kvVar).actionBar;
        kVar.setEnabled(false);
        kvVar.e.setEnabled(false);
        jv jvVar = jvVarArr[1];
        jvVar.f = i10;
        jvVar.setVisibility(0);
        kvVar.r = z4;
        kvVar.m0(true);
        if (z4) {
            jvVarArr[1].setTranslationX(jvVarArr[0].getMeasuredWidth());
            return true;
        }
        jvVarArr[1].setTranslationX(-jvVarArr[0].getMeasuredWidth());
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.e5 e5Var;
        org.telegram.ui.ActionBar.e5 e5Var2;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        super.dispatchDraw(canvas);
        kv kvVar = this.n;
        e5Var = ((org.telegram.ui.ActionBar.p2) kvVar).parentLayout;
        if (e5Var != null) {
            e5Var2 = ((org.telegram.ui.ActionBar.p2) kvVar).parentLayout;
            kVar = ((org.telegram.ui.ActionBar.p2) kvVar).actionBar;
            int measuredHeight = kVar.getMeasuredHeight();
            kVar2 = ((org.telegram.ui.ActionBar.p2) kvVar).actionBar;
            ((ActionBarLayout) e5Var2).q(canvas, measuredHeight + ((int) kVar2.getTranslationY()));
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        kv kvVar = this.n;
        Paint paint = kvVar.d;
        paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
        kVar = ((org.telegram.ui.ActionBar.p2) kvVar).actionBar;
        float measuredHeight = kVar.getMeasuredHeight();
        kVar2 = ((org.telegram.ui.ActionBar.p2) kvVar).actionBar;
        canvas.drawRect(0.0f, kVar2.getTranslationY() + measuredHeight, getMeasuredWidth(), getMeasuredHeight(), paint);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return a() || this.n.e.E || onTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        kv kvVar = this.n;
        jv[] jvVarArr = kvVar.f;
        kVar = ((org.telegram.ui.ActionBar.p2) kvVar).actionBar;
        measureChildWithMargins(kVar, i10, 0, i11, 0);
        kVar2 = ((org.telegram.ui.ActionBar.p2) kvVar).actionBar;
        int measuredHeight = kVar2.getMeasuredHeight();
        this.h = true;
        for (int i12 = 0; i12 < jvVarArr.length; i12++) {
            jv jvVar = jvVarArr[i12];
            if (jvVar != null) {
                org.telegram.ui.Components.sl0 sl0Var = jvVar.d;
                if (sl0Var != null) {
                    sl0Var.setPadding(0, measuredHeight, 0, 0);
                }
                lh.e1 e1Var = jvVarArr[i12].e;
                if (e1Var != null) {
                    e1Var.setPadding(0, measuredHeight, 0, 0);
                }
            }
        }
        this.h = false;
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt != null && childAt.getVisibility() != 8) {
                kVar3 = ((org.telegram.ui.ActionBar.p2) kvVar).actionBar;
                if (childAt != kVar3) {
                    measureChildWithMargins(childAt, i10, 0, i11, 0);
                }
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.e5 e5Var;
        float f10;
        float f11;
        org.telegram.ui.ActionBar.k kVar;
        float measuredWidth;
        boolean z4;
        kv kvVar = this.n;
        jv[] jvVarArr = kvVar.f;
        e5Var = ((org.telegram.ui.ActionBar.p2) kvVar).parentLayout;
        if (((ActionBarLayout) e5Var).j() || a()) {
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
            if (this.b && (((z4 = kvVar.r) && x10 > 0) || (!z4 && x10 < 0))) {
                if (!b(motionEvent, x10 < 0)) {
                    this.c = true;
                    this.b = false;
                    jvVarArr[0].setTranslationX(0.0f);
                    jvVarArr[1].setTranslationX(kvVar.r ? jvVarArr[0].getMeasuredWidth() : -jvVarArr[0].getMeasuredWidth());
                    kvVar.e.j(0.0f, jvVarArr[1].f);
                }
            }
            if (!this.c || this.b) {
                if (this.b) {
                    jvVarArr[0].setTranslationX(x10);
                    if (kvVar.r) {
                        jvVarArr[1].setTranslationX(jvVarArr[0].getMeasuredWidth() + x10);
                    } else {
                        jvVarArr[1].setTranslationX(x10 - jvVarArr[0].getMeasuredWidth());
                    }
                    kvVar.e.j(Math.abs(x10) / jvVarArr[0].getMeasuredWidth(), jvVarArr[1].f);
                }
            } else if (Math.abs(x10) >= AndroidUtilities.getPixelsInCM(0.3f, true) && Math.abs(x10) > abs) {
                b(motionEvent, x10 < 0);
            }
        } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.a && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
            this.f.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, kvVar.v);
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
                float x11 = jvVarArr[0].getX();
                kvVar.h = new AnimatorSet();
                boolean z10 = Math.abs(x11) < ((float) jvVarArr[0].getMeasuredWidth()) / 3.0f && (Math.abs(f10) < 3500.0f || Math.abs(f10) < Math.abs(f11));
                kvVar.s = z10;
                Property property = View.TRANSLATION_X;
                if (z10) {
                    measuredWidth = Math.abs(x11);
                    if (kvVar.r) {
                        kvVar.h.playTogether(ObjectAnimator.ofFloat(jvVarArr[0], (Property<jv, Float>) property, 0.0f), ObjectAnimator.ofFloat(jvVarArr[1], (Property<jv, Float>) property, r1.getMeasuredWidth()));
                    } else {
                        kvVar.h.playTogether(ObjectAnimator.ofFloat(jvVarArr[0], (Property<jv, Float>) property, 0.0f), ObjectAnimator.ofFloat(jvVarArr[1], (Property<jv, Float>) property, -r1.getMeasuredWidth()));
                    }
                } else {
                    measuredWidth = jvVarArr[0].getMeasuredWidth() - Math.abs(x11);
                    if (kvVar.r) {
                        kvVar.h.playTogether(ObjectAnimator.ofFloat(jvVarArr[0], (Property<jv, Float>) property, -r9.getMeasuredWidth()), ObjectAnimator.ofFloat(jvVarArr[1], (Property<jv, Float>) property, 0.0f));
                    } else {
                        kvVar.h.playTogether(ObjectAnimator.ofFloat(jvVarArr[0], (Property<jv, Float>) property, r9.getMeasuredWidth()), ObjectAnimator.ofFloat(jvVarArr[1], (Property<jv, Float>) property, 0.0f));
                    }
                }
                kvVar.h.setInterpolator(kv.x);
                int measuredWidth2 = getMeasuredWidth();
                float f12 = measuredWidth2 / 2;
                float distanceInfluenceForSnapDuration = (AndroidUtilities.distanceInfluenceForSnapDuration(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth2)) * f12) + f12;
                kvVar.h.setDuration(Math.max(ImageReceiver.DEFAULT_CROSSFADE_DURATION, Math.min(Math.abs(f10) > 0.0f ? Math.round(Math.abs(distanceInfluenceForSnapDuration / r4) * 1000.0f) * 4 : (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f), 600)));
                kvVar.h.addListener(new org.telegram.ui.Components.f91(this, 14));
                kvVar.h.start();
                kvVar.n = true;
                this.b = false;
            } else {
                this.c = false;
                kVar = ((org.telegram.ui.ActionBar.p2) kvVar).actionBar;
                kVar.setEnabled(true);
                kvVar.e.setEnabled(true);
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
