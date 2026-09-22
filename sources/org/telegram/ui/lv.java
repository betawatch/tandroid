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

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class lv extends FrameLayout {
    public int a;
    public boolean b;
    public boolean c;
    public int d;
    public int e;
    public VelocityTracker f;
    public boolean h;
    public final /* synthetic */ nv n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lv(nv nvVar, Context context) {
        super(context);
        this.n = nvVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a() {
        AnimatorSet animatorSet;
        nv nvVar = this.n;
        mv[] mvVarArr = nvVar.f;
        if (!nvVar.n) {
            return false;
        }
        if (!nvVar.s) {
            if (Math.abs(mvVarArr[1].getTranslationX()) < 1.0f) {
                mvVarArr[0].setTranslationX(r2.getMeasuredWidth() * (nvVar.r ? -1 : 1));
                mvVarArr[1].setTranslationX(0.0f);
                animatorSet = nvVar.h;
                if (animatorSet != null) {
                }
                nvVar.n = false;
            }
            return nvVar.n;
        }
        if (Math.abs(mvVarArr[0].getTranslationX()) < 1.0f) {
            mvVarArr[0].setTranslationX(0.0f);
            mvVarArr[1].setTranslationX(mvVarArr[0].getMeasuredWidth() * (nvVar.r ? 1 : -1));
            animatorSet = nvVar.h;
            if (animatorSet != null) {
                animatorSet.cancel();
                nvVar.h = null;
            }
            nvVar.n = false;
        }
        return nvVar.n;
    }

    public final boolean b(MotionEvent motionEvent, boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        nv nvVar = this.n;
        mv[] mvVarArr = nvVar.f;
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = nvVar.e;
        int i10 = scrollSlidingTextTabStrip.O.get(scrollSlidingTextTabStrip.n + (z10 ? 1 : -1), -1);
        if (i10 < 0) {
            return false;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        this.c = false;
        this.b = true;
        this.d = (int) motionEvent.getX();
        kVar = ((org.telegram.ui.ActionBar.n2) nvVar).actionBar;
        kVar.setEnabled(false);
        nvVar.e.setEnabled(false);
        mv mvVar = mvVarArr[1];
        mvVar.f = i10;
        mvVar.setVisibility(0);
        nvVar.r = z10;
        nvVar.m0(true);
        if (z10) {
            mvVarArr[1].setTranslationX(mvVarArr[0].getMeasuredWidth());
            return true;
        }
        mvVarArr[1].setTranslationX(-mvVarArr[0].getMeasuredWidth());
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.d5 d5Var;
        org.telegram.ui.ActionBar.d5 d5Var2;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        super.dispatchDraw(canvas);
        nv nvVar = this.n;
        d5Var = ((org.telegram.ui.ActionBar.n2) nvVar).parentLayout;
        if (d5Var != null) {
            d5Var2 = ((org.telegram.ui.ActionBar.n2) nvVar).parentLayout;
            kVar = ((org.telegram.ui.ActionBar.n2) nvVar).actionBar;
            int measuredHeight = kVar.getMeasuredHeight();
            kVar2 = ((org.telegram.ui.ActionBar.n2) nvVar).actionBar;
            ((ActionBarLayout) d5Var2).q(canvas, measuredHeight + ((int) kVar2.getTranslationY()));
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        nv nvVar = this.n;
        Paint paint = nvVar.d;
        paint.setColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.d6, false));
        kVar = ((org.telegram.ui.ActionBar.n2) nvVar).actionBar;
        float measuredHeight = kVar.getMeasuredHeight();
        kVar2 = ((org.telegram.ui.ActionBar.n2) nvVar).actionBar;
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
        nv nvVar = this.n;
        mv[] mvVarArr = nvVar.f;
        kVar = ((org.telegram.ui.ActionBar.n2) nvVar).actionBar;
        measureChildWithMargins(kVar, i10, 0, i11, 0);
        kVar2 = ((org.telegram.ui.ActionBar.n2) nvVar).actionBar;
        int measuredHeight = kVar2.getMeasuredHeight();
        this.h = true;
        for (int i12 = 0; i12 < mvVarArr.length; i12++) {
            mv mvVar = mvVarArr[i12];
            if (mvVar != null) {
                org.telegram.ui.Components.ll0 ll0Var = mvVar.d;
                if (ll0Var != null) {
                    ll0Var.setPadding(0, measuredHeight, 0, 0);
                }
                ai.w0 w0Var = mvVarArr[i12].e;
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
                kVar3 = ((org.telegram.ui.ActionBar.n2) nvVar).actionBar;
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
        nv nvVar = this.n;
        mv[] mvVarArr = nvVar.f;
        d5Var = ((org.telegram.ui.ActionBar.n2) nvVar).parentLayout;
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
            if (this.b && (((z10 = nvVar.r) && x10 > 0) || (!z10 && x10 < 0))) {
                if (!b(motionEvent, x10 < 0)) {
                    this.c = true;
                    this.b = false;
                    mvVarArr[0].setTranslationX(0.0f);
                    mvVarArr[1].setTranslationX(nvVar.r ? mvVarArr[0].getMeasuredWidth() : -mvVarArr[0].getMeasuredWidth());
                    nvVar.e.j(0.0f, mvVarArr[1].f);
                }
            }
            if (!this.c || this.b) {
                if (this.b) {
                    mvVarArr[0].setTranslationX(x10);
                    if (nvVar.r) {
                        mvVarArr[1].setTranslationX(mvVarArr[0].getMeasuredWidth() + x10);
                    } else {
                        mvVarArr[1].setTranslationX(x10 - mvVarArr[0].getMeasuredWidth());
                    }
                    nvVar.e.j(Math.abs(x10) / mvVarArr[0].getMeasuredWidth(), mvVarArr[1].f);
                }
            } else if (Math.abs(x10) >= AndroidUtilities.getPixelsInCM(0.3f, true) && Math.abs(x10) > abs) {
                b(motionEvent, x10 < 0);
            }
        } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.a && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
            this.f.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, nvVar.v);
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
                float x11 = mvVarArr[0].getX();
                nvVar.h = new AnimatorSet();
                boolean z11 = Math.abs(x11) < ((float) mvVarArr[0].getMeasuredWidth()) / 3.0f && (Math.abs(f7) < 3500.0f || Math.abs(f7) < Math.abs(f10));
                nvVar.s = z11;
                Property property = View.TRANSLATION_X;
                if (z11) {
                    measuredWidth = Math.abs(x11);
                    if (nvVar.r) {
                        nvVar.h.playTogether(ObjectAnimator.ofFloat(mvVarArr[0], (Property<mv, Float>) property, 0.0f), ObjectAnimator.ofFloat(mvVarArr[1], (Property<mv, Float>) property, r1.getMeasuredWidth()));
                    } else {
                        nvVar.h.playTogether(ObjectAnimator.ofFloat(mvVarArr[0], (Property<mv, Float>) property, 0.0f), ObjectAnimator.ofFloat(mvVarArr[1], (Property<mv, Float>) property, -r1.getMeasuredWidth()));
                    }
                } else {
                    measuredWidth = mvVarArr[0].getMeasuredWidth() - Math.abs(x11);
                    if (nvVar.r) {
                        nvVar.h.playTogether(ObjectAnimator.ofFloat(mvVarArr[0], (Property<mv, Float>) property, -r9.getMeasuredWidth()), ObjectAnimator.ofFloat(mvVarArr[1], (Property<mv, Float>) property, 0.0f));
                    } else {
                        nvVar.h.playTogether(ObjectAnimator.ofFloat(mvVarArr[0], (Property<mv, Float>) property, r9.getMeasuredWidth()), ObjectAnimator.ofFloat(mvVarArr[1], (Property<mv, Float>) property, 0.0f));
                    }
                }
                nvVar.h.setInterpolator(nv.x);
                int measuredWidth2 = getMeasuredWidth();
                float f11 = measuredWidth2 / 2;
                float distanceInfluenceForSnapDuration = (AndroidUtilities.distanceInfluenceForSnapDuration(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth2)) * f11) + f11;
                nvVar.h.setDuration(Math.max(ImageReceiver.DEFAULT_CROSSFADE_DURATION, Math.min(Math.abs(f7) > 0.0f ? Math.round(Math.abs(distanceInfluenceForSnapDuration / r4) * 1000.0f) * 4 : (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f), 600)));
                nvVar.h.addListener(new org.telegram.ui.Components.v81(this, 15));
                nvVar.h.start();
                nvVar.n = true;
                this.b = false;
            } else {
                this.c = false;
                kVar = ((org.telegram.ui.ActionBar.n2) nvVar).actionBar;
                kVar.setEnabled(true);
                nvVar.e.setEnabled(true);
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
