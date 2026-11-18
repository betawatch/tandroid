package org.telegram.ui.Components;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class vn0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yo0 b;

    public /* synthetic */ vn0(yo0 yo0Var, int i7) {
        this.a = i7;
        this.b = yo0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                yo0 yo0Var = this.b;
                yo0Var.w2 = true;
                c10 c10Var = yo0Var.u2;
                c10Var.r.setText("");
                org.telegram.messenger.g0.I3(c10Var.r);
                break;
            default:
                me meVar = new me(11);
                yo0 yo0Var2 = this.b;
                if (!yo0Var2.d) {
                    meVar.run();
                    break;
                } else {
                    c10 c10Var2 = yo0Var2.u2;
                    if (c10Var2 != null) {
                        org.telegram.messenger.g0.v1(c10Var2.r);
                    }
                    org.telegram.messenger.g0.h3(meVar, 300L);
                    break;
                }
        }
    }
}
