// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class m33 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ o33 b;

    public /* synthetic */ m33(o33 o33Var, byte b) {
        this.a = b;
        this.b = o33Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        o33 o33Var = this.b;
        switch (b) {
            case 0:
                a33 a33Var = o33Var.f;
                if (a33Var != null) {
                    a33Var.A(new n13("Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context.", (byte) 2));
                    return;
                } else {
                    rr5.e("callback");
                    throw null;
                }
            default:
                a33 a33Var2 = o33Var.f;
                if (a33Var2 != null) {
                    a33Var2.A(new l23(new h1((byte) 26), "Upon handling create public key credential response, fido module giving null bytes indicating internal error"));
                    return;
                } else {
                    rr5.e("callback");
                    throw null;
                }
        }
    }
}
