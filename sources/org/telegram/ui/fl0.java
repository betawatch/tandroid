package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fl0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ vm0 b;

    public /* synthetic */ fl0(vm0 vm0Var, int i10) {
        this.a = i10;
        this.b = vm0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                vm0 vm0Var = this.b;
                vm0Var.O0 = 2;
                vm0Var.D1();
                break;
            case 1:
                this.b.d1();
                break;
            case 2:
                vm0 vm0Var2 = this.b;
                vm0Var2.O0 = 3;
                vm0Var2.D1();
                break;
            case 3:
                vm0 vm0Var3 = this.b;
                vm0Var3.O0 = 1;
                vm0Var3.D1();
                break;
            case 4:
                vm0 vm0Var4 = this.b;
                vm0Var4.O0 = 4;
                vm0Var4.D1();
                break;
            case 5:
                vm0.e0(this.b);
                break;
            case 6:
                vm0 vm0Var5 = this.b;
                vm0Var5.f = true;
                vm0Var5.H.callOnClick();
                vm0Var5.f = false;
                break;
            case 7:
                vm0 vm0Var6 = this.b;
                vm0Var6.O0 = 0;
                vm0Var6.D1();
                break;
            case 8:
                vm0 vm0Var7 = this.b;
                vm0Var7.O0 = 4;
                vm0Var7.D1();
                break;
            case 9:
                this.b.d1();
                break;
            case 10:
                vm0.b0(this.b);
                break;
            case 11:
                vm0.c0(this.b);
                break;
            case 12:
                this.b.C1();
                break;
            case 13:
                vm0 vm0Var8 = this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vm0Var8.getParentActivity());
                alertDialog$Builder.a.N = LocaleController.getString(R.string.TelegramPassportDeleteTitle);
                alertDialog$Builder.a.P = LocaleController.getString(R.string.TelegramPassportDeleteAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new hl0(vm0Var8, 5));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                vm0Var8.showDialog(c2Var);
                TextView textView = (TextView) c2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q7, false));
                    break;
                }
                break;
            case 14:
                this.b.C1();
                break;
            case 15:
                vm0.V(this.b);
                break;
            default:
                vm0 vm0Var9 = this.b;
                vm0Var9.f = true;
                vm0Var9.H.callOnClick();
                vm0Var9.f = false;
                break;
        }
    }
}
