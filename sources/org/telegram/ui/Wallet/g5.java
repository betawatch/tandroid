package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class g5 extends org.telegram.ui.Components.r6 {
    public final /* synthetic */ int s;
    public final /* synthetic */ i5 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g5(i5 i5Var, Context context, int i10) {
        super(context, false, true, true, true, true);
        this.v = i5Var;
        this.s = i10;
    }

    @Override // org.telegram.ui.Components.r6, android.view.View
    public final void onDraw(Canvas canvas) {
        float c10 = getDrawable().c();
        i5 i5Var = this.v;
        float min = c10 > 0.0f ? Math.min(1.0f, Math.max(0.0f, (((((336.0f - this.s) - 50.0f) * i5Var.F.getWidth()) / 336.0f) - i5Var.N.leftMargin) - AndroidUtilities.dp(8.0f)) / c10) : 1.0f;
        float min2 = (((c10 > 0.0f ? Math.min(1.0f, i5Var.S / c10) : 1.0f) - min) * i5Var.R) + min;
        i5Var.b = min2;
        int save = canvas.save();
        canvas.scale(min2, min2, 0.0f, getHeight() / 2.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(save);
    }
}
