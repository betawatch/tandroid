package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class vy extends n9 {
    public final /* synthetic */ wy C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vy(wy wyVar, Context context) {
        super(context);
        this.C = wyVar;
    }

    @Override // org.telegram.ui.Components.n9, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        wy wyVar = this.C;
        yy yyVar = wyVar.d;
        boolean z10 = wyVar.c;
        if (z10) {
            return;
        }
        if (!MediaDataController.getInstance(yyVar.Y0).isStickerPackUnread(z10, ((TLRPC.StickerSetCovered) getTag()).set.id) || yyVar.o1 == null) {
            return;
        }
        canvas.drawCircle(canvas.getWidth() - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(3.0f), yyVar.o1);
    }
}
