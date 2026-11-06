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

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class d31 extends rt0 {
    public final Paint f0;
    public boolean g0;
    public boolean h0;
    public boolean i0;
    public ValueAnimator j0;
    public float k0;
    public final float[] l0;
    public boolean m0;
    public final /* synthetic */ e31 n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d31(e31 e31Var, Context context) {
        super(context, null);
        this.n0 = e31Var;
        this.f0 = new Paint(1);
        this.g0 = false;
        this.h0 = false;
        this.i0 = false;
        this.k0 = 0.0f;
        this.l0 = new float[8];
        setWillNotDraw(false);
        int i7 = e31Var.t0;
        setPadding(i7, 0, i7, 0);
        setDelegate(new c31(this));
    }

    public final float X() {
        e31 e31Var = this.n0;
        return Math.min(1.0f, Math.max(0.0f, e31Var.l1 / (e31Var.i1 * 2.0f)));
    }

    @Override // org.telegram.ui.Components.rt0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        e31 e31Var = this.n0;
        t31 t31Var = e31Var.k1;
        int i7 = e31Var.i1;
        GradientDrawable gradientDrawable = e31Var.j1;
        float X = X();
        boolean z9 = X == 0.0f && !e31Var.I;
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
                ofFloat.addUpdateListener(new c60(this, 27));
                this.j0.setDuration(200L);
            } else {
                valueAnimator2.setFloatValues(this.k0, z9 ? 1.0f : 0.0f);
            }
            this.j0.start();
        }
        boolean z10 = this.k0 > 0.5f;
        if (this.m0 != z10) {
            this.m0 = z10;
            boolean z11 = org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h5, e31Var.I0)) > 0.721f;
            boolean z12 = org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.w(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.s8, e31Var.I0), 855638016)) > 0.721f;
            if (!z10) {
                z11 = z12;
            }
            org.telegram.messenger.g0.s3(e31Var.getWindow(), z11);
        }
        if (this.k0 > 0.0f) {
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h5, e31Var.I0);
            Paint paint = this.f0;
            paint.setColor(w02);
            float max = (int) Math.max(0.0f, t31Var.getTranslationY() + (org.telegram.messenger.g0.m - i7) + ((1.0f - X()) * i7) + e31Var.l1 + org.telegram.messenger.g0.L(24.0f));
            canvas2 = canvas;
            canvas2.drawRect(e31Var.t0, org.telegram.messenger.g0.W1(this.k0, r1, -org.telegram.messenger.g0.m), getMeasuredWidth() - e31Var.t0, max, paint);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas);
        canvas2.save();
        canvas2.translate(0.0f, (t31Var.getTranslationY() + org.telegram.messenger.g0.m) - i7);
        int L = org.telegram.messenger.g0.L(36.0f);
        int L2 = org.telegram.messenger.g0.L(4.0f);
        int i10 = (int) ((1.0f - X) * L2 * 2.0f);
        gradientDrawable.setCornerRadius(org.telegram.messenger.g0.L(2.0f));
        gradientDrawable.setColor(i0.a.o(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.wj, e31Var.I0), (int) (Color.alpha(r5) * X)));
        gradientDrawable.setBounds((getWidth() - L) / 2, org.telegram.messenger.k5.C(10.0f, e31Var.l1, i10), (getWidth() + L) / 2, org.telegram.messenger.g0.L(10.0f) + e31Var.l1 + i10 + L2);
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
        org.telegram.messenger.g0.i3(new ir0(this, 24), 200L);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        e31 e31Var = this.n0;
        GradientDrawable gradientDrawable = e31Var.j1;
        t31 t31Var = e31Var.k1;
        if (t31Var.c()) {
            e31Var.l1 = t31Var.getContentTopOffset();
            e31Var.b.invalidate();
        }
        super.onDraw(canvas);
        float X = X();
        int i7 = e31Var.i1;
        int i10 = (int) ((1.0f - X) * i7);
        int i11 = org.telegram.messenger.g0.m - i7;
        canvas.save();
        canvas.translate(0.0f, t31Var.getTranslationY() + i11);
        e31Var.r0.setBounds(0, (e31Var.l1 - e31Var.s0) + i10, getMeasuredWidth(), getMeasuredHeight() + (i11 < 0 ? -i11 : 0));
        e31Var.r0.draw(canvas);
        if (X > 0.0f && X < 1.0f) {
            float L = org.telegram.messenger.g0.L(12.0f) * X;
            gradientDrawable.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h5, e31Var.I0));
            float[] fArr = this.l0;
            fArr[3] = L;
            fArr[2] = L;
            fArr[1] = L;
            fArr[0] = L;
            gradientDrawable.setCornerRadii(fArr);
            gradientDrawable.setBounds(e31Var.t0, e31Var.l1 + i10, getWidth() - e31Var.t0, org.telegram.messenger.g0.L(24.0f) + e31Var.l1 + i10);
            gradientDrawable.draw(canvas);
        }
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            e31 e31Var = this.n0;
            if (e31Var.l1 != 0 && motionEvent.getY() < e31Var.l1) {
                e31Var.dismiss();
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
        e31 e31Var = this.n0;
        if (Q > L) {
            e31Var.k1.a(true);
            e31Var.q0 = false;
            this.g0 = true;
        } else {
            e31Var.k1.a(false);
            e31Var.q0 = true;
            this.g0 = false;
        }
        e31Var.k1.setContentViewPaddingTop(i14);
        if (getPaddingTop() != i13) {
            int i15 = e31Var.t0;
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
