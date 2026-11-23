package org.telegram.ui.Wallet;

import org.telegram.messenger.gd;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class u8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v8 b;

    public /* synthetic */ u8(v8 v8Var, int i7) {
        this.a = i7;
        this.b = v8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        v8 v8Var = this.b;
        switch (i7) {
            case 0:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, v8Var.getParentActivity(), v8Var.getResourceProvider());
                alertDialog$Builder.a.U = gd.N0(2131742873, null);
                org.telegram.messenger.f3.m(null, 2131747637, alertDialog$Builder, null);
                break;
            default:
                v8Var.d0();
                break;
        }
    }
}
