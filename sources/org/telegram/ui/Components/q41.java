package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class q41 extends x41 {
    public final /* synthetic */ org.telegram.ui.wf T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q41(Activity activity, String str, String str2, TLRPC.InputPeer inputPeer, int i10, TL_iv.RichMessage richMessage, org.telegram.ui.wf wfVar) {
        super(activity, str, str2, null, inputPeer, i10, false, richMessage);
        this.T = wfVar;
    }

    @Override // org.telegram.ui.Components.x41, org.telegram.ui.ActionBar.e3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.i2
    public final void dismiss() {
        super.dismiss();
        this.T.run();
    }
}
