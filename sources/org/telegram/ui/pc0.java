package org.telegram.ui;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class pc0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qc0 b;

    public /* synthetic */ pc0(qc0 qc0Var, int i7) {
        this.a = i7;
        this.b = qc0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                qc0 qc0Var = this.b;
                rc0 rc0Var = qc0Var.d;
                if (qc0Var.b) {
                    boolean z9 = rc0Var.L;
                    org.telegram.ui.Components.ah0 ah0Var = rc0Var.K;
                    yc ycVar = rc0Var.n;
                    if (z9 && System.currentTimeMillis() - qc0Var.a >= 10000) {
                        ycVar.setAnimation(ah0Var);
                        ah0Var.N(0, false, false);
                        ah0Var.t0 = new pc0(qc0Var, 1);
                        ycVar.d();
                        qc0Var.a = System.currentTimeMillis();
                    }
                    ycVar.postDelayed(qc0Var.c, 1000L);
                    break;
                }
                break;
            case 1:
                org.telegram.messenger.g0.h3(new pc0(this.b, 2));
                break;
            default:
                rc0 rc0Var2 = this.b.d;
                org.telegram.ui.Components.ah0 ah0Var2 = rc0Var2.J;
                ah0Var2.N(0, false, false);
                rc0Var2.n.setAnimation(ah0Var2);
                break;
        }
    }
}
