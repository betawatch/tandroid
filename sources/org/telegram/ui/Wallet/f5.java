package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class f5 extends org.telegram.ui.Components.s6 {
    public final /* synthetic */ int s;
    public final /* synthetic */ h5 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f5(h5 h5Var, Context context, int i10) {
        super(context, false, true, true, true, true);
        this.v = h5Var;
        this.s = i10;
    }

    @Override // org.telegram.ui.Components.s6, android.view.View
    public final void onDraw(Canvas canvas) {
        float c10 = getDrawable().c();
        h5 h5Var = this.v;
        float min = c10 > 0.0f ? Math.min(1.0f, Math.max(0.0f, (((((336.0f - this.s) - 50.0f) * h5Var.F.getWidth()) / 336.0f) - h5Var.N.leftMargin) - AndroidUtilities.dp(8.0f)) / c10) : 1.0f;
        float min2 = (((c10 > 0.0f ? Math.min(1.0f, h5Var.S / c10) : 1.0f) - min) * h5Var.R) + min;
        h5Var.b = min2;
        int save = canvas.save();
        canvas.scale(min2, min2, 0.0f, getHeight() / 2.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(save);
    }
}
