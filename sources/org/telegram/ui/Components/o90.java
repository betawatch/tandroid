package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class o90 extends ij0 {
    public final /* synthetic */ r90 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o90(r90 r90Var, Context context, String str, String str2, String str3) {
        super(context, str, str2, str3, false);
        this.s = r90Var;
    }

    @Override // org.telegram.ui.ActionBar.k3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.n2
    public final void dismiss() {
        super.dismiss();
        this.s.E = null;
    }
}
