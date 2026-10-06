package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class n41 extends u41 {
    public final /* synthetic */ org.telegram.ui.yf T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n41(Activity activity, String str, String str2, TLRPC.InputPeer inputPeer, int i10, TL_iv.RichMessage richMessage, org.telegram.ui.yf yfVar) {
        super(activity, str, str2, null, inputPeer, i10, false, richMessage);
        this.T = yfVar;
    }

    @Override // org.telegram.ui.Components.u41, org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        super.dismiss();
        this.T.run();
    }
}
