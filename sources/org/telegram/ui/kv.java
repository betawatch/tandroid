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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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

    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
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

    public final boolean b(MotionEvent motionEvent, boolean z4) {
        org.telegram.ui.ActionBar.k kVar;
        mv mvVar = this.n;
        lv[] lvVarArr = mvVar.f;
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = mvVar.e;
        int i10 = scrollSlidingTextTabStrip.L.get(scrollSlidingTextTabStrip.n + (z4 ? 1 : -1), -1);
        if (i10 < 0) {
            return false;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        this.c = false;
        this.b = true;
        this.d = (int) motionEvent.getX();
        kVar = ((org.telegram.ui.ActionBar.p2) mvVar).actionBar;
        kVar.setEnabled(false);
        mvVar.e.setEnabled(false);
        lv lvVar = lvVarArr[1];
        lvVar.f = i10;
        lvVar.setVisibility(0);
        mvVar.r = z4;
        mvVar.m0(true);
        if (z4) {
            lvVarArr[1].setTranslationX(lvVarArr[0].getMeasuredWidth());
            return true;
        }
        lvVarArr[1].setTranslationX(-lvVarArr[0].getMeasuredWidth());
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.e5 e5Var;
        org.telegram.ui.ActionBar.e5 e5Var2;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        super.dispatchDraw(canvas);
        mv mvVar = this.n;
        e5Var = ((org.telegram.ui.ActionBar.p2) mvVar).parentLayout;
        if (e5Var != null) {
            e5Var2 = ((org.telegram.ui.ActionBar.p2) mvVar).parentLayout;
            kVar = ((org.telegram.ui.ActionBar.p2) mvVar).actionBar;
            int measuredHeight = kVar.getMeasuredHeight();
            kVar2 = ((org.telegram.ui.ActionBar.p2) mvVar).actionBar;
            ((ActionBarLayout) e5Var2).q(canvas, measuredHeight + ((int) kVar2.getTranslationY()));
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        mv mvVar = this.n;
        Paint paint = mvVar.d;
        paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
        kVar = ((org.telegram.ui.ActionBar.p2) mvVar).actionBar;
        float measuredHeight = kVar.getMeasuredHeight();
        kVar2 = ((org.telegram.ui.ActionBar.p2) mvVar).actionBar;
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
        mv mvVar = this.n;
        lv[] lvVarArr = mvVar.f;
        kVar = ((org.telegram.ui.ActionBar.p2) mvVar).actionBar;
        measureChildWithMargins(kVar, i10, 0, i11, 0);
        kVar2 = ((org.telegram.ui.ActionBar.p2) mvVar).actionBar;
        int measuredHeight = kVar2.getMeasuredHeight();
        this.h = true;
        for (int i12 = 0; i12 < lvVarArr.length; i12++) {
            lv lvVar = lvVarArr[i12];
            if (lvVar != null) {
                org.telegram.ui.Components.rl0 rl0Var = lvVar.d;
                if (rl0Var != null) {
                    rl0Var.setPadding(0, measuredHeight, 0, 0);
                }
                lh.e1 e1Var = lvVarArr[i12].e;
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
                kVar3 = ((org.telegram.ui.ActionBar.p2) mvVar).actionBar;
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
        mv mvVar = this.n;
        lv[] lvVarArr = mvVar.f;
        e5Var = ((org.telegram.ui.ActionBar.p2) mvVar).parentLayout;
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
            if (this.b && (((z4 = mvVar.r) && x10 > 0) || (!z4 && x10 < 0))) {
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
                float x11 = lvVarArr[0].getX();
                mvVar.h = new AnimatorSet();
                boolean z10 = Math.abs(x11) < ((float) lvVarArr[0].getMeasuredWidth()) / 3.0f && (Math.abs(f10) < 3500.0f || Math.abs(f10) < Math.abs(f11));
                mvVar.s = z10;
                Property property = View.TRANSLATION_X;
                if (z10) {
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
                float f12 = measuredWidth2 / 2;
                float distanceInfluenceForSnapDuration = (AndroidUtilities.distanceInfluenceForSnapDuration(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth2)) * f12) + f12;
                mvVar.h.setDuration(Math.max(ImageReceiver.DEFAULT_CROSSFADE_DURATION, Math.min(Math.abs(f10) > 0.0f ? Math.round(Math.abs(distanceInfluenceForSnapDuration / r4) * 1000.0f) * 4 : (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f), 600)));
                mvVar.h.addListener(new org.telegram.ui.Components.f91(this, 14));
                mvVar.h.start();
                mvVar.n = true;
                this.b = false;
            } else {
                this.c = false;
                kVar = ((org.telegram.ui.ActionBar.p2) mvVar).actionBar;
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
