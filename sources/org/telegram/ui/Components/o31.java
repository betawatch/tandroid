package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class o31 extends w31 {
    public final /* synthetic */ Runnable T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o31(Context context, String str, String str2, CharSequence charSequence, TLRPC.InputPeer inputPeer, int i10, boolean z10, Runnable runnable) {
        super(context, str, str2, charSequence, inputPeer, i10, z10, null);
        this.T = runnable;
    }

    @Override // org.telegram.ui.Components.w31, org.telegram.ui.ActionBar.g3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.k2
    public final void dismiss() {
        super.dismiss();
        Runnable runnable = this.T;
        if (runnable != null) {
            runnable.run();
        }
    }
}
