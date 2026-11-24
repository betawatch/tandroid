// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class it1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jt1 b;

    public /* synthetic */ it1(jt1 jt1Var, byte b) {
        this.a = b;
        this.b = jt1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        jt1 jt1Var = this.b;
        switch (b) {
            case 0:
                ms1 ms1Var = jt1Var.I.a0;
                if (ms1Var != null) {
                    ms1Var.j1();
                    break;
                }
                break;
            default:
                ms1 ms1Var2 = jt1Var.I.a0;
                if (ms1Var2 != null) {
                    ms1Var2.U0 = false;
                    jz1 jz1Var = ms1Var2.V0;
                    if (jz1Var != null) {
                        jz1Var.s(false);
                        break;
                    }
                }
                break;
        }
    }
}
