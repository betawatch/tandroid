// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class hm1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vs9 b;

    public /* synthetic */ hm1(vs9 vs9Var, byte b) {
        this.a = b;
        this.b = vs9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        vs9 vs9Var = this.b;
        switch (b) {
            case 0:
                if (!vs9Var.N) {
                    vs9Var.N = true;
                    vs9Var.a(new hm1(vs9Var, (byte) 2), false);
                    vs9Var.s.invalidate();
                    break;
                }
                break;
            case 1:
                vs9Var.dismiss();
                break;
            case 2:
                vs9Var.getClass();
                gm.c3(new hm1(vs9Var, (byte) 4));
                break;
            case 3:
                gm.c3(new hm1(vs9Var, (byte) 5));
                break;
            case 4:
                vs9Var.c();
                break;
            default:
                vs9Var.b();
                break;
        }
    }
}
