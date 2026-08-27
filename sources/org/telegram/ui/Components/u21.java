package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class u21 extends b31 {
    public final /* synthetic */ org.telegram.ui.gf P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u21(Activity activity, String str, String str2, TLRPC.InputPeer inputPeer, int i10, TL_iv.RichMessage richMessage, org.telegram.ui.gf gfVar) {
        super(activity, str, str2, null, inputPeer, i10, false, richMessage);
        this.P = gfVar;
    }

    @Override // org.telegram.ui.Components.b31, org.telegram.ui.ActionBar.e3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        super.dismiss();
        this.P.run();
    }
}
