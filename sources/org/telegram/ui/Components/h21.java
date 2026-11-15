package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class h21 extends p21 {
    public final /* synthetic */ org.telegram.ui.uf U1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h21(Activity activity, String str, String str2, TLRPC.InputPeer inputPeer, int i7, TL_iv.RichMessage richMessage, org.telegram.ui.uf ufVar) {
        super(activity, str, str2, null, inputPeer, i7, false, richMessage);
        this.U1 = ufVar;
    }

    @Override // org.telegram.ui.Components.p21, org.telegram.ui.ActionBar.u2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.a2
    public final void dismiss() {
        super.dismiss();
        this.U1.run();
    }
}
