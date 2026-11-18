package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class l21 implements View.OnClickListener {
    public final /* synthetic */ w21 a;
    public final /* synthetic */ TLRPC.TL_authorization b;
    public final /* synthetic */ SessionsActivity c;
    public final /* synthetic */ m21 d;

    public l21(m21 m21Var, w21 w21Var, TLRPC.TL_authorization tL_authorization, SessionsActivity sessionsActivity) {
        this.d = m21Var;
        this.a = w21Var;
        this.b = tL_authorization;
        this.c = sessionsActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.d.n1.getParentActivity());
        String M0 = org.telegram.messenger.gd.M0(2131743969, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.U = M0;
        u1Var.S = org.telegram.messenger.gd.M0(2131754071, null);
        alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131743974, null), new z6(this, this.a, this.b, 21));
        alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
        this.c.showDialog(u1Var);
        TextView textView = (TextView) u1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.q7, null);
        }
    }
}
