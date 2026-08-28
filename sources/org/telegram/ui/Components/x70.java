package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x70 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ e80 b;

    public /* synthetic */ x70(e80 e80Var, int i9) {
        this.a = i9;
        this.b = e80Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.r.j();
                break;
            case 1:
                e80 e80Var = this.b;
                org.telegram.ui.ActionBar.o1 o1Var = e80Var.s;
                if (o1Var != null) {
                    o1Var.d(true);
                }
                e80Var.r.b();
                break;
            case 2:
                e80 e80Var2 = this.b;
                String str = e80Var2.b;
                boolean z10 = str != null && str.endsWith("?direct");
                Context context = e80Var2.getContext();
                String string = LocaleController.getString(R.string.InviteByQRCode);
                String str2 = e80Var2.b;
                String str3 = e80Var2.F;
                if (str3 == null) {
                    str3 = LocaleController.getString(e80Var2.D ? z10 ? R.string.QRCodeLinkHelpChannelDirect : R.string.QRCodeLinkHelpChannel : R.string.QRCodeLinkHelpGroup);
                }
                b80 b80Var = new b80(e80Var2, context, string, str2, str3);
                e80Var2.A = b80Var;
                b80Var.m(R.raw.qr_code_logo);
                e80Var2.A.show();
                org.telegram.ui.ActionBar.o1 o1Var2 = e80Var2.s;
                if (o1Var2 != null) {
                    o1Var2.d(true);
                    break;
                }
                break;
            default:
                e80 e80Var3 = this.b;
                org.telegram.ui.ActionBar.o1 o1Var3 = e80Var3.s;
                if (o1Var3 != null) {
                    o1Var3.d(true);
                }
                org.telegram.ui.ActionBar.o2 o2Var = e80Var3.c;
                if (o2Var.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o2Var.getParentActivity());
                    alertDialog$Builder.a.N = LocaleController.getString(R.string.RevokeLink);
                    alertDialog$Builder.a.P = LocaleController.getString(R.string.RevokeAlert);
                    alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new w70(e80Var3, 1));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    TextView textView = (TextView) alertDialog$Builder.a.d(-1);
                    if (textView != null) {
                        textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.q7, false));
                    }
                    alertDialog$Builder.o();
                    break;
                }
                break;
        }
    }
}
