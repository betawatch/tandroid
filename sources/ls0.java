// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class ls0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rs0 b;

    public /* synthetic */ ls0(rs0 rs0Var, byte b) {
        this.a = b;
        this.b = rs0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        rs0 rs0Var = this.b;
        switch (b) {
            case 0:
                rs0Var.l0();
                break;
            default:
                rs0Var.getSendMessagesHelper().q0(y5a.b("/start", rs0Var.a, null, null, null, false, null, null, null, true, 0, 0, null, false));
                break;
        }
    }
}
