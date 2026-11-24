// default package

import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class l20 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ m20 b;

    public /* synthetic */ l20(m20 m20Var, byte b) {
        this.a = b;
        this.b = m20Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        m20 m20Var = this.b;
        switch (b) {
            case 0:
                int i = m20Var.w + 1;
                m20Var.w = i;
                if (i != 1) {
                    if (i == 2) {
                        gm.d3(this, 2000L);
                        break;
                    }
                } else {
                    i30 i30Var = m20Var.I;
                    i30Var.A2 = -1;
                    i30Var.B2 = MediaController.w().v0.b0;
                    m20Var.x = System.currentTimeMillis();
                    gm.d3(this, 2000L);
                    gm.c3(m20Var.F);
                    break;
                }
                break;
            default:
                i30 i30Var2 = m20Var.I;
                ndc ndcVar = MediaController.w().j0;
                long U = ndcVar == null ? 0L : ndcVar.U();
                if (U != 0 && U != -9223372036854775807L) {
                    float f = i30Var2.B2;
                    long currentTimeMillis = System.currentTimeMillis();
                    long j = currentTimeMillis - m20Var.x;
                    m20Var.x = currentTimeMillis;
                    long j2 = currentTimeMillis - m20Var.y;
                    int i2 = m20Var.w;
                    float f2 = ((long) ((f * r2) - (j * (i2 == 1 ? 3L : i2 == 2 ? 6L : 12L)))) / U;
                    if (f2 < 0.0f) {
                        f2 = 0.0f;
                    }
                    i30Var2.B2 = f2;
                    k47 k47Var = MediaController.w().v0;
                    if (k47Var != null && k47Var.I3()) {
                        i30Var2.W0(k47Var, false);
                    }
                    if (i30Var2.A2 == -1 && m20Var.w > 0) {
                        if (j2 > 200 || i30Var2.B2 == 0.0f) {
                            m20Var.y = currentTimeMillis;
                            if (i30Var2.B2 == 0.0f) {
                                MediaController.w().h0(MediaController.w().v0, 0.0f);
                                ndc ndcVar2 = MediaController.w().j0;
                                if (ndcVar2 != null) {
                                    ndcVar2.f0();
                                }
                            } else {
                                MediaController.w().h0(MediaController.w().v0, f2);
                            }
                        }
                        if (m20Var.w > 0 && i30Var2.B2 > 0.0f) {
                            gm.d3(m20Var.F, 16L);
                            break;
                        }
                    }
                } else {
                    m20Var.x = System.currentTimeMillis();
                    break;
                }
                break;
        }
    }
}
