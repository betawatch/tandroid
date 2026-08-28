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
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class bq0 extends org.telegram.ui.Components.xu0 {
    public int s0;
    public boolean t0;
    public boolean u0;
    public int v0;
    public int w0;
    public VelocityTracker x0;
    public boolean y0;
    public final /* synthetic */ eq0 z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bq0(eq0 eq0Var, Context context) {
        super(context, null);
        this.z0 = eq0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean Z() {
        AnimatorSet animatorSet;
        eq0 eq0Var = this.z0;
        cq0[] cq0VarArr = eq0Var.n;
        if (!eq0Var.s) {
            return false;
        }
        if (!eq0Var.w) {
            if (Math.abs(cq0VarArr[1].getTranslationX()) < 1.0f) {
                cq0VarArr[0].setTranslationX(r2.getMeasuredWidth() * (eq0Var.v ? -1 : 1));
                cq0VarArr[1].setTranslationX(0.0f);
                animatorSet = eq0Var.r;
                if (animatorSet != null) {
                }
                eq0Var.s = false;
            }
            return eq0Var.s;
        }
        if (Math.abs(cq0VarArr[0].getTranslationX()) < 1.0f) {
            cq0VarArr[0].setTranslationX(0.0f);
            cq0VarArr[1].setTranslationX(cq0VarArr[0].getMeasuredWidth() * (eq0Var.v ? 1 : -1));
            animatorSet = eq0Var.r;
            if (animatorSet != null) {
                animatorSet.cancel();
                eq0Var.r = null;
            }
            eq0Var.s = false;
        }
        return eq0Var.s;
    }

    public final boolean a0(MotionEvent motionEvent, boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        eq0 eq0Var = this.z0;
        cq0[] cq0VarArr = eq0Var.n;
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = eq0Var.h;
        int i9 = scrollSlidingTextTabStrip.K.get(scrollSlidingTextTabStrip.n + (z10 ? 1 : -1), -1);
        if (i9 < 0) {
            return false;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        this.u0 = false;
        this.t0 = true;
        this.v0 = (int) motionEvent.getX();
        kVar = ((org.telegram.ui.ActionBar.o2) eq0Var).actionBar;
        kVar.setEnabled(false);
        eq0Var.h.setEnabled(false);
        cq0 cq0Var = cq0VarArr[1];
        cq0Var.e = i9;
        cq0Var.setVisibility(0);
        eq0Var.v = z10;
        eq0Var.i0(true);
        if (z10) {
            cq0VarArr[1].setTranslationX(cq0VarArr[0].getMeasuredWidth());
            return true;
        }
        cq0VarArr[1].setTranslationX(-cq0VarArr[0].getMeasuredWidth());
        return true;
    }

    @Override // org.telegram.ui.Components.xu0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        super.dispatchDraw(canvas);
        eq0 eq0Var = this.z0;
        kVar = ((org.telegram.ui.ActionBar.o2) eq0Var).actionBar;
        int measuredHeight = kVar.getMeasuredHeight();
        kVar2 = ((org.telegram.ui.ActionBar.o2) eq0Var).actionBar;
        float translationY = measuredHeight + ((int) kVar2.getTranslationY());
        canvas.drawLine(0.0f, translationY, getWidth(), translationY, org.telegram.ui.ActionBar.f6.k0);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        eq0 eq0Var = this.z0;
        Paint paint = eq0Var.f;
        paint.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.a7, false));
        kVar = ((org.telegram.ui.ActionBar.o2) eq0Var).actionBar;
        float measuredHeight = kVar.getMeasuredHeight();
        kVar2 = ((org.telegram.ui.ActionBar.o2) eq0Var).actionBar;
        canvas.drawRect(0.0f, kVar2.getTranslationY() + measuredHeight, getMeasuredWidth(), getMeasuredHeight(), paint);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return Z() || this.z0.h.D || onTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0093  */
    @Override // org.telegram.ui.Components.xu0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        org.telegram.ui.Components.ut utVar;
        int measuredHeight;
        int measuredHeight2;
        int childCount = getChildCount();
        int dp = AndroidUtilities.dp(20.0f);
        eq0 eq0Var = this.z0;
        int emojiPadding = (dp < 0 || AndroidUtilities.isInMultiwindow || AndroidUtilities.isTablet()) ? 0 : eq0Var.d.getEmojiPadding();
        setBottomClip(emojiPadding);
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt = getChildAt(i19);
            if (childAt.getVisibility() != 8) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight3 = childAt.getMeasuredHeight();
                int i20 = layoutParams.gravity;
                if (i20 == -1) {
                    i20 = 51;
                }
                int i21 = i20 & 112;
                int i22 = i20 & 7;
                if (i22 == 1) {
                    i13 = (((i11 - i9) - measuredWidth) / 2) + layoutParams.leftMargin;
                    i14 = layoutParams.rightMargin;
                } else if (i22 != 5) {
                    i15 = getPaddingLeft() + layoutParams.leftMargin;
                    if (i21 == 16) {
                        if (i21 == 48) {
                            i18 = layoutParams.topMargin + getPaddingTop();
                        } else if (i21 != 80) {
                            i18 = layoutParams.topMargin;
                        } else {
                            i16 = ((i12 - emojiPadding) - i10) - measuredHeight3;
                            i17 = layoutParams.bottomMargin;
                        }
                        utVar = eq0Var.d;
                        if (utVar != null && utVar.l(childAt)) {
                            if (AndroidUtilities.isTablet()) {
                                measuredHeight = getMeasuredHeight();
                                measuredHeight2 = childAt.getMeasuredHeight();
                            } else {
                                measuredHeight = getMeasuredHeight();
                                measuredHeight2 = childAt.getMeasuredHeight();
                            }
                            i18 = measuredHeight - measuredHeight2;
                        }
                        childAt.layout(i15, i18, measuredWidth + i15, measuredHeight3 + i18);
                    } else {
                        i16 = ((((i12 - emojiPadding) - i10) - measuredHeight3) / 2) + layoutParams.topMargin;
                        i17 = layoutParams.bottomMargin;
                    }
                    i18 = i16 - i17;
                    utVar = eq0Var.d;
                    if (utVar != null) {
                        if (AndroidUtilities.isTablet()) {
                        }
                        i18 = measuredHeight - measuredHeight2;
                    }
                    childAt.layout(i15, i18, measuredWidth + i15, measuredHeight3 + i18);
                } else {
                    i13 = ((i11 - i9) - measuredWidth) - layoutParams.rightMargin;
                    i14 = getPaddingRight();
                }
                i15 = i13 - i14;
                if (i21 == 16) {
                }
                i18 = i16 - i17;
                utVar = eq0Var.d;
                if (utVar != null) {
                }
                childAt.layout(i15, i18, measuredWidth + i15, measuredHeight3 + i18);
            }
        }
        S();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0074 A[EDGE_INSN: B:18:0x0074->B:19:0x0074 BREAK  A[LOOP:0: B:7:0x004d->B:15:0x0071], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0052  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i9, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        int i11;
        org.telegram.ui.ActionBar.k kVar2;
        int i12;
        cq0[] cq0VarArr;
        int childCount;
        int i13;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.Components.wk0 wk0Var;
        int size = View.MeasureSpec.getSize(i9);
        int size2 = View.MeasureSpec.getSize(i10);
        setMeasuredDimension(size, size2);
        eq0 eq0Var = this.z0;
        kVar = ((org.telegram.ui.ActionBar.o2) eq0Var).actionBar;
        measureChildWithMargins(kVar, i9, 0, i10, 0);
        if (AndroidUtilities.dp(20.0f) < 0) {
            this.y0 = true;
            eq0Var.d.j();
            this.y0 = false;
        } else if (!AndroidUtilities.isInMultiwindow) {
            size2 -= eq0Var.d.getEmojiPadding();
            i11 = View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30);
            kVar2 = ((org.telegram.ui.ActionBar.o2) eq0Var).actionBar;
            int measuredHeight = kVar2.getMeasuredHeight();
            this.y0 = true;
            i12 = 0;
            while (true) {
                cq0VarArr = eq0Var.n;
                if (i12 < cq0VarArr.length) {
                    break;
                }
                cq0 cq0Var = cq0VarArr[i12];
                if (cq0Var != null && (wk0Var = cq0Var.d) != null) {
                    wk0Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f) + measuredHeight, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
                }
                i12++;
            }
            this.y0 = false;
            childCount = getChildCount();
            for (i13 = 0; i13 < childCount; i13++) {
                View childAt = getChildAt(i13);
                if (childAt != null && childAt.getVisibility() != 8) {
                    kVar3 = ((org.telegram.ui.ActionBar.o2) eq0Var).actionBar;
                    if (childAt != kVar3) {
                        org.telegram.ui.Components.ut utVar = eq0Var.d;
                        if (utVar == null || !utVar.l(childAt)) {
                            measureChildWithMargins(childAt, i9, 0, i11, 0);
                        } else if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, TLObject.FLAG_30));
                        } else if (AndroidUtilities.isTablet()) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(AndroidUtilities.isTablet() ? 200.0f : 320.0f), getPaddingTop() + (size2 - AndroidUtilities.statusBarHeight)), TLObject.FLAG_30));
                        } else {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (size2 - AndroidUtilities.statusBarHeight), TLObject.FLAG_30));
                        }
                    }
                }
            }
        }
        i11 = i10;
        kVar2 = ((org.telegram.ui.ActionBar.o2) eq0Var).actionBar;
        int measuredHeight2 = kVar2.getMeasuredHeight();
        this.y0 = true;
        i12 = 0;
        while (true) {
            cq0VarArr = eq0Var.n;
            if (i12 < cq0VarArr.length) {
            }
            i12++;
        }
        this.y0 = false;
        childCount = getChildCount();
        while (i13 < childCount) {
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
        eq0 eq0Var = this.z0;
        cq0[] cq0VarArr = eq0Var.n;
        b5Var = ((org.telegram.ui.ActionBar.o2) eq0Var).parentLayout;
        if (((ActionBarLayout) b5Var).j() || Z()) {
            return false;
        }
        if (motionEvent != null) {
            if (this.x0 == null) {
                this.x0 = VelocityTracker.obtain();
            }
            this.x0.addMovement(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && !this.t0 && !this.u0) {
            this.s0 = motionEvent.getPointerId(0);
            this.u0 = true;
            this.v0 = (int) motionEvent.getX();
            this.w0 = (int) motionEvent.getY();
            this.x0.clear();
        } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.s0) {
            int x10 = (int) (motionEvent.getX() - this.v0);
            int abs = Math.abs(((int) motionEvent.getY()) - this.w0);
            if (this.t0 && (((z10 = eq0Var.v) && x10 > 0) || (!z10 && x10 < 0))) {
                if (!a0(motionEvent, x10 < 0)) {
                    this.u0 = true;
                    this.t0 = false;
                    cq0VarArr[0].setTranslationX(0.0f);
                    cq0VarArr[1].setTranslationX(eq0Var.v ? cq0VarArr[0].getMeasuredWidth() : -cq0VarArr[0].getMeasuredWidth());
                    eq0Var.h.j(0.0f, cq0VarArr[1].e);
                }
            }
            if (!this.u0 || this.t0) {
                if (this.t0) {
                    cq0VarArr[0].setTranslationX(x10);
                    if (eq0Var.v) {
                        cq0VarArr[1].setTranslationX(cq0VarArr[0].getMeasuredWidth() + x10);
                    } else {
                        cq0VarArr[1].setTranslationX(x10 - cq0VarArr[0].getMeasuredWidth());
                    }
                    eq0Var.h.j(Math.abs(x10) / cq0VarArr[0].getMeasuredWidth(), cq0VarArr[1].e);
                }
            } else if (Math.abs(x10) >= AndroidUtilities.getPixelsInCM(0.3f, true) && Math.abs(x10) > abs) {
                a0(motionEvent, x10 < 0);
            }
        } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.s0 && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
            this.x0.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, eq0Var.x);
            if (motionEvent == null || motionEvent.getAction() == 3) {
                f10 = 0.0f;
                f11 = 0.0f;
            } else {
                f10 = this.x0.getXVelocity();
                f11 = this.x0.getYVelocity();
                if (!this.t0 && Math.abs(f10) >= 3000.0f && Math.abs(f10) > Math.abs(f11)) {
                    a0(motionEvent, f10 < 0.0f);
                }
            }
            if (this.t0) {
                float x11 = cq0VarArr[0].getX();
                eq0Var.r = new AnimatorSet();
                boolean z11 = Math.abs(x11) < ((float) cq0VarArr[0].getMeasuredWidth()) / 3.0f && (Math.abs(f10) < 3500.0f || Math.abs(f10) < Math.abs(f11));
                eq0Var.w = z11;
                Property property = View.TRANSLATION_X;
                if (z11) {
                    measuredWidth = Math.abs(x11);
                    if (eq0Var.v) {
                        eq0Var.r.playTogether(ObjectAnimator.ofFloat(cq0VarArr[0], (Property<cq0, Float>) property, 0.0f), ObjectAnimator.ofFloat(cq0VarArr[1], (Property<cq0, Float>) property, r1.getMeasuredWidth()));
                    } else {
                        eq0Var.r.playTogether(ObjectAnimator.ofFloat(cq0VarArr[0], (Property<cq0, Float>) property, 0.0f), ObjectAnimator.ofFloat(cq0VarArr[1], (Property<cq0, Float>) property, -r1.getMeasuredWidth()));
                    }
                } else {
                    measuredWidth = cq0VarArr[0].getMeasuredWidth() - Math.abs(x11);
                    if (eq0Var.v) {
                        eq0Var.r.playTogether(ObjectAnimator.ofFloat(cq0VarArr[0], (Property<cq0, Float>) property, -r10.getMeasuredWidth()), ObjectAnimator.ofFloat(cq0VarArr[1], (Property<cq0, Float>) property, 0.0f));
                    } else {
                        eq0Var.r.playTogether(ObjectAnimator.ofFloat(cq0VarArr[0], (Property<cq0, Float>) property, r10.getMeasuredWidth()), ObjectAnimator.ofFloat(cq0VarArr[1], (Property<cq0, Float>) property, 0.0f));
                    }
                }
                eq0Var.r.setInterpolator(eq0.y);
                int measuredWidth2 = getMeasuredWidth();
                float f12 = measuredWidth2 / 2;
                float distanceInfluenceForSnapDuration = (AndroidUtilities.distanceInfluenceForSnapDuration(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth2)) * f12) + f12;
                eq0Var.r.setDuration(Math.max(ImageReceiver.DEFAULT_CROSSFADE_DURATION, Math.min(Math.abs(f10) > 0.0f ? Math.round(Math.abs(distanceInfluenceForSnapDuration / r4) * 1000.0f) * 4 : (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f), 600)));
                eq0Var.r.addListener(new bc0(this, 6));
                eq0Var.r.start();
                eq0Var.s = true;
                this.t0 = false;
            } else {
                this.u0 = false;
                kVar = ((org.telegram.ui.ActionBar.o2) eq0Var).actionBar;
                kVar.setEnabled(true);
                eq0Var.h.setEnabled(true);
            }
            VelocityTracker velocityTracker = this.x0;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.x0 = null;
            }
        }
        return this.t0;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.y0) {
            return;
        }
        super.requestLayout();
    }
}
