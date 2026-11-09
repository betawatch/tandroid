package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final /* synthetic */ class r6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u6 b;

    public /* synthetic */ r6(u6 u6Var, int i7) {
        this.a = i7;
        this.b = u6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                u6.a(this.b);
                break;
            default:
                u6 u6Var = this.b;
                Runnable runnable = u6Var.c0;
                u6Var.c0 = null;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
        }
    }
}
