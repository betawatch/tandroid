package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class e41 extends l41 {
    public final /* synthetic */ org.telegram.ui.ug T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e41(Activity activity, String str, String str2, TLRPC.InputPeer inputPeer, int i10, TL_iv.RichMessage richMessage, org.telegram.ui.ug ugVar) {
        super(activity, str, str2, null, inputPeer, i10, false, richMessage);
        this.T = ugVar;
    }

    @Override // org.telegram.ui.Components.l41, org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        super.dismiss();
        this.T.run();
    }
}
