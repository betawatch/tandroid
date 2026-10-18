package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class i41 extends r41 {
    public final /* synthetic */ Runnable T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i41(Context context, String str, String str2, CharSequence charSequence, TLRPC.InputPeer inputPeer, int i10, boolean z10, Runnable runnable) {
        super(context, str, str2, charSequence, inputPeer, i10, z10, null);
        this.T = runnable;
    }

    @Override // org.telegram.ui.Components.r41, org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        super.dismiss();
        Runnable runnable = this.T;
        if (runnable != null) {
            runnable.run();
        }
    }
}
