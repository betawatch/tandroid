package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class mw0 extends eg.k2 {
    public final /* synthetic */ nw0 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mw0(nw0 nw0Var, Context context) {
        super(context);
        this.K = nw0Var;
    }

    @Override // eg.k2, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.r.getVisibility() == 0) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(r0.getLeft(), r0.getTop(), r0.getRight(), r0.getBottom());
            nw0 nw0Var = this.K;
            nw0Var.d.n.k0.d(0, 0.0f, 0, getMeasuredWidth(), -this.n.h, nw0Var.d.n.L);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), nw0Var.d.n.k0.f);
        }
        super.dispatchDraw(canvas);
    }
}
