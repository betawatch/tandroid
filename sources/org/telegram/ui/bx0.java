package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class bx0 extends rg.r1 {
    public final /* synthetic */ cx0 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bx0(cx0 cx0Var, Context context) {
        super(context);
        this.N = cx0Var;
    }

    @Override // rg.r1, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.r.getVisibility() == 0) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(r0.getLeft(), r0.getTop(), r0.getRight(), r0.getBottom());
            cx0 cx0Var = this.N;
            cx0Var.d.n.n0.d(0, 0.0f, 0, getMeasuredWidth(), -this.n.h, cx0Var.d.n.O);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), cx0Var.d.n.n0.f);
        }
        super.dispatchDraw(canvas);
    }
}
