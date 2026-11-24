// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class d15 extends b61 {
    public final RectF m0;
    public boolean n0;
    public float o0;
    public final ef1 p0;

    public d15(Context context, ylb ylbVar) {
        super(ylbVar, context, true);
        this.m0 = new RectF();
        ef1 ef1Var = new ef1();
        this.p0 = ef1Var;
        ef1Var.n = 1.2f;
        ef1Var.k = false;
        ef1Var.m = 4.0f;
    }

    @Override // b61, android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z = this.n0;
        float f = this.o0;
        if (z) {
            float f2 = f + 0.016f;
            this.o0 = f2;
            if (f2 > 3.0f) {
                this.n0 = false;
            }
        } else {
            float f3 = f - 0.016f;
            this.o0 = f3;
            if (f3 < 1.0f) {
                this.n0 = true;
            }
        }
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        RectF rectF = this.m0;
        rectF.set(0.0f, 0.0f, measuredWidth, measuredHeight);
        oj8.d().f((-getMeasuredWidth()) * 0.1f * this.o0, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        canvas.drawRoundRect(rectF, gm.L(8.0f), gm.L(8.0f), oj8.d().e());
        int measuredWidth2 = getMeasuredWidth();
        ef1 ef1Var = this.p0;
        ef1Var.f = measuredWidth2;
        ef1Var.a(gm.L(8.0f), canvas, rectF, null);
        super.onDraw(canvas);
        invalidate();
    }
}
