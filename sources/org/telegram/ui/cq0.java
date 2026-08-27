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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class cq0 extends org.telegram.ui.Components.zu0 {
    public int s0;
    public boolean t0;
    public boolean u0;
    public int v0;
    public int w0;
    public VelocityTracker x0;
    public boolean y0;
    public final /* synthetic */ fq0 z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cq0(fq0 fq0Var, Context context) {
        super(context, null);
        this.z0 = fq0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean Z() {
        AnimatorSet animatorSet;
        fq0 fq0Var = this.z0;
        dq0[] dq0VarArr = fq0Var.n;
        if (!fq0Var.s) {
            return false;
        }
        if (!fq0Var.w) {
            if (Math.abs(dq0VarArr[1].getTranslationX()) < 1.0f) {
                dq0VarArr[0].setTranslationX(r2.getMeasuredWidth() * (fq0Var.v ? -1 : 1));
                dq0VarArr[1].setTranslationX(0.0f);
                animatorSet = fq0Var.r;
                if (animatorSet != null) {
                }
                fq0Var.s = false;
            }
            return fq0Var.s;
        }
        if (Math.abs(dq0VarArr[0].getTranslationX()) < 1.0f) {
            dq0VarArr[0].setTranslationX(0.0f);
            dq0VarArr[1].setTranslationX(dq0VarArr[0].getMeasuredWidth() * (fq0Var.v ? 1 : -1));
            animatorSet = fq0Var.r;
            if (animatorSet != null) {
                animatorSet.cancel();
                fq0Var.r = null;
            }
            fq0Var.s = false;
        }
        return fq0Var.s;
    }

    public final boolean a0(MotionEvent motionEvent, boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        fq0 fq0Var = this.z0;
        dq0[] dq0VarArr = fq0Var.n;
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = fq0Var.h;
        int i10 = scrollSlidingTextTabStrip.K.get(scrollSlidingTextTabStrip.n + (z10 ? 1 : -1), -1);
        if (i10 < 0) {
            return false;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        this.u0 = false;
        this.t0 = true;
        this.v0 = (int) motionEvent.getX();
        kVar = ((org.telegram.ui.ActionBar.n2) fq0Var).actionBar;
        kVar.setEnabled(false);
        fq0Var.h.setEnabled(false);
        dq0 dq0Var = dq0VarArr[1];
        dq0Var.e = i10;
        dq0Var.setVisibility(0);
        fq0Var.v = z10;
        fq0Var.j0(true);
        if (z10) {
            dq0VarArr[1].setTranslationX(dq0VarArr[0].getMeasuredWidth());
            return true;
        }
        dq0VarArr[1].setTranslationX(-dq0VarArr[0].getMeasuredWidth());
        return true;
    }

    @Override // org.telegram.ui.Components.zu0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        super.dispatchDraw(canvas);
        fq0 fq0Var = this.z0;
        kVar = ((org.telegram.ui.ActionBar.n2) fq0Var).actionBar;
        int measuredHeight = kVar.getMeasuredHeight();
        kVar2 = ((org.telegram.ui.ActionBar.n2) fq0Var).actionBar;
        float translationY = measuredHeight + ((int) kVar2.getTranslationY());
        canvas.drawLine(0.0f, translationY, getWidth(), translationY, org.telegram.ui.ActionBar.g6.k0);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        fq0 fq0Var = this.z0;
        Paint paint = fq0Var.f;
        paint.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.a7, false));
        kVar = ((org.telegram.ui.ActionBar.n2) fq0Var).actionBar;
        float measuredHeight = kVar.getMeasuredHeight();
        kVar2 = ((org.telegram.ui.ActionBar.n2) fq0Var).actionBar;
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
    @Override // org.telegram.ui.Components.zu0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        org.telegram.ui.Components.tt ttVar;
        int measuredHeight;
        int measuredHeight2;
        int childCount = getChildCount();
        int dp = AndroidUtilities.dp(20.0f);
        fq0 fq0Var = this.z0;
        int emojiPadding = (dp < 0 || AndroidUtilities.isInMultiwindow || AndroidUtilities.isTablet()) ? 0 : fq0Var.d.getEmojiPadding();
        setBottomClip(emojiPadding);
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt = getChildAt(i20);
            if (childAt.getVisibility() != 8) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight3 = childAt.getMeasuredHeight();
                int i21 = layoutParams.gravity;
                if (i21 == -1) {
                    i21 = 51;
                }
                int i22 = i21 & 112;
                int i23 = i21 & 7;
                if (i23 == 1) {
                    i14 = (((i12 - i10) - measuredWidth) / 2) + layoutParams.leftMargin;
                    i15 = layoutParams.rightMargin;
                } else if (i23 != 5) {
                    i16 = getPaddingLeft() + layoutParams.leftMargin;
                    if (i22 == 16) {
                        if (i22 == 48) {
                            i19 = layoutParams.topMargin + getPaddingTop();
                        } else if (i22 != 80) {
                            i19 = layoutParams.topMargin;
                        } else {
                            i17 = ((i13 - emojiPadding) - i11) - measuredHeight3;
                            i18 = layoutParams.bottomMargin;
                        }
                        ttVar = fq0Var.d;
                        if (ttVar != null && ttVar.l(childAt)) {
                            if (AndroidUtilities.isTablet()) {
                                measuredHeight = getMeasuredHeight();
                                measuredHeight2 = childAt.getMeasuredHeight();
                            } else {
                                measuredHeight = getMeasuredHeight();
                                measuredHeight2 = childAt.getMeasuredHeight();
                            }
                            i19 = measuredHeight - measuredHeight2;
                        }
                        childAt.layout(i16, i19, measuredWidth + i16, measuredHeight3 + i19);
                    } else {
                        i17 = ((((i13 - emojiPadding) - i11) - measuredHeight3) / 2) + layoutParams.topMargin;
                        i18 = layoutParams.bottomMargin;
                    }
                    i19 = i17 - i18;
                    ttVar = fq0Var.d;
                    if (ttVar != null) {
                        if (AndroidUtilities.isTablet()) {
                        }
                        i19 = measuredHeight - measuredHeight2;
                    }
                    childAt.layout(i16, i19, measuredWidth + i16, measuredHeight3 + i19);
                } else {
                    i14 = ((i12 - i10) - measuredWidth) - layoutParams.rightMargin;
                    i15 = getPaddingRight();
                }
                i16 = i14 - i15;
                if (i22 == 16) {
                }
                i19 = i17 - i18;
                ttVar = fq0Var.d;
                if (ttVar != null) {
                }
                childAt.layout(i16, i19, measuredWidth + i16, measuredHeight3 + i19);
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
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        int i12;
        org.telegram.ui.ActionBar.k kVar2;
        int i13;
        dq0[] dq0VarArr;
        int childCount;
        int i14;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.Components.zk0 zk0Var;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(size, size2);
        fq0 fq0Var = this.z0;
        kVar = ((org.telegram.ui.ActionBar.n2) fq0Var).actionBar;
        measureChildWithMargins(kVar, i10, 0, i11, 0);
        if (AndroidUtilities.dp(20.0f) < 0) {
            this.y0 = true;
            fq0Var.d.j();
            this.y0 = false;
        } else if (!AndroidUtilities.isInMultiwindow) {
            size2 -= fq0Var.d.getEmojiPadding();
            i12 = View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30);
            kVar2 = ((org.telegram.ui.ActionBar.n2) fq0Var).actionBar;
            int measuredHeight = kVar2.getMeasuredHeight();
            this.y0 = true;
            i13 = 0;
            while (true) {
                dq0VarArr = fq0Var.n;
                if (i13 < dq0VarArr.length) {
                    break;
                }
                dq0 dq0Var = dq0VarArr[i13];
                if (dq0Var != null && (zk0Var = dq0Var.d) != null) {
                    zk0Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f) + measuredHeight, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
                }
                i13++;
            }
            this.y0 = false;
            childCount = getChildCount();
            for (i14 = 0; i14 < childCount; i14++) {
                View childAt = getChildAt(i14);
                if (childAt != null && childAt.getVisibility() != 8) {
                    kVar3 = ((org.telegram.ui.ActionBar.n2) fq0Var).actionBar;
                    if (childAt != kVar3) {
                        org.telegram.ui.Components.tt ttVar = fq0Var.d;
                        if (ttVar == null || !ttVar.l(childAt)) {
                            measureChildWithMargins(childAt, i10, 0, i12, 0);
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
        i12 = i11;
        kVar2 = ((org.telegram.ui.ActionBar.n2) fq0Var).actionBar;
        int measuredHeight2 = kVar2.getMeasuredHeight();
        this.y0 = true;
        i13 = 0;
        while (true) {
            dq0VarArr = fq0Var.n;
            if (i13 < dq0VarArr.length) {
            }
            i13++;
        }
        this.y0 = false;
        childCount = getChildCount();
        while (i14 < childCount) {
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
        fq0 fq0Var = this.z0;
        dq0[] dq0VarArr = fq0Var.n;
        b5Var = ((org.telegram.ui.ActionBar.n2) fq0Var).parentLayout;
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
            int x8 = (int) (motionEvent.getX() - this.v0);
            int abs = Math.abs(((int) motionEvent.getY()) - this.w0);
            if (this.t0 && (((z10 = fq0Var.v) && x8 > 0) || (!z10 && x8 < 0))) {
                if (!a0(motionEvent, x8 < 0)) {
                    this.u0 = true;
                    this.t0 = false;
                    dq0VarArr[0].setTranslationX(0.0f);
                    dq0VarArr[1].setTranslationX(fq0Var.v ? dq0VarArr[0].getMeasuredWidth() : -dq0VarArr[0].getMeasuredWidth());
                    fq0Var.h.j(0.0f, dq0VarArr[1].e);
                }
            }
            if (!this.u0 || this.t0) {
                if (this.t0) {
                    dq0VarArr[0].setTranslationX(x8);
                    if (fq0Var.v) {
                        dq0VarArr[1].setTranslationX(dq0VarArr[0].getMeasuredWidth() + x8);
                    } else {
                        dq0VarArr[1].setTranslationX(x8 - dq0VarArr[0].getMeasuredWidth());
                    }
                    fq0Var.h.j(Math.abs(x8) / dq0VarArr[0].getMeasuredWidth(), dq0VarArr[1].e);
                }
            } else if (Math.abs(x8) >= AndroidUtilities.getPixelsInCM(0.3f, true) && Math.abs(x8) > abs) {
                a0(motionEvent, x8 < 0);
            }
        } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.s0 && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
            this.x0.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, fq0Var.x);
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
                float x10 = dq0VarArr[0].getX();
                fq0Var.r = new AnimatorSet();
                boolean z11 = Math.abs(x10) < ((float) dq0VarArr[0].getMeasuredWidth()) / 3.0f && (Math.abs(f10) < 3500.0f || Math.abs(f10) < Math.abs(f11));
                fq0Var.w = z11;
                Property property = View.TRANSLATION_X;
                if (z11) {
                    measuredWidth = Math.abs(x10);
                    if (fq0Var.v) {
                        fq0Var.r.playTogether(ObjectAnimator.ofFloat(dq0VarArr[0], (Property<dq0, Float>) property, 0.0f), ObjectAnimator.ofFloat(dq0VarArr[1], (Property<dq0, Float>) property, r1.getMeasuredWidth()));
                    } else {
                        fq0Var.r.playTogether(ObjectAnimator.ofFloat(dq0VarArr[0], (Property<dq0, Float>) property, 0.0f), ObjectAnimator.ofFloat(dq0VarArr[1], (Property<dq0, Float>) property, -r1.getMeasuredWidth()));
                    }
                } else {
                    measuredWidth = dq0VarArr[0].getMeasuredWidth() - Math.abs(x10);
                    if (fq0Var.v) {
                        fq0Var.r.playTogether(ObjectAnimator.ofFloat(dq0VarArr[0], (Property<dq0, Float>) property, -r9.getMeasuredWidth()), ObjectAnimator.ofFloat(dq0VarArr[1], (Property<dq0, Float>) property, 0.0f));
                    } else {
                        fq0Var.r.playTogether(ObjectAnimator.ofFloat(dq0VarArr[0], (Property<dq0, Float>) property, r9.getMeasuredWidth()), ObjectAnimator.ofFloat(dq0VarArr[1], (Property<dq0, Float>) property, 0.0f));
                    }
                }
                fq0Var.r.setInterpolator(fq0.y);
                int measuredWidth2 = getMeasuredWidth();
                float f12 = measuredWidth2 / 2;
                float distanceInfluenceForSnapDuration = (AndroidUtilities.distanceInfluenceForSnapDuration(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth2)) * f12) + f12;
                fq0Var.r.setDuration(Math.max(ImageReceiver.DEFAULT_CROSSFADE_DURATION, Math.min(Math.abs(f10) > 0.0f ? Math.round(Math.abs(distanceInfluenceForSnapDuration / r4) * 1000.0f) * 4 : (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f), 600)));
                fq0Var.r.addListener(new f50(this, 8));
                fq0Var.r.start();
                fq0Var.s = true;
                this.t0 = false;
            } else {
                this.u0 = false;
                kVar = ((org.telegram.ui.ActionBar.n2) fq0Var).actionBar;
                kVar.setEnabled(true);
                fq0Var.h.setEnabled(true);
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
