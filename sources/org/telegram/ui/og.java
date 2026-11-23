package org.telegram.ui;

import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
                        org.telegram.ui.Components.pe peVar = rjVar.c1;
                        if (peVar != null) {
                            peVar.j(org.telegram.ui.Components.yg.a, false);
                        }
                        rjVar.z4 = true;
                        rjVar.v3 = true;
                        org.telegram.ui.Components.ng ngVar = rjVar.P3;
                        if (ngVar != null) {
                            ngVar.a1(1);
                        }
                        rjVar.s2(0, true);
                        if (this.c) {
                            rjVar.P = true;
                            org.telegram.ui.Components.rg rgVar = rjVar.E2;
                            if (rgVar != null) {
                                rgVar.E.d(1, true, false);
                            }
                            org.telegram.messenger.si d02 = org.telegram.messenger.si.d0(rjVar.R);
                            long j3 = rjVar.G3;
                            bn bnVar = rjVar.F3;
                            d02.j2(j3, (bnVar == null || !bnVar.x4) ? 0L : bnVar.d(), true);
                        }
                        long j10 = this.d;
                        long currentTimeMillis = j10 > 0 ? System.currentTimeMillis() - j10 : B.l1;
                        rjVar.Y1 = currentTimeMillis;
                        org.telegram.ui.Components.wg wgVar = rjVar.Z0;
                        if (wgVar != null) {
                            wgVar.a(currentTimeMillis);
                        }
                        rjVar.i5 = true;
                        rjVar.d2();
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
