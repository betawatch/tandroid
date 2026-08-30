package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ol0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ dn0 b;

    public /* synthetic */ ol0(dn0 dn0Var, int i10) {
        this.a = i10;
        this.b = dn0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                dn0 dn0Var = this.b;
                dn0Var.P0 = 2;
                dn0Var.D1();
                break;
            case 1:
                this.b.d1();
                break;
            case 2:
                dn0 dn0Var2 = this.b;
                dn0Var2.P0 = 3;
                dn0Var2.D1();
                break;
            case 3:
                dn0 dn0Var3 = this.b;
                dn0Var3.P0 = 1;
                dn0Var3.D1();
                break;
            case 4:
                dn0 dn0Var4 = this.b;
                dn0Var4.P0 = 4;
                dn0Var4.D1();
                break;
            case 5:
                dn0.e0(this.b);
                break;
            case 6:
                dn0 dn0Var5 = this.b;
                dn0Var5.f = true;
                dn0Var5.I.callOnClick();
                dn0Var5.f = false;
                break;
            case 7:
                dn0 dn0Var6 = this.b;
                dn0Var6.P0 = 0;
                dn0Var6.D1();
                break;
            case 8:
                dn0 dn0Var7 = this.b;
                dn0Var7.P0 = 4;
                dn0Var7.D1();
                break;
            case 9:
                this.b.d1();
                break;
            case 10:
                dn0.b0(this.b);
                break;
            case 11:
                dn0.c0(this.b);
                break;
            case 12:
                this.b.C1();
                break;
            case 13:
                dn0 dn0Var8 = this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(dn0Var8.getParentActivity());
                alertDialog$Builder.a.O = LocaleController.getString(R.string.TelegramPassportDeleteTitle);
                alertDialog$Builder.a.Q = LocaleController.getString(R.string.TelegramPassportDeleteAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new ql0(dn0Var8, 5));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                dn0Var8.showDialog(d2Var);
                TextView textView = (TextView) d2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
                    break;
                }
                break;
            case 14:
                this.b.C1();
                break;
            case 15:
                dn0.V(this.b);
                break;
            default:
                dn0 dn0Var9 = this.b;
                dn0Var9.f = true;
                dn0Var9.I.callOnClick();
                dn0Var9.f = false;
                break;
        }
    }
}
