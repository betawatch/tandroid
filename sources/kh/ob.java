package kh;

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
import org.telegram.ui.Components.qe0;
import org.telegram.ui.Components.v60;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class ob extends FrameLayout {
    public float a;
    public float b;
    public final Paint c;
    public LinearGradient d;
    public final /* synthetic */ wb e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ob(wb wbVar, Activity activity) {
        super(activity);
        this.e = wbVar;
        this.c = new Paint(1);
    }

    public static void a(View view, int i9, int i10) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i9, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_30));
    }

    public final void b(float f10) {
        float f11 = this.a;
        this.b = f10;
        super.setTranslationY(f11 + f10);
    }

    public final void c() {
        if (this.e.F == 0) {
            setBackground(org.telegram.ui.ActionBar.f6.b0(AndroidUtilities.dp(12.0f), -16777216));
        } else {
            setBackground(null);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        boolean drawChild = super.drawChild(canvas, view, j10);
        wb wbVar = this.e;
        if (view == wbVar.d0) {
            float f10 = wbVar.R ? AndroidUtilities.statusBarHeight : 0.0f;
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
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        wb wbVar = this.e;
        int i13 = wbVar.R ? wbVar.V : 0;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        wbVar.d0.layout(0, 0, wbVar.O, wbVar.P);
        wbVar.d0.setPivotX(wbVar.O * 0.5f);
        FrameLayout frameLayout = wbVar.e0;
        frameLayout.layout(0, i13, wbVar.O, frameLayout.getMeasuredHeight() + i13);
        FrameLayout frameLayout2 = wbVar.g0;
        frameLayout2.layout(0, wbVar.P - frameLayout2.getMeasuredHeight(), wbVar.O, wbVar.P);
        FrameLayout frameLayout3 = wbVar.i0;
        int i14 = wbVar.P;
        frameLayout3.layout(0, i14, wbVar.O, frameLayout3.getMeasuredHeight() + i14);
        wbVar.h0.layout(0, 0, wbVar.O, wbVar.P);
        fh.l2 l2Var = wbVar.p0;
        if (l2Var != null) {
            l2Var.layout(0, 0, measuredWidth, measuredHeight);
        }
        wbVar.s.c.layout(0, 0, measuredWidth, measuredHeight);
        i iVar = wbVar.Y0.I;
        if (iVar != null) {
            iVar.layout(0, 0, wbVar.O, wbVar.P);
            wbVar.Y0.y();
        }
        qe0 qe0Var = wbVar.x1;
        if (qe0Var != null) {
            qe0Var.layout(0, 0, qe0Var.getMeasuredWidth(), wbVar.x1.getMeasuredHeight());
        }
        ya yaVar = wbVar.r1;
        if (yaVar != null) {
            yaVar.layout(0, 0, yaVar.getMeasuredWidth(), wbVar.r1.getMeasuredHeight());
        }
        for (int i15 = 0; i15 < getChildCount(); i15++) {
            View childAt = getChildAt(i15);
            if (childAt instanceof v60) {
                childAt.layout(0, 0, measuredWidth, measuredHeight);
            }
        }
        setPivotX(measuredWidth / 2.0f);
        setPivotY((-measuredHeight) * 0.2f);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        int size = View.MeasureSpec.getSize(i9);
        int size2 = View.MeasureSpec.getSize(i10);
        wb wbVar = this.e;
        a(wbVar.d0, wbVar.O, wbVar.P);
        wbVar.j();
        a(wbVar.e0, wbVar.O, AndroidUtilities.dp(150.0f));
        a(wbVar.g0, wbVar.O, AndroidUtilities.dp(220.0f));
        a(wbVar.i0, wbVar.O, wbVar.Q);
        a(wbVar.h0, wbVar.O, wbVar.P);
        a(wbVar.s.c, size, size2);
        fh.l2 l2Var = wbVar.p0;
        if (l2Var != null) {
            a(l2Var, size, size2);
        }
        i iVar = wbVar.Y0.I;
        if (iVar != null) {
            a(iVar, wbVar.O, wbVar.P);
        }
        qe0 qe0Var = wbVar.x1;
        if (qe0Var != null) {
            a(qe0Var, size, size2);
        }
        ya yaVar = wbVar.r1;
        if (yaVar != null) {
            a(yaVar, size, size2);
        }
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof v60) {
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
        wb wbVar = this.e;
        wbVar.G = clamp;
        wbVar.o();
        wbVar.n.invalidate();
        float clamp2 = 1.0f - (Utilities.clamp(getTranslationY() / AndroidUtilities.dp(320.0f), 1.0f, 0.0f) * 0.1f);
        setScaleX(clamp2);
        setScaleY(clamp2);
    }
}
