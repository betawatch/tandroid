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
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class no0 extends org.telegram.ui.Components.uu0 {
    public int f0;
    public boolean g0;
    public boolean h0;
    public int i0;
    public int j0;
    public VelocityTracker k0;
    public boolean l0;
    public final /* synthetic */ oo0 m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public no0(oo0 oo0Var, Context context) {
        super(context, null);
        this.m0 = oo0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean X() {
        AnimatorSet animatorSet;
        oo0 oo0Var = this.m0;
        org.telegram.ui.ActionBar.h5[] h5VarArr = oo0Var.n;
        if (!oo0Var.s) {
            return false;
        }
        if (!oo0Var.x) {
            if (Math.abs(h5VarArr[1].getTranslationX()) < 1.0f) {
                h5VarArr[0].setTranslationX(r2.getMeasuredWidth() * (oo0Var.w ? -1 : 1));
                h5VarArr[1].setTranslationX(0.0f);
                animatorSet = oo0Var.r;
                if (animatorSet != null) {
                }
                oo0Var.s = false;
            }
            return oo0Var.s;
        }
        if (Math.abs(h5VarArr[0].getTranslationX()) < 1.0f) {
            h5VarArr[0].setTranslationX(0.0f);
            h5VarArr[1].setTranslationX(h5VarArr[0].getMeasuredWidth() * (oo0Var.w ? 1 : -1));
            animatorSet = oo0Var.r;
            if (animatorSet != null) {
                animatorSet.cancel();
                oo0Var.r = null;
            }
            oo0Var.s = false;
        }
        return oo0Var.s;
    }

    public final boolean Y(MotionEvent motionEvent, boolean z10) {
        org.telegram.ui.ActionBar.l lVar;
        oo0 oo0Var = this.m0;
        org.telegram.ui.ActionBar.h5[] h5VarArr = oo0Var.n;
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = oo0Var.h;
        int i10 = scrollSlidingTextTabStrip.O.get(scrollSlidingTextTabStrip.n + (z10 ? 1 : -1), -1);
        if (i10 < 0) {
            return false;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        this.h0 = false;
        this.g0 = true;
        this.i0 = (int) motionEvent.getX();
        lVar = ((org.telegram.ui.ActionBar.k2) oo0Var).actionBar;
        lVar.setEnabled(false);
        oo0Var.h.setEnabled(false);
        org.telegram.ui.ActionBar.h5 h5Var = h5VarArr[1];
        h5Var.b = i10;
        h5Var.setVisibility(0);
        oo0Var.w = z10;
        oo0Var.n0(true);
        if (z10) {
            h5VarArr[1].setTranslationX(h5VarArr[0].getMeasuredWidth());
            return true;
        }
        h5VarArr[1].setTranslationX(-h5VarArr[0].getMeasuredWidth());
        return true;
    }

    @Override // org.telegram.ui.Components.uu0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        super.dispatchDraw(canvas);
        oo0 oo0Var = this.m0;
        lVar = ((org.telegram.ui.ActionBar.k2) oo0Var).actionBar;
        int measuredHeight = lVar.getMeasuredHeight();
        lVar2 = ((org.telegram.ui.ActionBar.k2) oo0Var).actionBar;
        float translationY = measuredHeight + ((int) lVar2.getTranslationY());
        canvas.drawLine(0.0f, translationY, getWidth(), translationY, org.telegram.ui.ActionBar.t6.k0);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        oo0 oo0Var = this.m0;
        Paint paint = oo0Var.f;
        paint.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.a7, false));
        lVar = ((org.telegram.ui.ActionBar.k2) oo0Var).actionBar;
        float measuredHeight = lVar.getMeasuredHeight();
        lVar2 = ((org.telegram.ui.ActionBar.k2) oo0Var).actionBar;
        canvas.drawRect(0.0f, lVar2.getTranslationY() + measuredHeight, getMeasuredWidth(), getMeasuredHeight(), paint);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return X() || this.m0.h.H || onTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0093  */
    @Override // org.telegram.ui.Components.uu0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
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
        org.telegram.ui.Components.wt wtVar;
        int measuredHeight;
        int measuredHeight2;
        int childCount = getChildCount();
        int L = org.telegram.messenger.i0.L(20.0f);
        oo0 oo0Var = this.m0;
        int emojiPadding = (L < 0 || org.telegram.messenger.i0.E || org.telegram.messenger.i0.Q1()) ? 0 : oo0Var.d.getEmojiPadding();
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
                int i22 = i21 & org.telegram.messenger.zs.x1;
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
                        wtVar = oo0Var.d;
                        if (wtVar != null && wtVar.l(childAt)) {
                            if (org.telegram.messenger.i0.Q1()) {
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
                    wtVar = oo0Var.d;
                    if (wtVar != null) {
                        if (org.telegram.messenger.i0.Q1()) {
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
                wtVar = oo0Var.d;
                if (wtVar != null) {
                }
                childAt.layout(i16, i19, measuredWidth + i16, measuredHeight3 + i19);
            }
        }
        R();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0076 A[EDGE_INSN: B:18:0x0076->B:19:0x0076 BREAK  A[LOOP:0: B:7:0x004d->B:15:0x0073], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0052  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.l lVar;
        int i12;
        org.telegram.ui.ActionBar.l lVar2;
        int i13;
        org.telegram.ui.ActionBar.h5[] h5VarArr;
        int childCount;
        int i14;
        org.telegram.ui.ActionBar.l lVar3;
        org.telegram.ui.Components.tk0 tk0Var;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(size, size2);
        oo0 oo0Var = this.m0;
        lVar = ((org.telegram.ui.ActionBar.k2) oo0Var).actionBar;
        measureChildWithMargins(lVar, i10, 0, i11, 0);
        if (org.telegram.messenger.i0.L(20.0f) < 0) {
            this.l0 = true;
            oo0Var.d.j();
            this.l0 = false;
        } else if (!org.telegram.messenger.i0.E) {
            size2 -= oo0Var.d.getEmojiPadding();
            i12 = View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30);
            lVar2 = ((org.telegram.ui.ActionBar.k2) oo0Var).actionBar;
            int measuredHeight = lVar2.getMeasuredHeight();
            this.l0 = true;
            i13 = 0;
            while (true) {
                h5VarArr = oo0Var.n;
                if (i13 < h5VarArr.length) {
                    break;
                }
                org.telegram.ui.ActionBar.h5 h5Var = h5VarArr[i13];
                if (h5Var != null && (tk0Var = (org.telegram.ui.Components.tk0) h5Var.f) != null) {
                    tk0Var.setPadding(org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f) + measuredHeight, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f));
                }
                i13++;
            }
            this.l0 = false;
            childCount = getChildCount();
            for (i14 = 0; i14 < childCount; i14++) {
                View childAt = getChildAt(i14);
                if (childAt != null && childAt.getVisibility() != 8) {
                    lVar3 = ((org.telegram.ui.ActionBar.k2) oo0Var).actionBar;
                    if (childAt != lVar3) {
                        org.telegram.ui.Components.wt wtVar = oo0Var.d;
                        if (wtVar == null || !wtVar.l(childAt)) {
                            measureChildWithMargins(childAt, i10, 0, i12, 0);
                        } else if (!org.telegram.messenger.i0.E && !org.telegram.messenger.i0.Q1()) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, TLObject.FLAG_30));
                        } else if (org.telegram.messenger.i0.Q1()) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.i0.L(org.telegram.messenger.i0.Q1() ? 200.0f : 320.0f), getPaddingTop() + (size2 - org.telegram.messenger.i0.m)), TLObject.FLAG_30));
                        } else {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (size2 - org.telegram.messenger.i0.m), TLObject.FLAG_30));
                        }
                    }
                }
            }
        }
        i12 = i11;
        lVar2 = ((org.telegram.ui.ActionBar.k2) oo0Var).actionBar;
        int measuredHeight2 = lVar2.getMeasuredHeight();
        this.l0 = true;
        i13 = 0;
        while (true) {
            h5VarArr = oo0Var.n;
            if (i13 < h5VarArr.length) {
            }
            i13++;
        }
        this.l0 = false;
        childCount = getChildCount();
        while (i14 < childCount) {
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.z4 z4Var;
        float f7;
        float f10;
        org.telegram.ui.ActionBar.l lVar;
        float measuredWidth;
        boolean z10;
        oo0 oo0Var = this.m0;
        org.telegram.ui.ActionBar.h5[] h5VarArr = oo0Var.n;
        z4Var = ((org.telegram.ui.ActionBar.k2) oo0Var).parentLayout;
        if (((ActionBarLayout) z4Var).i() || X()) {
            return false;
        }
        if (motionEvent != null) {
            if (this.k0 == null) {
                this.k0 = VelocityTracker.obtain();
            }
            this.k0.addMovement(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && !this.g0 && !this.h0) {
            this.f0 = motionEvent.getPointerId(0);
            this.h0 = true;
            this.i0 = (int) motionEvent.getX();
            this.j0 = (int) motionEvent.getY();
            this.k0.clear();
        } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f0) {
            int x10 = (int) (motionEvent.getX() - this.i0);
            int abs = Math.abs(((int) motionEvent.getY()) - this.j0);
            if (this.g0 && (((z10 = oo0Var.w) && x10 > 0) || (!z10 && x10 < 0))) {
                if (!Y(motionEvent, x10 < 0)) {
                    this.h0 = true;
                    this.g0 = false;
                    h5VarArr[0].setTranslationX(0.0f);
                    h5VarArr[1].setTranslationX(oo0Var.w ? h5VarArr[0].getMeasuredWidth() : -h5VarArr[0].getMeasuredWidth());
                    oo0Var.h.i(0.0f, h5VarArr[1].b);
                }
            }
            if (!this.h0 || this.g0) {
                if (this.g0) {
                    h5VarArr[0].setTranslationX(x10);
                    if (oo0Var.w) {
                        h5VarArr[1].setTranslationX(h5VarArr[0].getMeasuredWidth() + x10);
                    } else {
                        h5VarArr[1].setTranslationX(x10 - h5VarArr[0].getMeasuredWidth());
                    }
                    oo0Var.h.i(Math.abs(x10) / h5VarArr[0].getMeasuredWidth(), h5VarArr[1].b);
                }
            } else if (Math.abs(x10) >= org.telegram.messenger.i0.a1(true, 0.3f) && Math.abs(x10) > abs) {
                Y(motionEvent, x10 < 0);
            }
        } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.f0 && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
            this.k0.computeCurrentVelocity(1000, oo0Var.y);
            if (motionEvent == null || motionEvent.getAction() == 3) {
                f7 = 0.0f;
                f10 = 0.0f;
            } else {
                f7 = this.k0.getXVelocity();
                f10 = this.k0.getYVelocity();
                if (!this.g0 && Math.abs(f7) >= 3000.0f && Math.abs(f7) > Math.abs(f10)) {
                    Y(motionEvent, f7 < 0.0f);
                }
            }
            if (this.g0) {
                float x11 = h5VarArr[0].getX();
                oo0Var.r = new AnimatorSet();
                boolean z11 = Math.abs(x11) < ((float) h5VarArr[0].getMeasuredWidth()) / 3.0f && (Math.abs(f7) < 3500.0f || Math.abs(f7) < Math.abs(f10));
                oo0Var.x = z11;
                Property property = View.TRANSLATION_X;
                if (z11) {
                    measuredWidth = Math.abs(x11);
                    if (oo0Var.w) {
                        oo0Var.r.playTogether(ObjectAnimator.ofFloat(h5VarArr[0], (Property<org.telegram.ui.ActionBar.h5, Float>) property, 0.0f), ObjectAnimator.ofFloat(h5VarArr[1], (Property<org.telegram.ui.ActionBar.h5, Float>) property, r1.getMeasuredWidth()));
                    } else {
                        oo0Var.r.playTogether(ObjectAnimator.ofFloat(h5VarArr[0], (Property<org.telegram.ui.ActionBar.h5, Float>) property, 0.0f), ObjectAnimator.ofFloat(h5VarArr[1], (Property<org.telegram.ui.ActionBar.h5, Float>) property, -r1.getMeasuredWidth()));
                    }
                } else {
                    measuredWidth = h5VarArr[0].getMeasuredWidth() - Math.abs(x11);
                    if (oo0Var.w) {
                        oo0Var.r.playTogether(ObjectAnimator.ofFloat(h5VarArr[0], (Property<org.telegram.ui.ActionBar.h5, Float>) property, -r9.getMeasuredWidth()), ObjectAnimator.ofFloat(h5VarArr[1], (Property<org.telegram.ui.ActionBar.h5, Float>) property, 0.0f));
                    } else {
                        oo0Var.r.playTogether(ObjectAnimator.ofFloat(h5VarArr[0], (Property<org.telegram.ui.ActionBar.h5, Float>) property, r9.getMeasuredWidth()), ObjectAnimator.ofFloat(h5VarArr[1], (Property<org.telegram.ui.ActionBar.h5, Float>) property, 0.0f));
                    }
                }
                oo0Var.r.setInterpolator(oo0.D);
                int measuredWidth2 = getMeasuredWidth();
                float f11 = measuredWidth2 / 2;
                float I = (org.telegram.messenger.i0.I(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth2)) * f11) + f11;
                oo0Var.r.setDuration(Math.max(org.telegram.messenger.zs.g2, Math.min(Math.abs(f7) > 0.0f ? Math.round(Math.abs(I / r4) * 1000.0f) * 4 : (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f), 600)));
                oo0Var.r.addListener(new org.telegram.ui.Components.voip.h2(this, 20));
                oo0Var.r.start();
                oo0Var.s = true;
                this.g0 = false;
            } else {
                this.h0 = false;
                lVar = ((org.telegram.ui.ActionBar.k2) oo0Var).actionBar;
                lVar.setEnabled(true);
                oo0Var.h.setEnabled(true);
            }
            VelocityTracker velocityTracker = this.k0;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.k0 = null;
            }
        }
        return this.g0;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.l0) {
            return;
        }
        super.requestLayout();
    }
}
