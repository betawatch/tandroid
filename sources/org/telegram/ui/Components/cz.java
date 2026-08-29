package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class cz extends t9 {
    public final /* synthetic */ dz C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cz(dz dzVar, Context context) {
        super(context);
        this.C = dzVar;
    }

    @Override // org.telegram.ui.Components.t9, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        dz dzVar = this.C;
        fz fzVar = dzVar.d;
        boolean z10 = dzVar.c;
        if (z10) {
            return;
        }
        if (!MediaDataController.getInstance(fzVar.Y0).isStickerPackUnread(z10, ((TLRPC.StickerSetCovered) getTag()).set.id) || fzVar.o1 == null) {
            return;
        }
        canvas.drawCircle(canvas.getWidth() - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(3.0f), fzVar.o1);
    }
}
