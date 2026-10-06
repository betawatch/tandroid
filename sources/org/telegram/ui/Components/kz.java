package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class kz extends w9 {
    public final /* synthetic */ lz G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kz(lz lzVar, Context context) {
        super(context);
        this.G = lzVar;
    }

    @Override // org.telegram.ui.Components.w9, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        lz lzVar = this.G;
        nz nzVar = lzVar.d;
        boolean z10 = lzVar.c;
        if (z10) {
            return;
        }
        if (!MediaDataController.getInstance(nzVar.c1).isStickerPackUnread(z10, ((TLRPC.StickerSetCovered) getTag()).set.id) || nzVar.s1 == null) {
            return;
        }
        canvas.drawCircle(canvas.getWidth() - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(3.0f), nzVar.s1);
    }
}
