package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class o31 extends v31 {
    public final /* synthetic */ org.telegram.ui.qf T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o31(Activity activity, String str, String str2, TLRPC.InputPeer inputPeer, int i10, TL_iv.RichMessage richMessage, org.telegram.ui.qf qfVar) {
        super(activity, str, str2, null, inputPeer, i10, false, richMessage);
        this.T = qfVar;
    }

    @Override // org.telegram.ui.Components.v31, org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        super.dismiss();
        this.T.run();
    }
}
