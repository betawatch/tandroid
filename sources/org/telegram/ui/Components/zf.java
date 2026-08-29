package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class zf extends e41 {
    public final /* synthetic */ ag h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zf(ag agVar, Context context, org.telegram.ui.ActionBar.o2 o2Var, s41 s41Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, o2Var, s41Var, c6Var);
        this.h = agVar;
    }

    @Override // org.telegram.ui.Components.e41, org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.k2
    public final void dismiss() {
        super.dismiss();
        ChatActivityEnterView chatActivityEnterView = this.h.a;
        if (chatActivityEnterView.V2 == this) {
            chatActivityEnterView.V2 = null;
        }
        hg hgVar = chatActivityEnterView.U2;
        if (hgVar != null) {
            hgVar.x(false);
        }
    }
}
