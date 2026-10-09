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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class kv extends FrameLayout {
    public int a;
    public boolean b;
    public boolean c;
    public int d;
    public int e;
    public VelocityTracker f;
    public boolean h;
    public final /* synthetic */ mv n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kv(mv mvVar, Context context) {
        super(context);
        this.n = mvVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a() {
        AnimatorSet animatorSet;
        mv mvVar = this.n;
        lv[] lvVarArr = mvVar.f;
        if (!mvVar.n) {
            return false;
        }
        if (!mvVar.s) {
            if (Math.abs(lvVarArr[1].getTranslationX()) < 1.0f) {
                lvVarArr[0].setTranslationX(r2.getMeasuredWidth() * (mvVar.r ? -1 : 1));
                lvVarArr[1].setTranslationX(0.0f);
                animatorSet = mvVar.h;
                if (animatorSet != null) {
                }
                mvVar.n = false;
            }
            return mvVar.n;
        }
        if (Math.abs(lvVarArr[0].getTranslationX()) < 1.0f) {
            lvVarArr[0].setTranslationX(0.0f);
            lvVarArr[1].setTranslationX(lvVarArr[0].getMeasuredWidth() * (mvVar.r ? 1 : -1));
            animatorSet = mvVar.h;
            if (animatorSet != null) {
                animatorSet.cancel();
                mvVar.h = null;
            }
            mvVar.n = false;
        }
        return mvVar.n;
    }

    public final boolean b(MotionEvent motionEvent, boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        mv mvVar = this.n;
        lv[] lvVarArr = mvVar.f;
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = mvVar.e;
        int i10 = scrollSlidingTextTabStrip.O.get(scrollSlidingTextTabStrip.n + (z10 ? 1 : -1), -1);
        if (i10 < 0) {
            return false;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        this.c = false;
        this.b = true;
        this.d = (int) motionEvent.getX();
        kVar = ((org.telegram.ui.ActionBar.n2) mvVar).actionBar;
        kVar.setEnabled(false);
        mvVar.e.setEnabled(false);
        lv lvVar = lvVarArr[1];
        lvVar.f = i10;
        lvVar.setVisibility(0);
        mvVar.r = z10;
        mvVar.m0(true);
        if (z10) {
            lvVarArr[1].setTranslationX(lvVarArr[0].getMeasuredWidth());
            return true;
        }
        lvVarArr[1].setTranslationX(-lvVarArr[0].getMeasuredWidth());
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.d5 d5Var;
        org.telegram.ui.ActionBar.d5 d5Var2;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        super.dispatchDraw(canvas);
        mv mvVar = this.n;
        d5Var = ((org.telegram.ui.ActionBar.n2) mvVar).parentLayout;
        if (d5Var != null) {
            d5Var2 = ((org.telegram.ui.ActionBar.n2) mvVar).parentLayout;
            kVar = ((org.telegram.ui.ActionBar.n2) mvVar).actionBar;
            int measuredHeight = kVar.getMeasuredHeight();
            kVar2 = ((org.telegram.ui.ActionBar.n2) mvVar).actionBar;
            ((ActionBarLayout) d5Var2).q(canvas, measuredHeight + ((int) kVar2.getTranslationY()));
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        mv mvVar = this.n;
        Paint paint = mvVar.d;
        paint.setColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.d6, false));
        kVar = ((org.telegram.ui.ActionBar.n2) mvVar).actionBar;
        float measuredHeight = kVar.getMeasuredHeight();
        kVar2 = ((org.telegram.ui.ActionBar.n2) mvVar).actionBar;
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
        mv mvVar = this.n;
        lv[] lvVarArr = mvVar.f;
        kVar = ((org.telegram.ui.ActionBar.n2) mvVar).actionBar;
        measureChildWithMargins(kVar, i10, 0, i11, 0);
        kVar2 = ((org.telegram.ui.ActionBar.n2) mvVar).actionBar;
        int measuredHeight = kVar2.getMeasuredHeight();
        this.h = true;
        for (int i12 = 0; i12 < lvVarArr.length; i12++) {
            lv lvVar = lvVarArr[i12];
            if (lvVar != null) {
                org.telegram.ui.Components.qm0 qm0Var = lvVar.d;
                if (qm0Var != null) {
                    qm0Var.setPadding(0, measuredHeight, 0, 0);
                }
                ai.w0 w0Var = lvVarArr[i12].e;
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
                kVar3 = ((org.telegram.ui.ActionBar.n2) mvVar).actionBar;
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
        mv mvVar = this.n;
        lv[] lvVarArr = mvVar.f;
        d5Var = ((org.telegram.ui.ActionBar.n2) mvVar).parentLayout;
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
            if (this.b && (((z10 = mvVar.r) && x10 > 0) || (!z10 && x10 < 0))) {
                if (!b(motionEvent, x10 < 0)) {
                    this.c = true;
                    this.b = false;
                    lvVarArr[0].setTranslationX(0.0f);
                    lvVarArr[1].setTranslationX(mvVar.r ? lvVarArr[0].getMeasuredWidth() : -lvVarArr[0].getMeasuredWidth());
                    mvVar.e.j(0.0f, lvVarArr[1].f);
                }
            }
            if (!this.c || this.b) {
                if (this.b) {
                    lvVarArr[0].setTranslationX(x10);
                    if (mvVar.r) {
                        lvVarArr[1].setTranslationX(lvVarArr[0].getMeasuredWidth() + x10);
                    } else {
                        lvVarArr[1].setTranslationX(x10 - lvVarArr[0].getMeasuredWidth());
                    }
                    mvVar.e.j(Math.abs(x10) / lvVarArr[0].getMeasuredWidth(), lvVarArr[1].f);
                }
            } else if (Math.abs(x10) >= AndroidUtilities.getPixelsInCM(0.3f, true) && Math.abs(x10) > abs) {
                b(motionEvent, x10 < 0);
            }
        } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.a && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
            this.f.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, mvVar.v);
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
                float x11 = lvVarArr[0].getX();
                mvVar.h = new AnimatorSet();
                boolean z11 = Math.abs(x11) < ((float) lvVarArr[0].getMeasuredWidth()) / 3.0f && (Math.abs(f7) < 3500.0f || Math.abs(f7) < Math.abs(f10));
                mvVar.s = z11;
                Property property = View.TRANSLATION_X;
                if (z11) {
                    measuredWidth = Math.abs(x11);
                    if (mvVar.r) {
                        mvVar.h.playTogether(ObjectAnimator.ofFloat(lvVarArr[0], (Property<lv, Float>) property, 0.0f), ObjectAnimator.ofFloat(lvVarArr[1], (Property<lv, Float>) property, r1.getMeasuredWidth()));
                    } else {
                        mvVar.h.playTogether(ObjectAnimator.ofFloat(lvVarArr[0], (Property<lv, Float>) property, 0.0f), ObjectAnimator.ofFloat(lvVarArr[1], (Property<lv, Float>) property, -r1.getMeasuredWidth()));
                    }
                } else {
                    measuredWidth = lvVarArr[0].getMeasuredWidth() - Math.abs(x11);
                    if (mvVar.r) {
                        mvVar.h.playTogether(ObjectAnimator.ofFloat(lvVarArr[0], (Property<lv, Float>) property, -r9.getMeasuredWidth()), ObjectAnimator.ofFloat(lvVarArr[1], (Property<lv, Float>) property, 0.0f));
                    } else {
                        mvVar.h.playTogether(ObjectAnimator.ofFloat(lvVarArr[0], (Property<lv, Float>) property, r9.getMeasuredWidth()), ObjectAnimator.ofFloat(lvVarArr[1], (Property<lv, Float>) property, 0.0f));
                    }
                }
                mvVar.h.setInterpolator(mv.x);
                int measuredWidth2 = getMeasuredWidth();
                float f11 = measuredWidth2 / 2;
                float distanceInfluenceForSnapDuration = (AndroidUtilities.distanceInfluenceForSnapDuration(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth2)) * f11) + f11;
                mvVar.h.setDuration(Math.max(ImageReceiver.DEFAULT_CROSSFADE_DURATION, Math.min(Math.abs(f7) > 0.0f ? Math.round(Math.abs(distanceInfluenceForSnapDuration / r4) * 1000.0f) * 4 : (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f), 600)));
                mvVar.h.addListener(new org.telegram.ui.Components.i91(this, 16));
                mvVar.h.start();
                mvVar.n = true;
                this.b = false;
            } else {
                this.c = false;
                kVar = ((org.telegram.ui.ActionBar.n2) mvVar).actionBar;
                kVar.setEnabled(true);
                mvVar.e.setEnabled(true);
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
