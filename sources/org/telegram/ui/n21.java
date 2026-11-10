package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class n21 implements View.OnClickListener {
    public final /* synthetic */ y21 a;
    public final /* synthetic */ TLRPC.TL_authorization b;
    public final /* synthetic */ SessionsActivity c;
    public final /* synthetic */ o21 d;

    public n21(o21 o21Var, y21 y21Var, TLRPC.TL_authorization tL_authorization, SessionsActivity sessionsActivity) {
        this.d = o21Var;
        this.a = y21Var;
        this.b = tL_authorization;
        this.c = sessionsActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.d.m1.getParentActivity());
        String M0 = org.telegram.messenger.id.M0(2131744204, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.T = M0;
        u1Var.R = org.telegram.messenger.id.M0(2131754073, null);
        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131744209, null), new a7(this, this.a, this.b, 21));
        alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
        this.c.showDialog(u1Var);
        TextView textView = (TextView) u1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.q7, null);
        }
    }
}
