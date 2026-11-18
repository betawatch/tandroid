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

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class s31 extends au0 {
    public final Paint g0;
    public boolean h0;
    public boolean i0;
    public boolean j0;
    public ValueAnimator k0;
    public float l0;
    public final float[] m0;
    public boolean n0;
    public final /* synthetic */ t31 o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s31(t31 t31Var, Context context) {
        super(context, null);
        this.o0 = t31Var;
        this.g0 = new Paint(1);
        this.h0 = false;
        this.i0 = false;
        this.j0 = false;
        this.l0 = 0.0f;
        this.m0 = new float[8];
        setWillNotDraw(false);
        int i7 = t31Var.u0;
        setPadding(i7, 0, i7, 0);
        setDelegate(new r31(this));
    }

    public final float X() {
        t31 t31Var = this.o0;
        return Math.min(1.0f, Math.max(0.0f, t31Var.p1 / (t31Var.m1 * 2.0f)));
    }

    @Override // org.telegram.ui.Components.au0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        t31 t31Var = this.o0;
        h41 h41Var = t31Var.o1;
        int i7 = t31Var.m1;
        GradientDrawable gradientDrawable = t31Var.n1;
        float X = X();
        boolean z10 = X == 0.0f && !t31Var.J;
        if (this.j0 != z10) {
            ValueAnimator valueAnimator = this.k0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.j0 = z10;
            ValueAnimator valueAnimator2 = this.k0;
            if (valueAnimator2 == null) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.l0, z10 ? 1.0f : 0.0f);
                this.k0 = ofFloat;
                ofFloat.addUpdateListener(new e60(this, 29));
                this.k0.setDuration(200L);
            } else {
                valueAnimator2.setFloatValues(this.l0, z10 ? 1.0f : 0.0f);
            }
            this.k0.start();
        }
        boolean z11 = this.l0 > 0.5f;
        if (this.n0 != z11) {
            this.n0 = z11;
            boolean z12 = org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.h5, t31Var.J0)) > 0.721f;
            boolean z13 = org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.n6.w(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.s8, t31Var.J0), 855638016)) > 0.721f;
            if (!z11) {
                z12 = z13;
            }
            org.telegram.messenger.g0.r3(t31Var.getWindow(), z12);
        }
        if (this.l0 > 0.0f) {
            int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.h5, t31Var.J0);
            Paint paint = this.g0;
            paint.setColor(w02);
            float max = (int) Math.max(0.0f, h41Var.getTranslationY() + (org.telegram.messenger.g0.m - i7) + ((1.0f - X()) * i7) + t31Var.p1 + org.telegram.messenger.g0.L(24.0f));
            canvas2 = canvas;
            canvas2.drawRect(t31Var.u0, org.telegram.messenger.g0.W1(this.l0, r1, -org.telegram.messenger.g0.m), getMeasuredWidth() - t31Var.u0, max, paint);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas);
        canvas2.save();
        canvas2.translate(0.0f, (h41Var.getTranslationY() + org.telegram.messenger.g0.m) - i7);
        int L = org.telegram.messenger.g0.L(36.0f);
        int L2 = org.telegram.messenger.g0.L(4.0f);
        int i10 = (int) ((1.0f - X) * L2 * 2.0f);
        gradientDrawable.setCornerRadius(org.telegram.messenger.g0.L(2.0f));
        gradientDrawable.setColor(i0.a.o(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.zj, t31Var.J0), (int) (Color.alpha(r5) * X)));
        gradientDrawable.setBounds((getWidth() - L) / 2, org.telegram.messenger.f3.C(10.0f, t31Var.p1, i10), (getWidth() + L) / 2, org.telegram.messenger.g0.L(10.0f) + t31Var.p1 + i10 + L2);
        gradientDrawable.draw(canvas2);
        canvas2.restore();
    }

    @Override // android.view.View
    public final float getTranslationY() {
        return this.o0.o1.getTranslationY();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        org.telegram.messenger.g0.h3(new ap0(this, 26), 200L);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        t31 t31Var = this.o0;
        GradientDrawable gradientDrawable = t31Var.n1;
        h41 h41Var = t31Var.o1;
        if (h41Var.c()) {
            t31Var.p1 = h41Var.getContentTopOffset();
            t31Var.b.invalidate();
        }
        super.onDraw(canvas);
        float X = X();
        int i7 = t31Var.m1;
        int i10 = (int) ((1.0f - X) * i7);
        int i11 = org.telegram.messenger.g0.m - i7;
        canvas.save();
        canvas.translate(0.0f, h41Var.getTranslationY() + i11);
        t31Var.s0.setBounds(0, (t31Var.p1 - t31Var.t0) + i10, getMeasuredWidth(), getMeasuredHeight() + (i11 < 0 ? -i11 : 0));
        t31Var.s0.draw(canvas);
        if (X > 0.0f && X < 1.0f) {
            float L = org.telegram.messenger.g0.L(12.0f) * X;
            gradientDrawable.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.h5, t31Var.J0));
            float[] fArr = this.m0;
            fArr[3] = L;
            fArr[2] = L;
            fArr[1] = L;
            fArr[0] = L;
            gradientDrawable.setCornerRadii(fArr);
            gradientDrawable.setBounds(t31Var.u0, t31Var.p1 + i10, getWidth() - t31Var.u0, org.telegram.messenger.g0.L(24.0f) + t31Var.p1 + i10);
            gradientDrawable.draw(canvas);
        }
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            t31 t31Var = this.o0;
            if (t31Var.p1 != 0 && motionEvent.getY() < t31Var.p1) {
                t31Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.au0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int i13 = org.telegram.messenger.g0.m;
        int size = View.MeasureSpec.getSize(getMeasuredHeight()) - i13;
        int Q = Q();
        int i14 = (int) ((size + Q) * 0.2f);
        this.i0 = true;
        int L = org.telegram.messenger.g0.L(20.0f);
        t31 t31Var = this.o0;
        if (Q > L) {
            t31Var.o1.a(true);
            t31Var.r0 = false;
            this.h0 = true;
        } else {
            t31Var.o1.a(false);
            t31Var.r0 = true;
            this.h0 = false;
        }
        t31Var.o1.setContentViewPaddingTop(i14);
        if (getPaddingTop() != i13) {
            int i15 = t31Var.u0;
            setPadding(i15, i13, i15, 0);
        }
        this.i0 = false;
        super.onLayout(z10, i7, i10, i11, i12);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.o0.J && super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.i0) {
            return;
        }
        super.requestLayout();
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        this.o0.o1.setTranslationY(f10);
        invalidate();
    }
}
