package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ty extends o9 {
    public final /* synthetic */ uy C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ty(uy uyVar, Context context) {
        super(context);
        this.C = uyVar;
    }

    @Override // org.telegram.ui.Components.o9, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        uy uyVar = this.C;
        wy wyVar = uyVar.d;
        boolean z10 = uyVar.c;
        if (z10) {
            return;
        }
        if (!MediaDataController.getInstance(wyVar.Y0).isStickerPackUnread(z10, ((TLRPC.StickerSetCovered) getTag()).set.id) || wyVar.o1 == null) {
            return;
        }
        canvas.drawCircle(canvas.getWidth() - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(3.0f), wyVar.o1);
    }
}
