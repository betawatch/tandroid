package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class ny extends g51 {
    public static final /* synthetic */ int a = 0;

    static {
        g51.setup(new ny());
    }

    public static h51 a(TLRPC.StickerSetCovered stickerSetCovered, dy dyVar, boolean z4) {
        h51 J = h51.J(ny.class);
        long j10 = stickerSetCovered.set.id;
        long j11 = 1 + j10;
        J.d = (int) (j11 ^ (j11 >>> 32));
        J.B = j10;
        J.G = stickerSetCovered;
        J.H = dyVar;
        J.e = z4;
        return J;
    }

    @Override // org.telegram.ui.Components.g51
    public final void bindView(View view, h51 h51Var, boolean z4, w51 w51Var, h61 h61Var) {
        bh.d dVar = (bh.d) view;
        Object obj = h51Var.G;
        if (obj instanceof TLRPC.TL_messages_stickerSet) {
            dVar.setPack((TLRPC.TL_messages_stickerSet) obj);
        } else if (obj instanceof TLRPC.StickerSetCovered) {
            TLRPC.Document document = ((dy) h51Var.H).e;
            dVar.d.setText(((TLRPC.StickerSetCovered) obj).set.short_name);
            dVar.c.d(document, null, null, null, false, false);
        }
        dVar.a(h51Var.e, false);
    }

    @Override // org.telegram.ui.Components.g51
    public final boolean contentsEquals(h51 h51Var, h51 h51Var2) {
        return h51Var.B == h51Var2.B && h51Var.e == h51Var2.e;
    }

    @Override // org.telegram.ui.Components.g51
    public final View createView(Context context, sl0 sl0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        bh.d dVar = new bh.d(context, g6Var);
        dVar.setLayoutParams(new f2.x0(AndroidUtilities.dp(64.0f), -1));
        return dVar;
    }

    @Override // org.telegram.ui.Components.g51
    public final boolean equals(h51 h51Var, h51 h51Var2) {
        return h51Var.B == h51Var2.B;
    }
}
