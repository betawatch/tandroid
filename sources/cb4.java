// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class cb4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lb4 b;
    public final /* synthetic */ int c;

    public /* synthetic */ cb4(lb4 lb4Var, int i, byte b) {
        this.a = b;
        this.b = lb4Var;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = this.c;
        lb4 lb4Var = this.b;
        switch (b) {
            case 0:
                lb4Var.F0.add(Integer.valueOf(i));
                break;
            case 1:
                lb4Var.F0.remove(Integer.valueOf(i));
                break;
            case 2:
                lb4Var.F0.remove(Integer.valueOf(i));
                break;
            default:
                zb4 zb4Var = lb4Var.g0;
                if (zb4Var != null) {
                    zb4Var.b(lb4Var, i);
                }
                lb4Var.g();
                break;
        }
    }
}
