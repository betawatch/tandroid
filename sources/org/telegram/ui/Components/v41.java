package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class v41 extends f51 {
    public final /* synthetic */ Runnable Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v41(Context context, String str, String str2, CharSequence charSequence, TLRPC.InputPeer inputPeer, int i10, boolean z10, Runnable runnable) {
        super(context, str, str2, charSequence, inputPeer, i10, z10, null);
        this.Z = runnable;
    }

    @Override // org.telegram.ui.Components.f51, org.telegram.ui.ActionBar.k3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.n2
    public final void dismiss() {
        super.dismiss();
        Runnable runnable = this.Z;
        if (runnable != null) {
            runnable.run();
        }
    }
}
