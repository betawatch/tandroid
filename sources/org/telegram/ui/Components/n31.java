package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class n31 extends v31 {
    public final /* synthetic */ Runnable T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n31(Context context, String str, String str2, CharSequence charSequence, TLRPC.InputPeer inputPeer, int i10, boolean z10, Runnable runnable) {
        super(context, str, str2, charSequence, inputPeer, i10, z10, null);
        this.T = runnable;
    }

    @Override // org.telegram.ui.Components.v31, org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        super.dismiss();
        Runnable runnable = this.T;
        if (runnable != null) {
            runnable.run();
        }
    }
}
