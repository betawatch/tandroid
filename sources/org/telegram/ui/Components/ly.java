package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ly extends h51 {
    public static final /* synthetic */ int a = 0;

    static {
        h51.setup(new ly());
    }

    public static i51 a(TLRPC.StickerSetCovered stickerSetCovered, ay ayVar, boolean z4) {
        i51 J = i51.J(ly.class);
        long j10 = stickerSetCovered.set.id;
        long j11 = 1 + j10;
        J.d = (int) (j11 ^ (j11 >>> 32));
        J.B = j10;
        J.G = stickerSetCovered;
        J.H = ayVar;
        J.e = z4;
        return J;
    }

    @Override // org.telegram.ui.Components.h51
    public final void bindView(View view, i51 i51Var, boolean z4, w51 w51Var, g61 g61Var) {
        ah.f fVar = (ah.f) view;
        Object obj = i51Var.G;
        if (obj instanceof TLRPC.TL_messages_stickerSet) {
            fVar.setPack((TLRPC.TL_messages_stickerSet) obj);
        } else if (obj instanceof TLRPC.StickerSetCovered) {
            TLRPC.Document document = ((ay) i51Var.H).e;
            fVar.d.setText(((TLRPC.StickerSetCovered) obj).set.short_name);
            fVar.c.d(document, null, null, null, false, false);
        }
        fVar.a(i51Var.e, false);
    }

    @Override // org.telegram.ui.Components.h51
    public final boolean contentsEquals(i51 i51Var, i51 i51Var2) {
        return i51Var.B == i51Var2.B && i51Var.e == i51Var2.e;
    }

    @Override // org.telegram.ui.Components.h51
    public final View createView(Context context, rl0 rl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        ah.f fVar = new ah.f(context, f6Var);
        fVar.setLayoutParams(new f2.w0(AndroidUtilities.dp(64.0f), -1));
        return fVar;
    }

    @Override // org.telegram.ui.Components.h51
    public final boolean equals(i51 i51Var, i51 i51Var2) {
        return i51Var.B == i51Var2.B;
    }
}
