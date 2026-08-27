package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b80 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ i80 b;

    public /* synthetic */ b80(i80 i80Var, int i10) {
        this.a = i10;
        this.b = i80Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.r.g();
                break;
            case 1:
                i80 i80Var = this.b;
                org.telegram.ui.ActionBar.n1 n1Var = i80Var.s;
                if (n1Var != null) {
                    n1Var.d(true);
                }
                i80Var.r.b();
                break;
            case 2:
                i80 i80Var2 = this.b;
                String str = i80Var2.b;
                boolean z10 = str != null && str.endsWith("?direct");
                Context context = i80Var2.getContext();
                String string = LocaleController.getString(R.string.InviteByQRCode);
                String str2 = i80Var2.b;
                String str3 = i80Var2.F;
                if (str3 == null) {
                    str3 = LocaleController.getString(i80Var2.D ? z10 ? R.string.QRCodeLinkHelpChannelDirect : R.string.QRCodeLinkHelpChannel : R.string.QRCodeLinkHelpGroup);
                }
                f80 f80Var = new f80(i80Var2, context, string, str2, str3);
                i80Var2.A = f80Var;
                f80Var.m(R.raw.qr_code_logo);
                i80Var2.A.show();
                org.telegram.ui.ActionBar.n1 n1Var2 = i80Var2.s;
                if (n1Var2 != null) {
                    n1Var2.d(true);
                    break;
                }
                break;
            default:
                i80 i80Var3 = this.b;
                org.telegram.ui.ActionBar.n1 n1Var3 = i80Var3.s;
                if (n1Var3 != null) {
                    n1Var3.d(true);
                }
                org.telegram.ui.ActionBar.n2 n2Var = i80Var3.c;
                if (n2Var.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n2Var.getParentActivity());
                    alertDialog$Builder.a.N = LocaleController.getString(R.string.RevokeLink);
                    alertDialog$Builder.a.P = LocaleController.getString(R.string.RevokeAlert);
                    alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new a80(i80Var3, 1));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    TextView textView = (TextView) alertDialog$Builder.a.d(-1);
                    if (textView != null) {
                        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q7, false));
                    }
                    alertDialog$Builder.o();
                    break;
                }
                break;
        }
    }
}
