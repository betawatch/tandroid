// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class mw5 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nw5 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ mw5(nw5 nw5Var, boolean z, boolean z2, byte b) {
        this.a = b;
        this.b = nw5Var;
        this.c = z;
        this.d = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        boolean z = this.d;
        boolean z2 = this.c;
        nw5 nw5Var = this.b;
        switch (b) {
            case 0:
                hl.c3(new mw5(nw5Var, z2, z, (byte) 1));
                break;
            default:
                nw5Var.setJoinRequest(z2);
                nw5Var.setJoinToSend(z);
                break;
        }
    }
}
