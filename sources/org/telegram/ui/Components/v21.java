package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class v21 extends b31 {
    public final /* synthetic */ Runnable P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v21(Context context, String str, String str2, CharSequence charSequence, Runnable runnable) {
        super(context, str, str2, charSequence, null, 0, false, null);
        this.P = runnable;
    }

    @Override // org.telegram.ui.Components.b31, org.telegram.ui.ActionBar.e3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        super.dismiss();
        Runnable runnable = this.P;
        if (runnable != null) {
            runnable.run();
        }
    }
}
