package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q90 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ x90 b;

    public /* synthetic */ q90(x90 x90Var, int i10) {
        this.a = i10;
        this.b = x90Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.r.i();
                break;
            case 1:
                x90 x90Var = this.b;
                org.telegram.ui.ActionBar.n1 n1Var = x90Var.s;
                if (n1Var != null) {
                    n1Var.d(true);
                }
                x90Var.r.a();
                break;
            case 2:
                x90 x90Var2 = this.b;
                String str = x90Var2.b;
                boolean z10 = str != null && str.endsWith("?direct");
                Context context = x90Var2.getContext();
                String string = LocaleController.getString(R.string.InviteByQRCode);
                String str2 = x90Var2.b;
                String str3 = x90Var2.J;
                if (str3 == null) {
                    str3 = LocaleController.getString(x90Var2.H ? z10 ? R.string.QRCodeLinkHelpChannelDirect : R.string.QRCodeLinkHelpChannel : R.string.QRCodeLinkHelpGroup);
                }
                u90 u90Var = new u90(x90Var2, context, string, str2, str3);
                x90Var2.E = u90Var;
                u90Var.o(R.raw.qr_code_logo);
                x90Var2.E.show();
                org.telegram.ui.ActionBar.n1 n1Var2 = x90Var2.s;
                if (n1Var2 != null) {
                    n1Var2.d(true);
                    break;
                }
                break;
            default:
                x90 x90Var3 = this.b;
                org.telegram.ui.ActionBar.n1 n1Var3 = x90Var3.s;
                if (n1Var3 != null) {
                    n1Var3.d(true);
                }
                org.telegram.ui.ActionBar.n2 n2Var = x90Var3.c;
                if (n2Var.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n2Var.getParentActivity());
                    alertDialog$Builder.a.R = LocaleController.getString(R.string.RevokeLink);
                    alertDialog$Builder.a.T = LocaleController.getString(R.string.RevokeAlert);
                    alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new p90(x90Var3, 1));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    TextView textView = (TextView) alertDialog$Builder.a.d(-1);
                    if (textView != null) {
                        textView.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.q7, false));
                    }
                    alertDialog$Builder.o();
                    break;
                }
                break;
        }
    }
}
