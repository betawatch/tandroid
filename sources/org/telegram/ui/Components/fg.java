package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class fg extends o51 {
    public final /* synthetic */ gg h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fg(gg ggVar, Context context, org.telegram.ui.ActionBar.n2 n2Var, c61 c61Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, n2Var, c61Var, d6Var);
        this.h = ggVar;
    }

    @Override // org.telegram.ui.Components.o51, org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        super.dismiss();
        ChatActivityEnterView chatActivityEnterView = this.h.a;
        if (chatActivityEnterView.a3 == this) {
            chatActivityEnterView.a3 = null;
        }
        og ogVar = chatActivityEnterView.Z2;
        if (ogVar != null) {
            ogVar.C(false);
        }
    }
}
