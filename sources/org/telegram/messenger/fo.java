package org.telegram.messenger;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class fo implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wp b;

    public /* synthetic */ fo(wp wpVar, int i10) {
        this.a = i10;
        this.b = wpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        wp wpVar = this.b;
        switch (i10) {
            case 0:
                wpVar.e2 = false;
                break;
            case 1:
                wpVar.getNotificationCenter().k(2, Integer.valueOf(TLObject.FLAG_13));
                break;
            case 2:
                wpVar.getNotificationCenter().k(2, Integer.valueOf(TLObject.FLAG_19));
                wpVar.f5();
                break;
            case 3:
                wpVar.getNotificationCenter().k(2, 4);
                break;
            case 4:
                wpVar.getNotificationCenter().k(2, 4);
                break;
            case 5:
                wpVar.P1.clear();
                wpVar.Q1.b();
                wpVar.R1.clear();
                wpVar.S1.clear();
                wpVar.e1.clear();
                wpVar.f1.clear();
                wpVar.g1.clear();
                wpVar.b1.b();
                wpVar.c1.b();
                wpVar.h1 = 0L;
                wpVar.i1 = 0L;
                wpVar.j1 = 0L;
                wpVar.u0.clear();
                wpVar.v0.clear();
                wpVar.f2 = false;
                wpVar.m2 = null;
                wpVar.n2 = null;
                break;
            case 6:
                f8.b("cleanup: isUpdating = false");
                wpVar.getConnectionsManager().setIsUpdating(false);
                wpVar.W0.b();
                wpVar.X0.clear();
                wpVar.Z0.b();
                wpVar.Y0.clear();
                wpVar.z0.clear();
                wpVar.A0.b();
                wpVar.B0.clear();
                wpVar.C0.b();
                break;
            case 7:
                wpVar.getNotificationCenter().k(at.Q2, new Object[0]);
                wpVar.getNotificationCenter().k(at.O2, new Object[0]);
                wpVar.getNotificationCenter().k(3, new Object[0]);
                break;
            case 8:
                wpVar.g4();
                break;
            case 9:
                wpVar.j2 = false;
                break;
            case 10:
                r20 r20Var = wpVar.I7;
                if (r20Var != null) {
                    r20Var.a(Boolean.TRUE);
                    wpVar.I7 = null;
                    break;
                }
                break;
            case 11:
                wpVar.getNotificationCenter().k(at.O2, new Object[0]);
                break;
            case 12:
                r20 r20Var2 = wpVar.I7;
                if (r20Var2 != null) {
                    r20Var2.a(Boolean.TRUE);
                    wpVar.I7 = null;
                    break;
                }
                break;
            default:
                r20 r20Var3 = wpVar.I7;
                if (r20Var3 != null) {
                    r20Var3.a(Boolean.FALSE);
                    wpVar.I7 = null;
                    break;
                }
                break;
        }
    }
}
