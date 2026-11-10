package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class ix extends w31 {
    public static final /* synthetic */ int b = 0;

    static {
        w31.h(new ix());
    }

    public static x31 i(TLRPC.StickerSetCovered stickerSetCovered, yw ywVar, boolean z9) {
        x31 K = x31.K(ix.class);
        long j3 = stickerSetCovered.set.id;
        long j10 = 1 + j3;
        K.d = (int) (j10 ^ (j10 >>> 32));
        K.B = j3;
        K.G = stickerSetCovered;
        K.H = ywVar;
        K.e = z9;
        return K;
    }

    @Override // org.telegram.ui.Components.w31
    public final void b(View view, x31 x31Var, boolean z9, m41 m41Var, r41 r41Var) {
        ph.b bVar = (ph.b) view;
        Object obj = x31Var.G;
        if (obj instanceof TLRPC.TL_messages_stickerSet) {
            bVar.setPack((TLRPC.TL_messages_stickerSet) obj);
        } else if (obj instanceof TLRPC.StickerSetCovered) {
            TLRPC.Document document = ((yw) x31Var.H).e;
            bVar.d.setText(((TLRPC.StickerSetCovered) obj).set.short_name);
            bVar.c.d(document, null, null, null, false, false);
        }
        bVar.a(x31Var.e, false);
    }

    @Override // org.telegram.ui.Components.w31
    public final boolean c(x31 x31Var, x31 x31Var2) {
        return x31Var.B == x31Var2.B && x31Var.e == x31Var2.e;
    }

    @Override // org.telegram.ui.Components.w31
    public final View d(Context context, pj0 pj0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        ph.b bVar = new ph.b(context, h6Var);
        bVar.setLayoutParams(new v4.o0(org.telegram.messenger.g0.L(64.0f), -1));
        return bVar;
    }

    @Override // org.telegram.ui.Components.w31
    public final boolean e(x31 x31Var, x31 x31Var2) {
        return x31Var.B == x31Var2.B;
    }
}
