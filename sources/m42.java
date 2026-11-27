// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class m42 implements hj {
    public final /* synthetic */ byte a;
    public final /* synthetic */ s42 b;
    public final /* synthetic */ TLRPC.TL_messageMediaVenue c;

    public /* synthetic */ m42(s42 s42Var, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, byte b) {
        this.a = b;
        this.b = s42Var;
        this.c = tL_messageMediaVenue;
    }

    @Override // hj
    public final void y(int i, int i2, boolean z) {
        byte b = this.a;
        s42 s42Var = this.b;
        switch (b) {
            case 0:
                s42Var.o0.b(this.c, s42Var.p0, z, i, 0L);
                s42Var.b.a(true);
                break;
            default:
                s42Var.o0.b(this.c, s42Var.p0, z, i, 0L);
                s42Var.b.a(true);
                break;
        }
    }
}
