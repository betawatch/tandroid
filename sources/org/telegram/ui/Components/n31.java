package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class n31 extends u31 {
    public final /* synthetic */ org.telegram.ui.qf T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n31(Activity activity, String str, String str2, TLRPC.InputPeer inputPeer, int i10, TL_iv.RichMessage richMessage, org.telegram.ui.qf qfVar) {
        super(activity, str, str2, null, inputPeer, i10, false, richMessage);
        this.T = qfVar;
    }

    @Override // org.telegram.ui.Components.u31, org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        super.dismiss();
        this.T.run();
    }
}
