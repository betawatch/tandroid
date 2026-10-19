package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final /* synthetic */ class j6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m6 b;

    public /* synthetic */ j6(m6 m6Var, int i10) {
        this.a = i10;
        this.b = m6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                m6.a(this.b);
                break;
            default:
                m6 m6Var = this.b;
                Runnable runnable = m6Var.c0;
                m6Var.c0 = null;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
        }
    }
}
