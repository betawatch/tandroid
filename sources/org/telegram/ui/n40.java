package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class n40 extends vu0 {
    public final /* synthetic */ c60 T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n40(c60 c60Var, ViewGroup viewGroup, ViewGroup viewGroup2) {
        super(viewGroup, viewGroup2);
        this.T = c60Var;
    }

    @Override // org.telegram.ui.vu0
    public final void c(Canvas canvas, float f10, float f11, float f12, float f13, float f14) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        c60 c60Var = this.T;
        x30 x30Var = c60Var.b;
        y30 y30Var = c60Var.z2;
        if (f10 > 0.0f) {
            float x10 = y30Var.getX();
            viewGroup = ((org.telegram.ui.ActionBar.g3) c60Var).containerView;
            float x11 = viewGroup.getX() + x10;
            float y10 = y30Var.getY();
            viewGroup2 = ((org.telegram.ui.ActionBar.g3) c60Var).containerView;
            float y11 = viewGroup2.getY() + y10;
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(x11, y11, x30Var.getMeasuredWidth() + x11, x30Var.getMeasuredHeight() + y11);
            canvas.saveLayerAlpha(rectF, (int) (f10 * 255.0f), 31);
            canvas.translate(x11, y11);
            y30Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.vu0
    public final void e() {
        x30 x30Var = this.T.b;
        super.e();
        for (int i10 = 0; i10 < x30Var.getChildCount(); i10++) {
            x30Var.getChildAt(i10).invalidate();
        }
    }
}
