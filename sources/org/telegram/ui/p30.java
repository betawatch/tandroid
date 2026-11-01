package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.ViewGroup;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class p30 extends ps0 {
    public final /* synthetic */ a50 T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p30(a50 a50Var, ViewGroup viewGroup, ViewGroup viewGroup2) {
        super(viewGroup, viewGroup2);
        this.T = a50Var;
    }

    @Override // org.telegram.ui.ps0
    public final void c(Canvas canvas, float f7, float f10, float f11, float f12, float f13) {
        a50 a50Var = this.T;
        z20 z20Var = a50Var.i1;
        a30 a30Var = a50Var.t4;
        if (f7 > 0.0f) {
            float x10 = a50Var.b.getX() + a30Var.getX();
            float y3 = a50Var.b.getY() + a30Var.getY();
            RectF rectF = org.telegram.messenger.i0.P;
            rectF.set(x10, y3, z20Var.getMeasuredWidth() + x10, z20Var.getMeasuredHeight() + y3);
            canvas.saveLayerAlpha(rectF, (int) (f7 * 255.0f), 31);
            canvas.translate(x10, y3);
            a30Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.ps0
    public final void e() {
        z20 z20Var = this.T.i1;
        super.e();
        for (int i10 = 0; i10 < z20Var.getChildCount(); i10++) {
            z20Var.getChildAt(i10).invalidate();
        }
    }
}
