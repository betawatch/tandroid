package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class w11 extends f21 {
    public final /* synthetic */ Runnable R1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w11(Context context, String str, String str2, CharSequence charSequence, TLRPC.InputPeer inputPeer, int i3, boolean z10, Runnable runnable) {
        super(context, str, str2, charSequence, inputPeer, i3, z10, null);
        this.R1 = runnable;
    }

    @Override // org.telegram.ui.Components.f21, org.telegram.ui.ActionBar.t2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.z1
    public final void dismiss() {
        super.dismiss();
        Runnable runnable = this.R1;
        if (runnable != null) {
            runnable.run();
        }
    }
}
