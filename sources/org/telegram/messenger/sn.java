package org.telegram.messenger;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final /* synthetic */ class sn implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qp b;

    public /* synthetic */ sn(qp qpVar, int i7) {
        this.a = i7;
        this.b = qpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        qp qpVar = this.b;
        switch (i7) {
            case 0:
                qpVar.getMessagesController().T4(null);
                qpVar.getNotificationCenter().k(3, Boolean.TRUE);
                break;
            case 1:
                qpVar.e2 = false;
                break;
            case 2:
                qpVar.getNotificationCenter().k(2, Integer.valueOf(TLObject.FLAG_13));
                break;
            case 3:
                qpVar.getNotificationCenter().k(2, Integer.valueOf(TLObject.FLAG_19));
                qpVar.i5();
                break;
            case 4:
                qpVar.getNotificationCenter().k(2, 4);
                break;
            case 5:
                qpVar.P1.clear();
                qpVar.Q1.b();
                qpVar.R1.clear();
                qpVar.S1.clear();
                qpVar.e1.clear();
                qpVar.f1.clear();
                qpVar.g1.clear();
                qpVar.b1.b();
                qpVar.c1.b();
                qpVar.h1 = 0L;
                qpVar.i1 = 0L;
                qpVar.j1 = 0L;
                qpVar.u0.clear();
                qpVar.v0.clear();
                qpVar.f2 = false;
                qpVar.m2 = null;
                qpVar.n2 = null;
                break;
            case 6:
                a8.b("cleanup: isUpdating = false");
                qpVar.getConnectionsManager().setIsUpdating(false);
                qpVar.W0.b();
                qpVar.X0.clear();
                qpVar.Z0.b();
                qpVar.Y0.clear();
                qpVar.z0.clear();
                qpVar.A0.b();
                qpVar.B0.clear();
                qpVar.C0.b();
                break;
            case 7:
                qpVar.getNotificationCenter().k(qs.Q2, new Object[0]);
                qpVar.getNotificationCenter().k(qs.O2, new Object[0]);
                qpVar.getNotificationCenter().k(3, new Object[0]);
                break;
            case 8:
                qpVar.j4();
                break;
            case 9:
                qpVar.getNotificationCenter().k(2, 4);
                break;
            case 10:
                c20 c20Var = qpVar.H7;
                if (c20Var != null) {
                    c20Var.a(Boolean.TRUE);
                    qpVar.H7 = null;
                    break;
                }
                break;
            case 11:
                qpVar.getNotificationCenter().k(qs.O2, new Object[0]);
                break;
            case 12:
                c20 c20Var2 = qpVar.H7;
                if (c20Var2 != null) {
                    c20Var2.a(Boolean.TRUE);
                    qpVar.H7 = null;
                    break;
                }
                break;
            default:
                c20 c20Var3 = qpVar.H7;
                if (c20Var3 != null) {
                    c20Var3.a(Boolean.FALSE);
                    qpVar.H7 = null;
                    break;
                }
                break;
        }
    }
}
