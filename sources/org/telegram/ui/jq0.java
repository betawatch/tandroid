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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class jq0 extends org.telegram.ui.Components.qv0 {
    public final /* synthetic */ mq0 A0;
    public int t0;
    public boolean u0;
    public boolean v0;
    public int w0;
    public int x0;
    public VelocityTracker y0;
    public boolean z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jq0(mq0 mq0Var, Context context) {
        super(context, null);
        this.A0 = mq0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean Z() {
        AnimatorSet animatorSet;
        mq0 mq0Var = this.A0;
        kq0[] kq0VarArr = mq0Var.n;
        if (!mq0Var.s) {
            return false;
        }
        if (!mq0Var.w) {
            if (Math.abs(kq0VarArr[1].getTranslationX()) < 1.0f) {
                kq0VarArr[0].setTranslationX(r2.getMeasuredWidth() * (mq0Var.v ? -1 : 1));
                kq0VarArr[1].setTranslationX(0.0f);
                animatorSet = mq0Var.r;
                if (animatorSet != null) {
                }
                mq0Var.s = false;
            }
            return mq0Var.s;
        }
        if (Math.abs(kq0VarArr[0].getTranslationX()) < 1.0f) {
            kq0VarArr[0].setTranslationX(0.0f);
            kq0VarArr[1].setTranslationX(kq0VarArr[0].getMeasuredWidth() * (mq0Var.v ? 1 : -1));
            animatorSet = mq0Var.r;
            if (animatorSet != null) {
                animatorSet.cancel();
                mq0Var.r = null;
            }
            mq0Var.s = false;
        }
        return mq0Var.s;
    }

    public final boolean a0(MotionEvent motionEvent, boolean z4) {
        org.telegram.ui.ActionBar.k kVar;
        mq0 mq0Var = this.A0;
        kq0[] kq0VarArr = mq0Var.n;
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = mq0Var.h;
        int i10 = scrollSlidingTextTabStrip.L.get(scrollSlidingTextTabStrip.n + (z4 ? 1 : -1), -1);
        if (i10 < 0) {
            return false;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        this.v0 = false;
        this.u0 = true;
        this.w0 = (int) motionEvent.getX();
        kVar = ((org.telegram.ui.ActionBar.p2) mq0Var).actionBar;
        kVar.setEnabled(false);
        mq0Var.h.setEnabled(false);
        kq0 kq0Var = kq0VarArr[1];
        kq0Var.e = i10;
        kq0Var.setVisibility(0);
        mq0Var.v = z4;
        mq0Var.j0(true);
        if (z4) {
            kq0VarArr[1].setTranslationX(kq0VarArr[0].getMeasuredWidth());
            return true;
        }
        kq0VarArr[1].setTranslationX(-kq0VarArr[0].getMeasuredWidth());
        return true;
    }

    @Override // org.telegram.ui.Components.qv0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        super.dispatchDraw(canvas);
        mq0 mq0Var = this.A0;
        kVar = ((org.telegram.ui.ActionBar.p2) mq0Var).actionBar;
        int measuredHeight = kVar.getMeasuredHeight();
        kVar2 = ((org.telegram.ui.ActionBar.p2) mq0Var).actionBar;
        float translationY = measuredHeight + ((int) kVar2.getTranslationY());
        canvas.drawLine(0.0f, translationY, getWidth(), translationY, org.telegram.ui.ActionBar.k6.k0);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        mq0 mq0Var = this.A0;
        Paint paint = mq0Var.f;
        paint.setColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.a7, false));
        kVar = ((org.telegram.ui.ActionBar.p2) mq0Var).actionBar;
        float measuredHeight = kVar.getMeasuredHeight();
        kVar2 = ((org.telegram.ui.ActionBar.p2) mq0Var).actionBar;
        canvas.drawRect(0.0f, kVar2.getTranslationY() + measuredHeight, getMeasuredWidth(), getMeasuredHeight(), paint);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return Z() || this.A0.h.E || onTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0093  */
    @Override // org.telegram.ui.Components.qv0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        org.telegram.ui.Components.fu fuVar;
        int measuredHeight;
        int measuredHeight2;
        int childCount = getChildCount();
        int dp = AndroidUtilities.dp(20.0f);
        mq0 mq0Var = this.A0;
        int emojiPadding = (dp < 0 || AndroidUtilities.isInMultiwindow || AndroidUtilities.isTablet()) ? 0 : mq0Var.d.getEmojiPadding();
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
                        fuVar = mq0Var.d;
                        if (fuVar != null && fuVar.l(childAt)) {
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
                    fuVar = mq0Var.d;
                    if (fuVar != null) {
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
                fuVar = mq0Var.d;
                if (fuVar != null) {
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
        kq0[] kq0VarArr;
        int childCount;
        int i14;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.Components.tl0 tl0Var;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(size, size2);
        mq0 mq0Var = this.A0;
        kVar = ((org.telegram.ui.ActionBar.p2) mq0Var).actionBar;
        measureChildWithMargins(kVar, i10, 0, i11, 0);
        if (AndroidUtilities.dp(20.0f) < 0) {
            this.z0 = true;
            mq0Var.d.j();
            this.z0 = false;
        } else if (!AndroidUtilities.isInMultiwindow) {
            size2 -= mq0Var.d.getEmojiPadding();
            i12 = View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30);
            kVar2 = ((org.telegram.ui.ActionBar.p2) mq0Var).actionBar;
            int measuredHeight = kVar2.getMeasuredHeight();
            this.z0 = true;
            i13 = 0;
            while (true) {
                kq0VarArr = mq0Var.n;
                if (i13 < kq0VarArr.length) {
                    break;
                }
                kq0 kq0Var = kq0VarArr[i13];
                if (kq0Var != null && (tl0Var = kq0Var.d) != null) {
                    tl0Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f) + measuredHeight, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
                }
                i13++;
            }
            this.z0 = false;
            childCount = getChildCount();
            for (i14 = 0; i14 < childCount; i14++) {
                View childAt = getChildAt(i14);
                if (childAt != null && childAt.getVisibility() != 8) {
                    kVar3 = ((org.telegram.ui.ActionBar.p2) mq0Var).actionBar;
                    if (childAt != kVar3) {
                        org.telegram.ui.Components.fu fuVar = mq0Var.d;
                        if (fuVar == null || !fuVar.l(childAt)) {
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
        kVar2 = ((org.telegram.ui.ActionBar.p2) mq0Var).actionBar;
        int measuredHeight2 = kVar2.getMeasuredHeight();
        this.z0 = true;
        i13 = 0;
        while (true) {
            kq0VarArr = mq0Var.n;
            if (i13 < kq0VarArr.length) {
            }
            i13++;
        }
        this.z0 = false;
        childCount = getChildCount();
        while (i14 < childCount) {
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
        mq0 mq0Var = this.A0;
        kq0[] kq0VarArr = mq0Var.n;
        f5Var = ((org.telegram.ui.ActionBar.p2) mq0Var).parentLayout;
        if (((ActionBarLayout) f5Var).j() || Z()) {
            return false;
        }
        if (motionEvent != null) {
            if (this.y0 == null) {
                this.y0 = VelocityTracker.obtain();
            }
            this.y0.addMovement(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && !this.u0 && !this.v0) {
            this.t0 = motionEvent.getPointerId(0);
            this.v0 = true;
            this.w0 = (int) motionEvent.getX();
            this.x0 = (int) motionEvent.getY();
            this.y0.clear();
        } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.t0) {
            int x10 = (int) (motionEvent.getX() - this.w0);
            int abs = Math.abs(((int) motionEvent.getY()) - this.x0);
            if (this.u0 && (((z4 = mq0Var.v) && x10 > 0) || (!z4 && x10 < 0))) {
                if (!a0(motionEvent, x10 < 0)) {
                    this.v0 = true;
                    this.u0 = false;
                    kq0VarArr[0].setTranslationX(0.0f);
                    kq0VarArr[1].setTranslationX(mq0Var.v ? kq0VarArr[0].getMeasuredWidth() : -kq0VarArr[0].getMeasuredWidth());
                    mq0Var.h.j(0.0f, kq0VarArr[1].e);
                }
            }
            if (!this.v0 || this.u0) {
                if (this.u0) {
                    kq0VarArr[0].setTranslationX(x10);
                    if (mq0Var.v) {
                        kq0VarArr[1].setTranslationX(kq0VarArr[0].getMeasuredWidth() + x10);
                    } else {
                        kq0VarArr[1].setTranslationX(x10 - kq0VarArr[0].getMeasuredWidth());
                    }
                    mq0Var.h.j(Math.abs(x10) / kq0VarArr[0].getMeasuredWidth(), kq0VarArr[1].e);
                }
            } else if (Math.abs(x10) >= AndroidUtilities.getPixelsInCM(0.3f, true) && Math.abs(x10) > abs) {
                a0(motionEvent, x10 < 0);
            }
        } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.t0 && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
            this.y0.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, mq0Var.x);
            if (motionEvent == null || motionEvent.getAction() == 3) {
                f10 = 0.0f;
                f11 = 0.0f;
            } else {
                f10 = this.y0.getXVelocity();
                f11 = this.y0.getYVelocity();
                if (!this.u0 && Math.abs(f10) >= 3000.0f && Math.abs(f10) > Math.abs(f11)) {
                    a0(motionEvent, f10 < 0.0f);
                }
            }
            if (this.u0) {
                float x11 = kq0VarArr[0].getX();
                mq0Var.r = new AnimatorSet();
                boolean z10 = Math.abs(x11) < ((float) kq0VarArr[0].getMeasuredWidth()) / 3.0f && (Math.abs(f10) < 3500.0f || Math.abs(f10) < Math.abs(f11));
                mq0Var.w = z10;
                Property property = View.TRANSLATION_X;
                if (z10) {
                    measuredWidth = Math.abs(x11);
                    if (mq0Var.v) {
                        mq0Var.r.playTogether(ObjectAnimator.ofFloat(kq0VarArr[0], (Property<kq0, Float>) property, 0.0f), ObjectAnimator.ofFloat(kq0VarArr[1], (Property<kq0, Float>) property, r1.getMeasuredWidth()));
                    } else {
                        mq0Var.r.playTogether(ObjectAnimator.ofFloat(kq0VarArr[0], (Property<kq0, Float>) property, 0.0f), ObjectAnimator.ofFloat(kq0VarArr[1], (Property<kq0, Float>) property, -r1.getMeasuredWidth()));
                    }
                } else {
                    measuredWidth = kq0VarArr[0].getMeasuredWidth() - Math.abs(x11);
                    if (mq0Var.v) {
                        mq0Var.r.playTogether(ObjectAnimator.ofFloat(kq0VarArr[0], (Property<kq0, Float>) property, -r9.getMeasuredWidth()), ObjectAnimator.ofFloat(kq0VarArr[1], (Property<kq0, Float>) property, 0.0f));
                    } else {
                        mq0Var.r.playTogether(ObjectAnimator.ofFloat(kq0VarArr[0], (Property<kq0, Float>) property, r9.getMeasuredWidth()), ObjectAnimator.ofFloat(kq0VarArr[1], (Property<kq0, Float>) property, 0.0f));
                    }
                }
                mq0Var.r.setInterpolator(mq0.y);
                int measuredWidth2 = getMeasuredWidth();
                float f12 = measuredWidth2 / 2;
                float distanceInfluenceForSnapDuration = (AndroidUtilities.distanceInfluenceForSnapDuration(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth2)) * f12) + f12;
                mq0Var.r.setDuration(Math.max(ImageReceiver.DEFAULT_CROSSFADE_DURATION, Math.min(Math.abs(f10) > 0.0f ? Math.round(Math.abs(distanceInfluenceForSnapDuration / r4) * 1000.0f) * 4 : (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f), 600)));
                mq0Var.r.addListener(new org.telegram.ui.Components.g91(this, 29));
                mq0Var.r.start();
                mq0Var.s = true;
                this.u0 = false;
            } else {
                this.v0 = false;
                kVar = ((org.telegram.ui.ActionBar.p2) mq0Var).actionBar;
                kVar.setEnabled(true);
                mq0Var.h.setEnabled(true);
            }
            VelocityTracker velocityTracker = this.y0;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.y0 = null;
            }
        }
        return this.u0;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.z0) {
            return;
        }
        super.requestLayout();
    }
}
