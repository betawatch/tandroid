// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class h65 implements icc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ j95 b;

    public /* synthetic */ h65(j95 j95Var, byte b) {
        this.a = b;
        this.b = j95Var;
    }

    @Override // icc
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        j95 j95Var = this.b;
        TLRPC.Updates updates = (TLRPC.Updates) obj;
        switch (b) {
            case 0:
                if (updates != null) {
                    uc7.s1(j95Var.n1.a).Y3(updates, false);
                } else {
                    j95Var.getClass();
                }
                hl.c3(new z55(j95Var, (byte) 8));
                break;
            default:
                if (updates != null) {
                    uc7.s1(j95Var.n1.a).Y3(updates, false);
                    break;
                }
                break;
        }
    }
}
