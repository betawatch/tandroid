package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l90 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ s90 b;

    public /* synthetic */ l90(s90 s90Var, int i10) {
        this.a = i10;
        this.b = s90Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.r.e();
                break;
            case 1:
                s90 s90Var = this.b;
                org.telegram.ui.ActionBar.o1 o1Var = s90Var.s;
                if (o1Var != null) {
                    o1Var.d(true);
                }
                s90Var.r.a();
                break;
            case 2:
                s90 s90Var2 = this.b;
                String str = s90Var2.b;
                boolean z10 = str != null && str.endsWith("?direct");
                Context context = s90Var2.getContext();
                String string = LocaleController.getString(R.string.InviteByQRCode);
                String str2 = s90Var2.b;
                String str3 = s90Var2.J;
                if (str3 == null) {
                    str3 = LocaleController.getString(s90Var2.H ? z10 ? R.string.QRCodeLinkHelpChannelDirect : R.string.QRCodeLinkHelpChannel : R.string.QRCodeLinkHelpGroup);
                }
                p90 p90Var = new p90(s90Var2, context, string, str2, str3);
                s90Var2.E = p90Var;
                p90Var.m(R.raw.qr_code_logo);
                s90Var2.E.show();
                org.telegram.ui.ActionBar.o1 o1Var2 = s90Var2.s;
                if (o1Var2 != null) {
                    o1Var2.d(true);
                    break;
                }
                break;
            default:
                s90 s90Var3 = this.b;
                org.telegram.ui.ActionBar.o1 o1Var3 = s90Var3.s;
                if (o1Var3 != null) {
                    o1Var3.d(true);
                }
                org.telegram.ui.ActionBar.r2 r2Var = s90Var3.c;
                if (r2Var.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(r2Var.getParentActivity());
                    alertDialog$Builder.a.R = LocaleController.getString(R.string.RevokeLink);
                    alertDialog$Builder.a.T = LocaleController.getString(R.string.RevokeAlert);
                    alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new k90(s90Var3, 1));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    TextView textView = (TextView) alertDialog$Builder.a.d(-1);
                    if (textView != null) {
                        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.q7, null);
                    }
                    alertDialog$Builder.p();
                    break;
                }
                break;
        }
    }
}
