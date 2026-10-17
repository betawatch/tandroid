package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class j41 extends r41 {
    public final /* synthetic */ org.telegram.ui.mf T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j41(Activity activity, String str, String str2, TLRPC.InputPeer inputPeer, int i10, TL_iv.RichMessage richMessage, org.telegram.ui.mf mfVar) {
        super(activity, str, str2, null, inputPeer, i10, false, richMessage);
        this.T = mfVar;
    }

    @Override // org.telegram.ui.Components.r41, org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        super.dismiss();
        this.T.run();
    }
}
