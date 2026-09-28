package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class jz extends w9 {
    public final /* synthetic */ kz G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jz(kz kzVar, Context context) {
        super(context);
        this.G = kzVar;
    }

    @Override // org.telegram.ui.Components.w9, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        kz kzVar = this.G;
        mz mzVar = kzVar.d;
        boolean z10 = kzVar.c;
        if (z10) {
            return;
        }
        if (!MediaDataController.getInstance(mzVar.c1).isStickerPackUnread(z10, ((TLRPC.StickerSetCovered) getTag()).set.id) || mzVar.s1 == null) {
            return;
        }
        canvas.drawCircle(canvas.getWidth() - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(3.0f), mzVar.s1);
    }
}
