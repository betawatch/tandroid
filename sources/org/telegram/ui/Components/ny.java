package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class ny extends u51 {
    public static final /* synthetic */ int a = 0;

    static {
        u51.setup(new ny());
    }

    public static v51 a(TLRPC.StickerSetCovered stickerSetCovered, ey eyVar, boolean z10) {
        v51 J = v51.J(ny.class);
        long j3 = stickerSetCovered.set.id;
        long j10 = 1 + j3;
        J.d = (int) (j10 ^ (j10 >>> 32));
        J.B = j3;
        J.G = stickerSetCovered;
        J.H = eyVar;
        J.e = z10;
        return J;
    }

    @Override // org.telegram.ui.Components.u51
    public final void bindView(View view, v51 v51Var, boolean z10, j61 j61Var, r61 r61Var) {
        nh.c cVar = (nh.c) view;
        Object obj = v51Var.G;
        if (obj instanceof TLRPC.TL_messages_stickerSet) {
            cVar.setPack((TLRPC.TL_messages_stickerSet) obj);
        } else if (obj instanceof TLRPC.StickerSetCovered) {
            TLRPC.Document document = ((ey) v51Var.H).e;
            cVar.d.setText(((TLRPC.StickerSetCovered) obj).set.short_name);
            cVar.c.d(document, null, null, null, false, false);
        }
        cVar.a(v51Var.e, false);
    }

    @Override // org.telegram.ui.Components.u51
    public final boolean contentsEquals(v51 v51Var, v51 v51Var2) {
        return v51Var.B == v51Var2.B && v51Var.e == v51Var2.e;
    }

    @Override // org.telegram.ui.Components.u51
    public final View createView(Context context, wl0 wl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        nh.c cVar = new nh.c(context, d6Var);
        cVar.setLayoutParams(new s4.p0(AndroidUtilities.dp(64.0f), -1));
        return cVar;
    }

    @Override // org.telegram.ui.Components.u51
    public final boolean equals(v51 v51Var, v51 v51Var2) {
        return v51Var.B == v51Var2.B;
    }
}
