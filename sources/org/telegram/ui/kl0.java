package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kl0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ xm0 b;

    public /* synthetic */ kl0(xm0 xm0Var, int i10) {
        this.a = i10;
        this.b = xm0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                xm0 xm0Var = this.b;
                xm0Var.S0 = 2;
                xm0Var.C1();
                break;
            case 1:
                this.b.c1();
                break;
            case 2:
                xm0 xm0Var2 = this.b;
                xm0Var2.S0 = 3;
                xm0Var2.C1();
                break;
            case 3:
                xm0 xm0Var3 = this.b;
                xm0Var3.S0 = 1;
                xm0Var3.C1();
                break;
            case 4:
                xm0 xm0Var4 = this.b;
                xm0Var4.S0 = 4;
                xm0Var4.C1();
                break;
            case 5:
                xm0 xm0Var5 = this.b;
                if (xm0Var5.getParentActivity().checkSelfPermission("android.permission.CAMERA") == 0) {
                    y9 y9Var = new y9(0);
                    y9Var.N = new vl0(xm0Var5);
                    xm0Var5.presentFragment(y9Var);
                    break;
                } else {
                    xm0Var5.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 22);
                    break;
                }
            case 6:
                xm0 xm0Var6 = this.b;
                xm0Var6.f = true;
                xm0Var6.L.callOnClick();
                xm0Var6.f = false;
                break;
            case 7:
                xm0 xm0Var7 = this.b;
                xm0Var7.S0 = 0;
                xm0Var7.C1();
                break;
            case 8:
                xm0 xm0Var8 = this.b;
                xm0Var8.S0 = 4;
                xm0Var8.C1();
                break;
            case 9:
                this.b.c1();
                break;
            case 10:
                xm0.b0(this.b);
                break;
            case 11:
                xm0.c0(this.b);
                break;
            case 12:
                this.b.B1();
                break;
            case 13:
                xm0 xm0Var9 = this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xm0Var9.getParentActivity());
                alertDialog$Builder.a.R = LocaleController.getString(R.string.TelegramPassportDeleteTitle);
                alertDialog$Builder.a.T = LocaleController.getString(R.string.TelegramPassportDeleteAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new ml0(xm0Var9, 5));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                xm0Var9.showDialog(b2Var);
                TextView textView = (TextView) b2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.q7, false));
                    break;
                }
                break;
            case 14:
                this.b.B1();
                break;
            case 15:
                xm0.V(this.b);
                break;
            default:
                xm0 xm0Var10 = this.b;
                xm0Var10.f = true;
                xm0Var10.L.callOnClick();
                xm0Var10.f = false;
                break;
        }
    }
}
