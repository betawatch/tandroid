package mg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.ui.ActionBar.p6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class z0 extends vh.d {
    public final RectF k0;
    public boolean l0;
    public float m0;
    public final org.telegram.ui.Components.voip.g n0;

    public z0(Context context, p6 p6Var) {
        super(context, p6Var, true);
        this.k0 = new RectF();
        org.telegram.ui.Components.voip.g gVar = new org.telegram.ui.Components.voip.g();
        this.n0 = gVar;
        gVar.n = 1.2f;
        gVar.k = false;
        gVar.m = 4.0f;
    }

    @Override // vh.d, android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.l0) {
            float f7 = this.m0 + 0.016f;
            this.m0 = f7;
            if (f7 > 3.0f) {
                this.l0 = false;
            }
        } else {
            float f10 = this.m0 - 0.016f;
            this.m0 = f10;
            if (f10 < 1.0f) {
                this.l0 = true;
            }
        }
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        RectF rectF = this.k0;
        rectF.set(0.0f, 0.0f, measuredWidth, measuredHeight);
        ea.f.d().f((-getMeasuredWidth()) * 0.1f * this.m0, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), ea.f.d().e());
        int measuredWidth2 = getMeasuredWidth();
        org.telegram.ui.Components.voip.g gVar = this.n0;
        gVar.f = measuredWidth2;
        gVar.a(org.telegram.messenger.i0.L(8.0f), canvas, rectF, null);
        super.onDraw(canvas);
        invalidate();
    }
}
