package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class w11 extends e21 {
    public final /* synthetic */ org.telegram.ui.af Q1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w11(Activity activity, String str, String str2, TLRPC.InputPeer inputPeer, int i7, TL_iv.RichMessage richMessage, org.telegram.ui.af afVar) {
        super(activity, str, str2, null, inputPeer, i7, false, richMessage);
        this.Q1 = afVar;
    }

    @Override // org.telegram.ui.Components.e21, org.telegram.ui.ActionBar.v2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.b2
    public final void dismiss() {
        super.dismiss();
        this.Q1.run();
    }
}
