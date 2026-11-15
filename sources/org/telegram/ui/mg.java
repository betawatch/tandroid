package org.telegram.ui;

import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class mg implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ an b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ long d;

    public /* synthetic */ mg(an anVar, long j3, boolean z10) {
        this.b = anVar;
        this.d = j3;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                an.c1(this.b, this.d, this.c);
                break;
            default:
                qj qjVar = this.b.a0;
                if (qjVar != null) {
                    MediaController B = MediaController.B();
                    if (!qjVar.G2 && !qjVar.n3 && B.J() && !B.K() && B.h1 == qjVar.o3) {
                        qjVar.d1 = false;
                        org.telegram.ui.Components.fe feVar = qjVar.c1;
                        if (feVar != null) {
                            feVar.j(org.telegram.ui.Components.ng.a, false);
                        }
                        qjVar.r4 = true;
                        qjVar.n3 = true;
                        org.telegram.ui.Components.cg cgVar = qjVar.H3;
                        if (cgVar != null) {
                            cgVar.a1(1);
                        }
                        qjVar.f2(0, true);
                        if (this.c) {
                            qjVar.P = true;
                            org.telegram.ui.Components.gg ggVar = qjVar.w2;
                            if (ggVar != null) {
                                ggVar.E.d(1, true, false);
                            }
                            org.telegram.messenger.si b02 = org.telegram.messenger.si.b0(qjVar.R);
                            long j3 = qjVar.y3;
                            an anVar = qjVar.x3;
                            b02.e2(j3, (anVar == null || !anVar.w4) ? 0L : anVar.b(), true);
                        }
                        long j10 = this.d;
                        long currentTimeMillis = j10 > 0 ? System.currentTimeMillis() - j10 : B.l1;
                        qjVar.Q1 = currentTimeMillis;
                        org.telegram.ui.Components.lg lgVar = qjVar.Z0;
                        if (lgVar != null) {
                            lgVar.a(currentTimeMillis);
                        }
                        qjVar.a5 = true;
                        qjVar.R1();
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ mg(an anVar, boolean z10, long j3) {
        this.b = anVar;
        this.c = z10;
        this.d = j3;
    }
}
