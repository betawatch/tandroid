package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class u41 extends b51 {
    public final /* synthetic */ org.telegram.ui.rf T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u41(Activity activity, String str, String str2, TLRPC.InputPeer inputPeer, int i10, TL_iv.RichMessage richMessage, org.telegram.ui.rf rfVar) {
        super(activity, str, str2, null, inputPeer, i10, false, richMessage);
        this.T = rfVar;
    }

    @Override // org.telegram.ui.Components.b51, org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        super.dismiss();
        this.T.run();
    }
}
