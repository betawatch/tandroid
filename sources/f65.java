// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class f65 implements jac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ g95 b;

    public /* synthetic */ f65(g95 g95Var, byte b) {
        this.a = b;
        this.b = g95Var;
    }

    @Override // jac
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        g95 g95Var = this.b;
        TLRPC.Updates updates = (TLRPC.Updates) obj;
        switch (b) {
            case 0:
                if (updates != null) {
                    oc7.r1(g95Var.n1.a).T3(updates, false);
                } else {
                    g95Var.getClass();
                }
                gm.c3(new v55(g95Var, (byte) 10));
                break;
            default:
                if (updates != null) {
                    oc7.r1(g95Var.n1.a).T3(updates, false);
                    break;
                }
                break;
        }
    }
}
