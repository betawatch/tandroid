package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
                this.b.r.j();
                break;
            case 1:
                g90 g90Var = this.b;
                org.telegram.ui.ActionBar.m1 m1Var = g90Var.s;
                if (m1Var != null) {
                    m1Var.d(true);
                }
                g90Var.r.c();
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
                org.telegram.ui.ActionBar.m1 m1Var2 = g90Var2.s;
                if (m1Var2 != null) {
                    m1Var2.d(true);
                    break;
                }
                break;
            default:
                g90 g90Var3 = this.b;
                org.telegram.ui.ActionBar.m1 m1Var3 = g90Var3.s;
                if (m1Var3 != null) {
                    m1Var3.d(true);
                }
                org.telegram.ui.ActionBar.m2 m2Var = g90Var3.c;
                if (m2Var.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(m2Var.getParentActivity());
                    alertDialog$Builder.a.R = LocaleController.getString(R.string.RevokeLink);
                    alertDialog$Builder.a.T = LocaleController.getString(R.string.RevokeAlert);
                    alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new y80(g90Var3, 1));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    TextView textView = (TextView) alertDialog$Builder.a.d(-1);
                    if (textView != null) {
                        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.q7, false));
                    }
                    alertDialog$Builder.o();
                    break;
                }
                break;
        }
    }
}
