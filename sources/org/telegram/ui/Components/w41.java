package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class w41 extends f51 {
    public final /* synthetic */ org.telegram.ui.kf Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w41(Activity activity, String str, String str2, TLRPC.InputPeer inputPeer, int i10, TL_iv.RichMessage richMessage, org.telegram.ui.kf kfVar) {
        super(activity, str, str2, null, inputPeer, i10, false, richMessage);
        this.Z = kfVar;
    }

    @Override // org.telegram.ui.Components.f51, org.telegram.ui.ActionBar.k3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.n2
    public final void dismiss() {
        super.dismiss();
        this.Z.run();
    }
}
