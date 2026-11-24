// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class do6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fo6 b;
    public final /* synthetic */ int c;

    public /* synthetic */ do6(fo6 fo6Var, int i, byte b) {
        this.a = b;
        this.b = fo6Var;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = this.c;
        fo6 fo6Var = this.b;
        switch (b) {
            case 0:
                try {
                    fo6Var.b.n(i);
                    break;
                } catch (Exception e) {
                    fc4.g(e, true);
                    return;
                }
            case 1:
                try {
                    fo6Var.b.n(i);
                    break;
                } catch (Exception e2) {
                    fc4.g(e2, true);
                    return;
                }
            case 2:
                try {
                    fo6Var.b.n(i);
                    break;
                } catch (Exception e3) {
                    fc4.g(e3, true);
                    return;
                }
            default:
                try {
                    fo6Var.b.n(i);
                    break;
                } catch (Exception e4) {
                    fc4.g(e4, true);
                }
        }
    }
}
