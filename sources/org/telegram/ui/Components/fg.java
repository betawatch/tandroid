package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class fg extends u51 {
    public final /* synthetic */ gg f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fg(gg ggVar, Context context, org.telegram.ui.ActionBar.o2 o2Var, i61 i61Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, o2Var, i61Var, g6Var);
        this.f = ggVar;
    }

    @Override // org.telegram.ui.Components.u51, org.telegram.ui.ActionBar.h3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.k2
    public final void dismiss() {
        super.dismiss();
        ChatActivityEnterView chatActivityEnterView = this.f.a;
        if (chatActivityEnterView.a3 == this) {
            chatActivityEnterView.a3 = null;
        }
        og ogVar = chatActivityEnterView.Z2;
        if (ogVar != null) {
            ogVar.C(false);
        }
    }
}
