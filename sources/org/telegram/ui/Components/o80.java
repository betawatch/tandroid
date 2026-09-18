package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o80 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ v80 b;

    public /* synthetic */ o80(v80 v80Var, int i10) {
        this.a = i10;
        this.b = v80Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.r.i();
                break;
            case 1:
                v80 v80Var = this.b;
                org.telegram.ui.ActionBar.o1 o1Var = v80Var.s;
                if (o1Var != null) {
                    o1Var.d(true);
                }
                v80Var.r.a();
                break;
            case 2:
                v80 v80Var2 = this.b;
                String str = v80Var2.b;
                boolean z10 = str != null && str.endsWith("?direct");
                Context context = v80Var2.getContext();
                String string = LocaleController.getString(R.string.InviteByQRCode);
                String str2 = v80Var2.b;
                String str3 = v80Var2.J;
                if (str3 == null) {
                    str3 = LocaleController.getString(v80Var2.H ? z10 ? R.string.QRCodeLinkHelpChannelDirect : R.string.QRCodeLinkHelpChannel : R.string.QRCodeLinkHelpGroup);
                }
                s80 s80Var = new s80(v80Var2, context, string, str2, str3);
                v80Var2.E = s80Var;
                s80Var.m(R.raw.qr_code_logo);
                v80Var2.E.show();
                org.telegram.ui.ActionBar.o1 o1Var2 = v80Var2.s;
                if (o1Var2 != null) {
                    o1Var2.d(true);
                    break;
                }
                break;
            default:
                v80 v80Var3 = this.b;
                org.telegram.ui.ActionBar.o1 o1Var3 = v80Var3.s;
                if (o1Var3 != null) {
                    o1Var3.d(true);
                }
                org.telegram.ui.ActionBar.o2 o2Var = v80Var3.c;
                if (o2Var.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o2Var.getParentActivity());
                    alertDialog$Builder.a.R = LocaleController.getString(R.string.RevokeLink);
                    alertDialog$Builder.a.T = LocaleController.getString(R.string.RevokeAlert);
                    alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new n80(v80Var3, 1));
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
