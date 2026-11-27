// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class lw5 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nw5 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ lw5(nw5 nw5Var, boolean z, byte b) {
        this.a = b;
        this.b = nw5Var;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        boolean z = this.c;
        nw5 nw5Var = this.b;
        switch (b) {
            case 0:
                hl.c3(new lw5(nw5Var, z, (byte) 1));
                break;
            default:
                nw5Var.setJoinRequest(z);
                break;
        }
    }
}
