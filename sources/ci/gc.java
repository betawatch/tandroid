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
import org.telegram.ui.Components.sf0;
import org.telegram.ui.Components.u70;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes4.dex */
public final class gc extends FrameLayout {
    public float a;
    public float b;
    public final Paint c;
    public LinearGradient d;
    public final /* synthetic */ oc e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gc(oc ocVar, Activity activity) {
        super(activity);
        this.e = ocVar;
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
            setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(12.0f), -16777216));
        } else {
            setBackground(null);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        boolean drawChild = super.drawChild(canvas, view, j3);
        oc ocVar = this.e;
        if (view == ocVar.h0) {
            float f7 = ocVar.V ? AndroidUtilities.statusBarHeight : 0.0f;
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
        oc ocVar = this.e;
        int i14 = ocVar.V ? ocVar.Z : 0;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        ocVar.h0.layout(0, 0, ocVar.S, ocVar.T);
        ocVar.h0.setPivotX(ocVar.S * 0.5f);
        FrameLayout frameLayout = ocVar.i0;
        frameLayout.layout(0, i14, ocVar.S, frameLayout.getMeasuredHeight() + i14);
        FrameLayout frameLayout2 = ocVar.k0;
        frameLayout2.layout(0, ocVar.T - frameLayout2.getMeasuredHeight(), ocVar.S, ocVar.T);
        FrameLayout frameLayout3 = ocVar.m0;
        int i15 = ocVar.T;
        frameLayout3.layout(0, i15, ocVar.S, frameLayout3.getMeasuredHeight() + i15);
        ocVar.l0.layout(0, 0, ocVar.S, ocVar.T);
        eb ebVar = ocVar.t0;
        if (ebVar != null) {
            ebVar.layout(0, 0, measuredWidth, measuredHeight);
        }
        ocVar.s.c.layout(0, 0, measuredWidth, measuredHeight);
        i iVar = ocVar.c1.M;
        if (iVar != null) {
            iVar.layout(0, 0, ocVar.S, ocVar.T);
            ocVar.c1.y();
        }
        sf0 sf0Var = ocVar.B1;
        if (sf0Var != null) {
            sf0Var.layout(0, 0, sf0Var.getMeasuredWidth(), ocVar.B1.getMeasuredHeight());
        }
        qb qbVar = ocVar.v1;
        if (qbVar != null) {
            qbVar.layout(0, 0, qbVar.getMeasuredWidth(), ocVar.v1.getMeasuredHeight());
        }
        for (int i16 = 0; i16 < getChildCount(); i16++) {
            View childAt = getChildAt(i16);
            if (childAt instanceof u70) {
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
        oc ocVar = this.e;
        a(ocVar.h0, ocVar.S, ocVar.T);
        ocVar.j();
        a(ocVar.i0, ocVar.S, AndroidUtilities.dp(150.0f));
        a(ocVar.k0, ocVar.S, AndroidUtilities.dp(220.0f));
        a(ocVar.m0, ocVar.S, ocVar.U);
        a(ocVar.l0, ocVar.S, ocVar.T);
        a(ocVar.s.c, size, size2);
        eb ebVar = ocVar.t0;
        if (ebVar != null) {
            a(ebVar, size, size2);
        }
        i iVar = ocVar.c1.M;
        if (iVar != null) {
            a(iVar, ocVar.S, ocVar.T);
        }
        sf0 sf0Var = ocVar.B1;
        if (sf0Var != null) {
            a(sf0Var, size, size2);
        }
        qb qbVar = ocVar.v1;
        if (qbVar != null) {
            a(qbVar, size, size2);
        }
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            if (childAt instanceof u70) {
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
        oc ocVar = this.e;
        ocVar.K = clamp;
        ocVar.o();
        ocVar.n.invalidate();
        float clamp2 = 1.0f - (Utilities.clamp(getTranslationY() / AndroidUtilities.dp(320.0f), 1.0f, 0.0f) * 0.1f);
        setScaleX(clamp2);
        setScaleY(clamp2);
    }
}
