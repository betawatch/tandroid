package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class t21 extends b31 {
    public final /* synthetic */ org.telegram.ui.vf U1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t21(Activity activity, String str, String str2, TLRPC.InputPeer inputPeer, int i7, TL_iv.RichMessage richMessage, org.telegram.ui.vf vfVar) {
        super(activity, str, str2, null, inputPeer, i7, false, richMessage);
        this.U1 = vfVar;
    }

    @Override // org.telegram.ui.Components.b31, org.telegram.ui.ActionBar.w2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.c2
    public final void dismiss() {
        super.dismiss();
        this.U1.run();
    }
}
