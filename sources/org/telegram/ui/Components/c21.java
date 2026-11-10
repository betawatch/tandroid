package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class c21 extends k21 {
    public final /* synthetic */ org.telegram.ui.xf T1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c21(Activity activity, String str, String str2, TLRPC.InputPeer inputPeer, int i7, TL_iv.RichMessage richMessage, org.telegram.ui.xf xfVar) {
        super(activity, str, str2, null, inputPeer, i7, false, richMessage);
        this.T1 = xfVar;
    }

    @Override // org.telegram.ui.Components.k21, org.telegram.ui.ActionBar.w2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.b2
    public final void dismiss() {
        super.dismiss();
        this.T1.run();
    }
}
