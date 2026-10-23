package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ll0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ an0 b;

    public /* synthetic */ ll0(an0 an0Var, int i10) {
        this.a = i10;
        this.b = an0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                an0 an0Var = this.b;
                an0Var.S0 = 2;
                an0Var.C1();
                break;
            case 1:
                this.b.c1();
                break;
            case 2:
                an0 an0Var2 = this.b;
                an0Var2.S0 = 3;
                an0Var2.C1();
                break;
            case 3:
                an0 an0Var3 = this.b;
                an0Var3.S0 = 1;
                an0Var3.C1();
                break;
            case 4:
                an0 an0Var4 = this.b;
                an0Var4.S0 = 4;
                an0Var4.C1();
                break;
            case 5:
                an0 an0Var5 = this.b;
                if (an0Var5.getParentActivity().checkSelfPermission("android.permission.CAMERA") == 0) {
                    w9 w9Var = new w9(0);
                    w9Var.M = new xl0(an0Var5);
                    an0Var5.presentFragment(w9Var);
                    break;
                } else {
                    an0Var5.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 22);
                    break;
                }
            case 6:
                an0 an0Var6 = this.b;
                an0Var6.f = true;
                an0Var6.L.callOnClick();
                an0Var6.f = false;
                break;
            case 7:
                an0 an0Var7 = this.b;
                an0Var7.S0 = 0;
                an0Var7.C1();
                break;
            case 8:
                an0 an0Var8 = this.b;
                an0Var8.S0 = 4;
                an0Var8.C1();
                break;
            case 9:
                this.b.c1();
                break;
            case 10:
                an0.b0(this.b);
                break;
            case 11:
                an0.c0(this.b);
                break;
            case 12:
                this.b.B1();
                break;
            case 13:
                an0 an0Var9 = this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(an0Var9.getParentActivity());
                alertDialog$Builder.a.R = LocaleController.getString(R.string.TelegramPassportDeleteTitle);
                alertDialog$Builder.a.T = LocaleController.getString(R.string.TelegramPassportDeleteAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new nl0(an0Var9, 5));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                an0Var9.showDialog(c2Var);
                TextView textView = (TextView) c2Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.q7, null);
                    break;
                }
                break;
            case 14:
                this.b.B1();
                break;
            case 15:
                an0.V(this.b);
                break;
            default:
                an0 an0Var10 = this.b;
                an0Var10.f = true;
                an0Var10.L.callOnClick();
                an0Var10.f = false;
                break;
        }
    }
}
