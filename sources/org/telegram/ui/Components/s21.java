package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class s21 extends b31 {
    public final /* synthetic */ Runnable U1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s21(Context context, String str, String str2, CharSequence charSequence, TLRPC.InputPeer inputPeer, int i7, boolean z10, Runnable runnable) {
        super(context, str, str2, charSequence, inputPeer, i7, z10, null);
        this.U1 = runnable;
    }

    @Override // org.telegram.ui.Components.b31, org.telegram.ui.ActionBar.w2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.c2
    public final void dismiss() {
        super.dismiss();
        Runnable runnable = this.U1;
        if (runnable != null) {
            runnable.run();
        }
    }
}
