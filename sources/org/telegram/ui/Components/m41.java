package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class m41 extends t41 {
    public final /* synthetic */ org.telegram.ui.yf T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m41(Activity activity, String str, String str2, TLRPC.InputPeer inputPeer, int i10, TL_iv.RichMessage richMessage, org.telegram.ui.yf yfVar) {
        super(activity, str, str2, null, inputPeer, i10, false, richMessage);
        this.T = yfVar;
    }

    @Override // org.telegram.ui.Components.t41, org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        super.dismiss();
        this.T.run();
    }
}
