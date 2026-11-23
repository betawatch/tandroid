package org.telegram.ui;

import android.view.View;
import android.widget.Toast;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class c31 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ n31 b;

    public /* synthetic */ c31(n31 n31Var, int i7) {
        this.a = i7;
        this.b = n31Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7 = this.a;
        n31 n31Var = this.b;
        switch (i7) {
            case 0:
                vf.c.t(n31Var.getParentActivity(), n31Var.getMessagesController().O5);
                n31Var.getMessagesController().s4(0L, "PREMIUM_GRACE");
                break;
            case 1:
                n31Var.getClass();
                n31Var.presentFragment(new g(3));
                break;
            case 2:
                n31Var.getMessagesController().s4(0L, "VALIDATE_PHONE_NUMBER");
                break;
            case 3:
                n31Var.getClass();
                n31Var.presentFragment(new za1(8, null));
                break;
            case 4:
                n31Var.getMessagesController().s4(0L, "VALIDATE_PASSWORD");
                break;
            case 5:
                n31.a0(n31Var);
                break;
            default:
                int i10 = n31Var.R + 1;
                n31Var.R = i10;
                if (i10 >= 2) {
                    n31Var.presentFragment(new ut());
                    break;
                } else {
                    boolean z10 = org.telegram.messenger.s2.a;
                    try {
                        Toast.makeText(n31Var.getParentActivity(), org.telegram.messenger.gd.N0(2131751613, null), 0).show();
                        break;
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                        return;
                    }
                }
        }
    }
}
