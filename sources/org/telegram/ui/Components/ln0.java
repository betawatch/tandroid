package org.telegram.ui.Components;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ln0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ oo0 b;

    public /* synthetic */ ln0(oo0 oo0Var, int i3) {
        this.a = i3;
        this.b = oo0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                oo0 oo0Var = this.b;
                oo0Var.t2 = true;
                n00 n00Var = oo0Var.r2;
                n00Var.r.setText("");
                org.telegram.messenger.g0.K3(n00Var.r);
                break;
            default:
                go goVar = new go(7);
                oo0 oo0Var2 = this.b;
                if (!oo0Var2.d) {
                    goVar.run();
                    break;
                } else {
                    n00 n00Var2 = oo0Var2.r2;
                    if (n00Var2 != null) {
                        org.telegram.messenger.g0.v1(n00Var2.r);
                    }
                    org.telegram.messenger.g0.i3(goVar, 300L);
                    break;
                }
        }
    }
}
