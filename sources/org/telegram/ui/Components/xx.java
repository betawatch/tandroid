package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class xx extends k41 {
    public static final /* synthetic */ int a = 0;

    static {
        k41.setup(new xx());
    }

    public static l41 a(TLRPC.StickerSetCovered stickerSetCovered, ox oxVar, boolean z10) {
        l41 J = l41.J(xx.class);
        long j10 = stickerSetCovered.set.id;
        long j11 = 1 + j10;
        J.d = (int) (j11 ^ (j11 >>> 32));
        J.B = j10;
        J.G = stickerSetCovered;
        J.H = oxVar;
        J.e = z10;
        return J;
    }

    @Override // org.telegram.ui.Components.k41
    public final void bindView(View view, l41 l41Var, boolean z10, z41 z41Var, i51 i51Var) {
        vg.d dVar = (vg.d) view;
        Object obj = l41Var.G;
        if (obj instanceof TLRPC.TL_messages_stickerSet) {
            dVar.setPack((TLRPC.TL_messages_stickerSet) obj);
        } else if (obj instanceof TLRPC.StickerSetCovered) {
            TLRPC.Document document = ((ox) l41Var.H).e;
            dVar.d.setText(((TLRPC.StickerSetCovered) obj).set.short_name);
            dVar.c.d(document, null, null, null, false, false);
        }
        dVar.a(l41Var.e, false);
    }

    @Override // org.telegram.ui.Components.k41
    public final boolean contentsEquals(l41 l41Var, l41 l41Var2) {
        return l41Var.B == l41Var2.B && l41Var.e == l41Var2.e;
    }

    @Override // org.telegram.ui.Components.k41
    public final View createView(Context context, wk0 wk0Var, int i9, int i10, org.telegram.ui.ActionBar.b6 b6Var) {
        vg.d dVar = new vg.d(context, b6Var);
        dVar.setLayoutParams(new f2.a1(AndroidUtilities.dp(64.0f), -1));
        return dVar;
    }

    @Override // org.telegram.ui.Components.k41
    public final boolean equals(l41 l41Var, l41 l41Var2) {
        return l41Var.B == l41Var2.B;
    }
}
