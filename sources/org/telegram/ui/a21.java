package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class a21 implements View.OnClickListener {
    public final /* synthetic */ k21 a;
    public final /* synthetic */ TLRPC.TL_authorization b;
    public final /* synthetic */ SessionsActivity c;
    public final /* synthetic */ b21 d;

    public a21(b21 b21Var, k21 k21Var, TLRPC.TL_authorization tL_authorization, SessionsActivity sessionsActivity) {
        this.d = b21Var;
        this.a = k21Var;
        this.b = tL_authorization;
        this.c = sessionsActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.d.k1.getParentActivity());
        String M0 = org.telegram.messenger.bd.M0(2131744214, null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
        s1Var.U = M0;
        s1Var.S = org.telegram.messenger.bd.M0(2131754073, null);
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131744219, null), new b7(this, this.a, this.b, 21));
        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
        this.c.showDialog(s1Var);
        TextView textView = (TextView) s1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q7, null);
        }
    }
}
