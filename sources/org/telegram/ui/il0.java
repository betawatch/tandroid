package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class il0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ wm0 b;

    public /* synthetic */ il0(wm0 wm0Var, int i9) {
        this.a = i9;
        this.b = wm0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                wm0 wm0Var = this.b;
                wm0Var.O0 = 2;
                wm0Var.D1();
                break;
            case 1:
                this.b.d1();
                break;
            case 2:
                wm0 wm0Var2 = this.b;
                wm0Var2.O0 = 3;
                wm0Var2.D1();
                break;
            case 3:
                wm0 wm0Var3 = this.b;
                wm0Var3.O0 = 1;
                wm0Var3.D1();
                break;
            case 4:
                wm0 wm0Var4 = this.b;
                wm0Var4.O0 = 4;
                wm0Var4.D1();
                break;
            case 5:
                wm0.d0(this.b);
                break;
            case 6:
                wm0 wm0Var5 = this.b;
                wm0Var5.f = true;
                wm0Var5.H.callOnClick();
                wm0Var5.f = false;
                break;
            case 7:
                wm0 wm0Var6 = this.b;
                wm0Var6.O0 = 0;
                wm0Var6.D1();
                break;
            case 8:
                wm0 wm0Var7 = this.b;
                wm0Var7.O0 = 4;
                wm0Var7.D1();
                break;
            case 9:
                this.b.d1();
                break;
            case 10:
                wm0.a0(this.b);
                break;
            case 11:
                wm0.b0(this.b);
                break;
            case 12:
                this.b.C1();
                break;
            case 13:
                wm0 wm0Var8 = this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wm0Var8.getParentActivity());
                alertDialog$Builder.a.N = LocaleController.getString(R.string.TelegramPassportDeleteTitle);
                alertDialog$Builder.a.P = LocaleController.getString(R.string.TelegramPassportDeleteAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new kl0(wm0Var8, 5));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                wm0Var8.showDialog(c2Var);
                TextView textView = (TextView) c2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.q7, false));
                    break;
                }
                break;
            case 14:
                this.b.C1();
                break;
            case 15:
                wm0.U(this.b);
                break;
            default:
                wm0 wm0Var9 = this.b;
                wm0Var9.f = true;
                wm0Var9.H.callOnClick();
                wm0Var9.f = false;
                break;
        }
    }
}
