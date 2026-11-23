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
import org.telegram.ui.Components.t60;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class fb extends FrameLayout {
    public float a;
    public float b;
    public final Paint c;
    public LinearGradient d;
    public final /* synthetic */ nb e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fb(nb nbVar, Activity activity) {
        super(activity);
        this.e = nbVar;
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
        nb nbVar = this.e;
        if (view == nbVar.i0) {
            float f10 = nbVar.W ? org.telegram.messenger.g0.m : 0.0f;
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
        nb nbVar = this.e;
        int i13 = nbVar.W ? nbVar.a0 : 0;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        nbVar.i0.layout(0, 0, nbVar.T, nbVar.U);
        nbVar.i0.setPivotX(nbVar.T * 0.5f);
        FrameLayout frameLayout = nbVar.j0;
        frameLayout.layout(0, i13, nbVar.T, frameLayout.getMeasuredHeight() + i13);
        FrameLayout frameLayout2 = nbVar.l0;
        frameLayout2.layout(0, nbVar.U - frameLayout2.getMeasuredHeight(), nbVar.T, nbVar.U);
        FrameLayout frameLayout3 = nbVar.n0;
        int i14 = nbVar.U;
        frameLayout3.layout(0, i14, nbVar.T, frameLayout3.getMeasuredHeight() + i14);
        nbVar.m0.layout(0, 0, nbVar.T, nbVar.U);
        bi.o3 o3Var = nbVar.u0;
        if (o3Var != null) {
            o3Var.layout(0, 0, measuredWidth, measuredHeight);
        }
        nbVar.s.c.layout(0, 0, measuredWidth, measuredHeight);
        j jVar = nbVar.d1.N;
        if (jVar != null) {
            jVar.layout(0, 0, nbVar.T, nbVar.U);
            nbVar.d1.y();
        }
        de0 de0Var = nbVar.C1;
        if (de0Var != null) {
            de0Var.layout(0, 0, de0Var.getMeasuredWidth(), nbVar.C1.getMeasuredHeight());
        }
        pa paVar = nbVar.w1;
        if (paVar != null) {
            paVar.layout(0, 0, paVar.getMeasuredWidth(), nbVar.w1.getMeasuredHeight());
        }
        for (int i15 = 0; i15 < getChildCount(); i15++) {
            View childAt = getChildAt(i15);
            if (childAt instanceof t60) {
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
        nb nbVar = this.e;
        a(nbVar.i0, nbVar.T, nbVar.U);
        nbVar.i();
        a(nbVar.j0, nbVar.T, org.telegram.messenger.g0.L(150.0f));
        a(nbVar.l0, nbVar.T, org.telegram.messenger.g0.L(220.0f));
        a(nbVar.n0, nbVar.T, nbVar.V);
        a(nbVar.m0, nbVar.T, nbVar.U);
        a(nbVar.s.c, size, size2);
        bi.o3 o3Var = nbVar.u0;
        if (o3Var != null) {
            a(o3Var, size, size2);
        }
        j jVar = nbVar.d1.N;
        if (jVar != null) {
            a(jVar, nbVar.T, nbVar.U);
        }
        de0 de0Var = nbVar.C1;
        if (de0Var != null) {
            a(de0Var, size, size2);
        }
        pa paVar = nbVar.w1;
        if (paVar != null) {
            a(paVar, size, size2);
        }
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof t60) {
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
        nb nbVar = this.e;
        nbVar.L = i7;
        nbVar.n();
        nbVar.n.invalidate();
        float i10 = 1.0f - (Utilities.i(getTranslationY() / org.telegram.messenger.g0.L(320.0f), 1.0f, 0.0f) * 0.1f);
        setScaleX(i10);
        setScaleY(i10);
    }
}
