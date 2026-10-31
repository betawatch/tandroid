package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class b41 implements View.OnClickListener {
    public final /* synthetic */ m41 a;
    public final /* synthetic */ TLRPC.TL_authorization b;
    public final /* synthetic */ SessionsActivity c;
    public final /* synthetic */ c41 d;

    public b41(c41 c41Var, m41 m41Var, TLRPC.TL_authorization tL_authorization, SessionsActivity sessionsActivity) {
        this.d = c41Var;
        this.a = m41Var;
        this.b = tL_authorization;
        this.c = sessionsActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.d.j1.getParentActivity());
        String L0 = org.telegram.messenger.cd.L0(2131744229, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
        x1Var.T = L0;
        x1Var.R = org.telegram.messenger.cd.L0(2131754073, null);
        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131744234, null), new a7(this, this.a, this.b, 21));
        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
        this.c.showDialog(x1Var);
        TextView textView = (TextView) x1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.q7, null);
        }
    }
}
