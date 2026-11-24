// default package

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class bg1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vg1 b;

    public /* synthetic */ bg1(vg1 vg1Var, byte b) {
        this.a = b;
        this.b = vg1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        vg1 vg1Var = this.b;
        switch (b) {
            case 0:
                vg1Var.H0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                vg1Var.i1();
                vg1Var.I0 = null;
                break;
            case 1:
                vg1Var.a1(false);
                vg1Var.F.f();
                break;
            default:
                vg1Var.Z0();
                break;
        }
    }
}
