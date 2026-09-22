package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class hz extends u9 {
    public final /* synthetic */ iz G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hz(iz izVar, Context context) {
        super(context);
        this.G = izVar;
    }

    @Override // org.telegram.ui.Components.u9, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        iz izVar = this.G;
        kz kzVar = izVar.d;
        boolean z10 = izVar.c;
        if (z10) {
            return;
        }
        if (!MediaDataController.getInstance(kzVar.c1).isStickerPackUnread(z10, ((TLRPC.StickerSetCovered) getTag()).set.id) || kzVar.s1 == null) {
            return;
        }
        canvas.drawCircle(canvas.getWidth() - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(3.0f), kzVar.s1);
    }
}
