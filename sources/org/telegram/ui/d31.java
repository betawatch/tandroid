package org.telegram.ui;

import android.view.View;
import android.widget.Toast;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class d31 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ n31 b;

    public /* synthetic */ d31(n31 n31Var, int i7) {
        this.a = i7;
        this.b = n31Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7 = this.a;
        n31 n31Var = this.b;
        switch (i7) {
            case 0:
                vf.c.t(n31Var.getParentActivity(), n31Var.getMessagesController().L5);
                n31Var.getMessagesController().k4(0L, "PREMIUM_GRACE");
                break;
            case 1:
                n31Var.getClass();
                n31Var.presentFragment(new g(3));
                break;
            case 2:
                n31Var.getMessagesController().k4(0L, "VALIDATE_PHONE_NUMBER");
                break;
            case 3:
                n31Var.getClass();
                n31Var.presentFragment(new bb1(8, null));
                break;
            case 4:
                n31Var.getMessagesController().k4(0L, "VALIDATE_PASSWORD");
                break;
            case 5:
                n31.a0(n31Var);
                break;
            default:
                int i10 = n31Var.Q + 1;
                n31Var.Q = i10;
                if (i10 >= 2) {
                    n31Var.presentFragment(new st());
                    break;
                } else {
                    boolean z9 = org.telegram.messenger.r2.a;
                    try {
                        Toast.makeText(n31Var.getParentActivity(), org.telegram.messenger.id.M0(2131751625, null), 0).show();
                        break;
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                        return;
                    }
                }
        }
    }
}
