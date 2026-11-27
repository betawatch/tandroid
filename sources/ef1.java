// default package

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
