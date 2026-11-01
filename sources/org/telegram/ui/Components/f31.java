package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class f31 extends n31 {
    public final /* synthetic */ org.telegram.ui.ng Q1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f31(Activity activity, String str, String str2, TLRPC.InputPeer inputPeer, int i10, TL_iv.RichMessage richMessage, org.telegram.ui.ng ngVar) {
        super(activity, str, str2, null, inputPeer, i10, false, richMessage);
        this.Q1 = ngVar;
    }

    @Override // org.telegram.ui.Components.n31, org.telegram.ui.ActionBar.z2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.g2
    public final void dismiss() {
        super.dismiss();
        this.Q1.run();
    }
}
