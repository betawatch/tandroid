package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class g40 extends ev0 {
    public final /* synthetic */ x50 T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g40(x50 x50Var, ViewGroup viewGroup, ViewGroup viewGroup2) {
        super(viewGroup, viewGroup2);
        this.T = x50Var;
    }

    @Override // org.telegram.ui.ev0
    public final void c(Canvas canvas, float f7, float f10, float f11, float f12, float f13) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        x50 x50Var = this.T;
        q30 q30Var = x50Var.b;
        r30 r30Var = x50Var.C2;
        if (f7 > 0.0f) {
            float x9 = r30Var.getX();
            viewGroup = ((org.telegram.ui.ActionBar.k3) x50Var).containerView;
            float x10 = viewGroup.getX() + x9;
            float y3 = r30Var.getY();
            viewGroup2 = ((org.telegram.ui.ActionBar.k3) x50Var).containerView;
            float y10 = viewGroup2.getY() + y3;
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(x10, y10, q30Var.getMeasuredWidth() + x10, q30Var.getMeasuredHeight() + y10);
            canvas.saveLayerAlpha(rectF, (int) (f7 * 255.0f), 31);
            canvas.translate(x10, y10);
            r30Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.ev0
    public final void e() {
        q30 q30Var = this.T.b;
        super.e();
        for (int i10 = 0; i10 < q30Var.getChildCount(); i10++) {
            q30Var.getChildAt(i10).invalidate();
        }
    }
}
