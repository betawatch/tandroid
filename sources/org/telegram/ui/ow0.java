package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class ow0 extends fg.j2 {
    public final /* synthetic */ pw0 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ow0(pw0 pw0Var, Context context) {
        super(context);
        this.K = pw0Var;
    }

    @Override // fg.j2, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.r.getVisibility() == 0) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(r0.getLeft(), r0.getTop(), r0.getRight(), r0.getBottom());
            pw0 pw0Var = this.K;
            pw0Var.d.n.k0.d(0, 0.0f, 0, getMeasuredWidth(), -this.n.h, pw0Var.d.n.L);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), pw0Var.d.n.k0.f);
        }
        super.dispatchDraw(canvas);
    }
}
