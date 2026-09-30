package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
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
