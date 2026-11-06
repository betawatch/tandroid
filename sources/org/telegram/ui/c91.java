package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class c91 implements View.OnClickListener {
    public final /* synthetic */ v91 a;

    public c91(v91 v91Var) {
        this.a = v91Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        v91 v91Var = this.a;
        if (v91Var.M == 1) {
            org.telegram.ui.Components.v4.g0(v91Var, -v91Var.a, null, v91Var.g(), null, false, v91Var.J, new na(this, 4), v91Var.getResourceProvider());
            return;
        }
        v91Var.getMessagesController().m(v91Var.a, v91Var.getUserConfig().f(), 0, null, v91Var, false, new w81(v91Var, 2), new x81(v91Var), null);
        org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.I4, new Object[0]);
        v91Var.S0(false);
    }
}
