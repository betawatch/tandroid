package org.telegram.messenger;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class eo implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vp b;

    public /* synthetic */ eo(vp vpVar, int i10) {
        this.a = i10;
        this.b = vpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        vp vpVar = this.b;
        switch (i10) {
            case 0:
                vpVar.e2 = false;
                break;
            case 1:
                vpVar.getNotificationCenter().k(2, Integer.valueOf(TLObject.FLAG_13));
                break;
            case 2:
                vpVar.getNotificationCenter().k(2, Integer.valueOf(TLObject.FLAG_19));
                vpVar.f5();
                break;
            case 3:
                vpVar.getNotificationCenter().k(2, 4);
                break;
            case 4:
                vpVar.getNotificationCenter().k(2, 4);
                break;
            case 5:
                vpVar.P1.clear();
                vpVar.Q1.b();
                vpVar.R1.clear();
                vpVar.S1.clear();
                vpVar.e1.clear();
                vpVar.f1.clear();
                vpVar.g1.clear();
                vpVar.b1.b();
                vpVar.c1.b();
                vpVar.h1 = 0L;
                vpVar.i1 = 0L;
                vpVar.j1 = 0L;
                vpVar.u0.clear();
                vpVar.v0.clear();
                vpVar.f2 = false;
                vpVar.m2 = null;
                vpVar.n2 = null;
                break;
            case 6:
                f8.b("cleanup: isUpdating = false");
                vpVar.getConnectionsManager().setIsUpdating(false);
                vpVar.W0.b();
                vpVar.X0.clear();
                vpVar.Z0.b();
                vpVar.Y0.clear();
                vpVar.z0.clear();
                vpVar.A0.b();
                vpVar.B0.clear();
                vpVar.C0.b();
                break;
            case 7:
                vpVar.getNotificationCenter().k(zs.Q2, new Object[0]);
                vpVar.getNotificationCenter().k(zs.O2, new Object[0]);
                vpVar.getNotificationCenter().k(3, new Object[0]);
                break;
            case 8:
                vpVar.g4();
                break;
            case 9:
                vpVar.j2 = false;
                break;
            case 10:
                q20 q20Var = vpVar.I7;
                if (q20Var != null) {
                    q20Var.a(Boolean.TRUE);
                    vpVar.I7 = null;
                    break;
                }
                break;
            case 11:
                vpVar.getNotificationCenter().k(zs.O2, new Object[0]);
                break;
            case 12:
                q20 q20Var2 = vpVar.I7;
                if (q20Var2 != null) {
                    q20Var2.a(Boolean.TRUE);
                    vpVar.I7 = null;
                    break;
                }
                break;
            default:
                q20 q20Var3 = vpVar.I7;
                if (q20Var3 != null) {
                    q20Var3.a(Boolean.FALSE);
                    vpVar.I7 = null;
                    break;
                }
                break;
        }
    }
}
