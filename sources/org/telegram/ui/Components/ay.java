package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ay extends k9 {
    public final /* synthetic */ cy H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ay(cy cyVar, Context context) {
        super(context);
        this.H = cyVar;
    }

    @Override // org.telegram.ui.Components.k9, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        cy cyVar = this.H;
        ey eyVar = cyVar.d;
        boolean z10 = cyVar.c;
        if (z10) {
            return;
        }
        if (!org.telegram.messenger.li.b0(eyVar.d1).v0[z10 ? 1 : 0].contains(Long.valueOf(((TLRPC.StickerSetCovered) getTag()).set.id)) || eyVar.t1 == null) {
            return;
        }
        canvas.drawCircle(canvas.getWidth() - org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(3.0f), eyVar.t1);
    }
}
