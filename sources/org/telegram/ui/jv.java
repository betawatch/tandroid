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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class jv extends FrameLayout {
    public int a;
    public boolean b;
    public boolean c;
    public int d;
    public int e;
    public VelocityTracker f;
    public boolean h;
    public final /* synthetic */ lv n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jv(lv lvVar, Context context) {
        super(context);
        this.n = lvVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a() {
        AnimatorSet animatorSet;
        lv lvVar = this.n;
        kv[] kvVarArr = lvVar.f;
        if (!lvVar.n) {
            return false;
        }
        if (!lvVar.s) {
            if (Math.abs(kvVarArr[1].getTranslationX()) < 1.0f) {
                kvVarArr[0].setTranslationX(r2.getMeasuredWidth() * (lvVar.r ? -1 : 1));
                kvVarArr[1].setTranslationX(0.0f);
                animatorSet = lvVar.h;
                if (animatorSet != null) {
                }
                lvVar.n = false;
            }
            return lvVar.n;
        }
        if (Math.abs(kvVarArr[0].getTranslationX()) < 1.0f) {
            kvVarArr[0].setTranslationX(0.0f);
            kvVarArr[1].setTranslationX(kvVarArr[0].getMeasuredWidth() * (lvVar.r ? 1 : -1));
            animatorSet = lvVar.h;
            if (animatorSet != null) {
                animatorSet.cancel();
                lvVar.h = null;
            }
            lvVar.n = false;
        }
        return lvVar.n;
    }

    public final boolean b(MotionEvent motionEvent, boolean z4) {
        org.telegram.ui.ActionBar.k kVar;
        lv lvVar = this.n;
        kv[] kvVarArr = lvVar.f;
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = lvVar.e;
        int i10 = scrollSlidingTextTabStrip.L.get(scrollSlidingTextTabStrip.n + (z4 ? 1 : -1), -1);
        if (i10 < 0) {
            return false;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        this.c = false;
        this.b = true;
        this.d = (int) motionEvent.getX();
        kVar = ((org.telegram.ui.ActionBar.p2) lvVar).actionBar;
        kVar.setEnabled(false);
        lvVar.e.setEnabled(false);
        kv kvVar = kvVarArr[1];
        kvVar.f = i10;
        kvVar.setVisibility(0);
        lvVar.r = z4;
        lvVar.m0(true);
        if (z4) {
            kvVarArr[1].setTranslationX(kvVarArr[0].getMeasuredWidth());
            return true;
        }
        kvVarArr[1].setTranslationX(-kvVarArr[0].getMeasuredWidth());
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.f5 f5Var;
        org.telegram.ui.ActionBar.f5 f5Var2;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        super.dispatchDraw(canvas);
        lv lvVar = this.n;
        f5Var = ((org.telegram.ui.ActionBar.p2) lvVar).parentLayout;
        if (f5Var != null) {
            f5Var2 = ((org.telegram.ui.ActionBar.p2) lvVar).parentLayout;
            kVar = ((org.telegram.ui.ActionBar.p2) lvVar).actionBar;
            int measuredHeight = kVar.getMeasuredHeight();
            kVar2 = ((org.telegram.ui.ActionBar.p2) lvVar).actionBar;
            ((ActionBarLayout) f5Var2).q(canvas, measuredHeight + ((int) kVar2.getTranslationY()));
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        lv lvVar = this.n;
        Paint paint = lvVar.d;
        paint.setColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.d6, false));
        kVar = ((org.telegram.ui.ActionBar.p2) lvVar).actionBar;
        float measuredHeight = kVar.getMeasuredHeight();
        kVar2 = ((org.telegram.ui.ActionBar.p2) lvVar).actionBar;
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
        lv lvVar = this.n;
        kv[] kvVarArr = lvVar.f;
        kVar = ((org.telegram.ui.ActionBar.p2) lvVar).actionBar;
        measureChildWithMargins(kVar, i10, 0, i11, 0);
        kVar2 = ((org.telegram.ui.ActionBar.p2) lvVar).actionBar;
        int measuredHeight = kVar2.getMeasuredHeight();
        this.h = true;
        for (int i12 = 0; i12 < kvVarArr.length; i12++) {
            kv kvVar = kvVarArr[i12];
            if (kvVar != null) {
                org.telegram.ui.Components.tl0 tl0Var = kvVar.d;
                if (tl0Var != null) {
                    tl0Var.setPadding(0, measuredHeight, 0, 0);
                }
                mh.d1 d1Var = kvVarArr[i12].e;
                if (d1Var != null) {
                    d1Var.setPadding(0, measuredHeight, 0, 0);
                }
            }
        }
        this.h = false;
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt != null && childAt.getVisibility() != 8) {
                kVar3 = ((org.telegram.ui.ActionBar.p2) lvVar).actionBar;
                if (childAt != kVar3) {
                    measureChildWithMargins(childAt, i10, 0, i11, 0);
                }
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.f5 f5Var;
        float f10;
        float f11;
        org.telegram.ui.ActionBar.k kVar;
        float measuredWidth;
        boolean z4;
        lv lvVar = this.n;
        kv[] kvVarArr = lvVar.f;
        f5Var = ((org.telegram.ui.ActionBar.p2) lvVar).parentLayout;
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
            if (this.b && (((z4 = lvVar.r) && x10 > 0) || (!z4 && x10 < 0))) {
                if (!b(motionEvent, x10 < 0)) {
                    this.c = true;
                    this.b = false;
                    kvVarArr[0].setTranslationX(0.0f);
                    kvVarArr[1].setTranslationX(lvVar.r ? kvVarArr[0].getMeasuredWidth() : -kvVarArr[0].getMeasuredWidth());
                    lvVar.e.j(0.0f, kvVarArr[1].f);
                }
            }
            if (!this.c || this.b) {
                if (this.b) {
                    kvVarArr[0].setTranslationX(x10);
                    if (lvVar.r) {
                        kvVarArr[1].setTranslationX(kvVarArr[0].getMeasuredWidth() + x10);
                    } else {
                        kvVarArr[1].setTranslationX(x10 - kvVarArr[0].getMeasuredWidth());
                    }
                    lvVar.e.j(Math.abs(x10) / kvVarArr[0].getMeasuredWidth(), kvVarArr[1].f);
                }
            } else if (Math.abs(x10) >= AndroidUtilities.getPixelsInCM(0.3f, true) && Math.abs(x10) > abs) {
                b(motionEvent, x10 < 0);
            }
        } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.a && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
            this.f.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, lvVar.v);
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
                float x11 = kvVarArr[0].getX();
                lvVar.h = new AnimatorSet();
                boolean z10 = Math.abs(x11) < ((float) kvVarArr[0].getMeasuredWidth()) / 3.0f && (Math.abs(f10) < 3500.0f || Math.abs(f10) < Math.abs(f11));
                lvVar.s = z10;
                Property property = View.TRANSLATION_X;
                if (z10) {
                    measuredWidth = Math.abs(x11);
                    if (lvVar.r) {
                        lvVar.h.playTogether(ObjectAnimator.ofFloat(kvVarArr[0], (Property<kv, Float>) property, 0.0f), ObjectAnimator.ofFloat(kvVarArr[1], (Property<kv, Float>) property, r1.getMeasuredWidth()));
                    } else {
                        lvVar.h.playTogether(ObjectAnimator.ofFloat(kvVarArr[0], (Property<kv, Float>) property, 0.0f), ObjectAnimator.ofFloat(kvVarArr[1], (Property<kv, Float>) property, -r1.getMeasuredWidth()));
                    }
                } else {
                    measuredWidth = kvVarArr[0].getMeasuredWidth() - Math.abs(x11);
                    if (lvVar.r) {
                        lvVar.h.playTogether(ObjectAnimator.ofFloat(kvVarArr[0], (Property<kv, Float>) property, -r9.getMeasuredWidth()), ObjectAnimator.ofFloat(kvVarArr[1], (Property<kv, Float>) property, 0.0f));
                    } else {
                        lvVar.h.playTogether(ObjectAnimator.ofFloat(kvVarArr[0], (Property<kv, Float>) property, r9.getMeasuredWidth()), ObjectAnimator.ofFloat(kvVarArr[1], (Property<kv, Float>) property, 0.0f));
                    }
                }
                lvVar.h.setInterpolator(lv.x);
                int measuredWidth2 = getMeasuredWidth();
                float f12 = measuredWidth2 / 2;
                float distanceInfluenceForSnapDuration = (AndroidUtilities.distanceInfluenceForSnapDuration(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth2)) * f12) + f12;
                lvVar.h.setDuration(Math.max(ImageReceiver.DEFAULT_CROSSFADE_DURATION, Math.min(Math.abs(f10) > 0.0f ? Math.round(Math.abs(distanceInfluenceForSnapDuration / r4) * 1000.0f) * 4 : (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f), 600)));
                lvVar.h.addListener(new org.telegram.ui.Components.g91(this, 14));
                lvVar.h.start();
                lvVar.n = true;
                this.b = false;
            } else {
                this.c = false;
                kVar = ((org.telegram.ui.ActionBar.p2) lvVar).actionBar;
                kVar.setEnabled(true);
                lvVar.e.setEnabled(true);
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
