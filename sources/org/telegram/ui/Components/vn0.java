package org.telegram.ui.Components;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
