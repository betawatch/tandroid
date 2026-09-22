package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class c81 implements View.OnClickListener {
    public final /* synthetic */ n81 a;
    public final /* synthetic */ TLRPC.TL_authorization b;
    public final /* synthetic */ SessionsActivity c;
    public final /* synthetic */ e81 d;

    public c81(e81 e81Var, n81 n81Var, TLRPC.TL_authorization tL_authorization, SessionsActivity sessionsActivity) {
        this.d = e81Var;
        this.a = n81Var;
        this.b = tL_authorization;
        this.c = sessionsActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.d.c.getParentActivity());
        alertDialog$Builder.a.T = LocaleController.getString(R.string.TerminateSessionText);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.AreYouSureSessionTitle);
        alertDialog$Builder.k(LocaleController.getString(R.string.Terminate), new b7(this, this.a, this.b, 21));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        SessionsActivity sessionsActivity = this.c;
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        sessionsActivity.showDialog(b2Var);
        TextView textView = (TextView) b2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.q7, false));
        }
    }
}
