// default package

import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class gd2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xd2 b;

    public /* synthetic */ gd2(xd2 xd2Var, byte b) {
        this.a = b;
        this.b = xd2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        xd2 xd2Var = this.b;
        switch (b) {
            case 0:
                xd2Var.q1.f();
                break;
            case 1:
                xd2Var.E0(true);
                break;
            case 2:
                mu1 mu1Var = xd2Var.u1;
                d d0 = uxa.d0(mu1Var.getMessagesController().K0(Long.valueOf(-mu1Var.a())), true);
                ag0 ag0Var = new ag0();
                ag0Var.a = true;
                d0.setResourceProvider(mu1Var.getResourceProvider());
                ag0Var.c = new jc((byte) 23);
                ag0Var.d = new gd2(xd2Var, (byte) 3);
                ag0Var.b = new gd2(xd2Var, (byte) 4);
                ag0Var.e = true;
                xd2Var.Q1 = d0;
                mu1Var.showAsSheet(d0, ag0Var);
                break;
            case 3:
                xd2Var.I0();
                break;
            case 4:
                xd2Var.Q1 = null;
                break;
            case 5:
                xd2Var.I0();
                break;
            case 6:
                xd2Var.Q1 = null;
                break;
            default:
                xd2Var.N1.c(xd2Var.z1);
                break;
        }
    }
}
