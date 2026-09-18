package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class am0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ qn0 b;

    public /* synthetic */ am0(qn0 qn0Var, int i10) {
        this.a = i10;
        this.b = qn0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                qn0 qn0Var = this.b;
                qn0Var.S0 = 2;
                qn0Var.D1();
                break;
            case 1:
                this.b.d1();
                break;
            case 2:
                qn0 qn0Var2 = this.b;
                qn0Var2.S0 = 3;
                qn0Var2.D1();
                break;
            case 3:
                qn0 qn0Var3 = this.b;
                qn0Var3.S0 = 1;
                qn0Var3.D1();
                break;
            case 4:
                qn0 qn0Var4 = this.b;
                qn0Var4.S0 = 4;
                qn0Var4.D1();
                break;
            case 5:
                qn0.e0(this.b);
                break;
            case 6:
                qn0 qn0Var5 = this.b;
                qn0Var5.f = true;
                qn0Var5.L.callOnClick();
                qn0Var5.f = false;
                break;
            case 7:
                qn0 qn0Var6 = this.b;
                qn0Var6.S0 = 0;
                qn0Var6.D1();
                break;
            case 8:
                qn0 qn0Var7 = this.b;
                qn0Var7.S0 = 4;
                qn0Var7.D1();
                break;
            case 9:
                this.b.d1();
                break;
            case 10:
                qn0.b0(this.b);
                break;
            case 11:
                qn0.c0(this.b);
                break;
            case 12:
                this.b.C1();
                break;
            case 13:
                qn0 qn0Var8 = this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qn0Var8.getParentActivity());
                alertDialog$Builder.a.R = LocaleController.getString(R.string.TelegramPassportDeleteTitle);
                alertDialog$Builder.a.T = LocaleController.getString(R.string.TelegramPassportDeleteAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new cm0(qn0Var8, 5));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                qn0Var8.showDialog(c2Var);
                TextView textView = (TextView) c2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
                    break;
                }
                break;
            case 14:
                this.b.C1();
                break;
            case 15:
                qn0.V(this.b);
                break;
            default:
                qn0 qn0Var9 = this.b;
                qn0Var9.f = true;
                qn0Var9.L.callOnClick();
                qn0Var9.f = false;
                break;
        }
    }
}
