package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class xz extends y9 {
    public final /* synthetic */ yz G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xz(yz yzVar, Context context) {
        super(context);
        this.G = yzVar;
    }

    @Override // org.telegram.ui.Components.y9, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        yz yzVar = this.G;
        a00 a00Var = yzVar.d;
        boolean z10 = yzVar.c;
        if (z10) {
            return;
        }
        if (!MediaDataController.getInstance(a00Var.c1).isStickerPackUnread(z10, ((TLRPC.StickerSetCovered) getTag()).set.id) || a00Var.s1 == null) {
            return;
        }
        canvas.drawCircle(canvas.getWidth() - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(3.0f), a00Var.s1);
    }
}
