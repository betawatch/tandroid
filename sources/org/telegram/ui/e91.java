package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class e91 implements View.OnClickListener {
    public final /* synthetic */ y91 a;

    public e91(y91 y91Var) {
        this.a = y91Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        y91 y91Var = this.a;
        if (y91Var.M == 1) {
            org.telegram.ui.Components.v4.g0(y91Var, -y91Var.a, null, y91Var.g(), null, false, y91Var.J, new na(this, 4), y91Var.getResourceProvider());
            return;
        }
        y91Var.getMessagesController().m(y91Var.a, y91Var.getUserConfig().f(), 0, null, y91Var, false, new y81(y91Var, 2), new z81(y91Var), null);
        org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.I4, new Object[0]);
        y91Var.S0(false);
    }
}
