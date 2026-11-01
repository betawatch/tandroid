package org.telegram.ui;

import android.view.View;
import android.widget.Toast;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q41 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ c51 b;

    public /* synthetic */ q41(c51 c51Var, int i10) {
        this.a = i10;
        this.b = c51Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.a;
        c51 c51Var = this.b;
        switch (i10) {
            case 0:
                gf.f.r(c51Var.getParentActivity(), c51Var.getMessagesController().M5);
                c51Var.getMessagesController().h4(0L, "PREMIUM_GRACE");
                break;
            case 1:
                c51Var.getClass();
                c51Var.presentFragment(new f(3));
                break;
            case 2:
                c51Var.getMessagesController().h4(0L, "VALIDATE_PHONE_NUMBER");
                break;
            case 3:
                c51Var.getClass();
                c51Var.presentFragment(new rc1(8, null));
                break;
            case 4:
                c51Var.getMessagesController().h4(0L, "VALIDATE_PASSWORD");
                break;
            case 5:
                c51.a0(c51Var);
                break;
            default:
                int i11 = c51Var.Q + 1;
                c51Var.Q = i11;
                if (i11 >= 2) {
                    c51Var.presentFragment(new ru());
                    break;
                } else {
                    boolean z10 = org.telegram.messenger.v2.a;
                    try {
                        Toast.makeText(c51Var.getParentActivity(), org.telegram.messenger.dd.L0(2131751626, null), 0).show();
                        break;
                    } catch (Exception e) {
                        org.telegram.messenger.f8.g(e, true);
                        return;
                    }
                }
        }
    }
}
