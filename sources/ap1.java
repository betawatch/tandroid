// default package

import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.l;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class ap1 implements Runnable {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ yv1 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ long d;

    public /* synthetic */ ap1(yv1 yv1Var, long j, boolean z) {
        this.b = yv1Var;
        this.d = j;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        long j = this.d;
        boolean z = this.c;
        yv1 yv1Var = this.b;
        switch (b) {
            case 0:
                yv1Var.p9(j, z);
                break;
            default:
                ms1 ms1Var = yv1Var.a0;
                if (ms1Var != null) {
                    MediaController w = MediaController.w();
                    if (!ms1Var.O2 && !ms1Var.v3 && w.E() && !w.F() && w.h1 == ms1Var.w3) {
                        ms1Var.d1 = false;
                        zx1 zx1Var = ms1Var.c1;
                        if (zx1Var != null) {
                            zx1Var.j(b02.a, false);
                        }
                        ms1Var.y4 = true;
                        ms1Var.v3 = true;
                        uz1 uz1Var = ms1Var.P3;
                        if (uz1Var != null) {
                            uz1Var.z0(1);
                        }
                        ms1Var.w2(0, true);
                        if (z) {
                            ms1Var.P = true;
                            l lVar = ms1Var.E2;
                            if (lVar != null) {
                                lVar.E.d(1, true, false);
                            }
                            hs6 d0 = hs6.d0(ms1Var.R);
                            long j2 = ms1Var.G3;
                            yv1 yv1Var2 = ms1Var.F3;
                            d0.g2(j2, (yv1Var2 == null || !yv1Var2.x4) ? 0L : yv1Var2.d(), true);
                        }
                        long currentTimeMillis = j > 0 ? System.currentTimeMillis() - j : w.l1;
                        ms1Var.Y1 = currentTimeMillis;
                        zz1 zz1Var = ms1Var.Z0;
                        if (zz1Var != null) {
                            zz1Var.a(currentTimeMillis);
                        }
                        ms1Var.h5 = true;
                        ms1Var.f2();
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ ap1(yv1 yv1Var, boolean z, long j) {
        this.b = yv1Var;
        this.c = z;
        this.d = j;
    }
}
