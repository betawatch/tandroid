package ci;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.vf0;
import org.telegram.ui.Components.z70;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes4.dex */
public final class cc extends FrameLayout {
    public float a;
    public float b;
    public final Paint c;
    public LinearGradient d;
    public final /* synthetic */ kc e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cc(kc kcVar, Activity activity) {
        super(activity);
        this.e = kcVar;
        this.c = new Paint(1);
    }

    public static void a(View view, int i10, int i11) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30));
    }

    public final void b(float f7) {
        float f10 = this.a;
        this.b = f7;
        super.setTranslationY(f10 + f7);
    }

    public final void c() {
        if (this.e.J == 0) {
            setBackground(org.telegram.ui.ActionBar.i6.b0(AndroidUtilities.dp(12.0f), -16777216));
        } else {
            setBackground(null);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        boolean drawChild = super.drawChild(canvas, view, j3);
        kc kcVar = this.e;
        if (view == kcVar.h0) {
            float f7 = kcVar.V ? AndroidUtilities.statusBarHeight : 0.0f;
            LinearGradient linearGradient = this.d;
            Paint paint = this.c;
            if (linearGradient == null) {
                LinearGradient linearGradient2 = new LinearGradient(0.0f, f7, 0.0f, f7 + AndroidUtilities.dp(72.0f), new int[]{TLObject.FLAG_30, 0}, new float[]{f7 / (AndroidUtilities.dp(72.0f) + f7), 1.0f}, Shader.TileMode.CLAMP);
                this.d = linearGradient2;
                paint.setShader(linearGradient2);
            }
            paint.setAlpha(255);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, getWidth(), AndroidUtilities.dp(84.0f) + f7);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), paint);
        }
        return drawChild;
    }

    @Override // android.view.View
    public final void invalidate() {
        ValueAnimator valueAnimator = this.e.E;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            super.invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        kc kcVar = this.e;
        int i14 = kcVar.V ? kcVar.Z : 0;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        kcVar.h0.layout(0, 0, kcVar.S, kcVar.T);
        kcVar.h0.setPivotX(kcVar.S * 0.5f);
        FrameLayout frameLayout = kcVar.i0;
        frameLayout.layout(0, i14, kcVar.S, frameLayout.getMeasuredHeight() + i14);
        FrameLayout frameLayout2 = kcVar.k0;
        frameLayout2.layout(0, kcVar.T - frameLayout2.getMeasuredHeight(), kcVar.S, kcVar.T);
        FrameLayout frameLayout3 = kcVar.m0;
        int i15 = kcVar.T;
        frameLayout3.layout(0, i15, kcVar.S, frameLayout3.getMeasuredHeight() + i15);
        kcVar.l0.layout(0, 0, kcVar.S, kcVar.T);
        ab abVar = kcVar.t0;
        if (abVar != null) {
            abVar.layout(0, 0, measuredWidth, measuredHeight);
        }
        kcVar.s.c.layout(0, 0, measuredWidth, measuredHeight);
        i iVar = kcVar.c1.M;
        if (iVar != null) {
            iVar.layout(0, 0, kcVar.S, kcVar.T);
            kcVar.c1.y();
        }
        vf0 vf0Var = kcVar.B1;
        if (vf0Var != null) {
            vf0Var.layout(0, 0, vf0Var.getMeasuredWidth(), kcVar.B1.getMeasuredHeight());
        }
        mb mbVar = kcVar.v1;
        if (mbVar != null) {
            mbVar.layout(0, 0, mbVar.getMeasuredWidth(), kcVar.v1.getMeasuredHeight());
        }
        for (int i16 = 0; i16 < getChildCount(); i16++) {
            View childAt = getChildAt(i16);
            if (childAt instanceof z70) {
                childAt.layout(0, 0, measuredWidth, measuredHeight);
            }
        }
        setPivotX(measuredWidth / 2.0f);
        setPivotY((-measuredHeight) * 0.2f);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        kc kcVar = this.e;
        a(kcVar.h0, kcVar.S, kcVar.T);
        kcVar.j();
        a(kcVar.i0, kcVar.S, AndroidUtilities.dp(150.0f));
        a(kcVar.k0, kcVar.S, AndroidUtilities.dp(220.0f));
        a(kcVar.m0, kcVar.S, kcVar.U);
        a(kcVar.l0, kcVar.S, kcVar.T);
        a(kcVar.s.c, size, size2);
        ab abVar = kcVar.t0;
        if (abVar != null) {
            a(abVar, size, size2);
        }
        i iVar = kcVar.c1.M;
        if (iVar != null) {
            a(iVar, kcVar.S, kcVar.T);
        }
        vf0 vf0Var = kcVar.B1;
        if (vf0Var != null) {
            a(vf0Var, size, size2);
        }
        mb mbVar = kcVar.v1;
        if (mbVar != null) {
            a(mbVar, size, size2);
        }
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            if (childAt instanceof z70) {
                a(childAt, size, size2);
            }
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        this.a = f7;
        super.setTranslationY(this.b + f7);
        float clamp = Utilities.clamp((f7 / getMeasuredHeight()) * 4.0f, 1.0f, 0.0f);
        kc kcVar = this.e;
        kcVar.K = clamp;
        kcVar.o();
        kcVar.n.invalidate();
        float clamp2 = 1.0f - (Utilities.clamp(getTranslationY() / AndroidUtilities.dp(320.0f), 1.0f, 0.0f) * 0.1f);
        setScaleX(clamp2);
        setScaleY(clamp2);
    }
}
