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

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class n5c extends wma {
    public final Paint g0;
    public boolean h0;
    public boolean i0;
    public boolean j0;
    public ValueAnimator k0;
    public float l0;
    public final float[] m0;
    public boolean n0;
    public final /* synthetic */ o5c o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5c(o5c o5cVar, Context context) {
        super(context, null);
        this.o0 = o5cVar;
        this.g0 = new Paint(1);
        this.h0 = false;
        this.i0 = false;
        this.j0 = false;
        this.l0 = 0.0f;
        this.m0 = new float[8];
        setWillNotDraw(false);
        int i = o5cVar.u0;
        setPadding(i, 0, i, 0);
        setDelegate(new m5c(this));
    }

    public final float X() {
        o5c o5cVar = this.o0;
        return Math.min(1.0f, Math.max(0.0f, o5cVar.o1 / (o5cVar.l1 * 2.0f)));
    }

    @Override // wma, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        o5c o5cVar = this.o0;
        d6c d6cVar = o5cVar.n1;
        int i = o5cVar.l1;
        GradientDrawable gradientDrawable = o5cVar.m1;
        float X = X();
        boolean z = X == 0.0f && !o5cVar.J;
        if (this.j0 != z) {
            ValueAnimator valueAnimator = this.k0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.j0 = z;
            ValueAnimator valueAnimator2 = this.k0;
            float f = this.l0;
            if (valueAnimator2 == null) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f, z ? 1.0f : 0.0f);
                this.k0 = ofFloat;
                ofFloat.addUpdateListener(new pzb(this, (byte) 4));
                this.k0.setDuration(200L);
            } else {
                valueAnimator2.setFloatValues(f, z ? 1.0f : 0.0f);
            }
            this.k0.start();
        }
        boolean z2 = this.l0 > 0.5f;
        if (this.n0 != z2) {
            this.n0 = z2;
            boolean z3 = hl.B(aob.v0(aob.h5, o5cVar.J0)) > 0.721f;
            boolean z4 = hl.B(aob.v(aob.v0(aob.s8, o5cVar.J0), 855638016)) > 0.721f;
            if (!z2) {
                z3 = z4;
            }
            hl.n3(o5cVar.getWindow(), z3);
        }
        if (this.l0 > 0.0f) {
            int v0 = aob.v0(aob.h5, o5cVar.J0);
            Paint paint = this.g0;
            paint.setColor(v0);
            float max = (int) Math.max(0.0f, d6cVar.getTranslationY() + (hl.m - i) + ((1.0f - X()) * i) + o5cVar.o1 + hl.L(24.0f));
            canvas2 = canvas;
            canvas2.drawRect(o5cVar.u0, hl.U1(this.l0, r1, -hl.m), getMeasuredWidth() - o5cVar.u0, max, paint);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas);
        canvas2.save();
        canvas2.translate(0.0f, (d6cVar.getTranslationY() + hl.m) - i);
        int L = hl.L(36.0f);
        int L2 = hl.L(4.0f);
        int i2 = (int) ((1.0f - X) * L2 * 2.0f);
        gradientDrawable.setCornerRadius(hl.L(2.0f));
        gradientDrawable.setColor(vm2.o(aob.v0(aob.zj, o5cVar.J0), (int) (Color.alpha(r5) * X)));
        gradientDrawable.setBounds((getWidth() - L) / 2, uh9.w(10.0f, o5cVar.o1, i2), (getWidth() + L) / 2, hl.L(10.0f) + o5cVar.o1 + i2 + L2);
        gradientDrawable.draw(canvas2);
        canvas2.restore();
    }

    @Override // android.view.View
    public final float getTranslationY() {
        return this.o0.n1.getTranslationY();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        hl.d3(new azb(this, (byte) 5), 200L);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        o5c o5cVar = this.o0;
        GradientDrawable gradientDrawable = o5cVar.m1;
        d6c d6cVar = o5cVar.n1;
        if (d6cVar.c()) {
            o5cVar.o1 = d6cVar.getContentTopOffset();
            o5cVar.b.invalidate();
        }
        super.onDraw(canvas);
        float X = X();
        int i = o5cVar.l1;
        int i2 = (int) ((1.0f - X) * i);
        int i3 = hl.m - i;
        canvas.save();
        canvas.translate(0.0f, d6cVar.getTranslationY() + i3);
        o5cVar.s0.setBounds(0, (o5cVar.o1 - o5cVar.t0) + i2, getMeasuredWidth(), getMeasuredHeight() + (i3 < 0 ? -i3 : 0));
        o5cVar.s0.draw(canvas);
        if (X > 0.0f && X < 1.0f) {
            float L = hl.L(12.0f) * X;
            gradientDrawable.setColor(aob.v0(aob.h5, o5cVar.J0));
            float[] fArr = this.m0;
            fArr[3] = L;
            fArr[2] = L;
            fArr[1] = L;
            fArr[0] = L;
            gradientDrawable.setCornerRadii(fArr);
            gradientDrawable.setBounds(o5cVar.u0, o5cVar.o1 + i2, getWidth() - o5cVar.u0, hl.L(24.0f) + o5cVar.o1 + i2);
            gradientDrawable.draw(canvas);
        }
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            o5c o5cVar = this.o0;
            if (o5cVar.o1 != 0 && motionEvent.getY() < o5cVar.o1) {
                o5cVar.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // wma, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = hl.m;
        int size = View.MeasureSpec.getSize(getMeasuredHeight()) - i5;
        int Q = Q();
        int i6 = (int) ((size + Q) * 0.2f);
        this.i0 = true;
        int L = hl.L(20.0f);
        o5c o5cVar = this.o0;
        d6c d6cVar = o5cVar.n1;
        if (Q > L) {
            d6cVar.a(true);
            o5cVar.r0 = false;
            this.h0 = true;
        } else {
            d6cVar.a(false);
            o5cVar.r0 = true;
            this.h0 = false;
        }
        d6cVar.setContentViewPaddingTop(i6);
        if (getPaddingTop() != i5) {
            int i7 = o5cVar.u0;
            setPadding(i7, i5, i7, 0);
        }
        this.i0 = false;
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), TLObject.FLAG_30));
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
    public final void setTranslationY(float f) {
        this.o0.n1.setTranslationY(f);
        invalidate();
    }
}
