package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class z80 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ g90 b;

    public /* synthetic */ z80(g90 g90Var, int i10) {
        this.a = i10;
        this.b = g90Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.r.h();
                break;
            case 1:
                g90 g90Var = this.b;
                org.telegram.ui.ActionBar.n1 n1Var = g90Var.s;
                if (n1Var != null) {
                    n1Var.d(true);
                }
                g90Var.r.a();
                break;
            case 2:
                g90 g90Var2 = this.b;
                String str = g90Var2.b;
                boolean z10 = str != null && str.endsWith("?direct");
                Context context = g90Var2.getContext();
                String string = LocaleController.getString(R.string.InviteByQRCode);
                String str2 = g90Var2.b;
                String str3 = g90Var2.J;
                if (str3 == null) {
                    str3 = LocaleController.getString(g90Var2.H ? z10 ? R.string.QRCodeLinkHelpChannelDirect : R.string.QRCodeLinkHelpChannel : R.string.QRCodeLinkHelpGroup);
                }
                d90 d90Var = new d90(g90Var2, context, string, str2, str3);
                g90Var2.E = d90Var;
                d90Var.m(R.raw.qr_code_logo);
                g90Var2.E.show();
                org.telegram.ui.ActionBar.n1 n1Var2 = g90Var2.s;
                if (n1Var2 != null) {
                    n1Var2.d(true);
                    break;
                }
                break;
            default:
                g90 g90Var3 = this.b;
                org.telegram.ui.ActionBar.n1 n1Var3 = g90Var3.s;
                if (n1Var3 != null) {
                    n1Var3.d(true);
                }
                org.telegram.ui.ActionBar.n2 n2Var = g90Var3.c;
                if (n2Var.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n2Var.getParentActivity());
                    alertDialog$Builder.a.R = LocaleController.getString(R.string.RevokeLink);
                    alertDialog$Builder.a.T = LocaleController.getString(R.string.RevokeAlert);
                    alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new y80(g90Var3, 1));
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
