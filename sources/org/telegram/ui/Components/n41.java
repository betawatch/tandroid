package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
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
