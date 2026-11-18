package org.telegram.ui;

import android.view.View;
import android.widget.Toast;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class d31 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ o31 b;

    public /* synthetic */ d31(o31 o31Var, int i7) {
        this.a = i7;
        this.b = o31Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7 = this.a;
        o31 o31Var = this.b;
        switch (i7) {
            case 0:
                vf.c.t(o31Var.getParentActivity(), o31Var.getMessagesController().O5);
                o31Var.getMessagesController().s4(0L, "PREMIUM_GRACE");
                break;
            case 1:
                o31Var.getClass();
                o31Var.presentFragment(new g(3));
                break;
            case 2:
                o31Var.getMessagesController().s4(0L, "VALIDATE_PHONE_NUMBER");
                break;
            case 3:
                o31Var.getClass();
                o31Var.presentFragment(new bb1(8, null));
                break;
            case 4:
                o31Var.getMessagesController().s4(0L, "VALIDATE_PASSWORD");
                break;
            case 5:
                o31.a0(o31Var);
                break;
            default:
                int i10 = o31Var.R + 1;
                o31Var.R = i10;
                if (i10 >= 2) {
                    o31Var.presentFragment(new vt());
                    break;
                } else {
                    boolean z10 = org.telegram.messenger.s2.a;
                    try {
                        Toast.makeText(o31Var.getParentActivity(), org.telegram.messenger.gd.M0(2131751614, null), 0).show();
                        break;
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                        return;
                    }
                }
        }
    }
}
