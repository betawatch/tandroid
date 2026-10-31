package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class wx extends z41 {
    public static final /* synthetic */ int b = 0;

    static {
        z41.h(new wx());
    }

    public static a51 i(TLRPC.StickerSetCovered stickerSetCovered, nx nxVar, boolean z10) {
        a51 K = a51.K(wx.class);
        long j10 = stickerSetCovered.set.id;
        long j11 = 1 + j10;
        K.d = (int) (j11 ^ (j11 >>> 32));
        K.B = j10;
        K.G = stickerSetCovered;
        K.H = nxVar;
        K.e = z10;
        return K;
    }

    @Override // org.telegram.ui.Components.z41
    public final void b(View view, a51 a51Var, boolean z10, p51 p51Var, u51 u51Var) {
        fh.b bVar = (fh.b) view;
        Object obj = a51Var.G;
        if (obj instanceof TLRPC.TL_messages_stickerSet) {
            bVar.setPack((TLRPC.TL_messages_stickerSet) obj);
        } else if (obj instanceof TLRPC.StickerSetCovered) {
            TLRPC.Document document = ((nx) a51Var.H).e;
            bVar.d.setText(((TLRPC.StickerSetCovered) obj).set.short_name);
            bVar.c.d(document, null, null, null, false, false);
        }
        bVar.a(a51Var.e, false);
    }

    @Override // org.telegram.ui.Components.z41
    public final boolean c(a51 a51Var, a51 a51Var2) {
        return a51Var.B == a51Var2.B && a51Var.e == a51Var2.e;
    }

    @Override // org.telegram.ui.Components.z41
    public final View d(Context context, tk0 tk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        fh.b bVar = new fh.b(context, p6Var);
        bVar.setLayoutParams(new s4.o0(org.telegram.messenger.i0.L(64.0f), -1));
        return bVar;
    }

    @Override // org.telegram.ui.Components.z41
    public final boolean e(a51 a51Var, a51 a51Var2) {
        return a51Var.B == a51Var2.B;
    }
}
