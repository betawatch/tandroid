package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.GradientDrawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class x21 extends rt0 {
    public final Paint f0;
    public boolean g0;
    public boolean h0;
    public boolean i0;
    public ValueAnimator j0;
    public float k0;
    public final float[] l0;
    public boolean m0;
    public final /* synthetic */ y21 n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x21(y21 y21Var, Context context) {
        super(context, null);
        this.n0 = y21Var;
        this.f0 = new Paint(1);
        this.g0 = false;
        this.h0 = false;
        this.i0 = false;
        this.k0 = 0.0f;
        this.l0 = new float[8];
        setWillNotDraw(false);
        int i7 = y21Var.t0;
        setPadding(i7, 0, i7, 0);
        setDelegate(new w21(this));
    }

    public final float X() {
        y21 y21Var = this.n0;
        return Math.min(1.0f, Math.max(0.0f, y21Var.l1 / (y21Var.i1 * 2.0f)));
    }

    @Override // org.telegram.ui.Components.rt0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        y21 y21Var = this.n0;
        n31 n31Var = y21Var.k1;
        int i7 = y21Var.i1;
        GradientDrawable gradientDrawable = y21Var.j1;
        float X = X();
        boolean z9 = X == 0.0f && !y21Var.I;
        if (this.i0 != z9) {
            ValueAnimator valueAnimator = this.j0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.i0 = z9;
            ValueAnimator valueAnimator2 = this.j0;
            if (valueAnimator2 == null) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.k0, z9 ? 1.0f : 0.0f);
                this.j0 = ofFloat;
                ofFloat.addUpdateListener(new c60(this, 28));
                this.j0.setDuration(200L);
            } else {
                valueAnimator2.setFloatValues(this.k0, z9 ? 1.0f : 0.0f);
            }
            this.j0.start();
        }
        boolean z10 = this.k0 > 0.5f;
        if (this.m0 != z10) {
            this.m0 = z10;
            boolean z11 = org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h5, y21Var.I0)) > 0.721f;
            boolean z12 = org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.w(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.s8, y21Var.I0), 855638016)) > 0.721f;
            if (!z10) {
                z11 = z12;
            }
            org.telegram.messenger.g0.s3(y21Var.getWindow(), z11);
        }
        if (this.k0 > 0.0f) {
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h5, y21Var.I0);
            Paint paint = this.f0;
            paint.setColor(w02);
            float max = (int) Math.max(0.0f, n31Var.getTranslationY() + (org.telegram.messenger.g0.m - i7) + ((1.0f - X()) * i7) + y21Var.l1 + org.telegram.messenger.g0.L(24.0f));
            canvas2 = canvas;
            canvas2.drawRect(y21Var.t0, org.telegram.messenger.g0.W1(this.k0, r1, -org.telegram.messenger.g0.m), getMeasuredWidth() - y21Var.t0, max, paint);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas);
        canvas2.save();
        canvas2.translate(0.0f, (n31Var.getTranslationY() + org.telegram.messenger.g0.m) - i7);
        int L = org.telegram.messenger.g0.L(36.0f);
        int L2 = org.telegram.messenger.g0.L(4.0f);
        int i10 = (int) ((1.0f - X) * L2 * 2.0f);
        gradientDrawable.setCornerRadius(org.telegram.messenger.g0.L(2.0f));
        gradientDrawable.setColor(i0.a.o(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.wj, y21Var.I0), (int) (Color.alpha(r5) * X)));
        gradientDrawable.setBounds((getWidth() - L) / 2, org.telegram.messenger.k5.C(10.0f, y21Var.l1, i10), (getWidth() + L) / 2, org.telegram.messenger.g0.L(10.0f) + y21Var.l1 + i10 + L2);
        gradientDrawable.draw(canvas2);
        canvas2.restore();
    }

    @Override // android.view.View
    public final float getTranslationY() {
        return this.n0.k1.getTranslationY();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        org.telegram.messenger.g0.i3(new ir0(this, 23), 200L);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        y21 y21Var = this.n0;
        GradientDrawable gradientDrawable = y21Var.j1;
        n31 n31Var = y21Var.k1;
        if (n31Var.c()) {
            y21Var.l1 = n31Var.getContentTopOffset();
            y21Var.b.invalidate();
        }
        super.onDraw(canvas);
        float X = X();
        int i7 = y21Var.i1;
        int i10 = (int) ((1.0f - X) * i7);
        int i11 = org.telegram.messenger.g0.m - i7;
        canvas.save();
        canvas.translate(0.0f, n31Var.getTranslationY() + i11);
        y21Var.r0.setBounds(0, (y21Var.l1 - y21Var.s0) + i10, getMeasuredWidth(), getMeasuredHeight() + (i11 < 0 ? -i11 : 0));
        y21Var.r0.draw(canvas);
        if (X > 0.0f && X < 1.0f) {
            float L = org.telegram.messenger.g0.L(12.0f) * X;
            gradientDrawable.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h5, y21Var.I0));
            float[] fArr = this.l0;
            fArr[3] = L;
            fArr[2] = L;
            fArr[1] = L;
            fArr[0] = L;
            gradientDrawable.setCornerRadii(fArr);
            gradientDrawable.setBounds(y21Var.t0, y21Var.l1 + i10, getWidth() - y21Var.t0, org.telegram.messenger.g0.L(24.0f) + y21Var.l1 + i10);
            gradientDrawable.draw(canvas);
        }
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            y21 y21Var = this.n0;
            if (y21Var.l1 != 0 && motionEvent.getY() < y21Var.l1) {
                y21Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.rt0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int i13 = org.telegram.messenger.g0.m;
        int size = View.MeasureSpec.getSize(getMeasuredHeight()) - i13;
        int Q = Q();
        int i14 = (int) ((size + Q) * 0.2f);
        this.h0 = true;
        int L = org.telegram.messenger.g0.L(20.0f);
        y21 y21Var = this.n0;
        if (Q > L) {
            y21Var.k1.a(true);
            y21Var.q0 = false;
            this.g0 = true;
        } else {
            y21Var.k1.a(false);
            y21Var.q0 = true;
            this.g0 = false;
        }
        y21Var.k1.setContentViewPaddingTop(i14);
        if (getPaddingTop() != i13) {
            int i15 = y21Var.t0;
            setPadding(i15, i13, i15, 0);
        }
        this.h0 = false;
        super.onLayout(z9, i7, i10, i11, i12);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.n0.I && super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.h0) {
            return;
        }
        super.requestLayout();
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        this.n0.k1.setTranslationY(f10);
        invalidate();
    }
}
