package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class o31 extends w31 {
    public final /* synthetic */ org.telegram.ui.lf Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o31(Activity activity, String str, String str2, TLRPC.InputPeer inputPeer, int i10, TL_iv.RichMessage richMessage, org.telegram.ui.lf lfVar) {
        super(activity, str, str2, null, inputPeer, i10, false, richMessage);
        this.Q = lfVar;
    }

    @Override // org.telegram.ui.Components.w31, org.telegram.ui.ActionBar.h3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.l2
    public final void dismiss() {
        super.dismiss();
        this.Q.run();
    }
}
