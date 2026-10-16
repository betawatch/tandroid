package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class nx0 extends sg.r1 {
    public final /* synthetic */ ox0 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nx0(ox0 ox0Var, Context context) {
        super(context);
        this.N = ox0Var;
    }

    @Override // sg.r1, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.r.getVisibility() == 0) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(r0.getLeft(), r0.getTop(), r0.getRight(), r0.getBottom());
            ox0 ox0Var = this.N;
            ox0Var.d.n.n0.d(0, 0.0f, 0, getMeasuredWidth(), -this.n.h, ox0Var.d.n.O);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), ox0Var.d.n.n0.f);
        }
        super.dispatchDraw(canvas);
    }
}
