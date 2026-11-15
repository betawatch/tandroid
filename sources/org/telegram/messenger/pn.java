package org.telegram.messenger;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class pn implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ np b;

    public /* synthetic */ pn(np npVar, int i7) {
        this.a = i7;
        this.b = npVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        np npVar = this.b;
        switch (i7) {
            case 0:
                npVar.I(true);
                break;
            case 1:
                npVar.getMessagesController().U4(null);
                npVar.getNotificationCenter().k(3, Boolean.TRUE);
                break;
            case 2:
                npVar.f2 = false;
                break;
            case 3:
                npVar.getNotificationCenter().k(2, Integer.valueOf(TLObject.FLAG_13));
                break;
            case 4:
                npVar.getNotificationCenter().k(2, 4);
                break;
            case 5:
                npVar.Q1.clear();
                npVar.R1.b();
                npVar.S1.clear();
                npVar.T1.clear();
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
                npVar.g2 = false;
                npVar.n2 = null;
                npVar.o2 = null;
                break;
            case 6:
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
            case 7:
                npVar.getNotificationCenter().k(ns.Q2, new Object[0]);
                npVar.getNotificationCenter().k(ns.O2, new Object[0]);
                npVar.getNotificationCenter().k(3, new Object[0]);
                break;
            case 8:
                npVar.j4();
                break;
            case 9:
                npVar.getNotificationCenter().k(2, 4);
                break;
            case 10:
                z10 z10Var = npVar.I7;
                if (z10Var != null) {
                    z10Var.a(Boolean.TRUE);
                    npVar.I7 = null;
                    break;
                }
                break;
            case 11:
                npVar.getNotificationCenter().k(ns.O2, new Object[0]);
                break;
            case 12:
                z10 z10Var2 = npVar.I7;
                if (z10Var2 != null) {
                    z10Var2.a(Boolean.TRUE);
                    npVar.I7 = null;
                    break;
                }
                break;
            default:
                z10 z10Var3 = npVar.I7;
                if (z10Var3 != null) {
                    z10Var3.a(Boolean.FALSE);
                    npVar.I7 = null;
                    break;
                }
                break;
        }
    }
}
