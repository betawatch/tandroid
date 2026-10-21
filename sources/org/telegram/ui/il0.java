package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final /* synthetic */ class il0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ vm0 b;

    public /* synthetic */ il0(vm0 vm0Var, int i10) {
        this.a = i10;
        this.b = vm0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                vm0 vm0Var = this.b;
                vm0Var.S0 = 2;
                vm0Var.C1();
                break;
            case 1:
                this.b.c1();
                break;
            case 2:
                vm0 vm0Var2 = this.b;
                vm0Var2.S0 = 3;
                vm0Var2.C1();
                break;
            case 3:
                vm0 vm0Var3 = this.b;
                vm0Var3.S0 = 1;
                vm0Var3.C1();
                break;
            case 4:
                vm0 vm0Var4 = this.b;
                vm0Var4.S0 = 4;
                vm0Var4.C1();
                break;
            case 5:
                vm0 vm0Var5 = this.b;
                if (vm0Var5.getParentActivity().checkSelfPermission("android.permission.CAMERA") == 0) {
                    w9 w9Var = new w9(0);
                    w9Var.M = new tl0(vm0Var5);
                    vm0Var5.presentFragment(w9Var);
                    break;
                } else {
                    vm0Var5.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 22);
                    break;
                }
            case 6:
                vm0 vm0Var6 = this.b;
                vm0Var6.f = true;
                vm0Var6.L.callOnClick();
                vm0Var6.f = false;
                break;
            case 7:
                vm0 vm0Var7 = this.b;
                vm0Var7.S0 = 0;
                vm0Var7.C1();
                break;
            case 8:
                vm0 vm0Var8 = this.b;
                vm0Var8.S0 = 4;
                vm0Var8.C1();
                break;
            case 9:
                this.b.c1();
                break;
            case 10:
                vm0.b0(this.b);
                break;
            case 11:
                vm0.c0(this.b);
                break;
            case 12:
                this.b.B1();
                break;
            case 13:
                vm0 vm0Var9 = this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vm0Var9.getParentActivity());
                alertDialog$Builder.a.R = LocaleController.getString(R.string.TelegramPassportDeleteTitle);
                alertDialog$Builder.a.T = LocaleController.getString(R.string.TelegramPassportDeleteAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new kl0(vm0Var9, 5));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                vm0Var9.showDialog(b2Var);
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
                vm0.V(this.b);
                break;
            default:
                vm0 vm0Var10 = this.b;
                vm0Var10.f = true;
                vm0Var10.L.callOnClick();
                vm0Var10.f = false;
                break;
        }
    }
}
