package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class h21 implements View.OnClickListener {
    public final /* synthetic */ s21 a;
    public final /* synthetic */ TLRPC.TL_authorization b;
    public final /* synthetic */ SessionsActivity c;
    public final /* synthetic */ i21 d;

    public h21(i21 i21Var, s21 s21Var, TLRPC.TL_authorization tL_authorization, SessionsActivity sessionsActivity) {
        this.d = i21Var;
        this.a = s21Var;
        this.b = tL_authorization;
        this.c = sessionsActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.d.n1.getParentActivity());
        String M0 = org.telegram.messenger.hd.M0(2131744204, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.U = M0;
        t1Var.S = org.telegram.messenger.hd.M0(2131754073, null);
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131744209, null), new a7(this, this.a, this.b, 21));
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
        this.c.showDialog(t1Var);
        TextView textView = (TextView) t1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.q7, null);
        }
    }
}
