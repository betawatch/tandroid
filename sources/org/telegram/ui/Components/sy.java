package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class sy extends g9 {
    public final /* synthetic */ ty G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sy(ty tyVar, Context context) {
        super(context);
        this.G = tyVar;
    }

    @Override // org.telegram.ui.Components.g9, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ty tyVar = this.G;
        vy vyVar = tyVar.d;
        boolean z10 = tyVar.c;
        if (z10) {
            return;
        }
        if (!org.telegram.messenger.ui.b0(vyVar.c1).u0[z10 ? 1 : 0].contains(Long.valueOf(((TLRPC.StickerSetCovered) getTag()).set.id)) || vyVar.s1 == null) {
            return;
        }
        canvas.drawCircle(canvas.getWidth() - org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(3.0f), vyVar.s1);
    }
}
