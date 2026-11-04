package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.ViewGroup;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class m20 extends vq0 {
    public final /* synthetic */ x30 T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m20(x30 x30Var, ViewGroup viewGroup, ViewGroup viewGroup2) {
        super(viewGroup, viewGroup2);
        this.T = x30Var;
    }

    @Override // org.telegram.ui.vq0
    public final void c(Canvas canvas, float f10, float f11, float f12, float f13, float f14) {
        x30 x30Var = this.T;
        w10 w10Var = x30Var.j1;
        x10 x10Var = x30Var.u4;
        if (f10 > 0.0f) {
            float x10 = x30Var.b.getX() + x10Var.getX();
            float y9 = x30Var.b.getY() + x10Var.getY();
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(x10, y9, w10Var.getMeasuredWidth() + x10, w10Var.getMeasuredHeight() + y9);
            canvas.saveLayerAlpha(rectF, (int) (f10 * 255.0f), 31);
            canvas.translate(x10, y9);
            x10Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.vq0
    public final void e() {
        w10 w10Var = this.T.j1;
        super.e();
        for (int i3 = 0; i3 < w10Var.getChildCount(); i3++) {
            w10Var.getChildAt(i3).invalidate();
        }
    }
}
