package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class cw0 extends cg.l2 {
    public final /* synthetic */ dw0 J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cw0(dw0 dw0Var, Context context) {
        super(context);
        this.J = dw0Var;
    }

    @Override // cg.l2, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.r.getVisibility() == 0) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(r0.getLeft(), r0.getTop(), r0.getRight(), r0.getBottom());
            dw0 dw0Var = this.J;
            dw0Var.d.n.j0.d(0, 0.0f, 0, getMeasuredWidth(), -this.n.h, dw0Var.d.n.K);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), dw0Var.d.n.j0.f);
        }
        super.dispatchDraw(canvas);
    }
}
