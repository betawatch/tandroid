package org.telegram.ui.Wallet;

import org.telegram.messenger.gd;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final /* synthetic */ class t8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u8 b;

    public /* synthetic */ t8(u8 u8Var, int i7) {
        this.a = i7;
        this.b = u8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        u8 u8Var = this.b;
        switch (i7) {
            case 0:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, u8Var.getParentActivity(), u8Var.getResourceProvider());
                alertDialog$Builder.a.U = gd.M0(2131742886, null);
                org.telegram.messenger.f3.m(null, 2131747638, alertDialog$Builder, null);
                break;
            default:
                u8Var.d0();
                break;
        }
    }
}
