package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class hz extends p9 {
    public final /* synthetic */ iz D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hz(iz izVar, Context context) {
        super(context);
        this.D = izVar;
    }

    @Override // org.telegram.ui.Components.p9, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        iz izVar = this.D;
        kz kzVar = izVar.d;
        boolean z4 = izVar.c;
        if (z4) {
            return;
        }
        if (!MediaDataController.getInstance(kzVar.Z0).isStickerPackUnread(z4, ((TLRPC.StickerSetCovered) getTag()).set.id) || kzVar.p1 == null) {
            return;
        }
        canvas.drawCircle(canvas.getWidth() - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(3.0f), kzVar.p1);
    }
}
