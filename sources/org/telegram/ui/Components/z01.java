package org.telegram.ui.Components;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class z01 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p11 b;

    public /* synthetic */ z01(p11 p11Var, int i7) {
        this.a = i7;
        this.b = p11Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                p11 p11Var = this.b;
                if (p11Var.l()) {
                    p11Var.m();
                    break;
                }
                break;
            default:
                p11 p11Var2 = this.b;
                e11 e11Var = p11Var2.K;
                e11Var.z1(true);
                c11 c11Var = p11Var2.y;
                c11Var.z1(true);
                p11Var2.N.a(true, true);
                org.telegram.messenger.g0.a4(c11Var);
                org.telegram.messenger.g0.a4(e11Var);
                break;
        }
    }
}
