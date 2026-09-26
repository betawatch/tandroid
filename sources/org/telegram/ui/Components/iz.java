package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class iz extends w9 {
    public final /* synthetic */ jz G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iz(jz jzVar, Context context) {
        super(context);
        this.G = jzVar;
    }

    @Override // org.telegram.ui.Components.w9, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        jz jzVar = this.G;
        lz lzVar = jzVar.d;
        boolean z10 = jzVar.c;
        if (z10) {
            return;
        }
        if (!MediaDataController.getInstance(lzVar.c1).isStickerPackUnread(z10, ((TLRPC.StickerSetCovered) getTag()).set.id) || lzVar.s1 == null) {
            return;
        }
        canvas.drawCircle(canvas.getWidth() - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(3.0f), lzVar.s1);
    }
}
