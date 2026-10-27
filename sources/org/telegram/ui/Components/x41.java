package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class x41 extends g51 {
    public final /* synthetic */ org.telegram.ui.ig Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x41(Activity activity, String str, String str2, TLRPC.InputPeer inputPeer, int i10, TL_iv.RichMessage richMessage, org.telegram.ui.ig igVar) {
        super(activity, str, str2, null, inputPeer, i10, false, richMessage);
        this.Z = igVar;
    }

    @Override // org.telegram.ui.Components.g51, org.telegram.ui.ActionBar.k3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.n2
    public final void dismiss() {
        super.dismiss();
        this.Z.run();
    }
}
