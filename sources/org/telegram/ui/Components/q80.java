package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q80 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ x80 b;

    public /* synthetic */ q80(x80 x80Var, int i10) {
        this.a = i10;
        this.b = x80Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.r.e();
                break;
            case 1:
                x80 x80Var = this.b;
                org.telegram.ui.ActionBar.p1 p1Var = x80Var.s;
                if (p1Var != null) {
                    p1Var.d(true);
                }
                x80Var.r.a();
                break;
            case 2:
                x80 x80Var2 = this.b;
                String str = x80Var2.b;
                boolean z4 = str != null && str.endsWith("?direct");
                Context context = x80Var2.getContext();
                String string = LocaleController.getString(R.string.InviteByQRCode);
                String str2 = x80Var2.b;
                String str3 = x80Var2.G;
                if (str3 == null) {
                    str3 = LocaleController.getString(x80Var2.E ? z4 ? R.string.QRCodeLinkHelpChannelDirect : R.string.QRCodeLinkHelpChannel : R.string.QRCodeLinkHelpGroup);
                }
                u80 u80Var = new u80(x80Var2, context, string, str2, str3);
                x80Var2.B = u80Var;
                u80Var.m(R.raw.qr_code_logo);
                x80Var2.B.show();
                org.telegram.ui.ActionBar.p1 p1Var2 = x80Var2.s;
                if (p1Var2 != null) {
                    p1Var2.d(true);
                    break;
                }
                break;
            default:
                x80 x80Var3 = this.b;
                org.telegram.ui.ActionBar.p1 p1Var3 = x80Var3.s;
                if (p1Var3 != null) {
                    p1Var3.d(true);
                }
                org.telegram.ui.ActionBar.p2 p2Var = x80Var3.c;
                if (p2Var.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p2Var.getParentActivity());
                    alertDialog$Builder.a.O = LocaleController.getString(R.string.RevokeLink);
                    alertDialog$Builder.a.Q = LocaleController.getString(R.string.RevokeAlert);
                    alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new p80(x80Var3, 1));
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
