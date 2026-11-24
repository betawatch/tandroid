// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class g23 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ k23 b;
    public final /* synthetic */ o13 c;

    public /* synthetic */ g23(k23 k23Var, o13 o13Var, byte b) {
        this.a = b;
        this.b = k23Var;
        this.c = o13Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Object obj = this.c;
        k23 k23Var = this.b;
        switch (b) {
            case 0:
                a33 a33Var = k23Var.f;
                if (a33Var != null) {
                    a33Var.A(obj);
                    return;
                } else {
                    rr5.e("callback");
                    throw null;
                }
            default:
                a33 a33Var2 = k23Var.f;
                if (a33Var2 == null) {
                    rr5.e("callback");
                    throw null;
                }
                if (obj == null) {
                    obj = new n13("No provider data returned", (byte) 2);
                }
                a33Var2.A(obj);
                return;
        }
    }
}
