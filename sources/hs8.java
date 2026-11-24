// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class hs8 extends FrameLayout {
    public final /* synthetic */ js8 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hs8(js8 js8Var, Context context) {
        super(context);
        this.a = js8Var;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        js8 js8Var = this.a;
        xl3 xl3Var = js8Var.M;
        RectF rectF = js8Var.N;
        RectF rectF2 = js8Var.O;
        smc smcVar = js8Var.r;
        if (view == smcVar && js8Var.K > 0.0f) {
            rectF2.set(0.0f, 0.0f, smcVar.getWidth(), smcVar.getHeight());
            smcVar.getMatrix().mapRect(rectF2);
            rectF2.offset(smcVar.getLeft(), smcVar.getTop());
            rectF2.inset(-gl.L(4.0f), -gl.L(4.0f));
            float L = gl.L(28.0f);
            if (rectF2.top < js8Var.K + L && rectF2.intersect(0.0f, 0.0f, getWidth(), getHeight())) {
                int saveLayer = canvas.saveLayer(rectF2, null);
                boolean drawChild = super.drawChild(canvas, view, j);
                rectF.set(rectF2.left, rectF2.top, rectF2.right, Math.min(rectF2.bottom, js8Var.K));
                if (rectF.height() > 0.0f) {
                    canvas.drawRect(rectF, xl3Var.x(1.0f, 1));
                }
                float f = rectF2.left;
                float f2 = js8Var.K;
                rectF.set(f, f2, rectF2.right, L + f2);
                xl3Var.s(canvas, rectF, 1, 1.0f);
                canvas.restoreToCount(saveLayer);
                return drawChild;
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        js8 js8Var = this.a;
        TextView textView = js8Var.x;
        a6 a6Var = js8Var.w;
        smc smcVar = js8Var.r;
        getLocationOnScreen(js8Var.W);
        int i5 = js8Var.I.a;
        int width = getWidth();
        io5 io5Var = js8Var.I;
        int g = ug8.g(width - io5Var.a, io5Var.c, 2, i5);
        int height = ((getHeight() - js8Var.I.d) - gl.L(16.0f)) - (js8Var.c() ? a6Var.getMeasuredHeight() : 0);
        a6Var.layout(g - (a6Var.getMeasuredWidth() / 2), height, ((a6Var.getMeasuredWidth() + 1) / 2) + g, a6Var.getMeasuredHeight() + height);
        int L = gl.L(36.0f) + Math.max(js8Var.I.b, gl.m);
        textView.layout(g - (textView.getMeasuredWidth() / 2), L, ((textView.getMeasuredWidth() + 1) / 2) + g, textView.getMeasuredHeight() + L);
        js8Var.d();
        int measuredHeight = (textView.getVisibility() == 0 ? textView.getMeasuredHeight() + gl.L(12.0f) : 0) + gl.L(24.0f) + Math.max(js8Var.I.b, gl.m);
        int max = Math.max(measuredHeight, Math.min(Math.max(measuredHeight, (height - gl.L(24.0f)) - smcVar.getMeasuredHeight()), (getHeight() - smcVar.getMeasuredHeight()) / 2));
        int measuredWidth = g - (smcVar.getMeasuredWidth() / 2);
        smcVar.layout(measuredWidth, max, smcVar.getMeasuredWidth() + measuredWidth, smcVar.getMeasuredHeight() + max);
        js8Var.s.layout(0, 0, getWidth(), getHeight());
        js8Var.n.layout(0, 0, getWidth(), getHeight());
        tk0.c(js8Var.F, this);
        js8Var.e();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        setMeasuredDimension(size, size2);
        js8 js8Var = this.a;
        smc smcVar = js8Var.r;
        io5 io5Var = js8Var.I;
        int max = Math.max(1, (size - io5Var.a) - io5Var.c);
        js8Var.w.measure(View.MeasureSpec.makeMeasureSpec(Math.max(1, max - gl.L(24.0f)), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(gl.L(60.0f), TLObject.FLAG_30));
        TextView textView = js8Var.x;
        textView.measure(View.MeasureSpec.makeMeasureSpec(Math.max(1, max - gl.L(48.0f)), TLObject.FLAG_31), 0);
        int min = Math.min(gl.L(420.0f), Math.max(1, max - gl.L(24.0f)));
        int max2 = Math.max(1, (((size2 - Math.max(js8Var.I.b, gl.m)) - js8Var.I.d) - gl.L(js8Var.c() ? 120.0f : 48.0f)) - (textView.getVisibility() == 0 ? textView.getMeasuredHeight() + gl.L(12.0f) : 0));
        smcVar.measure(View.MeasureSpec.makeMeasureSpec(min, TLObject.FLAG_30), 0);
        if (smcVar.getMeasuredHeight() > max2) {
            int paddingRight = smcVar.getPaddingRight() + smcVar.getPaddingLeft();
            int paddingBottom = smcVar.getPaddingBottom() + smcVar.getPaddingTop();
            smcVar.measure(View.MeasureSpec.makeMeasureSpec(Math.max(1, Math.round((Math.max(0, max2 - paddingBottom) * (min - paddingRight)) / Math.max(1, smcVar.getMeasuredHeight() - paddingBottom)) + paddingRight), TLObject.FLAG_30), 0);
        }
        js8Var.s.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        js8Var.n.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
    }
}
