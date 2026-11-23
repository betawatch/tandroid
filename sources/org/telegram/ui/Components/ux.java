package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class ux extends n41 {
    public static final /* synthetic */ int b = 0;

    static {
        n41.h(new ux());
    }

    public static o41 i(TLRPC.StickerSetCovered stickerSetCovered, mx mxVar, boolean z10) {
        o41 K = o41.K(ux.class);
        long j3 = stickerSetCovered.set.id;
        long j10 = 1 + j3;
        K.d = (int) (j10 ^ (j10 >>> 32));
        K.C = j3;
        K.H = stickerSetCovered;
        K.I = mxVar;
        K.e = z10;
        return K;
    }

    @Override // org.telegram.ui.Components.n41
    public final void b(View view, o41 o41Var, boolean z10, c51 c51Var, h51 h51Var) {
        ph.b bVar = (ph.b) view;
        Object obj = o41Var.H;
        if (obj instanceof TLRPC.TL_messages_stickerSet) {
            bVar.setPack((TLRPC.TL_messages_stickerSet) obj);
        } else if (obj instanceof TLRPC.StickerSetCovered) {
            TLRPC.Document document = ((mx) o41Var.I).e;
            bVar.d.setText(((TLRPC.StickerSetCovered) obj).set.short_name);
            bVar.c.d(document, null, null, null, false, false);
        }
        bVar.a(o41Var.e, false);
    }

    @Override // org.telegram.ui.Components.n41
    public final boolean c(o41 o41Var, o41 o41Var2) {
        return o41Var.C == o41Var2.C && o41Var.e == o41Var2.e;
    }

    @Override // org.telegram.ui.Components.n41
    public final View d(Context context, ek0 ek0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        ph.b bVar = new ph.b(context, h6Var);
        bVar.setLayoutParams(new v4.q0(org.telegram.messenger.g0.L(64.0f), -1));
        return bVar;
    }

    @Override // org.telegram.ui.Components.n41
    public final boolean e(o41 o41Var, o41 o41Var2) {
        return o41Var.C == o41Var2.C;
    }
}
