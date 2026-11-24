// default package

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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class o3c extends ela {
    public final Paint m0;
    public boolean n0;
    public boolean o0;
    public boolean p0;
    public ValueAnimator q0;
    public float r0;
    public final float[] s0;
    public boolean t0;
    public final /* synthetic */ p3c u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3c(p3c p3cVar, Context context) {
        super(context, null);
        this.u0 = p3cVar;
        this.m0 = new Paint(1);
        this.n0 = false;
        this.o0 = false;
        this.p0 = false;
        this.r0 = 0.0f;
        this.s0 = new float[8];
        setWillNotDraw(false);
        int i = p3cVar.u0;
        setPadding(i, 0, i, 0);
        setDelegate(new n3c(this));
    }

    public final float X() {
        p3c p3cVar = this.u0;
        return Math.min(1.0f, Math.max(0.0f, p3cVar.o1 / (p3cVar.l1 * 2.0f)));
    }

    @Override // ela, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        p3c p3cVar = this.u0;
        d4c d4cVar = p3cVar.n1;
        int i = p3cVar.l1;
        GradientDrawable gradientDrawable = p3cVar.m1;
        float X = X();
        boolean z = X == 0.0f && !p3cVar.J;
        if (this.p0 != z) {
            ValueAnimator valueAnimator = this.q0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.p0 = z;
            ValueAnimator valueAnimator2 = this.q0;
            float f = this.r0;
            if (valueAnimator2 == null) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f, z ? 1.0f : 0.0f);
                this.q0 = ofFloat;
                ofFloat.addUpdateListener(new oxb(this, (byte) 4));
                this.q0.setDuration(200L);
            } else {
                valueAnimator2.setFloatValues(f, z ? 1.0f : 0.0f);
            }
            this.q0.start();
        }
        boolean z2 = this.r0 > 0.5f;
        if (this.t0 != z2) {
            this.t0 = z2;
            boolean z3 = gm.B(cmb.v0(cmb.g5, p3cVar.J0)) > 0.721f;
            boolean z4 = gm.B(cmb.v(cmb.v0(cmb.r8, p3cVar.J0), 855638016)) > 0.721f;
            if (!z2) {
                z3 = z4;
            }
            gm.n3(p3cVar.getWindow(), z3);
        }
        if (this.r0 > 0.0f) {
            int v0 = cmb.v0(cmb.g5, p3cVar.J0);
            Paint paint = this.m0;
            paint.setColor(v0);
            float max = (int) Math.max(0.0f, d4cVar.getTranslationY() + (gm.m - i) + ((1.0f - X()) * i) + p3cVar.o1 + gm.L(24.0f));
            canvas2 = canvas;
            canvas2.drawRect(p3cVar.u0, gm.U1(this.r0, r1, -gm.m), getMeasuredWidth() - p3cVar.u0, max, paint);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas);
        canvas2.save();
        canvas2.translate(0.0f, (d4cVar.getTranslationY() + gm.m) - i);
        int L = gm.L(36.0f);
        int L2 = gm.L(4.0f);
        int i2 = (int) ((1.0f - X) * L2 * 2.0f);
        gradientDrawable.setCornerRadius(gm.L(2.0f));
        gradientDrawable.setColor(on2.p(cmb.v0(cmb.yj, p3cVar.J0), (int) (Color.alpha(r5) * X)));
        gradientDrawable.setBounds((getWidth() - L) / 2, hg9.v(10.0f, p3cVar.o1, i2), (getWidth() + L) / 2, gm.L(10.0f) + p3cVar.o1 + i2 + L2);
        gradientDrawable.draw(canvas2);
        canvas2.restore();
    }

    @Override // android.view.View
    public final float getTranslationY() {
        return this.u0.n1.getTranslationY();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        gm.d3(new zcb(this, (byte) 26), 200L);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        p3c p3cVar = this.u0;
        GradientDrawable gradientDrawable = p3cVar.m1;
        d4c d4cVar = p3cVar.n1;
        if (d4cVar.c()) {
            p3cVar.o1 = d4cVar.getContentTopOffset();
            p3cVar.b.invalidate();
        }
        super.onDraw(canvas);
        float X = X();
        int i = p3cVar.l1;
        int i2 = (int) ((1.0f - X) * i);
        int i3 = gm.m - i;
        canvas.save();
        canvas.translate(0.0f, d4cVar.getTranslationY() + i3);
        p3cVar.s0.setBounds(0, (p3cVar.o1 - p3cVar.t0) + i2, getMeasuredWidth(), getMeasuredHeight() + (i3 < 0 ? -i3 : 0));
        p3cVar.s0.draw(canvas);
        if (X > 0.0f && X < 1.0f) {
            float L = gm.L(12.0f) * X;
            gradientDrawable.setColor(cmb.v0(cmb.g5, p3cVar.J0));
            float[] fArr = this.s0;
            fArr[3] = L;
            fArr[2] = L;
            fArr[1] = L;
            fArr[0] = L;
            gradientDrawable.setCornerRadii(fArr);
            gradientDrawable.setBounds(p3cVar.u0, p3cVar.o1 + i2, getWidth() - p3cVar.u0, gm.L(24.0f) + p3cVar.o1 + i2);
            gradientDrawable.draw(canvas);
        }
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            p3c p3cVar = this.u0;
            if (p3cVar.o1 != 0 && motionEvent.getY() < p3cVar.o1) {
                p3cVar.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // ela, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = gm.m;
        int size = View.MeasureSpec.getSize(getMeasuredHeight()) - i5;
        int Q = Q();
        int i6 = (int) ((size + Q) * 0.2f);
        this.o0 = true;
        int L = gm.L(20.0f);
        p3c p3cVar = this.u0;
        d4c d4cVar = p3cVar.n1;
        if (Q > L) {
            d4cVar.a(true);
            p3cVar.r0 = false;
            this.n0 = true;
        } else {
            d4cVar.a(false);
            p3cVar.r0 = true;
            this.n0 = false;
        }
        d4cVar.setContentViewPaddingTop(i6);
        if (getPaddingTop() != i5) {
            int i7 = p3cVar.u0;
            setPadding(i7, i5, i7, 0);
        }
        this.o0 = false;
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.u0.J && super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.o0) {
            return;
        }
        super.requestLayout();
    }

    @Override // android.view.View
    public final void setTranslationY(float f) {
        this.u0.n1.setTranslationY(f);
        invalidate();
    }
}
