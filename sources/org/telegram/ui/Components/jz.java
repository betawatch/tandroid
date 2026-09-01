package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class jz extends p9 {
    public final /* synthetic */ kz D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jz(kz kzVar, Context context) {
        super(context);
        this.D = kzVar;
    }

    @Override // org.telegram.ui.Components.p9, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        kz kzVar = this.D;
        mz mzVar = kzVar.d;
        boolean z4 = kzVar.c;
        if (z4) {
            return;
        }
        if (!MediaDataController.getInstance(mzVar.Z0).isStickerPackUnread(z4, ((TLRPC.StickerSetCovered) getTag()).set.id) || mzVar.p1 == null) {
            return;
        }
        canvas.drawCircle(canvas.getWidth() - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(3.0f), mzVar.p1);
    }
}
