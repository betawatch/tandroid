package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class d41 extends k41 {
    public final /* synthetic */ org.telegram.ui.rg T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d41(Activity activity, String str, String str2, TLRPC.InputPeer inputPeer, int i10, TL_iv.RichMessage richMessage, org.telegram.ui.rg rgVar) {
        super(activity, str, str2, null, inputPeer, i10, false, richMessage);
        this.T = rgVar;
    }

    @Override // org.telegram.ui.Components.k41, org.telegram.ui.ActionBar.e3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.i2
    public final void dismiss() {
        super.dismiss();
        this.T.run();
    }
}
