package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final /* synthetic */ class x80 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ e90 b;

    public /* synthetic */ x80(e90 e90Var, int i10) {
        this.a = i10;
        this.b = e90Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.r.j();
                break;
            case 1:
                e90 e90Var = this.b;
                org.telegram.ui.ActionBar.n1 n1Var = e90Var.s;
                if (n1Var != null) {
                    n1Var.d(true);
                }
                e90Var.r.c();
                break;
            case 2:
                e90 e90Var2 = this.b;
                String str = e90Var2.b;
                boolean z10 = str != null && str.endsWith("?direct");
                Context context = e90Var2.getContext();
                String string = LocaleController.getString(R.string.InviteByQRCode);
                String str2 = e90Var2.b;
                String str3 = e90Var2.J;
                if (str3 == null) {
                    str3 = LocaleController.getString(e90Var2.H ? z10 ? R.string.QRCodeLinkHelpChannelDirect : R.string.QRCodeLinkHelpChannel : R.string.QRCodeLinkHelpGroup);
                }
                b90 b90Var = new b90(e90Var2, context, string, str2, str3);
                e90Var2.E = b90Var;
                b90Var.m(R.raw.qr_code_logo);
                e90Var2.E.show();
                org.telegram.ui.ActionBar.n1 n1Var2 = e90Var2.s;
                if (n1Var2 != null) {
                    n1Var2.d(true);
                    break;
                }
                break;
            default:
                e90 e90Var3 = this.b;
                org.telegram.ui.ActionBar.n1 n1Var3 = e90Var3.s;
                if (n1Var3 != null) {
                    n1Var3.d(true);
                }
                org.telegram.ui.ActionBar.n2 n2Var = e90Var3.c;
                if (n2Var.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n2Var.getParentActivity());
                    alertDialog$Builder.a.R = LocaleController.getString(R.string.RevokeLink);
                    alertDialog$Builder.a.T = LocaleController.getString(R.string.RevokeAlert);
                    alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new w80(e90Var3, 1));
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
