package org.telegram.ui;

import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hg implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ wm b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ long d;

    public /* synthetic */ hg(wm wmVar, long j10, boolean z10) {
        this.b = wmVar;
        this.d = j10;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                wm.X0(this.b, this.d, this.c);
                break;
            default:
                mj mjVar = this.b.a0;
                if (mjVar != null) {
                    MediaController B = MediaController.B();
                    if (!mjVar.Z1 && !mjVar.G2 && B.J() && !B.K() && B.h1 == mjVar.H2) {
                        mjVar.d1 = false;
                        org.telegram.ui.Components.ce ceVar = mjVar.c1;
                        if (ceVar != null) {
                            ceVar.j(org.telegram.ui.Components.fg.a, false);
                        }
                        mjVar.G2 = true;
                        mjVar.M1(0, true);
                        if (this.c) {
                            mjVar.P = true;
                            org.telegram.ui.Components.yf yfVar = mjVar.P1;
                            if (yfVar != null) {
                                yfVar.E.d(1, true, false);
                            }
                            org.telegram.messenger.li b02 = org.telegram.messenger.li.b0(mjVar.R);
                            long j10 = mjVar.R2;
                            wm wmVar = mjVar.Q2;
                            b02.e2(j10, (wmVar == null || !wmVar.w4) ? 0L : wmVar.b(), true);
                        }
                        long j11 = this.d;
                        long currentTimeMillis = j11 > 0 ? System.currentTimeMillis() - j11 : B.l1;
                        mjVar.j1 = currentTimeMillis;
                        org.telegram.ui.Components.dg dgVar = mjVar.Z0;
                        if (dgVar != null) {
                            dgVar.a(currentTimeMillis);
                        }
                        mjVar.t4 = true;
                        mjVar.y1();
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ hg(wm wmVar, boolean z10, long j10) {
        this.b = wmVar;
        this.c = z10;
        this.d = j10;
    }
}
