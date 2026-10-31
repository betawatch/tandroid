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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class g41 extends uu0 {
    public final Paint f0;
    public boolean g0;
    public boolean h0;
    public boolean i0;
    public ValueAnimator j0;
    public float k0;
    public final float[] l0;
    public boolean m0;
    public final /* synthetic */ h41 n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g41(h41 h41Var, Context context) {
        super(context, null);
        this.n0 = h41Var;
        this.f0 = new Paint(1);
        this.g0 = false;
        this.h0 = false;
        this.i0 = false;
        this.k0 = 0.0f;
        this.l0 = new float[8];
        setWillNotDraw(false);
        int i10 = h41Var.t0;
        setPadding(i10, 0, i10, 0);
        setDelegate(new f41(this));
    }

    public final float X() {
        h41 h41Var = this.n0;
        return Math.min(1.0f, Math.max(0.0f, h41Var.l1 / (h41Var.i1 * 2.0f)));
    }

    @Override // org.telegram.ui.Components.uu0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        h41 h41Var = this.n0;
        w41 w41Var = h41Var.k1;
        int i10 = h41Var.i1;
        GradientDrawable gradientDrawable = h41Var.j1;
        float X = X();
        boolean z10 = X == 0.0f && !h41Var.I;
        if (this.i0 != z10) {
            ValueAnimator valueAnimator = this.j0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.i0 = z10;
            ValueAnimator valueAnimator2 = this.j0;
            if (valueAnimator2 == null) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.k0, z10 ? 1.0f : 0.0f);
                this.j0 = ofFloat;
                ofFloat.addUpdateListener(new r60(this, 29));
                this.j0.setDuration(200L);
            } else {
                valueAnimator2.setFloatValues(this.k0, z10 ? 1.0f : 0.0f);
            }
            this.j0.start();
        }
        boolean z11 = this.k0 > 0.5f;
        if (this.m0 != z11) {
            this.m0 = z11;
            boolean z12 = org.telegram.messenger.i0.B(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.h5, h41Var.I0)) > 0.721f;
            boolean z13 = org.telegram.messenger.i0.B(org.telegram.ui.ActionBar.t6.w(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.s8, h41Var.I0), 855638016)) > 0.721f;
            if (!z11) {
                z12 = z13;
            }
            org.telegram.messenger.i0.r3(h41Var.getWindow(), z12);
        }
        if (this.k0 > 0.0f) {
            int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.h5, h41Var.I0);
            Paint paint = this.f0;
            paint.setColor(w02);
            float max = (int) Math.max(0.0f, w41Var.getTranslationY() + (org.telegram.messenger.i0.m - i10) + ((1.0f - X()) * i10) + h41Var.l1 + org.telegram.messenger.i0.L(24.0f));
            canvas2 = canvas;
            canvas2.drawRect(h41Var.t0, org.telegram.messenger.i0.W1(this.k0, r1, -org.telegram.messenger.i0.m), getMeasuredWidth() - h41Var.t0, max, paint);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas);
        canvas2.save();
        canvas2.translate(0.0f, (w41Var.getTranslationY() + org.telegram.messenger.i0.m) - i10);
        int L = org.telegram.messenger.i0.L(36.0f);
        int L2 = org.telegram.messenger.i0.L(4.0f);
        int i11 = (int) ((1.0f - X) * L2 * 2.0f);
        gradientDrawable.setCornerRadius(org.telegram.messenger.i0.L(2.0f));
        gradientDrawable.setColor(i0.b.o(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.wj, h41Var.I0), (int) (Color.alpha(r5) * X)));
        gradientDrawable.setBounds((getWidth() - L) / 2, org.telegram.messenger.m5.C(10.0f, h41Var.l1, i11), (getWidth() + L) / 2, org.telegram.messenger.i0.L(10.0f) + h41Var.l1 + i11 + L2);
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
        org.telegram.messenger.i0.h3(new uo0(this, 28), 200L);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        h41 h41Var = this.n0;
        GradientDrawable gradientDrawable = h41Var.j1;
        w41 w41Var = h41Var.k1;
        if (w41Var.c()) {
            h41Var.l1 = w41Var.getContentTopOffset();
            h41Var.b.invalidate();
        }
        super.onDraw(canvas);
        float X = X();
        int i10 = h41Var.i1;
        int i11 = (int) ((1.0f - X) * i10);
        int i12 = org.telegram.messenger.i0.m - i10;
        canvas.save();
        canvas.translate(0.0f, w41Var.getTranslationY() + i12);
        h41Var.r0.setBounds(0, (h41Var.l1 - h41Var.s0) + i11, getMeasuredWidth(), getMeasuredHeight() + (i12 < 0 ? -i12 : 0));
        h41Var.r0.draw(canvas);
        if (X > 0.0f && X < 1.0f) {
            float L = org.telegram.messenger.i0.L(12.0f) * X;
            gradientDrawable.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.h5, h41Var.I0));
            float[] fArr = this.l0;
            fArr[3] = L;
            fArr[2] = L;
            fArr[1] = L;
            fArr[0] = L;
            gradientDrawable.setCornerRadii(fArr);
            gradientDrawable.setBounds(h41Var.t0, h41Var.l1 + i11, getWidth() - h41Var.t0, org.telegram.messenger.i0.L(24.0f) + h41Var.l1 + i11);
            gradientDrawable.draw(canvas);
        }
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            h41 h41Var = this.n0;
            if (h41Var.l1 != 0 && motionEvent.getY() < h41Var.l1) {
                h41Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.uu0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = org.telegram.messenger.i0.m;
        int size = View.MeasureSpec.getSize(getMeasuredHeight()) - i14;
        int Q = Q();
        int i15 = (int) ((size + Q) * 0.2f);
        this.h0 = true;
        int L = org.telegram.messenger.i0.L(20.0f);
        h41 h41Var = this.n0;
        if (Q > L) {
            h41Var.k1.a(true);
            h41Var.q0 = false;
            this.g0 = true;
        } else {
            h41Var.k1.a(false);
            h41Var.q0 = true;
            this.g0 = false;
        }
        h41Var.k1.setContentViewPaddingTop(i15);
        if (getPaddingTop() != i14) {
            int i16 = h41Var.t0;
            setPadding(i16, i14, i16, 0);
        }
        this.h0 = false;
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), TLObject.FLAG_30));
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
    public final void setTranslationY(float f7) {
        this.n0.k1.setTranslationY(f7);
        invalidate();
    }
}
