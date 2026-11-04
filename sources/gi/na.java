package gi;

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
import org.telegram.messenger.hs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.d60;
import org.telegram.ui.Components.nd0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class na extends FrameLayout {
    public float a;
    public float b;
    public final Paint c;
    public LinearGradient d;
    public final /* synthetic */ va e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public na(va vaVar, Activity activity) {
        super(activity);
        this.e = vaVar;
        this.c = new Paint(1);
    }

    public static void a(View view, int i3, int i10) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_30));
    }

    public final void b(float f10) {
        float f11 = this.a;
        this.b = f10;
        super.setTranslationY(f11 + f10);
    }

    public final void c() {
        if (this.e.K == 0) {
            setBackground(org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(12.0f), -16777216));
        } else {
            setBackground(null);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        boolean drawChild = super.drawChild(canvas, view, j10);
        va vaVar = this.e;
        if (view == vaVar.i0) {
            float f10 = vaVar.W ? org.telegram.messenger.g0.m : 0.0f;
            LinearGradient linearGradient = this.d;
            Paint paint = this.c;
            if (linearGradient == null) {
                LinearGradient linearGradient2 = new LinearGradient(0.0f, f10, 0.0f, f10 + org.telegram.messenger.g0.L(72.0f), new int[]{TLObject.FLAG_30, 0}, new float[]{f10 / (org.telegram.messenger.g0.L(72.0f) + f10), 1.0f}, Shader.TileMode.CLAMP);
                this.d = linearGradient2;
                paint.setShader(linearGradient2);
            }
            paint.setAlpha(hs.e4);
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(0.0f, 0.0f, getWidth(), org.telegram.messenger.g0.L(84.0f) + f10);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), paint);
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
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        va vaVar = this.e;
        int i13 = vaVar.W ? vaVar.a0 : 0;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        vaVar.i0.layout(0, 0, vaVar.T, vaVar.U);
        vaVar.i0.setPivotX(vaVar.T * 0.5f);
        FrameLayout frameLayout = vaVar.j0;
        frameLayout.layout(0, i13, vaVar.T, frameLayout.getMeasuredHeight() + i13);
        FrameLayout frameLayout2 = vaVar.l0;
        frameLayout2.layout(0, vaVar.U - frameLayout2.getMeasuredHeight(), vaVar.T, vaVar.U);
        FrameLayout frameLayout3 = vaVar.n0;
        int i14 = vaVar.U;
        frameLayout3.layout(0, i14, vaVar.T, frameLayout3.getMeasuredHeight() + i14);
        vaVar.m0.layout(0, 0, vaVar.T, vaVar.U);
        ai.x2 x2Var = vaVar.u0;
        if (x2Var != null) {
            x2Var.layout(0, 0, measuredWidth, measuredHeight);
        }
        vaVar.s.c.layout(0, 0, measuredWidth, measuredHeight);
        i iVar = vaVar.d1.N;
        if (iVar != null) {
            iVar.layout(0, 0, vaVar.T, vaVar.U);
            vaVar.d1.y();
        }
        nd0 nd0Var = vaVar.C1;
        if (nd0Var != null) {
            nd0Var.layout(0, 0, nd0Var.getMeasuredWidth(), vaVar.C1.getMeasuredHeight());
        }
        x9 x9Var = vaVar.w1;
        if (x9Var != null) {
            x9Var.layout(0, 0, x9Var.getMeasuredWidth(), vaVar.w1.getMeasuredHeight());
        }
        for (int i15 = 0; i15 < getChildCount(); i15++) {
            View childAt = getChildAt(i15);
            if (childAt instanceof d60) {
                childAt.layout(0, 0, measuredWidth, measuredHeight);
            }
        }
        setPivotX(measuredWidth / 2.0f);
        setPivotY((-measuredHeight) * 0.2f);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        int size = View.MeasureSpec.getSize(i3);
        int size2 = View.MeasureSpec.getSize(i10);
        va vaVar = this.e;
        a(vaVar.i0, vaVar.T, vaVar.U);
        vaVar.i();
        a(vaVar.j0, vaVar.T, org.telegram.messenger.g0.L(150.0f));
        a(vaVar.l0, vaVar.T, org.telegram.messenger.g0.L(220.0f));
        a(vaVar.n0, vaVar.T, vaVar.V);
        a(vaVar.m0, vaVar.T, vaVar.U);
        a(vaVar.s.c, size, size2);
        ai.x2 x2Var = vaVar.u0;
        if (x2Var != null) {
            a(x2Var, size, size2);
        }
        i iVar = vaVar.d1.N;
        if (iVar != null) {
            a(iVar, vaVar.T, vaVar.U);
        }
        nd0 nd0Var = vaVar.C1;
        if (nd0Var != null) {
            a(nd0Var, size, size2);
        }
        x9 x9Var = vaVar.w1;
        if (x9Var != null) {
            a(x9Var, size, size2);
        }
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof d60) {
                a(childAt, size, size2);
            }
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        this.a = f10;
        super.setTranslationY(this.b + f10);
        float i3 = Utilities.i((f10 / getMeasuredHeight()) * 4.0f, 1.0f, 0.0f);
        va vaVar = this.e;
        vaVar.L = i3;
        vaVar.n();
        vaVar.n.invalidate();
        float i10 = 1.0f - (Utilities.i(getTranslationY() / org.telegram.messenger.g0.L(320.0f), 1.0f, 0.0f) * 0.1f);
        setScaleX(i10);
        setScaleY(i10);
    }
}
