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

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class nq0 extends org.telegram.ui.Components.jw0 {
    public int A0;
    public VelocityTracker B0;
    public boolean C0;
    public final /* synthetic */ qq0 D0;
    public int w0;
    public boolean x0;
    public boolean y0;
    public int z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nq0(qq0 qq0Var, Context context) {
        super(context, null);
        this.D0 = qq0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean Z() {
        AnimatorSet animatorSet;
        qq0 qq0Var = this.D0;
        oq0[] oq0VarArr = qq0Var.n;
        if (!qq0Var.s) {
            return false;
        }
        if (!qq0Var.w) {
            if (Math.abs(oq0VarArr[1].getTranslationX()) < 1.0f) {
                oq0VarArr[0].setTranslationX(r2.getMeasuredWidth() * (qq0Var.v ? -1 : 1));
                oq0VarArr[1].setTranslationX(0.0f);
                animatorSet = qq0Var.r;
                if (animatorSet != null) {
                }
                qq0Var.s = false;
            }
            return qq0Var.s;
        }
        if (Math.abs(oq0VarArr[0].getTranslationX()) < 1.0f) {
            oq0VarArr[0].setTranslationX(0.0f);
            oq0VarArr[1].setTranslationX(oq0VarArr[0].getMeasuredWidth() * (qq0Var.v ? 1 : -1));
            animatorSet = qq0Var.r;
            if (animatorSet != null) {
                animatorSet.cancel();
                qq0Var.r = null;
            }
            qq0Var.s = false;
        }
        return qq0Var.s;
    }

    public final boolean a0(MotionEvent motionEvent, boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        qq0 qq0Var = this.D0;
        oq0[] oq0VarArr = qq0Var.n;
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = qq0Var.h;
        int i10 = scrollSlidingTextTabStrip.O.get(scrollSlidingTextTabStrip.n + (z10 ? 1 : -1), -1);
        if (i10 < 0) {
            return false;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        this.y0 = false;
        this.x0 = true;
        this.z0 = (int) motionEvent.getX();
        kVar = ((org.telegram.ui.ActionBar.n2) qq0Var).actionBar;
        kVar.setEnabled(false);
        qq0Var.h.setEnabled(false);
        oq0 oq0Var = oq0VarArr[1];
        oq0Var.e = i10;
        oq0Var.setVisibility(0);
        qq0Var.v = z10;
        qq0Var.j0(true);
        if (z10) {
            oq0VarArr[1].setTranslationX(oq0VarArr[0].getMeasuredWidth());
            return true;
        }
        oq0VarArr[1].setTranslationX(-oq0VarArr[0].getMeasuredWidth());
        return true;
    }

    @Override // org.telegram.ui.Components.jw0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        super.dispatchDraw(canvas);
        qq0 qq0Var = this.D0;
        kVar = ((org.telegram.ui.ActionBar.n2) qq0Var).actionBar;
        int measuredHeight = kVar.getMeasuredHeight();
        kVar2 = ((org.telegram.ui.ActionBar.n2) qq0Var).actionBar;
        float translationY = measuredHeight + ((int) kVar2.getTranslationY());
        canvas.drawLine(0.0f, translationY, getWidth(), translationY, org.telegram.ui.ActionBar.h6.k0);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        qq0 qq0Var = this.D0;
        Paint paint = qq0Var.f;
        paint.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.a7, false));
        kVar = ((org.telegram.ui.ActionBar.n2) qq0Var).actionBar;
        float measuredHeight = kVar.getMeasuredHeight();
        kVar2 = ((org.telegram.ui.ActionBar.n2) qq0Var).actionBar;
        canvas.drawRect(0.0f, kVar2.getTranslationY() + measuredHeight, getMeasuredWidth(), getMeasuredHeight(), paint);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return Z() || this.D0.h.H || onTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0093  */
    @Override // org.telegram.ui.Components.jw0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
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
        org.telegram.ui.Components.qu quVar;
        int measuredHeight;
        int measuredHeight2;
        int childCount = getChildCount();
        int dp = AndroidUtilities.dp(20.0f);
        qq0 qq0Var = this.D0;
        int emojiPadding = (dp < 0 || AndroidUtilities.isInMultiwindow || AndroidUtilities.isTablet()) ? 0 : qq0Var.d.getEmojiPadding();
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
                        quVar = qq0Var.d;
                        if (quVar != null && quVar.l(childAt)) {
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
                    quVar = qq0Var.d;
                    if (quVar != null) {
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
                quVar = qq0Var.d;
                if (quVar != null) {
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
        oq0[] oq0VarArr;
        int childCount;
        int i14;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.Components.im0 im0Var;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(size, size2);
        qq0 qq0Var = this.D0;
        kVar = ((org.telegram.ui.ActionBar.n2) qq0Var).actionBar;
        measureChildWithMargins(kVar, i10, 0, i11, 0);
        if (AndroidUtilities.dp(20.0f) < 0) {
            this.C0 = true;
            qq0Var.d.j();
            this.C0 = false;
        } else if (!AndroidUtilities.isInMultiwindow) {
            size2 -= qq0Var.d.getEmojiPadding();
            i12 = View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30);
            kVar2 = ((org.telegram.ui.ActionBar.n2) qq0Var).actionBar;
            int measuredHeight = kVar2.getMeasuredHeight();
            this.C0 = true;
            i13 = 0;
            while (true) {
                oq0VarArr = qq0Var.n;
                if (i13 < oq0VarArr.length) {
                    break;
                }
                oq0 oq0Var = oq0VarArr[i13];
                if (oq0Var != null && (im0Var = oq0Var.d) != null) {
                    im0Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f) + measuredHeight, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
                }
                i13++;
            }
            this.C0 = false;
            childCount = getChildCount();
            for (i14 = 0; i14 < childCount; i14++) {
                View childAt = getChildAt(i14);
                if (childAt != null && childAt.getVisibility() != 8) {
                    kVar3 = ((org.telegram.ui.ActionBar.n2) qq0Var).actionBar;
                    if (childAt != kVar3) {
                        org.telegram.ui.Components.qu quVar = qq0Var.d;
                        if (quVar == null || !quVar.l(childAt)) {
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
        kVar2 = ((org.telegram.ui.ActionBar.n2) qq0Var).actionBar;
        int measuredHeight2 = kVar2.getMeasuredHeight();
        this.C0 = true;
        i13 = 0;
        while (true) {
            oq0VarArr = qq0Var.n;
            if (i13 < oq0VarArr.length) {
            }
            i13++;
        }
        this.C0 = false;
        childCount = getChildCount();
        while (i14 < childCount) {
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
        qq0 qq0Var = this.D0;
        oq0[] oq0VarArr = qq0Var.n;
        d5Var = ((org.telegram.ui.ActionBar.n2) qq0Var).parentLayout;
        if (((ActionBarLayout) d5Var).j() || Z()) {
            return false;
        }
        if (motionEvent != null) {
            if (this.B0 == null) {
                this.B0 = VelocityTracker.obtain();
            }
            this.B0.addMovement(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && !this.x0 && !this.y0) {
            this.w0 = motionEvent.getPointerId(0);
            this.y0 = true;
            this.z0 = (int) motionEvent.getX();
            this.A0 = (int) motionEvent.getY();
            this.B0.clear();
        } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.w0) {
            int x10 = (int) (motionEvent.getX() - this.z0);
            int abs = Math.abs(((int) motionEvent.getY()) - this.A0);
            if (this.x0 && (((z10 = qq0Var.v) && x10 > 0) || (!z10 && x10 < 0))) {
                if (!a0(motionEvent, x10 < 0)) {
                    this.y0 = true;
                    this.x0 = false;
                    oq0VarArr[0].setTranslationX(0.0f);
                    oq0VarArr[1].setTranslationX(qq0Var.v ? oq0VarArr[0].getMeasuredWidth() : -oq0VarArr[0].getMeasuredWidth());
                    qq0Var.h.j(0.0f, oq0VarArr[1].e);
                }
            }
            if (!this.y0 || this.x0) {
                if (this.x0) {
                    oq0VarArr[0].setTranslationX(x10);
                    if (qq0Var.v) {
                        oq0VarArr[1].setTranslationX(oq0VarArr[0].getMeasuredWidth() + x10);
                    } else {
                        oq0VarArr[1].setTranslationX(x10 - oq0VarArr[0].getMeasuredWidth());
                    }
                    qq0Var.h.j(Math.abs(x10) / oq0VarArr[0].getMeasuredWidth(), oq0VarArr[1].e);
                }
            } else if (Math.abs(x10) >= AndroidUtilities.getPixelsInCM(0.3f, true) && Math.abs(x10) > abs) {
                a0(motionEvent, x10 < 0);
            }
        } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.w0 && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
            this.B0.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, qq0Var.x);
            if (motionEvent == null || motionEvent.getAction() == 3) {
                f7 = 0.0f;
                f10 = 0.0f;
            } else {
                f7 = this.B0.getXVelocity();
                f10 = this.B0.getYVelocity();
                if (!this.x0 && Math.abs(f7) >= 3000.0f && Math.abs(f7) > Math.abs(f10)) {
                    a0(motionEvent, f7 < 0.0f);
                }
            }
            if (this.x0) {
                float x11 = oq0VarArr[0].getX();
                qq0Var.r = new AnimatorSet();
                boolean z11 = Math.abs(x11) < ((float) oq0VarArr[0].getMeasuredWidth()) / 3.0f && (Math.abs(f7) < 3500.0f || Math.abs(f7) < Math.abs(f10));
                qq0Var.w = z11;
                Property property = View.TRANSLATION_X;
                if (z11) {
                    measuredWidth = Math.abs(x11);
                    if (qq0Var.v) {
                        qq0Var.r.playTogether(ObjectAnimator.ofFloat(oq0VarArr[0], (Property<oq0, Float>) property, 0.0f), ObjectAnimator.ofFloat(oq0VarArr[1], (Property<oq0, Float>) property, r1.getMeasuredWidth()));
                    } else {
                        qq0Var.r.playTogether(ObjectAnimator.ofFloat(oq0VarArr[0], (Property<oq0, Float>) property, 0.0f), ObjectAnimator.ofFloat(oq0VarArr[1], (Property<oq0, Float>) property, -r1.getMeasuredWidth()));
                    }
                } else {
                    measuredWidth = oq0VarArr[0].getMeasuredWidth() - Math.abs(x11);
                    if (qq0Var.v) {
                        qq0Var.r.playTogether(ObjectAnimator.ofFloat(oq0VarArr[0], (Property<oq0, Float>) property, -r10.getMeasuredWidth()), ObjectAnimator.ofFloat(oq0VarArr[1], (Property<oq0, Float>) property, 0.0f));
                    } else {
                        qq0Var.r.playTogether(ObjectAnimator.ofFloat(oq0VarArr[0], (Property<oq0, Float>) property, r10.getMeasuredWidth()), ObjectAnimator.ofFloat(oq0VarArr[1], (Property<oq0, Float>) property, 0.0f));
                    }
                }
                qq0Var.r.setInterpolator(qq0.y);
                int measuredWidth2 = getMeasuredWidth();
                float f11 = measuredWidth2 / 2;
                float distanceInfluenceForSnapDuration = (AndroidUtilities.distanceInfluenceForSnapDuration(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth2)) * f11) + f11;
                qq0Var.r.setDuration(Math.max(ImageReceiver.DEFAULT_CROSSFADE_DURATION, Math.min(Math.abs(f7) > 0.0f ? Math.round(Math.abs(distanceInfluenceForSnapDuration / r4) * 1000.0f) * 4 : (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f), 600)));
                qq0Var.r.addListener(new bc0(this, 6));
                qq0Var.r.start();
                qq0Var.s = true;
                this.x0 = false;
            } else {
                this.y0 = false;
                kVar = ((org.telegram.ui.ActionBar.n2) qq0Var).actionBar;
                kVar.setEnabled(true);
                qq0Var.h.setEnabled(true);
            }
            VelocityTracker velocityTracker = this.B0;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.B0 = null;
            }
        }
        return this.x0;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.C0) {
            return;
        }
        super.requestLayout();
    }
}
