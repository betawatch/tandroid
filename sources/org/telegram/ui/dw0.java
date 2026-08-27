package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class dw0 extends ag.e3 {
    public final /* synthetic */ ew0 J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dw0(ew0 ew0Var, Context context) {
        super(context);
        this.J = ew0Var;
    }

    @Override // ag.e3, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.r.getVisibility() == 0) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(r0.getLeft(), r0.getTop(), r0.getRight(), r0.getBottom());
            ew0 ew0Var = this.J;
            ew0Var.d.n.j0.d(0, 0.0f, 0, getMeasuredWidth(), -this.n.h, ew0Var.d.n.K);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), ew0Var.d.n.j0.f);
        }
        super.dispatchDraw(canvas);
    }
}
