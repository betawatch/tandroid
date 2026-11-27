// default package

import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class kbb extends FrameLayout {
    public float a;
    public float b;
    public final Paint c;
    public LinearGradient d;
    public final /* synthetic */ sbb e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kbb(sbb sbbVar, Activity activity) {
        super(activity);
        this.e = sbbVar;
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
            setBackground(aob.b0(hl.L(12.0f), -16777216));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        boolean drawChild = super.drawChild(canvas, view, j);
        sbb sbbVar = this.e;
        if (view == sbbVar.i0) {
            float f = sbbVar.W ? hl.m : 0.0f;
            LinearGradient linearGradient = this.d;
            Paint paint = this.c;
            if (linearGradient == null) {
                LinearGradient linearGradient2 = new LinearGradient(0.0f, f, 0.0f, f + hl.L(72.0f), new int[]{TLObject.FLAG_30, 0}, new float[]{f / (hl.L(72.0f) + f), 1.0f}, Shader.TileMode.CLAMP);
                this.d = linearGradient2;
                paint.setShader(linearGradient2);
            }
            paint.setAlpha(jn7.d4);
            RectF rectF = hl.P;
            rectF.set(0.0f, 0.0f, getWidth(), hl.L(84.0f) + f);
            canvas.drawRoundRect(rectF, hl.L(12.0f), hl.L(12.0f), paint);
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
        sbb sbbVar = this.e;
        int i5 = sbbVar.W ? sbbVar.a0 : 0;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        sbbVar.i0.layout(0, 0, sbbVar.T, sbbVar.U);
        sbbVar.i0.setPivotX(sbbVar.T * 0.5f);
        FrameLayout frameLayout = sbbVar.j0;
        frameLayout.layout(0, i5, sbbVar.T, frameLayout.getMeasuredHeight() + i5);
        FrameLayout frameLayout2 = sbbVar.l0;
        frameLayout2.layout(0, sbbVar.U - frameLayout2.getMeasuredHeight(), sbbVar.T, sbbVar.U);
        FrameLayout frameLayout3 = sbbVar.n0;
        int i6 = sbbVar.U;
        frameLayout3.layout(0, i6, sbbVar.T, frameLayout3.getMeasuredHeight() + i6);
        sbbVar.m0.layout(0, 0, sbbVar.T, sbbVar.U);
        nf9 nf9Var = sbbVar.u0;
        if (nf9Var != null) {
            nf9Var.layout(0, 0, measuredWidth, measuredHeight);
        }
        sbbVar.s.c.layout(0, 0, measuredWidth, measuredHeight);
        mb1 mb1Var = sbbVar.d1.N;
        if (mb1Var != null) {
            mb1Var.layout(0, 0, sbbVar.T, sbbVar.U);
            sbbVar.d1.y();
        }
        c98 c98Var = sbbVar.C1;
        if (c98Var != null) {
            c98Var.layout(0, 0, c98Var.getMeasuredWidth(), sbbVar.C1.getMeasuredHeight());
        }
        wab wabVar = sbbVar.w1;
        if (wabVar != null) {
            wabVar.layout(0, 0, wabVar.getMeasuredWidth(), sbbVar.w1.getMeasuredHeight());
        }
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            if (childAt instanceof bu5) {
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
        sbb sbbVar = this.e;
        a(sbbVar.i0, sbbVar.T, sbbVar.U);
        sbbVar.g();
        a(sbbVar.j0, sbbVar.T, hl.L(150.0f));
        a(sbbVar.l0, sbbVar.T, hl.L(220.0f));
        a(sbbVar.n0, sbbVar.T, sbbVar.V);
        a(sbbVar.m0, sbbVar.T, sbbVar.U);
        a(sbbVar.s.c, size, size2);
        nf9 nf9Var = sbbVar.u0;
        if (nf9Var != null) {
            a(nf9Var, size, size2);
        }
        mb1 mb1Var = sbbVar.d1.N;
        if (mb1Var != null) {
            a(mb1Var, sbbVar.T, sbbVar.U);
        }
        c98 c98Var = sbbVar.C1;
        if (c98Var != null) {
            a(c98Var, size, size2);
        }
        wab wabVar = sbbVar.w1;
        if (wabVar != null) {
            a(wabVar, size, size2);
        }
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if (childAt instanceof bu5) {
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
        sbb sbbVar = this.e;
        sbbVar.L = i;
        sbbVar.l();
        sbbVar.n.invalidate();
        float i2 = 1.0f - (Utilities.i(getTranslationY() / hl.L(320.0f), 1.0f, 0.0f) * 0.1f);
        setScaleX(i2);
        setScaleY(i2);
    }
}
