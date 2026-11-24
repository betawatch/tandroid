// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class n14 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ float b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ n14(Object obj, float f, int i, byte b) {
        this.a = b;
        this.d = obj;
        this.b = f;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = this.c;
        float f = this.b;
        Object obj = this.d;
        switch (b) {
            case 0:
                e34 e34Var = ((o14) obj).G;
                try {
                    w46 w46Var = new w46(e34Var.Q.getContext(), 0, f);
                    w46Var.a = i;
                    e34Var.R.v0(w46Var);
                    break;
                } catch (Exception e) {
                    fc4.g(e, true);
                    return;
                }
            default:
                vz9 vz9Var = (vz9) obj;
                try {
                    w46 w46Var2 = new w46(vz9Var.i0.getContext(), 0, f);
                    w46Var2.a = i;
                    vz9Var.s0.v0(w46Var2);
                    break;
                } catch (Exception e2) {
                    fc4.g(e2, true);
                }
        }
    }
}
