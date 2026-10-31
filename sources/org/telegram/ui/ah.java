package org.telegram.ui;

import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ah implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ un b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ long d;

    public /* synthetic */ ah(un unVar, long j10, boolean z10) {
        this.b = unVar;
        this.d = j10;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                un.k1(this.b, this.d, this.c);
                break;
            default:
                mk mkVar = this.b.Z;
                if (mkVar != null) {
                    MediaController B = MediaController.B();
                    if (!mkVar.Y1 && !mkVar.F2 && B.J() && !B.K() && B.f1 == mkVar.G2) {
                        mkVar.c1 = false;
                        org.telegram.ui.Components.zd zdVar = mkVar.b1;
                        if (zdVar != null) {
                            zdVar.j(org.telegram.ui.Components.dg.a, false);
                        }
                        mkVar.F2 = true;
                        mkVar.K1(0, true);
                        if (this.c) {
                            mkVar.O = true;
                            org.telegram.ui.Components.wf wfVar = mkVar.O1;
                            if (wfVar != null) {
                                wfVar.D.d(1, true, false);
                            }
                            org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(mkVar.Q);
                            long j10 = mkVar.Q2;
                            un unVar = mkVar.P2;
                            b02.e2(j10, (unVar == null || !unVar.v4) ? 0L : unVar.b(), true);
                        }
                        long j11 = this.d;
                        long currentTimeMillis = j11 > 0 ? System.currentTimeMillis() - j11 : B.j1;
                        mkVar.i1 = currentTimeMillis;
                        org.telegram.ui.Components.bg bgVar = mkVar.Y0;
                        if (bgVar != null) {
                            bgVar.a(currentTimeMillis);
                        }
                        mkVar.s4 = true;
                        mkVar.w1();
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ ah(un unVar, boolean z10, long j10) {
        this.b = unVar;
        this.c = z10;
        this.d = j10;
    }
}
