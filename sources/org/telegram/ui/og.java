package org.telegram.ui;

import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class og implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ bn b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ long d;

    public /* synthetic */ og(bn bnVar, long j3, boolean z10) {
        this.b = bnVar;
        this.d = j3;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                bn.c1(this.b, this.d, this.c);
                break;
            default:
                rj rjVar = this.b.a0;
                if (rjVar != null) {
                    MediaController B = MediaController.B();
                    if (!rjVar.O2 && !rjVar.v3 && B.J() && !B.K() && B.h1 == rjVar.w3) {
                        rjVar.d1 = false;
                        org.telegram.ui.Components.qe qeVar = rjVar.c1;
                        if (qeVar != null) {
                            qeVar.j(org.telegram.ui.Components.xg.a, false);
                        }
                        rjVar.z4 = true;
                        rjVar.v3 = true;
                        org.telegram.ui.Components.mg mgVar = rjVar.P3;
                        if (mgVar != null) {
                            mgVar.U0(1);
                        }
                        rjVar.u2(0, true);
                        if (this.c) {
                            rjVar.P = true;
                            org.telegram.ui.Components.qg qgVar = rjVar.E2;
                            if (qgVar != null) {
                                qgVar.E.d(1, true, false);
                            }
                            org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(rjVar.R);
                            long j3 = rjVar.G3;
                            bn bnVar = rjVar.F3;
                            d02.j2(j3, (bnVar == null || !bnVar.x4) ? 0L : bnVar.b(), true);
                        }
                        long j10 = this.d;
                        long currentTimeMillis = j10 > 0 ? System.currentTimeMillis() - j10 : B.l1;
                        rjVar.Y1 = currentTimeMillis;
                        org.telegram.ui.Components.vg vgVar = rjVar.Z0;
                        if (vgVar != null) {
                            vgVar.a(currentTimeMillis);
                        }
                        rjVar.i5 = true;
                        rjVar.f2();
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ og(bn bnVar, boolean z10, long j3) {
        this.b = bnVar;
        this.c = z10;
        this.d = j3;
    }
}
