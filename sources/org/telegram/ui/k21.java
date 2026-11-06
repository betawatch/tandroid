package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class k21 implements View.OnClickListener {
    public final /* synthetic */ v21 a;
    public final /* synthetic */ TLRPC.TL_authorization b;
    public final /* synthetic */ SessionsActivity c;
    public final /* synthetic */ l21 d;

    public k21(l21 l21Var, v21 v21Var, TLRPC.TL_authorization tL_authorization, SessionsActivity sessionsActivity) {
        this.d = l21Var;
        this.a = v21Var;
        this.b = tL_authorization;
        this.c = sessionsActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.d.j1.getParentActivity());
        String M0 = org.telegram.messenger.hd.M0(2131744205, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.T = M0;
        u1Var.R = org.telegram.messenger.hd.M0(2131754073, null);
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131744210, null), new a7(this, this.a, this.b, 21));
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
        this.c.showDialog(u1Var);
        TextView textView = (TextView) u1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q7, null);
        }
    }
}
