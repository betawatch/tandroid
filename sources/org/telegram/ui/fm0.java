package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class fm0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ un0 b;

    public /* synthetic */ fm0(un0 un0Var, int i10) {
        this.a = i10;
        this.b = un0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                un0 un0Var = this.b;
                un0Var.S0 = 2;
                un0Var.C1();
                break;
            case 1:
                this.b.c1();
                break;
            case 2:
                un0 un0Var2 = this.b;
                un0Var2.S0 = 3;
                un0Var2.C1();
                break;
            case 3:
                un0 un0Var3 = this.b;
                un0Var3.S0 = 1;
                un0Var3.C1();
                break;
            case 4:
                un0 un0Var4 = this.b;
                un0Var4.S0 = 4;
                un0Var4.C1();
                break;
            case 5:
                un0 un0Var5 = this.b;
                if (un0Var5.getParentActivity().checkSelfPermission("android.permission.CAMERA") == 0) {
                    z9 z9Var = new z9(0);
                    z9Var.M = new qm0(un0Var5);
                    un0Var5.presentFragment(z9Var);
                    break;
                } else {
                    un0Var5.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 22);
                    break;
                }
            case 6:
                un0 un0Var6 = this.b;
                un0Var6.f = true;
                un0Var6.L.callOnClick();
                un0Var6.f = false;
                break;
            case 7:
                un0 un0Var7 = this.b;
                un0Var7.S0 = 0;
                un0Var7.C1();
                break;
            case 8:
                un0 un0Var8 = this.b;
                un0Var8.S0 = 4;
                un0Var8.C1();
                break;
            case 9:
                this.b.c1();
                break;
            case 10:
                un0.b0(this.b);
                break;
            case 11:
                un0.c0(this.b);
                break;
            case 12:
                this.b.B1();
                break;
            case 13:
                un0 un0Var9 = this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(un0Var9.getParentActivity());
                alertDialog$Builder.a.R = LocaleController.getString(R.string.TelegramPassportDeleteTitle);
                alertDialog$Builder.a.T = LocaleController.getString(R.string.TelegramPassportDeleteAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new hm0(un0Var9, 5));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
                un0Var9.showDialog(a2Var);
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
                un0.V(this.b);
                break;
            default:
                un0 un0Var10 = this.b;
                un0Var10.f = true;
                un0Var10.L.callOnClick();
                un0Var10.f = false;
                break;
        }
    }
}
