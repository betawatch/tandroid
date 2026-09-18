package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class eg extends r41 {
    public final /* synthetic */ fg h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eg(fg fgVar, Context context, org.telegram.ui.ActionBar.o2 o2Var, f51 f51Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, o2Var, f51Var, f6Var);
        this.h = fgVar;
    }

    @Override // org.telegram.ui.Components.r41, org.telegram.ui.ActionBar.g3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.k2
    public final void dismiss() {
        super.dismiss();
        ChatActivityEnterView chatActivityEnterView = this.h.a;
        if (chatActivityEnterView.Z2 == this) {
            chatActivityEnterView.Z2 = null;
        }
        mg mgVar = chatActivityEnterView.Y2;
        if (mgVar != null) {
            mgVar.B(false);
        }
    }
}
