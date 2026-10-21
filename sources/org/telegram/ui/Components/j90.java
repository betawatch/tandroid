package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j90 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ q90 b;

    public /* synthetic */ j90(q90 q90Var, int i10) {
        this.a = i10;
        this.b = q90Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.r.i();
                break;
            case 1:
                q90 q90Var = this.b;
                org.telegram.ui.ActionBar.m1 m1Var = q90Var.s;
                if (m1Var != null) {
                    m1Var.d(true);
                }
                q90Var.r.c();
                break;
            case 2:
                q90 q90Var2 = this.b;
                String str = q90Var2.b;
                boolean z10 = str != null && str.endsWith("?direct");
                Context context = q90Var2.getContext();
                String string = LocaleController.getString(R.string.InviteByQRCode);
                String str2 = q90Var2.b;
                String str3 = q90Var2.J;
                if (str3 == null) {
                    str3 = LocaleController.getString(q90Var2.H ? z10 ? R.string.QRCodeLinkHelpChannelDirect : R.string.QRCodeLinkHelpChannel : R.string.QRCodeLinkHelpGroup);
                }
                n90 n90Var = new n90(q90Var2, context, string, str2, str3);
                q90Var2.E = n90Var;
                n90Var.n(R.raw.qr_code_logo);
                q90Var2.E.show();
                org.telegram.ui.ActionBar.m1 m1Var2 = q90Var2.s;
                if (m1Var2 != null) {
                    m1Var2.d(true);
                    break;
                }
                break;
            default:
                q90 q90Var3 = this.b;
                org.telegram.ui.ActionBar.m1 m1Var3 = q90Var3.s;
                if (m1Var3 != null) {
                    m1Var3.d(true);
                }
                org.telegram.ui.ActionBar.n2 n2Var = q90Var3.c;
                if (n2Var.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n2Var.getParentActivity());
                    alertDialog$Builder.a.R = LocaleController.getString(R.string.RevokeLink);
                    alertDialog$Builder.a.T = LocaleController.getString(R.string.RevokeAlert);
                    alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new h90(q90Var3, 1));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    TextView textView = (TextView) alertDialog$Builder.a.d(-1);
                    if (textView != null) {
                        textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.q7, false));
                    }
                    alertDialog$Builder.o();
                    break;
                }
                break;
        }
    }
}
