package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class b41 extends i41 {
    public final /* synthetic */ org.telegram.ui.sf T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b41(Activity activity, String str, String str2, TLRPC.InputPeer inputPeer, int i10, TL_iv.RichMessage richMessage, org.telegram.ui.sf sfVar) {
        super(activity, str, str2, null, inputPeer, i10, false, richMessage);
        this.T = sfVar;
    }

    @Override // org.telegram.ui.Components.i41, org.telegram.ui.ActionBar.h3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.l2
    public final void dismiss() {
        super.dismiss();
        this.T.run();
    }
}
