package org.telegram.ui;

import android.view.View;
import android.widget.Toast;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e31 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ o31 b;

    public /* synthetic */ e31(o31 o31Var, int i7) {
        this.a = i7;
        this.b = o31Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7 = this.a;
        o31 o31Var = this.b;
        switch (i7) {
            case 0:
                vf.c.t(o31Var.getParentActivity(), o31Var.getMessagesController().L5);
                o31Var.getMessagesController().k4(0L, "PREMIUM_GRACE");
                break;
            case 1:
                o31Var.getClass();
                o31Var.presentFragment(new g(3));
                break;
            case 2:
                o31Var.getMessagesController().k4(0L, "VALIDATE_PHONE_NUMBER");
                break;
            case 3:
                o31Var.getClass();
                o31Var.presentFragment(new cb1(8, null));
                break;
            case 4:
                o31Var.getMessagesController().k4(0L, "VALIDATE_PASSWORD");
                break;
            case 5:
                o31.a0(o31Var);
                break;
            default:
                int i10 = o31Var.Q + 1;
                o31Var.Q = i10;
                if (i10 >= 2) {
                    o31Var.presentFragment(new tt());
                    break;
                } else {
                    boolean z9 = org.telegram.messenger.r2.a;
                    try {
                        Toast.makeText(o31Var.getParentActivity(), org.telegram.messenger.id.M0(2131751625, null), 0).show();
                        break;
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                        return;
                    }
                }
        }
    }
}
