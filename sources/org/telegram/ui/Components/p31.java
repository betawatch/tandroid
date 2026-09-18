package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class p31 extends w31 {
    public final /* synthetic */ org.telegram.ui.sf T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p31(Activity activity, String str, String str2, TLRPC.InputPeer inputPeer, int i10, TL_iv.RichMessage richMessage, org.telegram.ui.sf sfVar) {
        super(activity, str, str2, null, inputPeer, i10, false, richMessage);
        this.T = sfVar;
    }

    @Override // org.telegram.ui.Components.w31, org.telegram.ui.ActionBar.g3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.k2
    public final void dismiss() {
        super.dismiss();
        this.T.run();
    }
}
