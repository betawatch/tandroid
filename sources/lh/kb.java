package lh;

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
import org.telegram.ui.Components.ve0;
import org.telegram.ui.Components.z60;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class kb extends FrameLayout {
    public float a;
    public float b;
    public final Paint c;
    public LinearGradient d;
    public final /* synthetic */ sb e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kb(sb sbVar, Activity activity) {
        super(activity);
        this.e = sbVar;
        this.c = new Paint(1);
    }

    public static void a(View view, int i10, int i11) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30));
    }

    public final void b(float f10) {
        float f11 = this.a;
        this.b = f10;
        super.setTranslationY(f11 + f10);
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
        sb sbVar = this.e;
        if (view == sbVar.d0) {
            float f10 = sbVar.R ? AndroidUtilities.statusBarHeight : 0.0f;
            LinearGradient linearGradient = this.d;
            Paint paint = this.c;
            if (linearGradient == null) {
                LinearGradient linearGradient2 = new LinearGradient(0.0f, f10, 0.0f, f10 + AndroidUtilities.dp(72.0f), new int[]{TLObject.FLAG_30, 0}, new float[]{f10 / (AndroidUtilities.dp(72.0f) + f10), 1.0f}, Shader.TileMode.CLAMP);
                this.d = linearGradient2;
                paint.setShader(linearGradient2);
            }
            paint.setAlpha(255);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, getWidth(), AndroidUtilities.dp(84.0f) + f10);
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
        sb sbVar = this.e;
        int i14 = sbVar.R ? sbVar.V : 0;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        sbVar.d0.layout(0, 0, sbVar.O, sbVar.P);
        sbVar.d0.setPivotX(sbVar.O * 0.5f);
        FrameLayout frameLayout = sbVar.e0;
        frameLayout.layout(0, i14, sbVar.O, frameLayout.getMeasuredHeight() + i14);
        FrameLayout frameLayout2 = sbVar.g0;
        frameLayout2.layout(0, sbVar.P - frameLayout2.getMeasuredHeight(), sbVar.O, sbVar.P);
        FrameLayout frameLayout3 = sbVar.i0;
        int i15 = sbVar.P;
        frameLayout3.layout(0, i15, sbVar.O, frameLayout3.getMeasuredHeight() + i15);
        sbVar.h0.layout(0, 0, sbVar.O, sbVar.P);
        ag.s0 s0Var = sbVar.p0;
        if (s0Var != null) {
            s0Var.layout(0, 0, measuredWidth, measuredHeight);
        }
        sbVar.s.c.layout(0, 0, measuredWidth, measuredHeight);
        i iVar = sbVar.Y0.I;
        if (iVar != null) {
            iVar.layout(0, 0, sbVar.O, sbVar.P);
            sbVar.Y0.y();
        }
        ve0 ve0Var = sbVar.x1;
        if (ve0Var != null) {
            ve0Var.layout(0, 0, ve0Var.getMeasuredWidth(), sbVar.x1.getMeasuredHeight());
        }
        va vaVar = sbVar.r1;
        if (vaVar != null) {
            vaVar.layout(0, 0, vaVar.getMeasuredWidth(), sbVar.r1.getMeasuredHeight());
        }
        for (int i16 = 0; i16 < getChildCount(); i16++) {
            View childAt = getChildAt(i16);
            if (childAt instanceof z60) {
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
        sb sbVar = this.e;
        a(sbVar.d0, sbVar.O, sbVar.P);
        sbVar.j();
        a(sbVar.e0, sbVar.O, AndroidUtilities.dp(150.0f));
        a(sbVar.g0, sbVar.O, AndroidUtilities.dp(220.0f));
        a(sbVar.i0, sbVar.O, sbVar.Q);
        a(sbVar.h0, sbVar.O, sbVar.P);
        a(sbVar.s.c, size, size2);
        ag.s0 s0Var = sbVar.p0;
        if (s0Var != null) {
            a(s0Var, size, size2);
        }
        i iVar = sbVar.Y0.I;
        if (iVar != null) {
            a(iVar, sbVar.O, sbVar.P);
        }
        ve0 ve0Var = sbVar.x1;
        if (ve0Var != null) {
            a(ve0Var, size, size2);
        }
        va vaVar = sbVar.r1;
        if (vaVar != null) {
            a(vaVar, size, size2);
        }
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            if (childAt instanceof z60) {
                a(childAt, size, size2);
            }
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        this.a = f10;
        super.setTranslationY(this.b + f10);
        float clamp = Utilities.clamp((f10 / getMeasuredHeight()) * 4.0f, 1.0f, 0.0f);
        sb sbVar = this.e;
        sbVar.G = clamp;
        sbVar.o();
        sbVar.n.invalidate();
        float clamp2 = 1.0f - (Utilities.clamp(getTranslationY() / AndroidUtilities.dp(320.0f), 1.0f, 0.0f) * 0.1f);
        setScaleX(clamp2);
        setScaleY(clamp2);
    }
}
