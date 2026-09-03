package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class m31 extends v31 {
    public final /* synthetic */ Runnable Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m31(Context context, String str, String str2, CharSequence charSequence, TLRPC.InputPeer inputPeer, int i10, boolean z4, Runnable runnable) {
        super(context, str, str2, charSequence, inputPeer, i10, z4, null);
        this.Q = runnable;
    }

    @Override // org.telegram.ui.Components.v31, org.telegram.ui.ActionBar.g3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.l2
    public final void dismiss() {
        super.dismiss();
        Runnable runnable = this.Q;
        if (runnable != null) {
            runnable.run();
        }
    }
}
