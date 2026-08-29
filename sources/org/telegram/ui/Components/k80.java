package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k80 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ r80 b;

    public /* synthetic */ k80(r80 r80Var, int i10) {
        this.a = i10;
        this.b = r80Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.r.j();
                break;
            case 1:
                r80 r80Var = this.b;
                org.telegram.ui.ActionBar.o1 o1Var = r80Var.s;
                if (o1Var != null) {
                    o1Var.d(true);
                }
                r80Var.r.a();
                break;
            case 2:
                r80 r80Var2 = this.b;
                String str = r80Var2.b;
                boolean z10 = str != null && str.endsWith("?direct");
                Context context = r80Var2.getContext();
                String string = LocaleController.getString(R.string.InviteByQRCode);
                String str2 = r80Var2.b;
                String str3 = r80Var2.F;
                if (str3 == null) {
                    str3 = LocaleController.getString(r80Var2.D ? z10 ? R.string.QRCodeLinkHelpChannelDirect : R.string.QRCodeLinkHelpChannel : R.string.QRCodeLinkHelpGroup);
                }
                o80 o80Var = new o80(r80Var2, context, string, str2, str3);
                r80Var2.A = o80Var;
                o80Var.m(R.raw.qr_code_logo);
                r80Var2.A.show();
                org.telegram.ui.ActionBar.o1 o1Var2 = r80Var2.s;
                if (o1Var2 != null) {
                    o1Var2.d(true);
                    break;
                }
                break;
            default:
                r80 r80Var3 = this.b;
                org.telegram.ui.ActionBar.o1 o1Var3 = r80Var3.s;
                if (o1Var3 != null) {
                    o1Var3.d(true);
                }
                org.telegram.ui.ActionBar.o2 o2Var = r80Var3.c;
                if (o2Var.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o2Var.getParentActivity());
                    alertDialog$Builder.a.N = LocaleController.getString(R.string.RevokeLink);
                    alertDialog$Builder.a.P = LocaleController.getString(R.string.RevokeAlert);
                    alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new j80(r80Var3, 1));
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
