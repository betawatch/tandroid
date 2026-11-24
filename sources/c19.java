// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class c19 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jp0 b;
    public final /* synthetic */ s09 c;

    public /* synthetic */ c19(jp0 jp0Var, s09 s09Var, byte b) {
        this.a = b;
        this.b = jp0Var;
        this.c = s09Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        s09 s09Var = this.c;
        jp0 jp0Var = this.b;
        switch (b) {
            case 0:
                gm.c3(new c19(jp0Var, s09Var, (byte) 1));
                break;
            default:
                jp0Var.removeView(s09Var);
                break;
        }
    }
}
