// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class de2 implements oqb {
    public final /* synthetic */ byte a;
    public final /* synthetic */ n12 b;
    public final /* synthetic */ ah1 c;

    public /* synthetic */ de2(n12 n12Var, ah1 ah1Var, byte b) {
        this.a = b;
        this.b = n12Var;
        this.c = ah1Var;
    }

    @Override // oqb
    public final void a(TLRPC.WallPaper wallPaper) {
        byte b = this.a;
        ah1 ah1Var = this.c;
        n12 n12Var = this.b;
        switch (b) {
            case 0:
                n12Var.H();
                ah1Var.a(wallPaper);
                break;
            default:
                n12Var.H();
                ah1Var.a(wallPaper);
                break;
        }
    }
}
