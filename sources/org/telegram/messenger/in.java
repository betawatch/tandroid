package org.telegram.messenger;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class in implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hp b;

    public /* synthetic */ in(hp hpVar, int i3) {
        this.a = i3;
        this.b = hpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        hp hpVar = this.b;
        switch (i3) {
            case 0:
                hpVar.getMessagesController().T4(null);
                hpVar.getNotificationCenter().k(3, Boolean.TRUE);
                break;
            case 1:
                hpVar.f2 = false;
                break;
            case 2:
                hpVar.getNotificationCenter().k(2, Integer.valueOf(TLObject.FLAG_13));
                break;
            case 3:
                hpVar.getNotificationCenter().k(2, Integer.valueOf(TLObject.FLAG_19));
                hpVar.i5();
                break;
            case 4:
                hpVar.getNotificationCenter().k(2, 4);
                break;
            case 5:
                hpVar.Q1.clear();
                hpVar.R1.b();
                hpVar.S1.clear();
                hpVar.T1.clear();
                hpVar.f1.clear();
                hpVar.g1.clear();
                hpVar.h1.clear();
                hpVar.c1.b();
                hpVar.d1.b();
                hpVar.i1 = 0L;
                hpVar.j1 = 0L;
                hpVar.k1 = 0L;
                hpVar.v0.clear();
                hpVar.w0.clear();
                hpVar.g2 = false;
                hpVar.n2 = null;
                hpVar.o2 = null;
                break;
            case 6:
                a8.b("cleanup: isUpdating = false");
                hpVar.getConnectionsManager().setIsUpdating(false);
                hpVar.X0.b();
                hpVar.Y0.clear();
                hpVar.a1.b();
                hpVar.Z0.clear();
                hpVar.A0.clear();
                hpVar.B0.b();
                hpVar.C0.clear();
                hpVar.D0.b();
                break;
            case 7:
                hpVar.getNotificationCenter().k(hs.Q2, new Object[0]);
                hpVar.getNotificationCenter().k(hs.O2, new Object[0]);
                hpVar.getNotificationCenter().k(3, new Object[0]);
                break;
            case 8:
                hpVar.j4();
                break;
            case 9:
                hpVar.getNotificationCenter().k(2, 4);
                break;
            case 10:
                u10 u10Var = hpVar.H7;
                if (u10Var != null) {
                    u10Var.a(Boolean.TRUE);
                    hpVar.H7 = null;
                    break;
                }
                break;
            case 11:
                hpVar.getNotificationCenter().k(hs.O2, new Object[0]);
                break;
            case 12:
                u10 u10Var2 = hpVar.H7;
                if (u10Var2 != null) {
                    u10Var2.a(Boolean.TRUE);
                    hpVar.H7 = null;
                    break;
                }
                break;
            default:
                u10 u10Var3 = hpVar.H7;
                if (u10Var3 != null) {
                    u10Var3.a(Boolean.FALSE);
                    hpVar.H7 = null;
                    break;
                }
                break;
        }
    }
}
