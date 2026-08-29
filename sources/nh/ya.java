package nh;

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
import org.telegram.ui.Components.ef0;
import org.telegram.ui.Components.h70;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class ya extends FrameLayout {
    public float a;
    public float b;
    public final Paint c;
    public LinearGradient d;
    public final /* synthetic */ gb e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ya(gb gbVar, Activity activity) {
        super(activity);
        this.e = gbVar;
        this.c = new Paint(1);
    }

    public static void a(View view, int i10, int i11) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30));
    }

    public final void b(float f9) {
        float f10 = this.a;
        this.b = f9;
        super.setTranslationY(f10 + f9);
    }

    public final void c() {
        if (this.e.F == 0) {
            setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(12.0f), -16777216));
        } else {
            setBackground(null);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        boolean drawChild = super.drawChild(canvas, view, j10);
        gb gbVar = this.e;
        if (view == gbVar.d0) {
            float f9 = gbVar.R ? AndroidUtilities.statusBarHeight : 0.0f;
            LinearGradient linearGradient = this.d;
            Paint paint = this.c;
            if (linearGradient == null) {
                LinearGradient linearGradient2 = new LinearGradient(0.0f, f9, 0.0f, f9 + AndroidUtilities.dp(72.0f), new int[]{TLObject.FLAG_30, 0}, new float[]{f9 / (AndroidUtilities.dp(72.0f) + f9), 1.0f}, Shader.TileMode.CLAMP);
                this.d = linearGradient2;
                paint.setShader(linearGradient2);
            }
            paint.setAlpha(255);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, getWidth(), AndroidUtilities.dp(84.0f) + f9);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), paint);
        }
        return drawChild;
    }

    @Override // android.view.View
    public final void invalidate() {
        ValueAnimator valueAnimator = this.e.A;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            super.invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        gb gbVar = this.e;
        int i14 = gbVar.R ? gbVar.V : 0;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        gbVar.d0.layout(0, 0, gbVar.O, gbVar.P);
        gbVar.d0.setPivotX(gbVar.O * 0.5f);
        FrameLayout frameLayout = gbVar.e0;
        frameLayout.layout(0, i14, gbVar.O, frameLayout.getMeasuredHeight() + i14);
        FrameLayout frameLayout2 = gbVar.g0;
        frameLayout2.layout(0, gbVar.P - frameLayout2.getMeasuredHeight(), gbVar.O, gbVar.P);
        FrameLayout frameLayout3 = gbVar.i0;
        int i15 = gbVar.P;
        frameLayout3.layout(0, i15, gbVar.O, frameLayout3.getMeasuredHeight() + i15);
        gbVar.h0.layout(0, 0, gbVar.O, gbVar.P);
        cg.h0 h0Var = gbVar.p0;
        if (h0Var != null) {
            h0Var.layout(0, 0, measuredWidth, measuredHeight);
        }
        gbVar.s.c.layout(0, 0, measuredWidth, measuredHeight);
        i iVar = gbVar.Y0.I;
        if (iVar != null) {
            iVar.layout(0, 0, gbVar.O, gbVar.P);
            gbVar.Y0.y();
        }
        ef0 ef0Var = gbVar.x1;
        if (ef0Var != null) {
            ef0Var.layout(0, 0, ef0Var.getMeasuredWidth(), gbVar.x1.getMeasuredHeight());
        }
        ja jaVar = gbVar.r1;
        if (jaVar != null) {
            jaVar.layout(0, 0, jaVar.getMeasuredWidth(), gbVar.r1.getMeasuredHeight());
        }
        for (int i16 = 0; i16 < getChildCount(); i16++) {
            View childAt = getChildAt(i16);
            if (childAt instanceof h70) {
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
        gb gbVar = this.e;
        a(gbVar.d0, gbVar.O, gbVar.P);
        gbVar.j();
        a(gbVar.e0, gbVar.O, AndroidUtilities.dp(150.0f));
        a(gbVar.g0, gbVar.O, AndroidUtilities.dp(220.0f));
        a(gbVar.i0, gbVar.O, gbVar.Q);
        a(gbVar.h0, gbVar.O, gbVar.P);
        a(gbVar.s.c, size, size2);
        cg.h0 h0Var = gbVar.p0;
        if (h0Var != null) {
            a(h0Var, size, size2);
        }
        i iVar = gbVar.Y0.I;
        if (iVar != null) {
            a(iVar, gbVar.O, gbVar.P);
        }
        ef0 ef0Var = gbVar.x1;
        if (ef0Var != null) {
            a(ef0Var, size, size2);
        }
        ja jaVar = gbVar.r1;
        if (jaVar != null) {
            a(jaVar, size, size2);
        }
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            if (childAt instanceof h70) {
                a(childAt, size, size2);
            }
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    public final void setTranslationY(float f9) {
        this.a = f9;
        super.setTranslationY(this.b + f9);
        float clamp = Utilities.clamp((f9 / getMeasuredHeight()) * 4.0f, 1.0f, 0.0f);
        gb gbVar = this.e;
        gbVar.G = clamp;
        gbVar.o();
        gbVar.n.invalidate();
        float clamp2 = 1.0f - (Utilities.clamp(getTranslationY() / AndroidUtilities.dp(320.0f), 1.0f, 0.0f) * 0.1f);
        setScaleX(clamp2);
        setScaleY(clamp2);
    }
}
