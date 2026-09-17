package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes3.dex */
public final class gg extends p41 {
    public final /* synthetic */ hg h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gg(hg hgVar, Context context, org.telegram.ui.ActionBar.n2 n2Var, d51 d51Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, n2Var, d51Var, f6Var);
        this.h = hgVar;
    }

    @Override // org.telegram.ui.Components.p41, org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        super.dismiss();
        ChatActivityEnterView chatActivityEnterView = this.h.a;
        if (chatActivityEnterView.Z2 == this) {
            chatActivityEnterView.Z2 = null;
        }
        og ogVar = chatActivityEnterView.Y2;
        if (ogVar != null) {
            ogVar.z(false);
        }
    }
}
