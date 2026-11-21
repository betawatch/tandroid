package org.telegram.ui.Components;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l11 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b21 b;

    public /* synthetic */ l11(b21 b21Var, int i7) {
        this.a = i7;
        this.b = b21Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                b21 b21Var = this.b;
                if (b21Var.l()) {
                    b21Var.m();
                    break;
                }
                break;
            default:
                b21 b21Var2 = this.b;
                q11 q11Var = b21Var2.K;
                q11Var.z1(true);
                o11 o11Var = b21Var2.y;
                o11Var.z1(true);
                b21Var2.N.a(true, true);
                org.telegram.messenger.g0.Z3(o11Var);
                org.telegram.messenger.g0.Z3(q11Var);
                break;
        }
    }
}
