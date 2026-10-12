package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class p90 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ w90 b;

    public /* synthetic */ p90(w90 w90Var, int i10) {
        this.a = i10;
        this.b = w90Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.r.h();
                break;
            case 1:
                w90 w90Var = this.b;
                org.telegram.ui.ActionBar.m1 m1Var = w90Var.s;
                if (m1Var != null) {
                    m1Var.d(true);
                }
                w90Var.r.c();
                break;
            case 2:
                w90 w90Var2 = this.b;
                String str = w90Var2.b;
                boolean z10 = str != null && str.endsWith("?direct");
                Context context = w90Var2.getContext();
                String string = LocaleController.getString(R.string.InviteByQRCode);
                String str2 = w90Var2.b;
                String str3 = w90Var2.J;
                if (str3 == null) {
                    str3 = LocaleController.getString(w90Var2.H ? z10 ? R.string.QRCodeLinkHelpChannelDirect : R.string.QRCodeLinkHelpChannel : R.string.QRCodeLinkHelpGroup);
                }
                t90 t90Var = new t90(w90Var2, context, string, str2, str3);
                w90Var2.E = t90Var;
                t90Var.n(R.raw.qr_code_logo);
                w90Var2.E.show();
                org.telegram.ui.ActionBar.m1 m1Var2 = w90Var2.s;
                if (m1Var2 != null) {
                    m1Var2.d(true);
                    break;
                }
                break;
            default:
                w90 w90Var3 = this.b;
                org.telegram.ui.ActionBar.m1 m1Var3 = w90Var3.s;
                if (m1Var3 != null) {
                    m1Var3.d(true);
                }
                org.telegram.ui.ActionBar.m2 m2Var = w90Var3.c;
                if (m2Var.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(m2Var.getParentActivity());
                    alertDialog$Builder.a.R = LocaleController.getString(R.string.RevokeLink);
                    alertDialog$Builder.a.T = LocaleController.getString(R.string.RevokeAlert);
                    alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new o90(w90Var3, 1));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    TextView textView = (TextView) alertDialog$Builder.a.d(-1);
                    if (textView != null) {
                        textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.q7, false));
                    }
                    alertDialog$Builder.o();
                    break;
                }
                break;
        }
    }
}
