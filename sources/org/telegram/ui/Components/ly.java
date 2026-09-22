package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class ly extends h51 {
    public static final /* synthetic */ int a = 0;

    static {
        h51.setup(new ly());
    }

    public static i51 a(TLRPC.StickerSetCovered stickerSetCovered, cy cyVar, boolean z10) {
        i51 J = i51.J(ly.class);
        long j3 = stickerSetCovered.set.id;
        long j10 = 1 + j3;
        J.d = (int) (j10 ^ (j10 >>> 32));
        J.B = j3;
        J.G = stickerSetCovered;
        J.H = cyVar;
        J.e = z10;
        return J;
    }

    @Override // org.telegram.ui.Components.h51
    public final void bindView(View view, i51 i51Var, boolean z10, w51 w51Var, e61 e61Var) {
        nh.c cVar = (nh.c) view;
        Object obj = i51Var.G;
        if (obj instanceof TLRPC.TL_messages_stickerSet) {
            cVar.setPack((TLRPC.TL_messages_stickerSet) obj);
        } else if (obj instanceof TLRPC.StickerSetCovered) {
            TLRPC.Document document = ((cy) i51Var.H).e;
            cVar.d.setText(((TLRPC.StickerSetCovered) obj).set.short_name);
            cVar.c.d(document, null, null, null, false, false);
        }
        cVar.a(i51Var.e, false);
    }

    @Override // org.telegram.ui.Components.h51
    public final boolean contentsEquals(i51 i51Var, i51 i51Var2) {
        return i51Var.B == i51Var2.B && i51Var.e == i51Var2.e;
    }

    @Override // org.telegram.ui.Components.h51
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        nh.c cVar = new nh.c(context, e6Var);
        cVar.setLayoutParams(new s4.p0(AndroidUtilities.dp(64.0f), -1));
        return cVar;
    }

    @Override // org.telegram.ui.Components.h51
    public final boolean equals(i51 i51Var, i51 i51Var2) {
        return i51Var.B == i51Var2.B;
    }
}
