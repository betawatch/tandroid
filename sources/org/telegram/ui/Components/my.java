package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class my extends g51 {
    public static final /* synthetic */ int a = 0;

    static {
        g51.setup(new my());
    }

    public static h51 a(TLRPC.StickerSetCovered stickerSetCovered, dy dyVar, boolean z10) {
        h51 J = h51.J(my.class);
        long j3 = stickerSetCovered.set.id;
        long j10 = 1 + j3;
        J.d = (int) (j10 ^ (j10 >>> 32));
        J.B = j3;
        J.G = stickerSetCovered;
        J.H = dyVar;
        J.e = z10;
        return J;
    }

    @Override // org.telegram.ui.Components.g51
    public final void bindView(View view, h51 h51Var, boolean z10, v51 v51Var, d61 d61Var) {
        oh.c cVar = (oh.c) view;
        Object obj = h51Var.G;
        if (obj instanceof TLRPC.TL_messages_stickerSet) {
            cVar.setPack((TLRPC.TL_messages_stickerSet) obj);
        } else if (obj instanceof TLRPC.StickerSetCovered) {
            TLRPC.Document document = ((dy) h51Var.H).e;
            cVar.d.setText(((TLRPC.StickerSetCovered) obj).set.short_name);
            cVar.c.d(document, null, null, null, false, false);
        }
        cVar.a(h51Var.e, false);
    }

    @Override // org.telegram.ui.Components.g51
    public final boolean contentsEquals(h51 h51Var, h51 h51Var2) {
        return h51Var.B == h51Var2.B && h51Var.e == h51Var2.e;
    }

    @Override // org.telegram.ui.Components.g51
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        oh.c cVar = new oh.c(context, f6Var);
        cVar.setLayoutParams(new s4.p0(AndroidUtilities.dp(64.0f), -1));
        return cVar;
    }

    @Override // org.telegram.ui.Components.g51
    public final boolean equals(h51 h51Var, h51 h51Var2) {
        return h51Var.B == h51Var2.B;
    }
}
