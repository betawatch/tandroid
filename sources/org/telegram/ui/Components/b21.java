package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class b21 extends k21 {
    public final /* synthetic */ Runnable T1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b21(Context context, String str, String str2, CharSequence charSequence, TLRPC.InputPeer inputPeer, int i7, boolean z9, Runnable runnable) {
        super(context, str, str2, charSequence, inputPeer, i7, z9, null);
        this.T1 = runnable;
    }

    @Override // org.telegram.ui.Components.k21, org.telegram.ui.ActionBar.w2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.b2
    public final void dismiss() {
        super.dismiss();
        Runnable runnable = this.T1;
        if (runnable != null) {
            runnable.run();
        }
    }
}
