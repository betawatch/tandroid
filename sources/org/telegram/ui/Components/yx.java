package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class yx extends m41 {
    public static final /* synthetic */ int a = 0;

    static {
        m41.setup(new yx());
    }

    public static n41 a(TLRPC.StickerSetCovered stickerSetCovered, px pxVar, boolean z10) {
        n41 J = n41.J(yx.class);
        long j10 = stickerSetCovered.set.id;
        long j11 = 1 + j10;
        J.d = (int) (j11 ^ (j11 >>> 32));
        J.B = j10;
        J.G = stickerSetCovered;
        J.H = pxVar;
        J.e = z10;
        return J;
    }

    @Override // org.telegram.ui.Components.m41
    public final void bindView(View view, n41 n41Var, boolean z10, b51 b51Var, k51 k51Var) {
        wg.c cVar = (wg.c) view;
        Object obj = n41Var.G;
        if (obj instanceof TLRPC.TL_messages_stickerSet) {
            cVar.setPack((TLRPC.TL_messages_stickerSet) obj);
        } else if (obj instanceof TLRPC.StickerSetCovered) {
            TLRPC.Document document = ((px) n41Var.H).e;
            cVar.d.setText(((TLRPC.StickerSetCovered) obj).set.short_name);
            cVar.c.d(document, null, null, null, false, false);
        }
        cVar.a(n41Var.e, false);
    }

    @Override // org.telegram.ui.Components.m41
    public final boolean contentsEquals(n41 n41Var, n41 n41Var2) {
        return n41Var.B == n41Var2.B && n41Var.e == n41Var2.e;
    }

    @Override // org.telegram.ui.Components.m41
    public final View createView(Context context, zk0 zk0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        wg.c cVar = new wg.c(context, c6Var);
        cVar.setLayoutParams(new f2.y0(AndroidUtilities.dp(64.0f), -1));
        return cVar;
    }

    @Override // org.telegram.ui.Components.m41
    public final boolean equals(n41 n41Var, n41 n41Var2) {
        return n41Var.B == n41Var2.B;
    }
}
