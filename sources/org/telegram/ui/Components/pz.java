package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class pz extends y9 {
    public final /* synthetic */ qz G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pz(qz qzVar, Context context) {
        super(context);
        this.G = qzVar;
    }

    @Override // org.telegram.ui.Components.y9, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        qz qzVar = this.G;
        sz szVar = qzVar.d;
        boolean z10 = qzVar.c;
        if (z10) {
            return;
        }
        if (!MediaDataController.getInstance(szVar.c1).isStickerPackUnread(z10, ((TLRPC.StickerSetCovered) getTag()).set.id) || szVar.s1 == null) {
            return;
        }
        canvas.drawCircle(canvas.getWidth() - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(3.0f), szVar.s1);
    }
}
