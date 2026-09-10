package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class jx0 extends qg.r1 {
    public final /* synthetic */ kx0 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jx0(kx0 kx0Var, Context context) {
        super(context);
        this.N = kx0Var;
    }

    @Override // qg.r1, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.r.getVisibility() == 0) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(r0.getLeft(), r0.getTop(), r0.getRight(), r0.getBottom());
            kx0 kx0Var = this.N;
            kx0Var.d.n.n0.d(0, 0.0f, 0, getMeasuredWidth(), -this.n.h, kx0Var.d.n.O);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), kx0Var.d.n.n0.f);
        }
        super.dispatchDraw(canvas);
    }
}
