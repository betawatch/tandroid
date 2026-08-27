package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class b40 extends ou0 {
    public final /* synthetic */ s50 T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b40(s50 s50Var, ViewGroup viewGroup, ViewGroup viewGroup2) {
        super(viewGroup, viewGroup2);
        this.T = s50Var;
    }

    @Override // org.telegram.ui.ou0
    public final void c(Canvas canvas, float f10, float f11, float f12, float f13, float f14) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        s50 s50Var = this.T;
        l30 l30Var = s50Var.b;
        m30 m30Var = s50Var.y2;
        if (f10 > 0.0f) {
            float x8 = m30Var.getX();
            viewGroup = ((org.telegram.ui.ActionBar.e3) s50Var).containerView;
            float x10 = viewGroup.getX() + x8;
            float y10 = m30Var.getY();
            viewGroup2 = ((org.telegram.ui.ActionBar.e3) s50Var).containerView;
            float y11 = viewGroup2.getY() + y10;
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(x10, y11, l30Var.getMeasuredWidth() + x10, l30Var.getMeasuredHeight() + y11);
            canvas.saveLayerAlpha(rectF, (int) (f10 * 255.0f), 31);
            canvas.translate(x10, y11);
            m30Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.ou0
    public final void e() {
        l30 l30Var = this.T.b;
        super.e();
        for (int i10 = 0; i10 < l30Var.getChildCount(); i10++) {
            l30Var.getChildAt(i10).invalidate();
        }
    }
}
