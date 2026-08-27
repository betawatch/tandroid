package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class il0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ xm0 b;

    public /* synthetic */ il0(xm0 xm0Var, int i10) {
        this.a = i10;
        this.b = xm0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                xm0 xm0Var = this.b;
                xm0Var.O0 = 2;
                xm0Var.D1();
                break;
            case 1:
                this.b.d1();
                break;
            case 2:
                xm0 xm0Var2 = this.b;
                xm0Var2.O0 = 3;
                xm0Var2.D1();
                break;
            case 3:
                xm0 xm0Var3 = this.b;
                xm0Var3.O0 = 1;
                xm0Var3.D1();
                break;
            case 4:
                xm0 xm0Var4 = this.b;
                xm0Var4.O0 = 4;
                xm0Var4.D1();
                break;
            case 5:
                xm0.e0(this.b);
                break;
            case 6:
                xm0 xm0Var5 = this.b;
                xm0Var5.f = true;
                xm0Var5.H.callOnClick();
                xm0Var5.f = false;
                break;
            case 7:
                xm0 xm0Var6 = this.b;
                xm0Var6.O0 = 0;
                xm0Var6.D1();
                break;
            case 8:
                xm0 xm0Var7 = this.b;
                xm0Var7.O0 = 4;
                xm0Var7.D1();
                break;
            case 9:
                this.b.d1();
                break;
            case 10:
                xm0.b0(this.b);
                break;
            case 11:
                xm0.c0(this.b);
                break;
            case 12:
                this.b.C1();
                break;
            case 13:
                xm0 xm0Var8 = this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xm0Var8.getParentActivity());
                alertDialog$Builder.a.N = LocaleController.getString(R.string.TelegramPassportDeleteTitle);
                alertDialog$Builder.a.P = LocaleController.getString(R.string.TelegramPassportDeleteAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new kl0(xm0Var8, 5));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                xm0Var8.showDialog(b2Var);
                TextView textView = (TextView) b2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q7, false));
                    break;
                }
                break;
            case 14:
                this.b.C1();
                break;
            case 15:
                xm0.V(this.b);
                break;
            default:
                xm0 xm0Var9 = this.b;
                xm0Var9.f = true;
                xm0Var9.H.callOnClick();
                xm0Var9.f = false;
                break;
        }
    }
}
