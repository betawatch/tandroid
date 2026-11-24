// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class l7b extends FrameLayout {
    public float a;
    public float b;
    public final Paint c;
    public LinearGradient d;
    public final /* synthetic */ t7b e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l7b(t7b t7bVar, Context context) {
        super(context);
        this.e = t7bVar;
        this.c = new Paint(1);
    }

    public static void a(View view, int i, int i2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i2, TLObject.FLAG_30));
    }

    public final void b(float f) {
        float f2 = this.a;
        this.b = f;
        super.setTranslationY(f2 + f);
    }

    public final void c() {
        if (this.e.K) {
            setBackground(null);
        } else {
            setBackground(bkb.b0(gl.L(12.0f), -16777216));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        boolean drawChild = super.drawChild(canvas, view, j);
        t7b t7bVar = this.e;
        if (view == t7bVar.i0) {
            float f = t7bVar.W ? gl.m : 0.0f;
            LinearGradient linearGradient = this.d;
            Paint paint = this.c;
            if (linearGradient == null) {
                LinearGradient linearGradient2 = new LinearGradient(0.0f, f, 0.0f, f + gl.L(72.0f), new int[]{TLObject.FLAG_30, 0}, new float[]{f / (gl.L(72.0f) + f), 1.0f}, Shader.TileMode.CLAMP);
                this.d = linearGradient2;
                paint.setShader(linearGradient2);
            }
            paint.setAlpha(kk7.d4);
            RectF rectF = gl.P;
            rectF.set(0.0f, 0.0f, getWidth(), gl.L(84.0f) + f);
            canvas.drawRoundRect(rectF, gl.L(12.0f), gl.L(12.0f), paint);
        }
        return drawChild;
    }

    @Override // android.view.View
    public final void invalidate() {
        ValueAnimator valueAnimator = this.e.F;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            super.invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        t7b t7bVar = this.e;
        int i5 = t7bVar.W ? t7bVar.a0 : 0;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        t7bVar.i0.layout(0, 0, t7bVar.T, t7bVar.U);
        t7bVar.i0.setPivotX(t7bVar.T * 0.5f);
        FrameLayout frameLayout = t7bVar.j0;
        frameLayout.layout(0, i5, t7bVar.T, frameLayout.getMeasuredHeight() + i5);
        FrameLayout frameLayout2 = t7bVar.l0;
        frameLayout2.layout(0, t7bVar.U - frameLayout2.getMeasuredHeight(), t7bVar.T, t7bVar.U);
        FrameLayout frameLayout3 = t7bVar.n0;
        int i6 = t7bVar.U;
        frameLayout3.layout(0, i6, t7bVar.T, frameLayout3.getMeasuredHeight() + i6);
        t7bVar.m0.layout(0, 0, t7bVar.T, t7bVar.U);
        si9 si9Var = t7bVar.u0;
        if (si9Var != null) {
            si9Var.layout(0, 0, measuredWidth, measuredHeight);
        }
        t7bVar.s.c.layout(0, 0, measuredWidth, measuredHeight);
        eb1 eb1Var = t7bVar.d1.N;
        if (eb1Var != null) {
            eb1Var.layout(0, 0, t7bVar.T, t7bVar.U);
            t7bVar.d1.y();
        }
        l58 l58Var = t7bVar.C1;
        if (l58Var != null) {
            l58Var.layout(0, 0, l58Var.getMeasuredWidth(), t7bVar.C1.getMeasuredHeight());
        }
        x6b x6bVar = t7bVar.w1;
        if (x6bVar != null) {
            x6bVar.layout(0, 0, x6bVar.getMeasuredWidth(), t7bVar.w1.getMeasuredHeight());
        }
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            if (childAt instanceof zr5) {
                childAt.layout(0, 0, measuredWidth, measuredHeight);
            }
        }
        setPivotX(measuredWidth / 2.0f);
        setPivotY((-measuredHeight) * 0.2f);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        t7b t7bVar = this.e;
        a(t7bVar.i0, t7bVar.T, t7bVar.U);
        t7bVar.g();
        a(t7bVar.j0, t7bVar.T, gl.L(150.0f));
        a(t7bVar.l0, t7bVar.T, gl.L(220.0f));
        a(t7bVar.n0, t7bVar.T, t7bVar.V);
        a(t7bVar.m0, t7bVar.T, t7bVar.U);
        a(t7bVar.s.c, size, size2);
        si9 si9Var = t7bVar.u0;
        if (si9Var != null) {
            a(si9Var, size, size2);
        }
        eb1 eb1Var = t7bVar.d1.N;
        if (eb1Var != null) {
            a(eb1Var, t7bVar.T, t7bVar.U);
        }
        l58 l58Var = t7bVar.C1;
        if (l58Var != null) {
            a(l58Var, size, size2);
        }
        x6b x6bVar = t7bVar.w1;
        if (x6bVar != null) {
            a(x6bVar, size, size2);
        }
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if (childAt instanceof zr5) {
                a(childAt, size, size2);
            }
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    public final void setTranslationY(float f) {
        this.a = f;
        super.setTranslationY(this.b + f);
        float i = Utilities.i((f / getMeasuredHeight()) * 4.0f, 1.0f, 0.0f);
        t7b t7bVar = this.e;
        t7bVar.L = i;
        t7bVar.l();
        t7bVar.n.invalidate();
        float i2 = 1.0f - (Utilities.i(getTranslationY() / gl.L(320.0f), 1.0f, 0.0f) * 0.1f);
        setScaleX(i2);
        setScaleY(i2);
    }
}
