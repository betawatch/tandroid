package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class c21 extends k21 {
    public final /* synthetic */ org.telegram.ui.af Q1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c21(Activity activity, String str, String str2, TLRPC.InputPeer inputPeer, int i7, TL_iv.RichMessage richMessage, org.telegram.ui.af afVar) {
        super(activity, str, str2, null, inputPeer, i7, false, richMessage);
        this.Q1 = afVar;
    }

    @Override // org.telegram.ui.Components.k21, org.telegram.ui.ActionBar.v2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.b2
    public final void dismiss() {
        super.dismiss();
        this.Q1.run();
    }
}
