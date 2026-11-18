package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
