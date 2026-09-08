package di;

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
import org.telegram.ui.Components.jf0;
import org.telegram.ui.Components.l70;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class hc extends FrameLayout {
    public float a;
    public float b;
    public final Paint c;
    public LinearGradient d;
    public final /* synthetic */ pc e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hc(pc pcVar, Activity activity) {
        super(activity);
        this.e = pcVar;
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
        pc pcVar = this.e;
        if (view == pcVar.h0) {
            float f7 = pcVar.V ? AndroidUtilities.statusBarHeight : 0.0f;
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
        pc pcVar = this.e;
        int i14 = pcVar.V ? pcVar.Z : 0;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        pcVar.h0.layout(0, 0, pcVar.S, pcVar.T);
        pcVar.h0.setPivotX(pcVar.S * 0.5f);
        FrameLayout frameLayout = pcVar.i0;
        frameLayout.layout(0, i14, pcVar.S, frameLayout.getMeasuredHeight() + i14);
        FrameLayout frameLayout2 = pcVar.k0;
        frameLayout2.layout(0, pcVar.T - frameLayout2.getMeasuredHeight(), pcVar.S, pcVar.T);
        FrameLayout frameLayout3 = pcVar.m0;
        int i15 = pcVar.T;
        frameLayout3.layout(0, i15, pcVar.S, frameLayout3.getMeasuredHeight() + i15);
        pcVar.l0.layout(0, 0, pcVar.S, pcVar.T);
        eb ebVar = pcVar.t0;
        if (ebVar != null) {
            ebVar.layout(0, 0, measuredWidth, measuredHeight);
        }
        pcVar.s.c.layout(0, 0, measuredWidth, measuredHeight);
        i iVar = pcVar.c1.M;
        if (iVar != null) {
            iVar.layout(0, 0, pcVar.S, pcVar.T);
            pcVar.c1.y();
        }
        jf0 jf0Var = pcVar.B1;
        if (jf0Var != null) {
            jf0Var.layout(0, 0, jf0Var.getMeasuredWidth(), pcVar.B1.getMeasuredHeight());
        }
        rb rbVar = pcVar.v1;
        if (rbVar != null) {
            rbVar.layout(0, 0, rbVar.getMeasuredWidth(), pcVar.v1.getMeasuredHeight());
        }
        for (int i16 = 0; i16 < getChildCount(); i16++) {
            View childAt = getChildAt(i16);
            if (childAt instanceof l70) {
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
        pc pcVar = this.e;
        a(pcVar.h0, pcVar.S, pcVar.T);
        pcVar.j();
        a(pcVar.i0, pcVar.S, AndroidUtilities.dp(150.0f));
        a(pcVar.k0, pcVar.S, AndroidUtilities.dp(220.0f));
        a(pcVar.m0, pcVar.S, pcVar.U);
        a(pcVar.l0, pcVar.S, pcVar.T);
        a(pcVar.s.c, size, size2);
        eb ebVar = pcVar.t0;
        if (ebVar != null) {
            a(ebVar, size, size2);
        }
        i iVar = pcVar.c1.M;
        if (iVar != null) {
            a(iVar, pcVar.S, pcVar.T);
        }
        jf0 jf0Var = pcVar.B1;
        if (jf0Var != null) {
            a(jf0Var, size, size2);
        }
        rb rbVar = pcVar.v1;
        if (rbVar != null) {
            a(rbVar, size, size2);
        }
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            if (childAt instanceof l70) {
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
        pc pcVar = this.e;
        pcVar.K = clamp;
        pcVar.o();
        pcVar.n.invalidate();
        float clamp2 = 1.0f - (Utilities.clamp(getTranslationY() / AndroidUtilities.dp(320.0f), 1.0f, 0.0f) * 0.1f);
        setScaleX(clamp2);
        setScaleY(clamp2);
    }
}
