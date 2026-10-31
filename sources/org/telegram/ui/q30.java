package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.ViewGroup;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class q30 extends qs0 {
    public final /* synthetic */ b50 T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q30(b50 b50Var, ViewGroup viewGroup, ViewGroup viewGroup2) {
        super(viewGroup, viewGroup2);
        this.T = b50Var;
    }

    @Override // org.telegram.ui.qs0
    public final void c(Canvas canvas, float f7, float f10, float f11, float f12, float f13) {
        b50 b50Var = this.T;
        a30 a30Var = b50Var.i1;
        b30 b30Var = b50Var.t4;
        if (f7 > 0.0f) {
            float x10 = b50Var.b.getX() + b30Var.getX();
            float y3 = b50Var.b.getY() + b30Var.getY();
            RectF rectF = org.telegram.messenger.i0.P;
            rectF.set(x10, y3, a30Var.getMeasuredWidth() + x10, a30Var.getMeasuredHeight() + y3);
            canvas.saveLayerAlpha(rectF, (int) (f7 * 255.0f), 31);
            canvas.translate(x10, y3);
            b30Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.qs0
    public final void e() {
        a30 a30Var = this.T.i1;
        super.e();
        for (int i10 = 0; i10 < a30Var.getChildCount(); i10++) {
            a30Var.getChildAt(i10).invalidate();
        }
    }
}
