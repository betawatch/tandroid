package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class d31 extends k31 {
    public final /* synthetic */ org.telegram.ui.df P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d31(Activity activity, String str, String str2, TLRPC.InputPeer inputPeer, int i10, TL_iv.RichMessage richMessage, org.telegram.ui.df dfVar) {
        super(activity, str, str2, null, inputPeer, i10, false, richMessage);
        this.P = dfVar;
    }

    @Override // org.telegram.ui.Components.k31, org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.k2
    public final void dismiss() {
        super.dismiss();
        this.P.run();
    }
}
