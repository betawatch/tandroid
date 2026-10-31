package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class c61 extends FrameLayout {
    public ValueAnimator a;
    public float b;
    public boolean c;
    public Boolean d;
    public final /* synthetic */ e61 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c61(e61 e61Var, Context context) {
        super(context);
        this.e = e61Var;
        this.c = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(0, getPaddingTop(), getMeasuredWidth(), getMeasuredHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f7;
        canvas.save();
        e61 e61Var = this.e;
        Drawable drawable = e61Var.n1;
        RectF rectF = e61Var.t1;
        int L = org.telegram.messenger.i0.L(6.0f) + (e61Var.u1 - e61Var.s0);
        int L2 = (e61Var.u1 - e61Var.s0) - org.telegram.messenger.i0.L(13.0f);
        int L3 = org.telegram.messenger.i0.L(50.0f) + getMeasuredHeight();
        int i10 = e61Var.s0;
        int i11 = org.telegram.messenger.i0.m;
        int i12 = L2 + i11;
        int i13 = L + i11;
        int i14 = (L3 + i10) - i11;
        float translationY = getTranslationY() + i10 + i12;
        int i15 = org.telegram.messenger.i0.m;
        if (translationY < i15 * 2) {
            int min = (int) Math.min(i15, ((r8 - i12) - e61Var.s0) - getTranslationY());
            i12 -= min;
            i14 += min;
            f7 = 1.0f - Math.min(1.0f, (min * 2) / org.telegram.messenger.i0.m);
        } else {
            f7 = 1.0f;
        }
        float translationY2 = getTranslationY() + e61Var.s0 + i12;
        float f10 = org.telegram.messenger.i0.m;
        int min2 = translationY2 < f10 ? (int) Math.min(f10, ((r7 - i12) - e61Var.s0) - getTranslationY()) : 0;
        drawable.setBounds(0, i12, getMeasuredWidth(), i14);
        drawable.draw(canvas);
        if (!e61Var.J1) {
            if (f7 != 1.0f) {
                org.telegram.ui.ActionBar.t6.t0.setColor(e61Var.w1);
                rectF.set(e61Var.t0, e61Var.s0 + i12, getMeasuredWidth() - e61Var.t0, org.telegram.messenger.i0.L(24.0f) + e61Var.s0 + i12);
                canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(12.0f) * f7, org.telegram.messenger.i0.L(12.0f) * f7, org.telegram.ui.ActionBar.t6.t0);
            }
            int L4 = org.telegram.messenger.i0.L(36.0f);
            rectF.set((getMeasuredWidth() - L4) / 2, i13, (getMeasuredWidth() + L4) / 2, org.telegram.messenger.i0.L(4.0f) + i13);
            org.telegram.ui.ActionBar.t6.t0.setColor(org.telegram.ui.ActionBar.t6.x0(null, e61Var.z1, false));
            canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f), org.telegram.ui.ActionBar.t6.t0);
        }
        if (min2 > 0) {
            org.telegram.ui.ActionBar.t6.t0.setColor(e61Var.w1);
        }
        boolean z10 = min2 > org.telegram.messenger.i0.m / 2;
        Boolean bool = this.d;
        if (bool == null || bool.booleanValue() != z10) {
            boolean z11 = org.telegram.messenger.i0.B(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.h5, e61Var.I0)) > 0.721f;
            boolean z12 = org.telegram.messenger.i0.B(org.telegram.ui.ActionBar.t6.w(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.s8, e61Var.I0), 855638016)) > 0.721f;
            this.d = Boolean.valueOf(z10);
            if (!z10) {
                z11 = z12;
            }
            org.telegram.messenger.i0.r3(e61Var.getWindow(), z11);
        }
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            float y3 = motionEvent.getY();
            e61 e61Var = this.e;
            if (y3 < e61Var.u1) {
                e61Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.e.Q0();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int L;
        int size = View.MeasureSpec.getSize(i11);
        int i12 = 1;
        this.c = true;
        e61 e61Var = this.e;
        ag.b1 b1Var = e61Var.k1;
        int i13 = e61Var.t0;
        setPadding(i13, org.telegram.messenger.i0.m, i13, 0);
        this.c = false;
        int paddingTop = size - getPaddingTop();
        if (e61Var.d) {
            L = org.telegram.messenger.i0.L(8.0f);
            e61Var.u0(false);
            int i14 = e61Var.u1;
            if (i14 != 0) {
                float f7 = i14;
                this.b = f7;
                setTranslationY(f7);
                ValueAnimator valueAnimator = this.a;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    this.a.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.b, 0.0f);
                this.a = ofFloat;
                ofFloat.addUpdateListener(new v51(i12, this));
                this.a.setDuration(250L);
                this.a.setInterpolator(org.telegram.ui.ActionBar.m1.w);
                this.a.addListener(new p11(this, 6));
                this.a.start();
            } else if (this.a != null) {
                setTranslationY(this.b);
            }
        } else {
            L = (paddingTop - ((paddingTop / 5) * 3)) + org.telegram.messenger.i0.L(8.0f);
            e61Var.q0 = true;
        }
        if (b1Var.getPaddingTop() != L) {
            this.c = true;
            b1Var.setPadding(0, L, 0, 0);
            this.c = false;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.e.I && super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.c) {
            return;
        }
        super.requestLayout();
    }

    @Override // android.view.View
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        invalidate();
    }
}
