package hi;

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
import org.telegram.messenger.ks;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.de0;
import org.telegram.ui.Components.u60;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class la extends FrameLayout {
    public float a;
    public float b;
    public final Paint c;
    public LinearGradient d;
    public final /* synthetic */ ta e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public la(ta taVar, Activity activity) {
        super(activity);
        this.e = taVar;
        this.c = new Paint(1);
    }

    public static void a(View view, int i7, int i10) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i7, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_30));
    }

    public final void b(float f10) {
        float f11 = this.a;
        this.b = f10;
        super.setTranslationY(f11 + f10);
    }

    public final void c() {
        if (this.e.K == 0) {
            setBackground(org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(12.0f), -16777216));
        } else {
            setBackground(null);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        boolean drawChild = super.drawChild(canvas, view, j3);
        ta taVar = this.e;
        if (view == taVar.i0) {
            float f10 = taVar.W ? org.telegram.messenger.g0.m : 0.0f;
            LinearGradient linearGradient = this.d;
            Paint paint = this.c;
            if (linearGradient == null) {
                LinearGradient linearGradient2 = new LinearGradient(0.0f, f10, 0.0f, f10 + org.telegram.messenger.g0.L(72.0f), new int[]{TLObject.FLAG_30, 0}, new float[]{f10 / (org.telegram.messenger.g0.L(72.0f) + f10), 1.0f}, Shader.TileMode.CLAMP);
                this.d = linearGradient2;
                paint.setShader(linearGradient2);
            }
            paint.setAlpha(ks.e4);
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
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        ta taVar = this.e;
        int i13 = taVar.W ? taVar.a0 : 0;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        taVar.i0.layout(0, 0, taVar.T, taVar.U);
        taVar.i0.setPivotX(taVar.T * 0.5f);
        FrameLayout frameLayout = taVar.j0;
        frameLayout.layout(0, i13, taVar.T, frameLayout.getMeasuredHeight() + i13);
        FrameLayout frameLayout2 = taVar.l0;
        frameLayout2.layout(0, taVar.U - frameLayout2.getMeasuredHeight(), taVar.T, taVar.U);
        FrameLayout frameLayout3 = taVar.n0;
        int i14 = taVar.U;
        frameLayout3.layout(0, i14, taVar.T, frameLayout3.getMeasuredHeight() + i14);
        taVar.m0.layout(0, 0, taVar.T, taVar.U);
        bi.i3 i3Var = taVar.u0;
        if (i3Var != null) {
            i3Var.layout(0, 0, measuredWidth, measuredHeight);
        }
        taVar.s.c.layout(0, 0, measuredWidth, measuredHeight);
        i iVar = taVar.d1.N;
        if (iVar != null) {
            iVar.layout(0, 0, taVar.T, taVar.U);
            taVar.d1.y();
        }
        de0 de0Var = taVar.C1;
        if (de0Var != null) {
            de0Var.layout(0, 0, de0Var.getMeasuredWidth(), taVar.C1.getMeasuredHeight());
        }
        v9 v9Var = taVar.w1;
        if (v9Var != null) {
            v9Var.layout(0, 0, v9Var.getMeasuredWidth(), taVar.w1.getMeasuredHeight());
        }
        for (int i15 = 0; i15 < getChildCount(); i15++) {
            View childAt = getChildAt(i15);
            if (childAt instanceof u60) {
                childAt.layout(0, 0, measuredWidth, measuredHeight);
            }
        }
        setPivotX(measuredWidth / 2.0f);
        setPivotY((-measuredHeight) * 0.2f);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        ta taVar = this.e;
        a(taVar.i0, taVar.T, taVar.U);
        taVar.i();
        a(taVar.j0, taVar.T, org.telegram.messenger.g0.L(150.0f));
        a(taVar.l0, taVar.T, org.telegram.messenger.g0.L(220.0f));
        a(taVar.n0, taVar.T, taVar.V);
        a(taVar.m0, taVar.T, taVar.U);
        a(taVar.s.c, size, size2);
        bi.i3 i3Var = taVar.u0;
        if (i3Var != null) {
            a(i3Var, size, size2);
        }
        i iVar = taVar.d1.N;
        if (iVar != null) {
            a(iVar, taVar.T, taVar.U);
        }
        de0 de0Var = taVar.C1;
        if (de0Var != null) {
            a(de0Var, size, size2);
        }
        v9 v9Var = taVar.w1;
        if (v9Var != null) {
            a(v9Var, size, size2);
        }
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof u60) {
                a(childAt, size, size2);
            }
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        this.a = f10;
        super.setTranslationY(this.b + f10);
        float i7 = Utilities.i((f10 / getMeasuredHeight()) * 4.0f, 1.0f, 0.0f);
        ta taVar = this.e;
        taVar.L = i7;
        taVar.n();
        taVar.n.invalidate();
        float i10 = 1.0f - (Utilities.i(getTranslationY() / org.telegram.messenger.g0.L(320.0f), 1.0f, 0.0f) * 0.1f);
        setScaleX(i10);
        setScaleY(i10);
    }
}
