package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class ax0 extends rg.p1 {
    public final /* synthetic */ bx0 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ax0(bx0 bx0Var, Context context) {
        super(context);
        this.N = bx0Var;
    }

    @Override // rg.p1, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.r.getVisibility() == 0) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(r0.getLeft(), r0.getTop(), r0.getRight(), r0.getBottom());
            bx0 bx0Var = this.N;
            bx0Var.d.n.n0.d(0, 0.0f, 0, getMeasuredWidth(), -this.n.h, bx0Var.d.n.O);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), bx0Var.d.n.n0.f);
        }
        super.dispatchDraw(canvas);
    }
}
