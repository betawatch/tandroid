// default package

import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class l10 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ m10 b;

    public /* synthetic */ l10(m10 m10Var, byte b) {
        this.a = b;
        this.b = m10Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        m10 m10Var = this.b;
        switch (b) {
            case 0:
                int i = m10Var.w + 1;
                m10Var.w = i;
                if (i != 1) {
                    if (i == 2) {
                        gl.d3(this, 2000L);
                        break;
                    }
                } else {
                    i20 i20Var = m10Var.I;
                    i20Var.A2 = -1;
                    i20Var.B2 = MediaController.w().v0.b0;
                    m10Var.x = System.currentTimeMillis();
                    gl.d3(this, 2000L);
                    gl.c3(m10Var.F);
                    break;
                }
                break;
            default:
                i20 i20Var2 = m10Var.I;
                lbc lbcVar = MediaController.w().j0;
                long U = lbcVar == null ? 0L : lbcVar.U();
                if (U != 0 && U != -9223372036854775807L) {
                    float f = i20Var2.B2;
                    long currentTimeMillis = System.currentTimeMillis();
                    long j = currentTimeMillis - m10Var.x;
                    m10Var.x = currentTimeMillis;
                    long j2 = currentTimeMillis - m10Var.y;
                    int i2 = m10Var.w;
                    float f2 = ((long) ((f * r2) - (j * (i2 == 1 ? 3L : i2 == 2 ? 6L : 12L)))) / U;
                    if (f2 < 0.0f) {
                        f2 = 0.0f;
                    }
                    i20Var2.B2 = f2;
                    k27 k27Var = MediaController.w().v0;
                    if (k27Var != null && k27Var.I3()) {
                        i20Var2.W0(k27Var, false);
                    }
                    if (i20Var2.A2 == -1 && m10Var.w > 0) {
                        if (j2 > 200 || i20Var2.B2 == 0.0f) {
                            m10Var.y = currentTimeMillis;
                            if (i20Var2.B2 == 0.0f) {
                                MediaController.w().h0(MediaController.w().v0, 0.0f);
                                lbc lbcVar2 = MediaController.w().j0;
                                if (lbcVar2 != null) {
                                    lbcVar2.f0();
                                }
                            } else {
                                MediaController.w().h0(MediaController.w().v0, f2);
                            }
                        }
                        if (m10Var.w > 0 && i20Var2.B2 > 0.0f) {
                            gl.d3(m10Var.F, 16L);
                            break;
                        }
                    }
                } else {
                    m10Var.x = System.currentTimeMillis();
                    break;
                }
                break;
        }
    }
}
