package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class p40 extends cv0 {
    public final /* synthetic */ e60 T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p40(e60 e60Var, ViewGroup viewGroup, ViewGroup viewGroup2) {
        super(viewGroup, viewGroup2);
        this.T = e60Var;
    }

    @Override // org.telegram.ui.cv0
    public final void c(Canvas canvas, float f10, float f11, float f12, float f13, float f14) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        e60 e60Var = this.T;
        z30 z30Var = e60Var.b;
        a40 a40Var = e60Var.z2;
        if (f10 > 0.0f) {
            float x10 = a40Var.getX();
            viewGroup = ((org.telegram.ui.ActionBar.g3) e60Var).containerView;
            float x11 = viewGroup.getX() + x10;
            float y10 = a40Var.getY();
            viewGroup2 = ((org.telegram.ui.ActionBar.g3) e60Var).containerView;
            float y11 = viewGroup2.getY() + y10;
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(x11, y11, z30Var.getMeasuredWidth() + x11, z30Var.getMeasuredHeight() + y11);
            canvas.saveLayerAlpha(rectF, (int) (f10 * 255.0f), 31);
            canvas.translate(x11, y11);
            a40Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.cv0
    public final void e() {
        z30 z30Var = this.T.b;
        super.e();
        for (int i10 = 0; i10 < z30Var.getChildCount(); i10++) {
            z30Var.getChildAt(i10).invalidate();
        }
    }
}
