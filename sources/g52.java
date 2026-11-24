// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class g52 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ n52 b;
    public final /* synthetic */ uj5 c;

    public /* synthetic */ g52(n52 n52Var, uj5 uj5Var, byte b) {
        this.a = b;
        this.b = n52Var;
        this.c = uj5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        uj5 uj5Var = this.c;
        n52 n52Var = this.b;
        switch (b) {
            case 0:
                try {
                    ((sm2) uj5Var).F();
                } catch (Exception unused) {
                }
                gm.c3(new g52(n52Var, uj5Var, (byte) 1));
                break;
            default:
                n52Var.T(uj5Var);
                break;
        }
    }
}
