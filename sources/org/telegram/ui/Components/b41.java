package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class b41 extends i41 {
    public final /* synthetic */ org.telegram.ui.rg T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b41(Activity activity, String str, String str2, TLRPC.InputPeer inputPeer, int i10, TL_iv.RichMessage richMessage, org.telegram.ui.rg rgVar) {
        super(activity, str, str2, null, inputPeer, i10, false, richMessage);
        this.T = rgVar;
    }

    @Override // org.telegram.ui.Components.i41, org.telegram.ui.ActionBar.e3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.i2
    public final void dismiss() {
        super.dismiss();
        this.T.run();
    }
}
