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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class n9b extends FrameLayout {
    public float a;
    public float b;
    public final Paint c;
    public LinearGradient d;
    public final /* synthetic */ v9b e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n9b(v9b v9bVar, Activity activity) {
        super(activity);
        this.e = v9bVar;
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
            setBackground(cmb.b0(gm.L(12.0f), -16777216));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        boolean drawChild = super.drawChild(canvas, view, j);
        v9b v9bVar = this.e;
        if (view == v9bVar.i0) {
            float f = v9bVar.W ? gm.m : 0.0f;
            LinearGradient linearGradient = this.d;
            Paint paint = this.c;
            if (linearGradient == null) {
                LinearGradient linearGradient2 = new LinearGradient(0.0f, f, 0.0f, f + gm.L(72.0f), new int[]{TLObject.FLAG_30, 0}, new float[]{f / (gm.L(72.0f) + f), 1.0f}, Shader.TileMode.CLAMP);
                this.d = linearGradient2;
                paint.setShader(linearGradient2);
            }
            paint.setAlpha(nm7.d4);
            RectF rectF = gm.P;
            rectF.set(0.0f, 0.0f, getWidth(), gm.L(84.0f) + f);
            canvas.drawRoundRect(rectF, gm.L(12.0f), gm.L(12.0f), paint);
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
        v9b v9bVar = this.e;
        int i5 = v9bVar.W ? v9bVar.a0 : 0;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        v9bVar.i0.layout(0, 0, v9bVar.T, v9bVar.U);
        v9bVar.i0.setPivotX(v9bVar.T * 0.5f);
        FrameLayout frameLayout = v9bVar.j0;
        frameLayout.layout(0, i5, v9bVar.T, frameLayout.getMeasuredHeight() + i5);
        FrameLayout frameLayout2 = v9bVar.l0;
        frameLayout2.layout(0, v9bVar.U - frameLayout2.getMeasuredHeight(), v9bVar.T, v9bVar.U);
        FrameLayout frameLayout3 = v9bVar.n0;
        int i6 = v9bVar.U;
        frameLayout3.layout(0, i6, v9bVar.T, frameLayout3.getMeasuredHeight() + i6);
        v9bVar.m0.layout(0, 0, v9bVar.T, v9bVar.U);
        xd9 xd9Var = v9bVar.u0;
        if (xd9Var != null) {
            xd9Var.layout(0, 0, measuredWidth, measuredHeight);
        }
        v9bVar.s.c.layout(0, 0, measuredWidth, measuredHeight);
        lc1 lc1Var = v9bVar.d1.N;
        if (lc1Var != null) {
            lc1Var.layout(0, 0, v9bVar.T, v9bVar.U);
            v9bVar.d1.y();
        }
        n78 n78Var = v9bVar.C1;
        if (n78Var != null) {
            n78Var.layout(0, 0, n78Var.getMeasuredWidth(), v9bVar.C1.getMeasuredHeight());
        }
        z8b z8bVar = v9bVar.w1;
        if (z8bVar != null) {
            z8bVar.layout(0, 0, z8bVar.getMeasuredWidth(), v9bVar.w1.getMeasuredHeight());
        }
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            if (childAt instanceof yt5) {
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
        v9b v9bVar = this.e;
        a(v9bVar.i0, v9bVar.T, v9bVar.U);
        v9bVar.g();
        a(v9bVar.j0, v9bVar.T, gm.L(150.0f));
        a(v9bVar.l0, v9bVar.T, gm.L(220.0f));
        a(v9bVar.n0, v9bVar.T, v9bVar.V);
        a(v9bVar.m0, v9bVar.T, v9bVar.U);
        a(v9bVar.s.c, size, size2);
        xd9 xd9Var = v9bVar.u0;
        if (xd9Var != null) {
            a(xd9Var, size, size2);
        }
        lc1 lc1Var = v9bVar.d1.N;
        if (lc1Var != null) {
            a(lc1Var, v9bVar.T, v9bVar.U);
        }
        n78 n78Var = v9bVar.C1;
        if (n78Var != null) {
            a(n78Var, size, size2);
        }
        z8b z8bVar = v9bVar.w1;
        if (z8bVar != null) {
            a(z8bVar, size, size2);
        }
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if (childAt instanceof yt5) {
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
        v9b v9bVar = this.e;
        v9bVar.L = i;
        v9bVar.l();
        v9bVar.n.invalidate();
        float i2 = 1.0f - (Utilities.i(getTranslationY() / gm.L(320.0f), 1.0f, 0.0f) * 0.1f);
        setScaleX(i2);
        setScaleY(i2);
    }
}
