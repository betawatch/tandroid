package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class y80 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ f90 b;

    public /* synthetic */ y80(f90 f90Var, int i10) {
        this.a = i10;
        this.b = f90Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.r.i();
                break;
            case 1:
                f90 f90Var = this.b;
                org.telegram.ui.ActionBar.p1 p1Var = f90Var.s;
                if (p1Var != null) {
                    p1Var.d(true);
                }
                f90Var.r.c();
                break;
            case 2:
                f90 f90Var2 = this.b;
                String str = f90Var2.b;
                boolean z10 = str != null && str.endsWith("?direct");
                Context context = f90Var2.getContext();
                String string = LocaleController.getString(R.string.InviteByQRCode);
                String str2 = f90Var2.b;
                String str3 = f90Var2.J;
                if (str3 == null) {
                    str3 = LocaleController.getString(f90Var2.H ? z10 ? R.string.QRCodeLinkHelpChannelDirect : R.string.QRCodeLinkHelpChannel : R.string.QRCodeLinkHelpGroup);
                }
                c90 c90Var = new c90(f90Var2, context, string, str2, str3);
                f90Var2.E = c90Var;
                c90Var.m(R.raw.qr_code_logo);
                f90Var2.E.show();
                org.telegram.ui.ActionBar.p1 p1Var2 = f90Var2.s;
                if (p1Var2 != null) {
                    p1Var2.d(true);
                    break;
                }
                break;
            default:
                f90 f90Var3 = this.b;
                org.telegram.ui.ActionBar.p1 p1Var3 = f90Var3.s;
                if (p1Var3 != null) {
                    p1Var3.d(true);
                }
                org.telegram.ui.ActionBar.p2 p2Var = f90Var3.c;
                if (p2Var.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p2Var.getParentActivity());
                    alertDialog$Builder.a.R = LocaleController.getString(R.string.RevokeLink);
                    alertDialog$Builder.a.T = LocaleController.getString(R.string.RevokeAlert);
                    alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new x80(f90Var3, 1));
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
