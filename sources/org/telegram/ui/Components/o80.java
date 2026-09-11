package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final /* synthetic */ class o80 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ w80 b;

    public /* synthetic */ o80(w80 w80Var, int i10) {
        this.a = i10;
        this.b = w80Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.r.d();
                break;
            case 1:
                w80 w80Var = this.b;
                org.telegram.ui.ActionBar.n1 n1Var = w80Var.s;
                if (n1Var != null) {
                    n1Var.d(true);
                }
                w80Var.r.b();
                break;
            case 2:
                w80 w80Var2 = this.b;
                String str = w80Var2.b;
                boolean z10 = str != null && str.endsWith("?direct");
                Context context = w80Var2.getContext();
                String string = LocaleController.getString(R.string.InviteByQRCode);
                String str2 = w80Var2.b;
                String str3 = w80Var2.J;
                if (str3 == null) {
                    str3 = LocaleController.getString(w80Var2.H ? z10 ? R.string.QRCodeLinkHelpChannelDirect : R.string.QRCodeLinkHelpChannel : R.string.QRCodeLinkHelpGroup);
                }
                t80 t80Var = new t80(w80Var2, context, string, str2, str3);
                w80Var2.E = t80Var;
                t80Var.m(R.raw.qr_code_logo);
                w80Var2.E.show();
                org.telegram.ui.ActionBar.n1 n1Var2 = w80Var2.s;
                if (n1Var2 != null) {
                    n1Var2.d(true);
                    break;
                }
                break;
            default:
                w80 w80Var3 = this.b;
                org.telegram.ui.ActionBar.n1 n1Var3 = w80Var3.s;
                if (n1Var3 != null) {
                    n1Var3.d(true);
                }
                org.telegram.ui.ActionBar.n2 n2Var = w80Var3.c;
                if (n2Var.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n2Var.getParentActivity());
                    alertDialog$Builder.a.R = LocaleController.getString(R.string.RevokeLink);
                    alertDialog$Builder.a.T = LocaleController.getString(R.string.RevokeAlert);
                    alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new n80(w80Var3, 1));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    TextView textView = (TextView) alertDialog$Builder.a.d(-1);
                    if (textView != null) {
                        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
                    }
                    alertDialog$Builder.o();
                    break;
                }
                break;
        }
    }
}
