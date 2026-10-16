package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class tz extends z9 {
    public final /* synthetic */ uz G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tz(uz uzVar, Context context) {
        super(context);
        this.G = uzVar;
    }

    @Override // org.telegram.ui.Components.z9, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        uz uzVar = this.G;
        wz wzVar = uzVar.d;
        boolean z10 = uzVar.c;
        if (z10) {
            return;
        }
        if (!MediaDataController.getInstance(wzVar.c1).isStickerPackUnread(z10, ((TLRPC.StickerSetCovered) getTag()).set.id) || wzVar.s1 == null) {
            return;
        }
        canvas.drawCircle(canvas.getWidth() - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(3.0f), wzVar.s1);
    }
}
