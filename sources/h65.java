// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
