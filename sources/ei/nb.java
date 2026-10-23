package ei;

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
import org.telegram.ui.Components.h80;
import org.telegram.ui.Components.hg0;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final class nb extends FrameLayout {
    public float a;
    public float b;
    public final Paint c;
    public LinearGradient d;
    public final /* synthetic */ vb e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nb(vb vbVar, Activity activity) {
        super(activity);
        this.e = vbVar;
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
            setBackground(org.telegram.ui.ActionBar.k6.c0(AndroidUtilities.dp(12.0f), -16777216));
        } else {
            setBackground(null);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        boolean drawChild = super.drawChild(canvas, view, j10);
        vb vbVar = this.e;
        if (view == vbVar.h0) {
            float f7 = vbVar.V ? AndroidUtilities.statusBarHeight : 0.0f;
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
        vb vbVar = this.e;
        int i14 = vbVar.V ? vbVar.Z : 0;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        vbVar.h0.layout(0, 0, vbVar.S, vbVar.T);
        vbVar.h0.setPivotX(vbVar.S * 0.5f);
        FrameLayout frameLayout = vbVar.i0;
        frameLayout.layout(0, i14, vbVar.S, frameLayout.getMeasuredHeight() + i14);
        FrameLayout frameLayout2 = vbVar.k0;
        frameLayout2.layout(0, vbVar.T - frameLayout2.getMeasuredHeight(), vbVar.S, vbVar.T);
        FrameLayout frameLayout3 = vbVar.m0;
        int i15 = vbVar.T;
        frameLayout3.layout(0, i15, vbVar.S, frameLayout3.getMeasuredHeight() + i15);
        vbVar.l0.layout(0, 0, vbVar.S, vbVar.T);
        ai.jc jcVar = vbVar.t0;
        if (jcVar != null) {
            jcVar.layout(0, 0, measuredWidth, measuredHeight);
        }
        vbVar.s.c.layout(0, 0, measuredWidth, measuredHeight);
        i iVar = vbVar.c1.M;
        if (iVar != null) {
            iVar.layout(0, 0, vbVar.S, vbVar.T);
            vbVar.c1.y();
        }
        hg0 hg0Var = vbVar.B1;
        if (hg0Var != null) {
            hg0Var.layout(0, 0, hg0Var.getMeasuredWidth(), vbVar.B1.getMeasuredHeight());
        }
        xa xaVar = vbVar.v1;
        if (xaVar != null) {
            xaVar.layout(0, 0, xaVar.getMeasuredWidth(), vbVar.v1.getMeasuredHeight());
        }
        for (int i16 = 0; i16 < getChildCount(); i16++) {
            View childAt = getChildAt(i16);
            if (childAt instanceof h80) {
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
        vb vbVar = this.e;
        a(vbVar.h0, vbVar.S, vbVar.T);
        vbVar.i();
        a(vbVar.i0, vbVar.S, AndroidUtilities.dp(150.0f));
        a(vbVar.k0, vbVar.S, AndroidUtilities.dp(220.0f));
        a(vbVar.m0, vbVar.S, vbVar.U);
        a(vbVar.l0, vbVar.S, vbVar.T);
        a(vbVar.s.c, size, size2);
        ai.jc jcVar = vbVar.t0;
        if (jcVar != null) {
            a(jcVar, size, size2);
        }
        i iVar = vbVar.c1.M;
        if (iVar != null) {
            a(iVar, vbVar.S, vbVar.T);
        }
        hg0 hg0Var = vbVar.B1;
        if (hg0Var != null) {
            a(hg0Var, size, size2);
        }
        xa xaVar = vbVar.v1;
        if (xaVar != null) {
            a(xaVar, size, size2);
        }
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            if (childAt instanceof h80) {
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
        vb vbVar = this.e;
        vbVar.K = clamp;
        vbVar.n();
        vbVar.n.invalidate();
        float clamp2 = 1.0f - (Utilities.clamp(getTranslationY() / AndroidUtilities.dp(320.0f), 1.0f, 0.0f) * 0.1f);
        setScaleX(clamp2);
        setScaleY(clamp2);
    }
}
