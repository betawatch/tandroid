package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class x11 extends f21 {
    public final /* synthetic */ org.telegram.ui.xe R1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x11(Activity activity, String str, String str2, TLRPC.InputPeer inputPeer, int i3, TL_iv.RichMessage richMessage, org.telegram.ui.xe xeVar) {
        super(activity, str, str2, null, inputPeer, i3, false, richMessage);
        this.R1 = xeVar;
    }

    @Override // org.telegram.ui.Components.f21, org.telegram.ui.ActionBar.t2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.z1
    public final void dismiss() {
        super.dismiss();
        this.R1.run();
    }
}
