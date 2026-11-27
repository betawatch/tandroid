// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
