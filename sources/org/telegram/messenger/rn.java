package org.telegram.messenger;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final /* synthetic */ class rn implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ np b;

    public /* synthetic */ rn(np npVar, int i7) {
        this.a = i7;
        this.b = npVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        np npVar = this.b;
        switch (i7) {
            case 0:
                npVar.getNotificationCenter().k(2, Integer.valueOf(TLObject.FLAG_13));
                break;
            case 1:
                npVar.h2 = false;
                break;
            case 2:
                npVar.getNotificationCenter().k(2, Integer.valueOf(TLObject.FLAG_13));
                break;
            case 3:
                npVar.getNotificationCenter().k(2, 4);
                break;
            case 4:
                npVar.S1.clear();
                npVar.T1.b();
                npVar.U1.clear();
                npVar.V1.clear();
                npVar.f1.clear();
                npVar.g1.clear();
                npVar.h1.clear();
                npVar.c1.b();
                npVar.d1.b();
                npVar.i1 = 0L;
                npVar.j1 = 0L;
                npVar.k1 = 0L;
                npVar.v0.clear();
                npVar.w0.clear();
                npVar.i2 = false;
                npVar.p2 = null;
                npVar.q2 = null;
                break;
            case 5:
                a8.b("cleanup: isUpdating = false");
                npVar.getConnectionsManager().setIsUpdating(false);
                npVar.X0.b();
                npVar.Y0.clear();
                npVar.a1.b();
                npVar.Z0.clear();
                npVar.A0.clear();
                npVar.B0.b();
                npVar.C0.clear();
                npVar.D0.b();
                break;
            case 6:
                npVar.getNotificationCenter().k(ls.S2, new Object[0]);
                npVar.getNotificationCenter().k(ls.O2, new Object[0]);
                npVar.getNotificationCenter().k(3, new Object[0]);
                break;
            case 7:
                npVar.r4();
                break;
            case 8:
                npVar.getNotificationCenter().k(2, 4);
                break;
            case 9:
                npVar.m2 = false;
                break;
            case 10:
                y10 y10Var = npVar.N7;
                if (y10Var != null) {
                    y10Var.a(Boolean.TRUE);
                    npVar.N7 = null;
                    break;
                }
                break;
            case 11:
                npVar.getNotificationCenter().k(ls.O2, new Object[0]);
                break;
            case 12:
                y10 y10Var2 = npVar.N7;
                if (y10Var2 != null) {
                    y10Var2.a(Boolean.TRUE);
                    npVar.N7 = null;
                    break;
                }
                break;
            default:
                y10 y10Var3 = npVar.N7;
                if (y10Var3 != null) {
                    y10Var3.a(Boolean.FALSE);
                    npVar.N7 = null;
                    break;
                }
                break;
        }
    }
}
