// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class n33 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ o33 b;
    public final /* synthetic */ o13 c;

    public /* synthetic */ n33(o33 o33Var, o13 o13Var, byte b) {
        this.a = b;
        this.b = o33Var;
        this.c = o13Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        o13 o13Var = this.c;
        o33 o33Var = this.b;
        switch (b) {
            case 0:
                a33 a33Var = o33Var.f;
                if (a33Var != null) {
                    a33Var.A(o13Var);
                    return;
                } else {
                    rr5.e("callback");
                    throw null;
                }
            case 1:
                a33 a33Var2 = o33Var.f;
                if (a33Var2 != null) {
                    a33Var2.A(o13Var);
                    return;
                } else {
                    rr5.e("callback");
                    throw null;
                }
            default:
                a33 a33Var3 = o33Var.f;
                if (a33Var3 != null) {
                    a33Var3.A(o13Var);
                    return;
                } else {
                    rr5.e("callback");
                    throw null;
                }
        }
    }
}
