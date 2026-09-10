package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class oz extends w9 {
    public final /* synthetic */ pz G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oz(pz pzVar, Context context) {
        super(context);
        this.G = pzVar;
    }

    @Override // org.telegram.ui.Components.w9, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        pz pzVar = this.G;
        rz rzVar = pzVar.d;
        boolean z10 = pzVar.c;
        if (z10) {
            return;
        }
        if (!MediaDataController.getInstance(rzVar.c1).isStickerPackUnread(z10, ((TLRPC.StickerSetCovered) getTag()).set.id) || rzVar.s1 == null) {
            return;
        }
        canvas.drawCircle(canvas.getWidth() - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(3.0f), rzVar.s1);
    }
}
