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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class cn0 extends org.telegram.ui.Components.st0 {
    public int f0;
    public boolean g0;
    public boolean h0;
    public int i0;
    public int j0;
    public VelocityTracker k0;
    public boolean l0;
    public final /* synthetic */ dn0 m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cn0(dn0 dn0Var, Context context) {
        super(context, null);
        this.m0 = dn0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean X() {
        AnimatorSet animatorSet;
        dn0 dn0Var = this.m0;
        org.telegram.ui.ActionBar.y4[] y4VarArr = dn0Var.n;
        if (!dn0Var.s) {
            return false;
        }
        if (!dn0Var.x) {
            if (Math.abs(y4VarArr[1].getTranslationX()) < 1.0f) {
                y4VarArr[0].setTranslationX(r2.getMeasuredWidth() * (dn0Var.w ? -1 : 1));
                y4VarArr[1].setTranslationX(0.0f);
                animatorSet = dn0Var.r;
                if (animatorSet != null) {
                }
                dn0Var.s = false;
            }
            return dn0Var.s;
        }
        if (Math.abs(y4VarArr[0].getTranslationX()) < 1.0f) {
            y4VarArr[0].setTranslationX(0.0f);
            y4VarArr[1].setTranslationX(y4VarArr[0].getMeasuredWidth() * (dn0Var.w ? 1 : -1));
            animatorSet = dn0Var.r;
            if (animatorSet != null) {
                animatorSet.cancel();
                dn0Var.r = null;
            }
            dn0Var.s = false;
        }
        return dn0Var.s;
    }

    public final boolean Y(MotionEvent motionEvent, boolean z9) {
        org.telegram.ui.ActionBar.l lVar;
        dn0 dn0Var = this.m0;
        org.telegram.ui.ActionBar.y4[] y4VarArr = dn0Var.n;
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = dn0Var.h;
        int i7 = scrollSlidingTextTabStrip.O.get(scrollSlidingTextTabStrip.n + (z9 ? 1 : -1), -1);
        if (i7 < 0) {
            return false;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        this.h0 = false;
        this.g0 = true;
        this.i0 = (int) motionEvent.getX();
        lVar = ((org.telegram.ui.ActionBar.f2) dn0Var).actionBar;
        lVar.setEnabled(false);
        dn0Var.h.setEnabled(false);
        org.telegram.ui.ActionBar.y4 y4Var = y4VarArr[1];
        y4Var.b = i7;
        y4Var.setVisibility(0);
        dn0Var.w = z9;
        dn0Var.o0(true);
        if (z9) {
            y4VarArr[1].setTranslationX(y4VarArr[0].getMeasuredWidth());
            return true;
        }
        y4VarArr[1].setTranslationX(-y4VarArr[0].getMeasuredWidth());
        return true;
    }

    @Override // org.telegram.ui.Components.st0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        super.dispatchDraw(canvas);
        dn0 dn0Var = this.m0;
        lVar = ((org.telegram.ui.ActionBar.f2) dn0Var).actionBar;
        int measuredHeight = lVar.getMeasuredHeight();
        lVar2 = ((org.telegram.ui.ActionBar.f2) dn0Var).actionBar;
        float translationY = measuredHeight + ((int) lVar2.getTranslationY());
        canvas.drawLine(0.0f, translationY, getWidth(), translationY, org.telegram.ui.ActionBar.m6.k0);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        dn0 dn0Var = this.m0;
        Paint paint = dn0Var.f;
        paint.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.a7, false));
        lVar = ((org.telegram.ui.ActionBar.f2) dn0Var).actionBar;
        float measuredHeight = lVar.getMeasuredHeight();
        lVar2 = ((org.telegram.ui.ActionBar.f2) dn0Var).actionBar;
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
    @Override // org.telegram.ui.Components.st0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        org.telegram.ui.Components.kt ktVar;
        int measuredHeight;
        int measuredHeight2;
        int childCount = getChildCount();
        int L = org.telegram.messenger.g0.L(20.0f);
        dn0 dn0Var = this.m0;
        int emojiPadding = (L < 0 || org.telegram.messenger.g0.E || org.telegram.messenger.g0.Q1()) ? 0 : dn0Var.d.getEmojiPadding();
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
                int i21 = i20 & org.telegram.messenger.qs.x1;
                int i22 = i20 & 7;
                if (i22 == 1) {
                    i13 = (((i11 - i7) - measuredWidth) / 2) + layoutParams.leftMargin;
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
                        ktVar = dn0Var.d;
                        if (ktVar != null && ktVar.l(childAt)) {
                            if (org.telegram.messenger.g0.Q1()) {
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
                    ktVar = dn0Var.d;
                    if (ktVar != null) {
                        if (org.telegram.messenger.g0.Q1()) {
                        }
                        i18 = measuredHeight - measuredHeight2;
                    }
                    childAt.layout(i15, i18, measuredWidth + i15, measuredHeight3 + i18);
                } else {
                    i13 = ((i11 - i7) - measuredWidth) - layoutParams.rightMargin;
                    i14 = getPaddingRight();
                }
                i15 = i13 - i14;
                if (i21 == 16) {
                }
                i18 = i16 - i17;
                ktVar = dn0Var.d;
                if (ktVar != null) {
                }
                childAt.layout(i15, i18, measuredWidth + i15, measuredHeight3 + i18);
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
    public final void onMeasure(int i7, int i10) {
        org.telegram.ui.ActionBar.l lVar;
        int i11;
        org.telegram.ui.ActionBar.l lVar2;
        int i12;
        org.telegram.ui.ActionBar.y4[] y4VarArr;
        int childCount;
        int i13;
        org.telegram.ui.ActionBar.l lVar3;
        org.telegram.ui.Components.pj0 pj0Var;
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        setMeasuredDimension(size, size2);
        dn0 dn0Var = this.m0;
        lVar = ((org.telegram.ui.ActionBar.f2) dn0Var).actionBar;
        measureChildWithMargins(lVar, i7, 0, i10, 0);
        if (org.telegram.messenger.g0.L(20.0f) < 0) {
            this.l0 = true;
            dn0Var.d.j();
            this.l0 = false;
        } else if (!org.telegram.messenger.g0.E) {
            size2 -= dn0Var.d.getEmojiPadding();
            i11 = View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30);
            lVar2 = ((org.telegram.ui.ActionBar.f2) dn0Var).actionBar;
            int measuredHeight = lVar2.getMeasuredHeight();
            this.l0 = true;
            i12 = 0;
            while (true) {
                y4VarArr = dn0Var.n;
                if (i12 < y4VarArr.length) {
                    break;
                }
                org.telegram.ui.ActionBar.y4 y4Var = y4VarArr[i12];
                if (y4Var != null && (pj0Var = (org.telegram.ui.Components.pj0) y4Var.f) != null) {
                    pj0Var.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f) + measuredHeight, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
                }
                i12++;
            }
            this.l0 = false;
            childCount = getChildCount();
            for (i13 = 0; i13 < childCount; i13++) {
                View childAt = getChildAt(i13);
                if (childAt != null && childAt.getVisibility() != 8) {
                    lVar3 = ((org.telegram.ui.ActionBar.f2) dn0Var).actionBar;
                    if (childAt != lVar3) {
                        org.telegram.ui.Components.kt ktVar = dn0Var.d;
                        if (ktVar == null || !ktVar.l(childAt)) {
                            measureChildWithMargins(childAt, i7, 0, i11, 0);
                        } else if (!org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, TLObject.FLAG_30));
                        } else if (org.telegram.messenger.g0.Q1()) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.g0.L(org.telegram.messenger.g0.Q1() ? 200.0f : 320.0f), getPaddingTop() + (size2 - org.telegram.messenger.g0.m)), TLObject.FLAG_30));
                        } else {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (size2 - org.telegram.messenger.g0.m), TLObject.FLAG_30));
                        }
                    }
                }
            }
        }
        i11 = i10;
        lVar2 = ((org.telegram.ui.ActionBar.f2) dn0Var).actionBar;
        int measuredHeight2 = lVar2.getMeasuredHeight();
        this.l0 = true;
        i12 = 0;
        while (true) {
            y4VarArr = dn0Var.n;
            if (i12 < y4VarArr.length) {
            }
            i12++;
        }
        this.l0 = false;
        childCount = getChildCount();
        while (i13 < childCount) {
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.r4 r4Var;
        float f10;
        float f11;
        org.telegram.ui.ActionBar.l lVar;
        float measuredWidth;
        boolean z9;
        dn0 dn0Var = this.m0;
        org.telegram.ui.ActionBar.y4[] y4VarArr = dn0Var.n;
        r4Var = ((org.telegram.ui.ActionBar.f2) dn0Var).parentLayout;
        if (((ActionBarLayout) r4Var).i() || X()) {
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
            if (this.g0 && (((z9 = dn0Var.w) && x10 > 0) || (!z9 && x10 < 0))) {
                if (!Y(motionEvent, x10 < 0)) {
                    this.h0 = true;
                    this.g0 = false;
                    y4VarArr[0].setTranslationX(0.0f);
                    y4VarArr[1].setTranslationX(dn0Var.w ? y4VarArr[0].getMeasuredWidth() : -y4VarArr[0].getMeasuredWidth());
                    dn0Var.h.i(0.0f, y4VarArr[1].b);
                }
            }
            if (!this.h0 || this.g0) {
                if (this.g0) {
                    y4VarArr[0].setTranslationX(x10);
                    if (dn0Var.w) {
                        y4VarArr[1].setTranslationX(y4VarArr[0].getMeasuredWidth() + x10);
                    } else {
                        y4VarArr[1].setTranslationX(x10 - y4VarArr[0].getMeasuredWidth());
                    }
                    dn0Var.h.i(Math.abs(x10) / y4VarArr[0].getMeasuredWidth(), y4VarArr[1].b);
                }
            } else if (Math.abs(x10) >= org.telegram.messenger.g0.a1(true, 0.3f) && Math.abs(x10) > abs) {
                Y(motionEvent, x10 < 0);
            }
        } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.f0 && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
            this.k0.computeCurrentVelocity(1000, dn0Var.y);
            if (motionEvent == null || motionEvent.getAction() == 3) {
                f10 = 0.0f;
                f11 = 0.0f;
            } else {
                f10 = this.k0.getXVelocity();
                f11 = this.k0.getYVelocity();
                if (!this.g0 && Math.abs(f10) >= 3000.0f && Math.abs(f10) > Math.abs(f11)) {
                    Y(motionEvent, f10 < 0.0f);
                }
            }
            if (this.g0) {
                float x11 = y4VarArr[0].getX();
                dn0Var.r = new AnimatorSet();
                boolean z10 = Math.abs(x11) < ((float) y4VarArr[0].getMeasuredWidth()) / 3.0f && (Math.abs(f10) < 3500.0f || Math.abs(f10) < Math.abs(f11));
                dn0Var.x = z10;
                Property property = View.TRANSLATION_X;
                if (z10) {
                    measuredWidth = Math.abs(x11);
                    if (dn0Var.w) {
                        dn0Var.r.playTogether(ObjectAnimator.ofFloat(y4VarArr[0], (Property<org.telegram.ui.ActionBar.y4, Float>) property, 0.0f), ObjectAnimator.ofFloat(y4VarArr[1], (Property<org.telegram.ui.ActionBar.y4, Float>) property, r1.getMeasuredWidth()));
                    } else {
                        dn0Var.r.playTogether(ObjectAnimator.ofFloat(y4VarArr[0], (Property<org.telegram.ui.ActionBar.y4, Float>) property, 0.0f), ObjectAnimator.ofFloat(y4VarArr[1], (Property<org.telegram.ui.ActionBar.y4, Float>) property, -r1.getMeasuredWidth()));
                    }
                } else {
                    measuredWidth = y4VarArr[0].getMeasuredWidth() - Math.abs(x11);
                    if (dn0Var.w) {
                        dn0Var.r.playTogether(ObjectAnimator.ofFloat(y4VarArr[0], (Property<org.telegram.ui.ActionBar.y4, Float>) property, -r9.getMeasuredWidth()), ObjectAnimator.ofFloat(y4VarArr[1], (Property<org.telegram.ui.ActionBar.y4, Float>) property, 0.0f));
                    } else {
                        dn0Var.r.playTogether(ObjectAnimator.ofFloat(y4VarArr[0], (Property<org.telegram.ui.ActionBar.y4, Float>) property, r9.getMeasuredWidth()), ObjectAnimator.ofFloat(y4VarArr[1], (Property<org.telegram.ui.ActionBar.y4, Float>) property, 0.0f));
                    }
                }
                dn0Var.r.setInterpolator(dn0.D);
                int measuredWidth2 = getMeasuredWidth();
                float f12 = measuredWidth2 / 2;
                float I = (org.telegram.messenger.g0.I(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth2)) * f12) + f12;
                dn0Var.r.setDuration(Math.max(org.telegram.messenger.qs.g2, Math.min(Math.abs(f10) > 0.0f ? Math.round(Math.abs(I / r4) * 1000.0f) * 4 : (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f), 600)));
                dn0Var.r.addListener(new g30(this, 9));
                dn0Var.r.start();
                dn0Var.s = true;
                this.g0 = false;
            } else {
                this.h0 = false;
                lVar = ((org.telegram.ui.ActionBar.f2) dn0Var).actionBar;
                lVar.setEnabled(true);
                dn0Var.h.setEnabled(true);
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
