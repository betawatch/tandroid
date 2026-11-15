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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class bn0 extends org.telegram.ui.Components.st0 {
    public int g0;
    public boolean h0;
    public boolean i0;
    public int j0;
    public int k0;
    public VelocityTracker l0;
    public boolean m0;
    public final /* synthetic */ cn0 n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bn0(cn0 cn0Var, Context context) {
        super(context, null);
        this.n0 = cn0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean X() {
        AnimatorSet animatorSet;
        cn0 cn0Var = this.n0;
        org.telegram.ui.ActionBar.v4[] v4VarArr = cn0Var.n;
        if (!cn0Var.s) {
            return false;
        }
        if (!cn0Var.x) {
            if (Math.abs(v4VarArr[1].getTranslationX()) < 1.0f) {
                v4VarArr[0].setTranslationX(r2.getMeasuredWidth() * (cn0Var.w ? -1 : 1));
                v4VarArr[1].setTranslationX(0.0f);
                animatorSet = cn0Var.r;
                if (animatorSet != null) {
                }
                cn0Var.s = false;
            }
            return cn0Var.s;
        }
        if (Math.abs(v4VarArr[0].getTranslationX()) < 1.0f) {
            v4VarArr[0].setTranslationX(0.0f);
            v4VarArr[1].setTranslationX(v4VarArr[0].getMeasuredWidth() * (cn0Var.w ? 1 : -1));
            animatorSet = cn0Var.r;
            if (animatorSet != null) {
                animatorSet.cancel();
                cn0Var.r = null;
            }
            cn0Var.s = false;
        }
        return cn0Var.s;
    }

    public final boolean Y(MotionEvent motionEvent, boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        cn0 cn0Var = this.n0;
        org.telegram.ui.ActionBar.v4[] v4VarArr = cn0Var.n;
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = cn0Var.h;
        int i7 = scrollSlidingTextTabStrip.P.get(scrollSlidingTextTabStrip.n + (z10 ? 1 : -1), -1);
        if (i7 < 0) {
            return false;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        this.i0 = false;
        this.h0 = true;
        this.j0 = (int) motionEvent.getX();
        kVar = ((org.telegram.ui.ActionBar.e2) cn0Var).actionBar;
        kVar.setEnabled(false);
        cn0Var.h.setEnabled(false);
        org.telegram.ui.ActionBar.v4 v4Var = v4VarArr[1];
        v4Var.b = i7;
        v4Var.setVisibility(0);
        cn0Var.w = z10;
        cn0Var.o0(true);
        if (z10) {
            v4VarArr[1].setTranslationX(v4VarArr[0].getMeasuredWidth());
            return true;
        }
        v4VarArr[1].setTranslationX(-v4VarArr[0].getMeasuredWidth());
        return true;
    }

    @Override // org.telegram.ui.Components.st0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        super.dispatchDraw(canvas);
        cn0 cn0Var = this.n0;
        kVar = ((org.telegram.ui.ActionBar.e2) cn0Var).actionBar;
        int measuredHeight = kVar.getMeasuredHeight();
        kVar2 = ((org.telegram.ui.ActionBar.e2) cn0Var).actionBar;
        float translationY = measuredHeight + ((int) kVar2.getTranslationY());
        canvas.drawLine(0.0f, translationY, getWidth(), translationY, org.telegram.ui.ActionBar.j6.k0);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        cn0 cn0Var = this.n0;
        Paint paint = cn0Var.f;
        paint.setColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.a7, false));
        kVar = ((org.telegram.ui.ActionBar.e2) cn0Var).actionBar;
        float measuredHeight = kVar.getMeasuredHeight();
        kVar2 = ((org.telegram.ui.ActionBar.e2) cn0Var).actionBar;
        canvas.drawRect(0.0f, kVar2.getTranslationY() + measuredHeight, getMeasuredWidth(), getMeasuredHeight(), paint);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return X() || this.n0.h.I || onTouchEvent(motionEvent);
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
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        org.telegram.ui.Components.rt rtVar;
        int measuredHeight;
        int measuredHeight2;
        int childCount = getChildCount();
        int L = org.telegram.messenger.g0.L(20.0f);
        cn0 cn0Var = this.n0;
        int emojiPadding = (L < 0 || org.telegram.messenger.g0.E || org.telegram.messenger.g0.Q1()) ? 0 : cn0Var.d.getEmojiPadding();
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
                int i21 = i20 & org.telegram.messenger.ns.x1;
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
                        rtVar = cn0Var.d;
                        if (rtVar != null && rtVar.l(childAt)) {
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
                    rtVar = cn0Var.d;
                    if (rtVar != null) {
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
                rtVar = cn0Var.d;
                if (rtVar != null) {
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
        org.telegram.ui.ActionBar.k kVar;
        int i11;
        org.telegram.ui.ActionBar.k kVar2;
        int i12;
        org.telegram.ui.ActionBar.v4[] v4VarArr;
        int childCount;
        int i13;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.Components.uj0 uj0Var;
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        setMeasuredDimension(size, size2);
        cn0 cn0Var = this.n0;
        kVar = ((org.telegram.ui.ActionBar.e2) cn0Var).actionBar;
        measureChildWithMargins(kVar, i7, 0, i10, 0);
        if (org.telegram.messenger.g0.L(20.0f) < 0) {
            this.m0 = true;
            cn0Var.d.j();
            this.m0 = false;
        } else if (!org.telegram.messenger.g0.E) {
            size2 -= cn0Var.d.getEmojiPadding();
            i11 = View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30);
            kVar2 = ((org.telegram.ui.ActionBar.e2) cn0Var).actionBar;
            int measuredHeight = kVar2.getMeasuredHeight();
            this.m0 = true;
            i12 = 0;
            while (true) {
                v4VarArr = cn0Var.n;
                if (i12 < v4VarArr.length) {
                    break;
                }
                org.telegram.ui.ActionBar.v4 v4Var = v4VarArr[i12];
                if (v4Var != null && (uj0Var = (org.telegram.ui.Components.uj0) v4Var.f) != null) {
                    uj0Var.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f) + measuredHeight, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
                }
                i12++;
            }
            this.m0 = false;
            childCount = getChildCount();
            for (i13 = 0; i13 < childCount; i13++) {
                View childAt = getChildAt(i13);
                if (childAt != null && childAt.getVisibility() != 8) {
                    kVar3 = ((org.telegram.ui.ActionBar.e2) cn0Var).actionBar;
                    if (childAt != kVar3) {
                        org.telegram.ui.Components.rt rtVar = cn0Var.d;
                        if (rtVar == null || !rtVar.l(childAt)) {
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
        kVar2 = ((org.telegram.ui.ActionBar.e2) cn0Var).actionBar;
        int measuredHeight2 = kVar2.getMeasuredHeight();
        this.m0 = true;
        i12 = 0;
        while (true) {
            v4VarArr = cn0Var.n;
            if (i12 < v4VarArr.length) {
            }
            i12++;
        }
        this.m0 = false;
        childCount = getChildCount();
        while (i13 < childCount) {
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.o4 o4Var;
        float f10;
        float f11;
        org.telegram.ui.ActionBar.k kVar;
        float measuredWidth;
        boolean z10;
        cn0 cn0Var = this.n0;
        org.telegram.ui.ActionBar.v4[] v4VarArr = cn0Var.n;
        o4Var = ((org.telegram.ui.ActionBar.e2) cn0Var).parentLayout;
        if (((ActionBarLayout) o4Var).i() || X()) {
            return false;
        }
        if (motionEvent != null) {
            if (this.l0 == null) {
                this.l0 = VelocityTracker.obtain();
            }
            this.l0.addMovement(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && !this.h0 && !this.i0) {
            this.g0 = motionEvent.getPointerId(0);
            this.i0 = true;
            this.j0 = (int) motionEvent.getX();
            this.k0 = (int) motionEvent.getY();
            this.l0.clear();
        } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.g0) {
            int x10 = (int) (motionEvent.getX() - this.j0);
            int abs = Math.abs(((int) motionEvent.getY()) - this.k0);
            if (this.h0 && (((z10 = cn0Var.w) && x10 > 0) || (!z10 && x10 < 0))) {
                if (!Y(motionEvent, x10 < 0)) {
                    this.i0 = true;
                    this.h0 = false;
                    v4VarArr[0].setTranslationX(0.0f);
                    v4VarArr[1].setTranslationX(cn0Var.w ? v4VarArr[0].getMeasuredWidth() : -v4VarArr[0].getMeasuredWidth());
                    cn0Var.h.i(0.0f, v4VarArr[1].b);
                }
            }
            if (!this.i0 || this.h0) {
                if (this.h0) {
                    v4VarArr[0].setTranslationX(x10);
                    if (cn0Var.w) {
                        v4VarArr[1].setTranslationX(v4VarArr[0].getMeasuredWidth() + x10);
                    } else {
                        v4VarArr[1].setTranslationX(x10 - v4VarArr[0].getMeasuredWidth());
                    }
                    cn0Var.h.i(Math.abs(x10) / v4VarArr[0].getMeasuredWidth(), v4VarArr[1].b);
                }
            } else if (Math.abs(x10) >= org.telegram.messenger.g0.a1(true, 0.3f) && Math.abs(x10) > abs) {
                Y(motionEvent, x10 < 0);
            }
        } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.g0 && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
            this.l0.computeCurrentVelocity(1000, cn0Var.y);
            if (motionEvent == null || motionEvent.getAction() == 3) {
                f10 = 0.0f;
                f11 = 0.0f;
            } else {
                f10 = this.l0.getXVelocity();
                f11 = this.l0.getYVelocity();
                if (!this.h0 && Math.abs(f10) >= 3000.0f && Math.abs(f10) > Math.abs(f11)) {
                    Y(motionEvent, f10 < 0.0f);
                }
            }
            if (this.h0) {
                float x11 = v4VarArr[0].getX();
                cn0Var.r = new AnimatorSet();
                boolean z11 = Math.abs(x11) < ((float) v4VarArr[0].getMeasuredWidth()) / 3.0f && (Math.abs(f10) < 3500.0f || Math.abs(f10) < Math.abs(f11));
                cn0Var.x = z11;
                Property property = View.TRANSLATION_X;
                if (z11) {
                    measuredWidth = Math.abs(x11);
                    if (cn0Var.w) {
                        cn0Var.r.playTogether(ObjectAnimator.ofFloat(v4VarArr[0], (Property<org.telegram.ui.ActionBar.v4, Float>) property, 0.0f), ObjectAnimator.ofFloat(v4VarArr[1], (Property<org.telegram.ui.ActionBar.v4, Float>) property, r1.getMeasuredWidth()));
                    } else {
                        cn0Var.r.playTogether(ObjectAnimator.ofFloat(v4VarArr[0], (Property<org.telegram.ui.ActionBar.v4, Float>) property, 0.0f), ObjectAnimator.ofFloat(v4VarArr[1], (Property<org.telegram.ui.ActionBar.v4, Float>) property, -r1.getMeasuredWidth()));
                    }
                } else {
                    measuredWidth = v4VarArr[0].getMeasuredWidth() - Math.abs(x11);
                    if (cn0Var.w) {
                        cn0Var.r.playTogether(ObjectAnimator.ofFloat(v4VarArr[0], (Property<org.telegram.ui.ActionBar.v4, Float>) property, -r9.getMeasuredWidth()), ObjectAnimator.ofFloat(v4VarArr[1], (Property<org.telegram.ui.ActionBar.v4, Float>) property, 0.0f));
                    } else {
                        cn0Var.r.playTogether(ObjectAnimator.ofFloat(v4VarArr[0], (Property<org.telegram.ui.ActionBar.v4, Float>) property, r9.getMeasuredWidth()), ObjectAnimator.ofFloat(v4VarArr[1], (Property<org.telegram.ui.ActionBar.v4, Float>) property, 0.0f));
                    }
                }
                cn0Var.r.setInterpolator(cn0.E);
                int measuredWidth2 = getMeasuredWidth();
                float f12 = measuredWidth2 / 2;
                float I = (org.telegram.messenger.g0.I(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth2)) * f12) + f12;
                cn0Var.r.setDuration(Math.max(org.telegram.messenger.ns.g2, Math.min(Math.abs(f10) > 0.0f ? Math.round(Math.abs(I / r4) * 1000.0f) * 4 : (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f), 600)));
                cn0Var.r.addListener(new xx(this, 10));
                cn0Var.r.start();
                cn0Var.s = true;
                this.h0 = false;
            } else {
                this.i0 = false;
                kVar = ((org.telegram.ui.ActionBar.e2) cn0Var).actionBar;
                kVar.setEnabled(true);
                cn0Var.h.setEnabled(true);
            }
            VelocityTracker velocityTracker = this.l0;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.l0 = null;
            }
        }
        return this.h0;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.m0) {
            return;
        }
        super.requestLayout();
    }
}
