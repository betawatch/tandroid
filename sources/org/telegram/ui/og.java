package org.telegram.ui;

import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
                    if (!rjVar.M2 && !rjVar.t3 && B.J() && !B.K() && B.h1 == rjVar.u3) {
                        rjVar.d1 = false;
                        org.telegram.ui.Components.pe peVar = rjVar.c1;
                        if (peVar != null) {
                            peVar.j(org.telegram.ui.Components.wg.a, false);
                        }
                        rjVar.x4 = true;
                        rjVar.t3 = true;
                        org.telegram.ui.Components.kg kgVar = rjVar.N3;
                        if (kgVar != null) {
                            kgVar.a1(1);
                        }
                        rjVar.o2(0, true);
                        if (this.c) {
                            rjVar.P = true;
                            org.telegram.ui.Components.pg pgVar = rjVar.C2;
                            if (pgVar != null) {
                                pgVar.E.d(1, true, false);
                            }
                            org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(rjVar.R);
                            long j3 = rjVar.E3;
                            bn bnVar = rjVar.D3;
                            d02.j2(j3, (bnVar == null || !bnVar.x4) ? 0L : bnVar.d(), true);
                        }
                        long j10 = this.d;
                        long currentTimeMillis = j10 > 0 ? System.currentTimeMillis() - j10 : B.l1;
                        rjVar.W1 = currentTimeMillis;
                        org.telegram.ui.Components.ug ugVar = rjVar.Z0;
                        if (ugVar != null) {
                            ugVar.a(currentTimeMillis);
                        }
                        rjVar.g5 = true;
                        rjVar.Z1();
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
