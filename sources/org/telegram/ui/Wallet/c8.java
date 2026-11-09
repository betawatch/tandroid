package org.telegram.ui.Wallet;

import org.telegram.messenger.id;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final /* synthetic */ class c8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d8 b;

    public /* synthetic */ c8(d8 d8Var, int i7) {
        this.a = i7;
        this.b = d8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        d8 d8Var = this.b;
        switch (i7) {
            case 0:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, d8Var.getParentActivity(), d8Var.getResourceProvider());
                alertDialog$Builder.a.T = id.M0(2131743124, null);
                jg.g.C(null, 2131747831, alertDialog$Builder, null);
                break;
            default:
                d8Var.d0();
                break;
        }
    }
}
