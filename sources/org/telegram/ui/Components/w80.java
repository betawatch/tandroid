package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class w80 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ d90 b;

    public /* synthetic */ w80(d90 d90Var, int i10) {
        this.a = i10;
        this.b = d90Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.r.h();
                break;
            case 1:
                d90 d90Var = this.b;
                org.telegram.ui.ActionBar.n1 n1Var = d90Var.s;
                if (n1Var != null) {
                    n1Var.d(true);
                }
                d90Var.r.c();
                break;
            case 2:
                d90 d90Var2 = this.b;
                String str = d90Var2.b;
                boolean z10 = str != null && str.endsWith("?direct");
                Context context = d90Var2.getContext();
                String string = LocaleController.getString(R.string.InviteByQRCode);
                String str2 = d90Var2.b;
                String str3 = d90Var2.J;
                if (str3 == null) {
                    str3 = LocaleController.getString(d90Var2.H ? z10 ? R.string.QRCodeLinkHelpChannelDirect : R.string.QRCodeLinkHelpChannel : R.string.QRCodeLinkHelpGroup);
                }
                a90 a90Var = new a90(d90Var2, context, string, str2, str3);
                d90Var2.E = a90Var;
                a90Var.m(R.raw.qr_code_logo);
                d90Var2.E.show();
                org.telegram.ui.ActionBar.n1 n1Var2 = d90Var2.s;
                if (n1Var2 != null) {
                    n1Var2.d(true);
                    break;
                }
                break;
            default:
                d90 d90Var3 = this.b;
                org.telegram.ui.ActionBar.n1 n1Var3 = d90Var3.s;
                if (n1Var3 != null) {
                    n1Var3.d(true);
                }
                org.telegram.ui.ActionBar.n2 n2Var = d90Var3.c;
                if (n2Var.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n2Var.getParentActivity());
                    alertDialog$Builder.a.R = LocaleController.getString(R.string.RevokeLink);
                    alertDialog$Builder.a.T = LocaleController.getString(R.string.RevokeAlert);
                    alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new v80(d90Var3, 1));
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
