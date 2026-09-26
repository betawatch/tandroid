package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
