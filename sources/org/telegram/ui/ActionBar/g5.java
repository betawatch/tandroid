package org.telegram.ui.ActionBar;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class g5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j5 b;

    public /* synthetic */ g5(j5 j5Var, int i7) {
        this.a = i7;
        this.b = j5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                j5 j5Var = this.b;
                if (!j5Var.D && j5Var.N) {
                    j5Var.c();
                    break;
                }
                break;
            default:
                this.b.a(true);
                break;
        }
    }
}
