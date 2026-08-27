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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class cv extends FrameLayout {
    public int a;
    public boolean b;
    public boolean c;
    public int d;
    public int e;
    public VelocityTracker f;
    public boolean h;
    public final /* synthetic */ ev n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cv(ev evVar, Context context) {
        super(context);
        this.n = evVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a() {
        AnimatorSet animatorSet;
        ev evVar = this.n;
        dv[] dvVarArr = evVar.f;
        if (!evVar.n) {
            return false;
        }
        if (!evVar.s) {
            if (Math.abs(dvVarArr[1].getTranslationX()) < 1.0f) {
                dvVarArr[0].setTranslationX(r2.getMeasuredWidth() * (evVar.r ? -1 : 1));
                dvVarArr[1].setTranslationX(0.0f);
                animatorSet = evVar.h;
                if (animatorSet != null) {
                }
                evVar.n = false;
            }
            return evVar.n;
        }
        if (Math.abs(dvVarArr[0].getTranslationX()) < 1.0f) {
            dvVarArr[0].setTranslationX(0.0f);
            dvVarArr[1].setTranslationX(dvVarArr[0].getMeasuredWidth() * (evVar.r ? 1 : -1));
            animatorSet = evVar.h;
            if (animatorSet != null) {
                animatorSet.cancel();
                evVar.h = null;
            }
            evVar.n = false;
        }
        return evVar.n;
    }

    public final boolean b(MotionEvent motionEvent, boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        ev evVar = this.n;
        dv[] dvVarArr = evVar.f;
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = evVar.e;
        int i10 = scrollSlidingTextTabStrip.K.get(scrollSlidingTextTabStrip.n + (z10 ? 1 : -1), -1);
        if (i10 < 0) {
            return false;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        this.c = false;
        this.b = true;
        this.d = (int) motionEvent.getX();
        kVar = ((org.telegram.ui.ActionBar.n2) evVar).actionBar;
        kVar.setEnabled(false);
        evVar.e.setEnabled(false);
        dv dvVar = dvVarArr[1];
        dvVar.f = i10;
        dvVar.setVisibility(0);
        evVar.r = z10;
        evVar.m0(true);
        if (z10) {
            dvVarArr[1].setTranslationX(dvVarArr[0].getMeasuredWidth());
            return true;
        }
        dvVarArr[1].setTranslationX(-dvVarArr[0].getMeasuredWidth());
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.b5 b5Var2;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        super.dispatchDraw(canvas);
        ev evVar = this.n;
        b5Var = ((org.telegram.ui.ActionBar.n2) evVar).parentLayout;
        if (b5Var != null) {
            b5Var2 = ((org.telegram.ui.ActionBar.n2) evVar).parentLayout;
            kVar = ((org.telegram.ui.ActionBar.n2) evVar).actionBar;
            int measuredHeight = kVar.getMeasuredHeight();
            kVar2 = ((org.telegram.ui.ActionBar.n2) evVar).actionBar;
            ((ActionBarLayout) b5Var2).q(canvas, measuredHeight + ((int) kVar2.getTranslationY()));
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        ev evVar = this.n;
        Paint paint = evVar.d;
        paint.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false));
        kVar = ((org.telegram.ui.ActionBar.n2) evVar).actionBar;
        float measuredHeight = kVar.getMeasuredHeight();
        kVar2 = ((org.telegram.ui.ActionBar.n2) evVar).actionBar;
        canvas.drawRect(0.0f, kVar2.getTranslationY() + measuredHeight, getMeasuredWidth(), getMeasuredHeight(), paint);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return a() || this.n.e.D || onTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        ev evVar = this.n;
        dv[] dvVarArr = evVar.f;
        kVar = ((org.telegram.ui.ActionBar.n2) evVar).actionBar;
        measureChildWithMargins(kVar, i10, 0, i11, 0);
        kVar2 = ((org.telegram.ui.ActionBar.n2) evVar).actionBar;
        int measuredHeight = kVar2.getMeasuredHeight();
        this.h = true;
        for (int i12 = 0; i12 < dvVarArr.length; i12++) {
            dv dvVar = dvVarArr[i12];
            if (dvVar != null) {
                org.telegram.ui.Components.zk0 zk0Var = dvVar.d;
                if (zk0Var != null) {
                    zk0Var.setPadding(0, measuredHeight, 0, 0);
                }
                hh.f1 f1Var = dvVarArr[i12].e;
                if (f1Var != null) {
                    f1Var.setPadding(0, measuredHeight, 0, 0);
                }
            }
        }
        this.h = false;
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt != null && childAt.getVisibility() != 8) {
                kVar3 = ((org.telegram.ui.ActionBar.n2) evVar).actionBar;
                if (childAt != kVar3) {
                    measureChildWithMargins(childAt, i10, 0, i11, 0);
                }
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.b5 b5Var;
        float f10;
        float f11;
        org.telegram.ui.ActionBar.k kVar;
        float measuredWidth;
        boolean z10;
        ev evVar = this.n;
        dv[] dvVarArr = evVar.f;
        b5Var = ((org.telegram.ui.ActionBar.n2) evVar).parentLayout;
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
            int x8 = (int) (motionEvent.getX() - this.d);
            int abs = Math.abs(((int) motionEvent.getY()) - this.e);
            if (this.b && (((z10 = evVar.r) && x8 > 0) || (!z10 && x8 < 0))) {
                if (!b(motionEvent, x8 < 0)) {
                    this.c = true;
                    this.b = false;
                    dvVarArr[0].setTranslationX(0.0f);
                    dvVarArr[1].setTranslationX(evVar.r ? dvVarArr[0].getMeasuredWidth() : -dvVarArr[0].getMeasuredWidth());
                    evVar.e.j(0.0f, dvVarArr[1].f);
                }
            }
            if (!this.c || this.b) {
                if (this.b) {
                    dvVarArr[0].setTranslationX(x8);
                    if (evVar.r) {
                        dvVarArr[1].setTranslationX(dvVarArr[0].getMeasuredWidth() + x8);
                    } else {
                        dvVarArr[1].setTranslationX(x8 - dvVarArr[0].getMeasuredWidth());
                    }
                    evVar.e.j(Math.abs(x8) / dvVarArr[0].getMeasuredWidth(), dvVarArr[1].f);
                }
            } else if (Math.abs(x8) >= AndroidUtilities.getPixelsInCM(0.3f, true) && Math.abs(x8) > abs) {
                b(motionEvent, x8 < 0);
            }
        } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.a && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
            this.f.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, evVar.v);
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
                float x10 = dvVarArr[0].getX();
                evVar.h = new AnimatorSet();
                boolean z11 = Math.abs(x10) < ((float) dvVarArr[0].getMeasuredWidth()) / 3.0f && (Math.abs(f10) < 3500.0f || Math.abs(f10) < Math.abs(f11));
                evVar.s = z11;
                Property property = View.TRANSLATION_X;
                if (z11) {
                    measuredWidth = Math.abs(x10);
                    if (evVar.r) {
                        evVar.h.playTogether(ObjectAnimator.ofFloat(dvVarArr[0], (Property<dv, Float>) property, 0.0f), ObjectAnimator.ofFloat(dvVarArr[1], (Property<dv, Float>) property, r1.getMeasuredWidth()));
                    } else {
                        evVar.h.playTogether(ObjectAnimator.ofFloat(dvVarArr[0], (Property<dv, Float>) property, 0.0f), ObjectAnimator.ofFloat(dvVarArr[1], (Property<dv, Float>) property, -r1.getMeasuredWidth()));
                    }
                } else {
                    measuredWidth = dvVarArr[0].getMeasuredWidth() - Math.abs(x10);
                    if (evVar.r) {
                        evVar.h.playTogether(ObjectAnimator.ofFloat(dvVarArr[0], (Property<dv, Float>) property, -r9.getMeasuredWidth()), ObjectAnimator.ofFloat(dvVarArr[1], (Property<dv, Float>) property, 0.0f));
                    } else {
                        evVar.h.playTogether(ObjectAnimator.ofFloat(dvVarArr[0], (Property<dv, Float>) property, r9.getMeasuredWidth()), ObjectAnimator.ofFloat(dvVarArr[1], (Property<dv, Float>) property, 0.0f));
                    }
                }
                evVar.h.setInterpolator(ev.x);
                int measuredWidth2 = getMeasuredWidth();
                float f12 = measuredWidth2 / 2;
                float distanceInfluenceForSnapDuration = (AndroidUtilities.distanceInfluenceForSnapDuration(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth2)) * f12) + f12;
                evVar.h.setDuration(Math.max(ImageReceiver.DEFAULT_CROSSFADE_DURATION, Math.min(Math.abs(f10) > 0.0f ? Math.round(Math.abs(distanceInfluenceForSnapDuration / r4) * 1000.0f) * 4 : (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f), 600)));
                evVar.h.addListener(new org.telegram.ui.Components.f11(this, 23));
                evVar.h.start();
                evVar.n = true;
                this.b = false;
            } else {
                this.c = false;
                kVar = ((org.telegram.ui.ActionBar.n2) evVar).actionBar;
                kVar.setEnabled(true);
                evVar.e.setEnabled(true);
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
