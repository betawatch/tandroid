// default package

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
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class b88 extends ela {
    public int m0;
    public boolean n0;
    public boolean o0;
    public int p0;
    public int q0;
    public VelocityTracker r0;
    public boolean s0;
    public final /* synthetic */ d88 t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b88(d88 d88Var, Context context) {
        super(context, null);
        this.t0 = d88Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean X() {
        AnimatorSet animatorSet;
        d88 d88Var = this.t0;
        c88[] c88VarArr = d88Var.n;
        if (!d88Var.s) {
            return false;
        }
        if (!d88Var.x) {
            if (Math.abs(c88VarArr[1].getTranslationX()) < 1.0f) {
                c88VarArr[0].setTranslationX(r1.getMeasuredWidth() * (d88Var.w ? -1 : 1));
                c88VarArr[1].setTranslationX(0.0f);
                animatorSet = d88Var.r;
                if (animatorSet != null) {
                }
                d88Var.s = false;
            }
            return d88Var.s;
        }
        if (Math.abs(c88VarArr[0].getTranslationX()) < 1.0f) {
            c88VarArr[0].setTranslationX(0.0f);
            c88VarArr[1].setTranslationX(c88VarArr[0].getMeasuredWidth() * (d88Var.w ? 1 : -1));
            animatorSet = d88Var.r;
            if (animatorSet != null) {
                animatorSet.cancel();
                d88Var.r = null;
            }
            d88Var.s = false;
        }
        return d88Var.s;
    }

    public final boolean Y(MotionEvent motionEvent, boolean z) {
        a aVar;
        d88 d88Var = this.t0;
        c88[] c88VarArr = d88Var.n;
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = d88Var.h;
        int i = scrollSlidingTextTabStrip.P.get(scrollSlidingTextTabStrip.n + (z ? 1 : -1), -1);
        if (i < 0) {
            return false;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        this.o0 = false;
        this.n0 = true;
        this.p0 = (int) motionEvent.getX();
        aVar = ((d) d88Var).actionBar;
        aVar.setEnabled(false);
        d88Var.h.setEnabled(false);
        c88 c88Var = c88VarArr[1];
        c88Var.b = i;
        c88Var.setVisibility(0);
        d88Var.w = z;
        d88Var.o0(true);
        if (z) {
            c88VarArr[1].setTranslationX(c88VarArr[0].getMeasuredWidth());
            return true;
        }
        c88VarArr[1].setTranslationX(-c88VarArr[0].getMeasuredWidth());
        return true;
    }

    @Override // ela, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        a aVar;
        a aVar2;
        super.dispatchDraw(canvas);
        d88 d88Var = this.t0;
        aVar = ((d) d88Var).actionBar;
        int measuredHeight = aVar.getMeasuredHeight();
        aVar2 = ((d) d88Var).actionBar;
        float translationY = measuredHeight + ((int) aVar2.getTranslationY());
        canvas.drawLine(0.0f, translationY, getWidth(), translationY, cmb.j0);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        a aVar;
        a aVar2;
        d88 d88Var = this.t0;
        Paint paint = d88Var.f;
        paint.setColor(cmb.w0(null, cmb.Z6, false));
        aVar = ((d) d88Var).actionBar;
        float measuredHeight = aVar.getMeasuredHeight();
        aVar2 = ((d) d88Var).actionBar;
        canvas.drawRect(0.0f, aVar2.getTranslationY() + measuredHeight, getMeasuredWidth(), getMeasuredHeight(), paint);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return X() || this.t0.h.I || onTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0091  */
    @Override // ela, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        cv3 cv3Var;
        int measuredHeight;
        int measuredHeight2;
        int childCount = getChildCount();
        int L = gm.L(20.0f);
        d88 d88Var = this.t0;
        int emojiPadding = (L < 0 || gm.E || gm.O1()) ? 0 : d88Var.d.getEmojiPadding();
        setBottomClip(emojiPadding);
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight3 = childAt.getMeasuredHeight();
                int i12 = layoutParams.gravity;
                if (i12 == -1) {
                    i12 = 51;
                }
                int i13 = i12 & nm7.w1;
                int i14 = i12 & 7;
                if (i14 == 1) {
                    i5 = (((i3 - i) - measuredWidth) / 2) + layoutParams.leftMargin;
                    i6 = layoutParams.rightMargin;
                } else if (i14 != 5) {
                    i7 = getPaddingLeft() + layoutParams.leftMargin;
                    if (i13 == 16) {
                        if (i13 == 48) {
                            i10 = layoutParams.topMargin + getPaddingTop();
                        } else if (i13 != 80) {
                            i10 = layoutParams.topMargin;
                        } else {
                            i8 = td4.f(i4, emojiPadding, i2, measuredHeight3);
                            i9 = layoutParams.bottomMargin;
                        }
                        cv3Var = d88Var.d;
                        if (cv3Var != null && cv3Var.l(childAt)) {
                            if (gm.O1()) {
                                measuredHeight = getMeasuredHeight();
                                measuredHeight2 = childAt.getMeasuredHeight();
                            } else {
                                measuredHeight = getMeasuredHeight();
                                measuredHeight2 = childAt.getMeasuredHeight();
                            }
                            i10 = measuredHeight - measuredHeight2;
                        }
                        childAt.layout(i7, i10, measuredWidth + i7, measuredHeight3 + i10);
                    } else {
                        i8 = ((((i4 - emojiPadding) - i2) - measuredHeight3) / 2) + layoutParams.topMargin;
                        i9 = layoutParams.bottomMargin;
                    }
                    i10 = i8 - i9;
                    cv3Var = d88Var.d;
                    if (cv3Var != null) {
                        if (gm.O1()) {
                        }
                        i10 = measuredHeight - measuredHeight2;
                    }
                    childAt.layout(i7, i10, measuredWidth + i7, measuredHeight3 + i10);
                } else {
                    i5 = ((i3 - i) - measuredWidth) - layoutParams.rightMargin;
                    i6 = getPaddingRight();
                }
                i7 = i5 - i6;
                if (i13 == 16) {
                }
                i10 = i8 - i9;
                cv3Var = d88Var.d;
                if (cv3Var != null) {
                }
                childAt.layout(i7, i10, measuredWidth + i7, measuredHeight3 + i10);
            }
        }
        R();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0075 A[EDGE_INSN: B:18:0x0075->B:19:0x0075 BREAK  A[LOOP:0: B:7:0x004d->B:15:0x0072], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0052  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        a aVar;
        int i3;
        a aVar2;
        int i4;
        c88[] c88VarArr;
        int childCount;
        int i5;
        a aVar3;
        r59 r59Var;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        setMeasuredDimension(size, size2);
        d88 d88Var = this.t0;
        aVar = ((d) d88Var).actionBar;
        measureChildWithMargins(aVar, i, 0, i2, 0);
        if (gm.L(20.0f) < 0) {
            this.s0 = true;
            d88Var.d.j();
            this.s0 = false;
        } else if (!gm.E) {
            size2 -= d88Var.d.getEmojiPadding();
            i3 = View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30);
            aVar2 = ((d) d88Var).actionBar;
            int measuredHeight = aVar2.getMeasuredHeight();
            this.s0 = true;
            i4 = 0;
            while (true) {
                c88VarArr = d88Var.n;
                if (i4 < c88VarArr.length) {
                    break;
                }
                c88 c88Var = c88VarArr[i4];
                if (c88Var != null && (r59Var = (r59) c88Var.f) != null) {
                    r59Var.setPadding(gm.L(4.0f), gm.L(4.0f) + measuredHeight, gm.L(4.0f), gm.L(4.0f));
                }
                i4++;
            }
            this.s0 = false;
            childCount = getChildCount();
            for (i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                if (childAt != null && childAt.getVisibility() != 8) {
                    aVar3 = ((d) d88Var).actionBar;
                    if (childAt != aVar3) {
                        cv3 cv3Var = d88Var.d;
                        if (cv3Var == null || !cv3Var.l(childAt)) {
                            measureChildWithMargins(childAt, i, 0, i3, 0);
                        } else if (!gm.E && !gm.O1()) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, TLObject.FLAG_30));
                        } else if (gm.O1()) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.min(gm.L(gm.O1() ? 200.0f : 320.0f), getPaddingTop() + (size2 - gm.m)), TLObject.FLAG_30));
                        } else {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (size2 - gm.m), TLObject.FLAG_30));
                        }
                    }
                }
            }
        }
        i3 = i2;
        aVar2 = ((d) d88Var).actionBar;
        int measuredHeight2 = aVar2.getMeasuredHeight();
        this.s0 = true;
        i4 = 0;
        while (true) {
            c88VarArr = d88Var.n;
            if (i4 < c88VarArr.length) {
            }
            i4++;
        }
        this.s0 = false;
        childCount = getChildCount();
        while (i5 < childCount) {
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        tk5 tk5Var;
        float f;
        float f2;
        a aVar;
        float measuredWidth;
        d88 d88Var = this.t0;
        c88[] c88VarArr = d88Var.n;
        tk5Var = ((d) d88Var).parentLayout;
        if (((ActionBarLayout) tk5Var).h() || X()) {
            return false;
        }
        if (motionEvent != null) {
            VelocityTracker velocityTracker = this.r0;
            if (velocityTracker == null) {
                velocityTracker = VelocityTracker.obtain();
                this.r0 = velocityTracker;
            }
            velocityTracker.addMovement(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && !this.n0 && !this.o0) {
            this.m0 = motionEvent.getPointerId(0);
            this.o0 = true;
            this.p0 = (int) motionEvent.getX();
            this.q0 = (int) motionEvent.getY();
            this.r0.clear();
        } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.m0) {
            int x = (int) (motionEvent.getX() - this.p0);
            int abs = Math.abs(((int) motionEvent.getY()) - this.q0);
            if (this.n0 && (!d88Var.w ? x < 0 : x > 0)) {
                if (!Y(motionEvent, x < 0)) {
                    this.o0 = true;
                    this.n0 = false;
                    c88VarArr[0].setTranslationX(0.0f);
                    c88VarArr[1].setTranslationX(d88Var.w ? c88VarArr[0].getMeasuredWidth() : -c88VarArr[0].getMeasuredWidth());
                    d88Var.h.i(0.0f, c88VarArr[1].b);
                }
            }
            if (!this.o0 || this.n0) {
                if (this.n0) {
                    c88VarArr[0].setTranslationX(x);
                    if (d88Var.w) {
                        c88VarArr[1].setTranslationX(c88VarArr[0].getMeasuredWidth() + x);
                    } else {
                        c88VarArr[1].setTranslationX(x - c88VarArr[0].getMeasuredWidth());
                    }
                    d88Var.h.i(Math.abs(x) / c88VarArr[0].getMeasuredWidth(), c88VarArr[1].b);
                }
            } else if (Math.abs(x) >= gm.Z0(true, 0.3f) && Math.abs(x) > abs) {
                Y(motionEvent, x < 0);
            }
        } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.m0 && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
            this.r0.computeCurrentVelocity(1000, d88Var.y);
            if (motionEvent == null || motionEvent.getAction() == 3) {
                f = 0.0f;
                f2 = 0.0f;
            } else {
                f = this.r0.getXVelocity();
                f2 = this.r0.getYVelocity();
                if (!this.n0 && Math.abs(f) >= 3000.0f && Math.abs(f) > Math.abs(f2)) {
                    Y(motionEvent, f < 0.0f);
                }
            }
            if (this.n0) {
                float x2 = c88VarArr[0].getX();
                d88Var.r = new AnimatorSet();
                boolean z = Math.abs(x2) < ((float) c88VarArr[0].getMeasuredWidth()) / 3.0f && (Math.abs(f) < 3500.0f || Math.abs(f) < Math.abs(f2));
                d88Var.x = z;
                Property property = View.TRANSLATION_X;
                if (z) {
                    measuredWidth = Math.abs(x2);
                    boolean z2 = d88Var.w;
                    AnimatorSet animatorSet = d88Var.r;
                    if (z2) {
                        animatorSet.playTogether(ObjectAnimator.ofFloat(c88VarArr[0], (Property<c88, Float>) property, 0.0f), ObjectAnimator.ofFloat(c88VarArr[1], (Property<c88, Float>) property, r1.getMeasuredWidth()));
                    } else {
                        animatorSet.playTogether(ObjectAnimator.ofFloat(c88VarArr[0], (Property<c88, Float>) property, 0.0f), ObjectAnimator.ofFloat(c88VarArr[1], (Property<c88, Float>) property, -r1.getMeasuredWidth()));
                    }
                } else {
                    measuredWidth = c88VarArr[0].getMeasuredWidth() - Math.abs(x2);
                    boolean z3 = d88Var.w;
                    AnimatorSet animatorSet2 = d88Var.r;
                    if (z3) {
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(c88VarArr[0], (Property<c88, Float>) property, -r7.getMeasuredWidth()), ObjectAnimator.ofFloat(c88VarArr[1], (Property<c88, Float>) property, 0.0f));
                    } else {
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(c88VarArr[0], (Property<c88, Float>) property, r7.getMeasuredWidth()), ObjectAnimator.ofFloat(c88VarArr[1], (Property<c88, Float>) property, 0.0f));
                    }
                }
                d88Var.r.setInterpolator(d88.E);
                int measuredWidth2 = getMeasuredWidth();
                float f3 = measuredWidth2 / 2;
                float I = (gm.I(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth2)) * f3) + f3;
                d88Var.r.setDuration(Math.max(nm7.f2, Math.min(Math.abs(f) > 0.0f ? Math.round(Math.abs(I / r6) * 1000.0f) << 2 : (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f), 600)));
                d88Var.r.addListener(new s38(this, (byte) 5));
                d88Var.r.start();
                d88Var.s = true;
                this.n0 = false;
            } else {
                this.o0 = false;
                aVar = ((d) d88Var).actionBar;
                aVar.setEnabled(true);
                d88Var.h.setEnabled(true);
            }
            VelocityTracker velocityTracker2 = this.r0;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.r0 = null;
            }
        }
        return this.n0;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.s0) {
            return;
        }
        super.requestLayout();
    }
}
