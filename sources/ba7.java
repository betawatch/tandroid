// default package

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class ba7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ oc7 b;

    public /* synthetic */ ba7(oc7 oc7Var, byte b) {
        this.a = b;
        this.b = oc7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        oc7 oc7Var = this.b;
        switch (b) {
            case 0:
                oc7Var.getNotificationCenter().k(2, 64);
                break;
            case 1:
                oc7Var.l3();
                break;
            case 2:
                TLRPC.Dialog dialog = oc7Var.q2;
                if (dialog != null) {
                    long j = dialog.id;
                    if (j < 0) {
                        TLRPC.Chat L0 = oc7Var.L0(Long.valueOf(-j));
                        if (sd2.r0(L0) || L0.restricted) {
                            oc7Var.k4(oc7Var.q2);
                        }
                    } else {
                        oc7Var.k4(dialog);
                    }
                    oc7Var.q2 = null;
                    oc7Var.b5(null);
                    oc7Var.getNotificationCenter().k(3, new Object[0]);
                    break;
                }
                break;
            case 3:
                oc7Var.getNotificationCenter().k(2, Integer.valueOf(TLObject.FLAG_13));
                break;
            case 4:
                oc7Var.getNotificationCenter().k(2, Integer.valueOf(TLObject.FLAG_13));
                break;
            case 5:
                oc7Var.E(true);
                break;
            case 6:
                oc7Var.X1 = false;
                break;
            case 7:
                oc7Var.getMessagesController().b5(null);
                oc7Var.getNotificationCenter().k(3, Boolean.TRUE);
                break;
            case 8:
                oc7Var.getNotificationCenter().k(2, Integer.valueOf(TLObject.FLAG_13));
                break;
            case 9:
                oc7Var.X1 = false;
                break;
            case 10:
                oc7Var.J(true);
                break;
            case 11:
                oc7Var.getNotificationCenter().k(2, Integer.valueOf(TLObject.FLAG_13));
                break;
            case 12:
                oc7Var.getNotificationCenter().k(2, 4);
                break;
            case 13:
                oc7Var.I1.clear();
                oc7Var.J1.b();
                oc7Var.K1.clear();
                oc7Var.L1.clear();
                oc7Var.V0.clear();
                oc7Var.W0.clear();
                oc7Var.X0.clear();
                oc7Var.S0.b();
                oc7Var.T0.b();
                oc7Var.Y0 = 0L;
                oc7Var.Z0 = 0L;
                oc7Var.a1 = 0L;
                oc7Var.l0.clear();
                oc7Var.m0.clear();
                oc7Var.Y1 = false;
                oc7Var.f2 = null;
                oc7Var.g2 = null;
                break;
            case 14:
                fc4.b("cleanup: isUpdating = false");
                oc7Var.getConnectionsManager().setIsUpdating(false);
                oc7Var.N0.b();
                oc7Var.O0.clear();
                oc7Var.Q0.b();
                oc7Var.P0.clear();
                oc7Var.q0.clear();
                oc7Var.r0.b();
                oc7Var.s0.clear();
                oc7Var.t0.b();
                break;
            case 15:
                oc7Var.getNotificationCenter().k(nm7.S2, new Object[0]);
                oc7Var.getNotificationCenter().k(nm7.O2, new Object[0]);
                oc7Var.getNotificationCenter().k(3, new Object[0]);
                break;
            case 16:
                oc7Var.getNotificationCenter().k(2, 4);
                break;
            case 17:
                oc7Var.o4();
                break;
            default:
                oc7Var.getNotificationCenter().k(47, new Object[0]);
                oc7Var.getNotificationCenter().k(2, 2);
                oc7Var.getUserConfig().u(true);
                break;
        }
    }
}
