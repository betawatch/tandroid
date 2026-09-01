package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class o40 extends xu0 {
    public final /* synthetic */ d60 T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o40(d60 d60Var, ViewGroup viewGroup, ViewGroup viewGroup2) {
        super(viewGroup, viewGroup2);
        this.T = d60Var;
    }

    @Override // org.telegram.ui.xu0
    public final void c(Canvas canvas, float f10, float f11, float f12, float f13, float f14) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        d60 d60Var = this.T;
        y30 y30Var = d60Var.b;
        z30 z30Var = d60Var.z2;
        if (f10 > 0.0f) {
            float x10 = z30Var.getX();
            viewGroup = ((org.telegram.ui.ActionBar.h3) d60Var).containerView;
            float x11 = viewGroup.getX() + x10;
            float y10 = z30Var.getY();
            viewGroup2 = ((org.telegram.ui.ActionBar.h3) d60Var).containerView;
            float y11 = viewGroup2.getY() + y10;
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(x11, y11, y30Var.getMeasuredWidth() + x11, y30Var.getMeasuredHeight() + y11);
            canvas.saveLayerAlpha(rectF, (int) (f10 * 255.0f), 31);
            canvas.translate(x11, y11);
            z30Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.xu0
    public final void e() {
        y30 y30Var = this.T.b;
        super.e();
        for (int i10 = 0; i10 < y30Var.getChildCount(); i10++) {
            y30Var.getChildAt(i10).invalidate();
        }
    }
}
