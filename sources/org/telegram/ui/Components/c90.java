package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c90 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ j90 b;

    public /* synthetic */ c90(j90 j90Var, int i10) {
        this.a = i10;
        this.b = j90Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.r.h();
                break;
            case 1:
                j90 j90Var = this.b;
                org.telegram.ui.ActionBar.n1 n1Var = j90Var.s;
                if (n1Var != null) {
                    n1Var.d(true);
                }
                j90Var.r.b();
                break;
            case 2:
                j90 j90Var2 = this.b;
                String str = j90Var2.b;
                boolean z10 = str != null && str.endsWith("?direct");
                Context context = j90Var2.getContext();
                String string = LocaleController.getString(R.string.InviteByQRCode);
                String str2 = j90Var2.b;
                String str3 = j90Var2.J;
                if (str3 == null) {
                    str3 = LocaleController.getString(j90Var2.H ? z10 ? R.string.QRCodeLinkHelpChannelDirect : R.string.QRCodeLinkHelpChannel : R.string.QRCodeLinkHelpGroup);
                }
                g90 g90Var = new g90(j90Var2, context, string, str2, str3);
                j90Var2.E = g90Var;
                g90Var.m(R.raw.qr_code_logo);
                j90Var2.E.show();
                org.telegram.ui.ActionBar.n1 n1Var2 = j90Var2.s;
                if (n1Var2 != null) {
                    n1Var2.d(true);
                    break;
                }
                break;
            default:
                j90 j90Var3 = this.b;
                org.telegram.ui.ActionBar.n1 n1Var3 = j90Var3.s;
                if (n1Var3 != null) {
                    n1Var3.d(true);
                }
                org.telegram.ui.ActionBar.n2 n2Var = j90Var3.c;
                if (n2Var.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n2Var.getParentActivity());
                    alertDialog$Builder.a.R = LocaleController.getString(R.string.RevokeLink);
                    alertDialog$Builder.a.T = LocaleController.getString(R.string.RevokeAlert);
                    alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new b90(j90Var3, 1));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    TextView textView = (TextView) alertDialog$Builder.a.d(-1);
                    if (textView != null) {
                        textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.q7, false));
                    }
                    alertDialog$Builder.o();
                    break;
                }
                break;
        }
    }
}
