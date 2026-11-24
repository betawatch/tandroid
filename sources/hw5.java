// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class hw5 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iw5 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ hw5(iw5 iw5Var, boolean z, boolean z2, byte b) {
        this.a = b;
        this.b = iw5Var;
        this.c = z;
        this.d = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        boolean z = this.d;
        boolean z2 = this.c;
        iw5 iw5Var = this.b;
        switch (b) {
            case 0:
                gm.c3(new hw5(iw5Var, z2, z, (byte) 1));
                break;
            default:
                iw5Var.setJoinRequest(z2);
                iw5Var.setJoinToSend(z);
                break;
        }
    }
}
