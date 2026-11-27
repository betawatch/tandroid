// default package

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ef1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wf1 b;

    public /* synthetic */ ef1(wf1 wf1Var, byte b) {
        this.a = b;
        this.b = wf1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        wf1 wf1Var = this.b;
        switch (b) {
            case 0:
                wf1Var.H0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                wf1Var.i1();
                wf1Var.I0 = null;
                break;
            case 1:
                wf1Var.a1(false);
                wf1Var.F.f();
                break;
            default:
                wf1Var.Z0();
                break;
        }
    }
}
