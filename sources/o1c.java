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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class o1c extends cja {
    public final Paint m0;
    public boolean n0;
    public boolean o0;
    public boolean p0;
    public ValueAnimator q0;
    public float r0;
    public final float[] s0;
    public boolean t0;
    public final /* synthetic */ p1c u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1c(p1c p1cVar, Context context) {
        super(context, null);
        this.u0 = p1cVar;
        this.m0 = new Paint(1);
        this.n0 = false;
        this.o0 = false;
        this.p0 = false;
        this.r0 = 0.0f;
        this.s0 = new float[8];
        setWillNotDraw(false);
        int i = p1cVar.u0;
        setPadding(i, 0, i, 0);
        setDelegate(new n1c(this));
    }

    public final float X() {
        p1c p1cVar = this.u0;
        return Math.min(1.0f, Math.max(0.0f, p1cVar.o1 / (p1cVar.l1 * 2.0f)));
    }

    @Override // cja, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        p1c p1cVar = this.u0;
        d2c d2cVar = p1cVar.n1;
        int i = p1cVar.l1;
        GradientDrawable gradientDrawable = p1cVar.m1;
        float X = X();
        boolean z = X == 0.0f && !p1cVar.J;
        byte b = 2;
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
                ofFloat.addUpdateListener(new uwb(this, b));
                this.q0.setDuration(200L);
            } else {
                valueAnimator2.setFloatValues(f, z ? 1.0f : 0.0f);
            }
            this.q0.start();
        }
        boolean z2 = this.r0 > 0.5f;
        if (this.t0 != z2) {
            this.t0 = z2;
            boolean z3 = gl.B(bkb.v0(bkb.g5, p1cVar.J0)) > 0.721f;
            boolean z4 = gl.B(bkb.v(bkb.v0(bkb.r8, p1cVar.J0), 855638016)) > 0.721f;
            if (!z2) {
                z3 = z4;
            }
            gl.o3(p1cVar.getWindow(), z3);
        }
        if (this.r0 > 0.0f) {
            int v0 = bkb.v0(bkb.g5, p1cVar.J0);
            Paint paint = this.m0;
            paint.setColor(v0);
            float max = (int) Math.max(0.0f, d2cVar.getTranslationY() + (gl.m - i) + ((1.0f - X()) * i) + p1cVar.o1 + gl.L(24.0f));
            canvas2 = canvas;
            canvas2.drawRect(p1cVar.u0, gl.U1(this.r0, r1, -gl.m), getMeasuredWidth() - p1cVar.u0, max, paint);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas);
        canvas2.save();
        canvas2.translate(0.0f, (d2cVar.getTranslationY() + gl.m) - i);
        int L = gl.L(36.0f);
        int L2 = gl.L(4.0f);
        int i2 = (int) ((1.0f - X) * L2 * 2.0f);
        gradientDrawable.setCornerRadius(gl.L(2.0f));
        gradientDrawable.setColor(bm2.o(bkb.v0(bkb.yj, p1cVar.J0), (int) (Color.alpha(r5) * X)));
        gradientDrawable.setBounds((getWidth() - L) / 2, de9.w(10.0f, p1cVar.o1, i2), (getWidth() + L) / 2, gl.L(10.0f) + p1cVar.o1 + i2 + L2);
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
        gl.e3(new cib(this, (byte) 18), 200L);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        p1c p1cVar = this.u0;
        GradientDrawable gradientDrawable = p1cVar.m1;
        d2c d2cVar = p1cVar.n1;
        if (d2cVar.c()) {
            p1cVar.o1 = d2cVar.getContentTopOffset();
            p1cVar.b.invalidate();
        }
        super.onDraw(canvas);
        float X = X();
        int i = p1cVar.l1;
        int i2 = (int) ((1.0f - X) * i);
        int i3 = gl.m - i;
        canvas.save();
        canvas.translate(0.0f, d2cVar.getTranslationY() + i3);
        p1cVar.s0.setBounds(0, (p1cVar.o1 - p1cVar.t0) + i2, getMeasuredWidth(), getMeasuredHeight() + (i3 < 0 ? -i3 : 0));
        p1cVar.s0.draw(canvas);
        if (X > 0.0f && X < 1.0f) {
            float L = gl.L(12.0f) * X;
            gradientDrawable.setColor(bkb.v0(bkb.g5, p1cVar.J0));
            float[] fArr = this.s0;
            fArr[3] = L;
            fArr[2] = L;
            fArr[1] = L;
            fArr[0] = L;
            gradientDrawable.setCornerRadii(fArr);
            gradientDrawable.setBounds(p1cVar.u0, p1cVar.o1 + i2, getWidth() - p1cVar.u0, gl.L(24.0f) + p1cVar.o1 + i2);
            gradientDrawable.draw(canvas);
        }
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            p1c p1cVar = this.u0;
            if (p1cVar.o1 != 0 && motionEvent.getY() < p1cVar.o1) {
                p1cVar.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // cja, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = gl.m;
        int size = View.MeasureSpec.getSize(getMeasuredHeight()) - i5;
        int Q = Q();
        int i6 = (int) ((size + Q) * 0.2f);
        this.o0 = true;
        int L = gl.L(20.0f);
        p1c p1cVar = this.u0;
        d2c d2cVar = p1cVar.n1;
        if (Q > L) {
            d2cVar.a(true);
            p1cVar.r0 = false;
            this.n0 = true;
        } else {
            d2cVar.a(false);
            p1cVar.r0 = true;
            this.n0 = false;
        }
        d2cVar.setContentViewPaddingTop(i6);
        if (getPaddingTop() != i5) {
            int i7 = p1cVar.u0;
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
