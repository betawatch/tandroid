package org.telegram.ui;

import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pg implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ cn b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ long d;

    public /* synthetic */ pg(cn cnVar, long j3, boolean z9) {
        this.b = cnVar;
        this.d = j3;
        this.c = z9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                cn.c1(this.b, this.d, this.c);
                break;
            default:
                sj sjVar = this.b.Z;
                if (sjVar != null) {
                    MediaController B = MediaController.B();
                    if (!sjVar.Y1 && !sjVar.F2 && B.J() && !B.K() && B.g1 == sjVar.G2) {
                        sjVar.c1 = false;
                        org.telegram.ui.Components.de deVar = sjVar.b1;
                        if (deVar != null) {
                            deVar.j(org.telegram.ui.Components.gg.a, false);
                        }
                        sjVar.J3 = true;
                        sjVar.F2 = true;
                        org.telegram.ui.Components.vf vfVar = sjVar.Z2;
                        if (vfVar != null) {
                            vfVar.R0(1);
                        }
                        sjVar.N1(0, true);
                        if (this.c) {
                            sjVar.O = true;
                            org.telegram.ui.Components.zf zfVar = sjVar.O1;
                            if (zfVar != null) {
                                zfVar.D.d(1, true, false);
                            }
                            org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(sjVar.Q);
                            long j3 = sjVar.Q2;
                            cn cnVar = sjVar.P2;
                            b02.e2(j3, (cnVar == null || !cnVar.v4) ? 0L : cnVar.b(), true);
                        }
                        long j10 = this.d;
                        long currentTimeMillis = j10 > 0 ? System.currentTimeMillis() - j10 : B.k1;
                        sjVar.i1 = currentTimeMillis;
                        org.telegram.ui.Components.eg egVar = sjVar.Y0;
                        if (egVar != null) {
                            egVar.a(currentTimeMillis);
                        }
                        sjVar.s4 = true;
                        sjVar.z1();
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ pg(cn cnVar, boolean z9, long j3) {
        this.b = cnVar;
        this.c = z9;
        this.d = j3;
    }
}
