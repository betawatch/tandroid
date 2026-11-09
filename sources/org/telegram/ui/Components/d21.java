package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class d21 extends l21 {
    public final /* synthetic */ org.telegram.ui.xf Q1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d21(Activity activity, String str, String str2, TLRPC.InputPeer inputPeer, int i7, TL_iv.RichMessage richMessage, org.telegram.ui.xf xfVar) {
        super(activity, str, str2, null, inputPeer, i7, false, richMessage);
        this.Q1 = xfVar;
    }

    @Override // org.telegram.ui.Components.l21, org.telegram.ui.ActionBar.v2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.b2
    public final void dismiss() {
        super.dismiss();
        this.Q1.run();
    }
}
