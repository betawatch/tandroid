// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class em7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nm7 b;

    public /* synthetic */ em7(nm7 nm7Var, byte b) {
        this.a = b;
        this.b = nm7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        nm7 nm7Var = this.b;
        switch (b) {
            case 0:
            case 2:
                nm7Var.c();
                break;
            case 1:
                nm7Var.getClass();
                nm7Var.i = new em7(nm7Var, (byte) 2);
                break;
            default:
                nm7Var.o();
                break;
        }
    }
}
