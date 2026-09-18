package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class d41 extends k41 {
    public final /* synthetic */ org.telegram.ui.ug T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d41(Activity activity, String str, String str2, TLRPC.InputPeer inputPeer, int i10, TL_iv.RichMessage richMessage, org.telegram.ui.ug ugVar) {
        super(activity, str, str2, null, inputPeer, i10, false, richMessage);
        this.T = ugVar;
    }

    @Override // org.telegram.ui.Components.k41, org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        super.dismiss();
        this.T.run();
    }
}
