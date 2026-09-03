package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class n31 extends v31 {
    public final /* synthetic */ org.telegram.ui.lf Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n31(Activity activity, String str, String str2, TLRPC.InputPeer inputPeer, int i10, TL_iv.RichMessage richMessage, org.telegram.ui.lf lfVar) {
        super(activity, str, str2, null, inputPeer, i10, false, richMessage);
        this.Q = lfVar;
    }

    @Override // org.telegram.ui.Components.v31, org.telegram.ui.ActionBar.h3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.l2
    public final void dismiss() {
        super.dismiss();
        this.Q.run();
    }
}
