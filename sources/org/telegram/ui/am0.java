package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final /* synthetic */ class am0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ pn0 b;

    public /* synthetic */ am0(pn0 pn0Var, int i10) {
        this.a = i10;
        this.b = pn0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                pn0 pn0Var = this.b;
                pn0Var.S0 = 2;
                pn0Var.D1();
                break;
            case 1:
                this.b.d1();
                break;
            case 2:
                pn0 pn0Var2 = this.b;
                pn0Var2.S0 = 3;
                pn0Var2.D1();
                break;
            case 3:
                pn0 pn0Var3 = this.b;
                pn0Var3.S0 = 1;
                pn0Var3.D1();
                break;
            case 4:
                pn0 pn0Var4 = this.b;
                pn0Var4.S0 = 4;
                pn0Var4.D1();
                break;
            case 5:
                pn0.e0(this.b);
                break;
            case 6:
                pn0 pn0Var5 = this.b;
                pn0Var5.f = true;
                pn0Var5.L.callOnClick();
                pn0Var5.f = false;
                break;
            case 7:
                pn0 pn0Var6 = this.b;
                pn0Var6.S0 = 0;
                pn0Var6.D1();
                break;
            case 8:
                pn0 pn0Var7 = this.b;
                pn0Var7.S0 = 4;
                pn0Var7.D1();
                break;
            case 9:
                this.b.d1();
                break;
            case 10:
                pn0.b0(this.b);
                break;
            case 11:
                pn0.c0(this.b);
                break;
            case 12:
                this.b.C1();
                break;
            case 13:
                pn0 pn0Var8 = this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(pn0Var8.getParentActivity());
                alertDialog$Builder.a.R = LocaleController.getString(R.string.TelegramPassportDeleteTitle);
                alertDialog$Builder.a.T = LocaleController.getString(R.string.TelegramPassportDeleteAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new cm0(pn0Var8, 5));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                pn0Var8.showDialog(b2Var);
                TextView textView = (TextView) b2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
                    break;
                }
                break;
            case 14:
                this.b.C1();
                break;
            case 15:
                pn0.V(this.b);
                break;
            default:
                pn0 pn0Var9 = this.b;
                pn0Var9.f = true;
                pn0Var9.L.callOnClick();
                pn0Var9.f = false;
                break;
        }
    }
}
