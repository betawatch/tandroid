package org.telegram.ui;

import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lg implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ an b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ long d;

    public /* synthetic */ lg(an anVar, long j3, boolean z9) {
        this.b = anVar;
        this.d = j3;
        this.c = z9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                an.X0(this.b, this.d, this.c);
                break;
            default:
                qj qjVar = this.b.Z;
                if (qjVar != null) {
                    MediaController B = MediaController.B();
                    if (!qjVar.Y1 && !qjVar.F2 && B.J() && !B.K() && B.g1 == qjVar.G2) {
                        qjVar.c1 = false;
                        org.telegram.ui.Components.ee eeVar = qjVar.b1;
                        if (eeVar != null) {
                            eeVar.j(org.telegram.ui.Components.hg.a, false);
                        }
                        qjVar.F2 = true;
                        qjVar.N1(0, true);
                        if (this.c) {
                            qjVar.O = true;
                            org.telegram.ui.Components.ag agVar = qjVar.O1;
                            if (agVar != null) {
                                agVar.D.d(1, true, false);
                            }
                            org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(qjVar.Q);
                            long j3 = qjVar.Q2;
                            an anVar = qjVar.P2;
                            b02.e2(j3, (anVar == null || !anVar.v4) ? 0L : anVar.b(), true);
                        }
                        long j10 = this.d;
                        long currentTimeMillis = j10 > 0 ? System.currentTimeMillis() - j10 : B.k1;
                        qjVar.i1 = currentTimeMillis;
                        org.telegram.ui.Components.fg fgVar = qjVar.Y0;
                        if (fgVar != null) {
                            fgVar.a(currentTimeMillis);
                        }
                        qjVar.s4 = true;
                        qjVar.z1();
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ lg(an anVar, boolean z9, long j3) {
        this.b = anVar;
        this.c = z9;
        this.d = j3;
    }
}
