package org.telegram.messenger;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final /* synthetic */ class qn implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ mp b;

    public /* synthetic */ qn(mp mpVar, int i7) {
        this.a = i7;
        this.b = mpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        mp mpVar = this.b;
        switch (i7) {
            case 0:
                mpVar.getNotificationCenter().k(2, Integer.valueOf(TLObject.FLAG_13));
                break;
            case 1:
                mpVar.h2 = false;
                break;
            case 2:
                mpVar.getNotificationCenter().k(2, Integer.valueOf(TLObject.FLAG_13));
                break;
            case 3:
                mpVar.getNotificationCenter().k(2, 4);
                break;
            case 4:
                mpVar.S1.clear();
                mpVar.T1.b();
                mpVar.U1.clear();
                mpVar.V1.clear();
                mpVar.f1.clear();
                mpVar.g1.clear();
                mpVar.h1.clear();
                mpVar.c1.b();
                mpVar.d1.b();
                mpVar.i1 = 0L;
                mpVar.j1 = 0L;
                mpVar.k1 = 0L;
                mpVar.v0.clear();
                mpVar.w0.clear();
                mpVar.i2 = false;
                mpVar.p2 = null;
                mpVar.q2 = null;
                break;
            case 5:
                a8.b("cleanup: isUpdating = false");
                mpVar.getConnectionsManager().setIsUpdating(false);
                mpVar.X0.b();
                mpVar.Y0.clear();
                mpVar.a1.b();
                mpVar.Z0.clear();
                mpVar.A0.clear();
                mpVar.B0.b();
                mpVar.C0.clear();
                mpVar.D0.b();
                break;
            case 6:
                mpVar.getNotificationCenter().k(ks.S2, new Object[0]);
                mpVar.getNotificationCenter().k(ks.O2, new Object[0]);
                mpVar.getNotificationCenter().k(3, new Object[0]);
                break;
            case 7:
                mpVar.r4();
                break;
            case 8:
                mpVar.getNotificationCenter().k(2, 4);
                break;
            case 9:
                mpVar.m2 = false;
                break;
            case 10:
                w10 w10Var = mpVar.N7;
                if (w10Var != null) {
                    w10Var.a(Boolean.TRUE);
                    mpVar.N7 = null;
                    break;
                }
                break;
            case 11:
                mpVar.getNotificationCenter().k(ks.O2, new Object[0]);
                break;
            case 12:
                w10 w10Var2 = mpVar.N7;
                if (w10Var2 != null) {
                    w10Var2.a(Boolean.TRUE);
                    mpVar.N7 = null;
                    break;
                }
                break;
            default:
                w10 w10Var3 = mpVar.N7;
                if (w10Var3 != null) {
                    w10Var3.a(Boolean.FALSE);
                    mpVar.N7 = null;
                    break;
                }
                break;
        }
    }
}
