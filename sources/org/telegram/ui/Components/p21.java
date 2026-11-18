package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class p21 extends y21 {
    public final /* synthetic */ Runnable U1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p21(Context context, String str, String str2, CharSequence charSequence, TLRPC.InputPeer inputPeer, int i7, boolean z10, Runnable runnable) {
        super(context, str, str2, charSequence, inputPeer, i7, z10, null);
        this.U1 = runnable;
    }

    @Override // org.telegram.ui.Components.y21, org.telegram.ui.ActionBar.x2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.d2
    public final void dismiss() {
        super.dismiss();
        Runnable runnable = this.U1;
        if (runnable != null) {
            runnable.run();
        }
    }
}
