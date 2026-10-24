package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class k90 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ r90 b;

    public /* synthetic */ k90(r90 r90Var, int i10) {
        this.a = i10;
        this.b = r90Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.r.j();
                break;
            case 1:
                r90 r90Var = this.b;
                org.telegram.ui.ActionBar.m1 m1Var = r90Var.s;
                if (m1Var != null) {
                    m1Var.d(true);
                }
                r90Var.r.a();
                break;
            case 2:
                r90 r90Var2 = this.b;
                String str = r90Var2.b;
                boolean z10 = str != null && str.endsWith("?direct");
                Context context = r90Var2.getContext();
                String string = LocaleController.getString(R.string.InviteByQRCode);
                String str2 = r90Var2.b;
                String str3 = r90Var2.J;
                if (str3 == null) {
                    str3 = LocaleController.getString(r90Var2.H ? z10 ? R.string.QRCodeLinkHelpChannelDirect : R.string.QRCodeLinkHelpChannel : R.string.QRCodeLinkHelpGroup);
                }
                o90 o90Var = new o90(r90Var2, context, string, str2, str3);
                r90Var2.E = o90Var;
                o90Var.m(R.raw.qr_code_logo);
                r90Var2.E.show();
                org.telegram.ui.ActionBar.m1 m1Var2 = r90Var2.s;
                if (m1Var2 != null) {
                    m1Var2.d(true);
                    break;
                }
                break;
            default:
                r90 r90Var3 = this.b;
                org.telegram.ui.ActionBar.m1 m1Var3 = r90Var3.s;
                if (m1Var3 != null) {
                    m1Var3.d(true);
                }
                org.telegram.ui.ActionBar.o2 o2Var = r90Var3.c;
                if (o2Var.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o2Var.getParentActivity());
                    alertDialog$Builder.a.R = LocaleController.getString(R.string.RevokeLink);
                    alertDialog$Builder.a.T = LocaleController.getString(R.string.RevokeAlert);
                    alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new i90(r90Var3, 1));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    TextView textView = (TextView) alertDialog$Builder.a.d(-1);
                    if (textView != null) {
                        org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.q7, null);
                    }
                    alertDialog$Builder.p();
                    break;
                }
                break;
        }
    }
}
