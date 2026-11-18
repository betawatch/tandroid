package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class sx extends k41 {
    public static final /* synthetic */ int b = 0;

    static {
        k41.h(new sx());
    }

    public static l41 i(TLRPC.StickerSetCovered stickerSetCovered, kx kxVar, boolean z10) {
        l41 K = l41.K(sx.class);
        long j3 = stickerSetCovered.set.id;
        long j10 = 1 + j3;
        K.d = (int) (j10 ^ (j10 >>> 32));
        K.C = j3;
        K.H = stickerSetCovered;
        K.I = kxVar;
        K.e = z10;
        return K;
    }

    @Override // org.telegram.ui.Components.k41
    public final void b(View view, l41 l41Var, boolean z10, z41 z41Var, e51 e51Var) {
        ph.b bVar = (ph.b) view;
        Object obj = l41Var.H;
        if (obj instanceof TLRPC.TL_messages_stickerSet) {
            bVar.setPack((TLRPC.TL_messages_stickerSet) obj);
        } else if (obj instanceof TLRPC.StickerSetCovered) {
            TLRPC.Document document = ((kx) l41Var.I).e;
            bVar.d.setText(((TLRPC.StickerSetCovered) obj).set.short_name);
            bVar.c.d(document, null, null, null, false, false);
        }
        bVar.a(l41Var.e, false);
    }

    @Override // org.telegram.ui.Components.k41
    public final boolean c(l41 l41Var, l41 l41Var2) {
        return l41Var.C == l41Var2.C && l41Var.e == l41Var2.e;
    }

    @Override // org.telegram.ui.Components.k41
    public final View d(Context context, ck0 ck0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        ph.b bVar = new ph.b(context, i6Var);
        bVar.setLayoutParams(new v4.q0(org.telegram.messenger.g0.L(64.0f), -1));
        return bVar;
    }

    @Override // org.telegram.ui.Components.k41
    public final boolean e(l41 l41Var, l41 l41Var2) {
        return l41Var.C == l41Var2.C;
    }
}
