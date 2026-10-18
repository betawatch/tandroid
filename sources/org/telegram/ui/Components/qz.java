package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class qz extends w9 {
    public final /* synthetic */ rz G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qz(rz rzVar, Context context) {
        super(context);
        this.G = rzVar;
    }

    @Override // org.telegram.ui.Components.w9, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        rz rzVar = this.G;
        tz tzVar = rzVar.d;
        boolean z10 = rzVar.c;
        if (z10) {
            return;
        }
        if (!MediaDataController.getInstance(tzVar.c1).isStickerPackUnread(z10, ((TLRPC.StickerSetCovered) getTag()).set.id) || tzVar.s1 == null) {
            return;
        }
        canvas.drawCircle(canvas.getWidth() - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(3.0f), tzVar.s1);
    }
}
