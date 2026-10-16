package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dm0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ sn0 b;

    public /* synthetic */ dm0(sn0 sn0Var, int i10) {
        this.a = i10;
        this.b = sn0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                sn0 sn0Var = this.b;
                sn0Var.S0 = 2;
                sn0Var.C1();
                break;
            case 1:
                this.b.c1();
                break;
            case 2:
                sn0 sn0Var2 = this.b;
                sn0Var2.S0 = 3;
                sn0Var2.C1();
                break;
            case 3:
                sn0 sn0Var3 = this.b;
                sn0Var3.S0 = 1;
                sn0Var3.C1();
                break;
            case 4:
                sn0 sn0Var4 = this.b;
                sn0Var4.S0 = 4;
                sn0Var4.C1();
                break;
            case 5:
                sn0 sn0Var5 = this.b;
                if (sn0Var5.getParentActivity().checkSelfPermission("android.permission.CAMERA") == 0) {
                    z9 z9Var = new z9(0);
                    z9Var.M = new pm0(sn0Var5);
                    sn0Var5.presentFragment(z9Var);
                    break;
                } else {
                    sn0Var5.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 22);
                    break;
                }
            case 6:
                sn0 sn0Var6 = this.b;
                sn0Var6.f = true;
                sn0Var6.L.callOnClick();
                sn0Var6.f = false;
                break;
            case 7:
                sn0 sn0Var7 = this.b;
                sn0Var7.S0 = 0;
                sn0Var7.C1();
                break;
            case 8:
                sn0 sn0Var8 = this.b;
                sn0Var8.S0 = 4;
                sn0Var8.C1();
                break;
            case 9:
                this.b.c1();
                break;
            case 10:
                sn0.b0(this.b);
                break;
            case 11:
                sn0.c0(this.b);
                break;
            case 12:
                this.b.B1();
                break;
            case 13:
                sn0 sn0Var9 = this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(sn0Var9.getParentActivity());
                alertDialog$Builder.a.R = LocaleController.getString(R.string.TelegramPassportDeleteTitle);
                alertDialog$Builder.a.T = LocaleController.getString(R.string.TelegramPassportDeleteAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new fm0(sn0Var9, 5));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
                sn0Var9.showDialog(a2Var);
                TextView textView = (TextView) a2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.q7, false));
                    break;
                }
                break;
            case 14:
                this.b.B1();
                break;
            case 15:
                sn0.V(this.b);
                break;
            default:
                sn0 sn0Var10 = this.b;
                sn0Var10.f = true;
                sn0Var10.L.callOnClick();
                sn0Var10.f = false;
                break;
        }
    }
}
