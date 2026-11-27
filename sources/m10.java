// default package

import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class m10 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ n10 b;

    public /* synthetic */ m10(n10 n10Var, byte b) {
        this.a = b;
        this.b = n10Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        n10 n10Var = this.b;
        switch (b) {
            case 0:
                int i = n10Var.w + 1;
                n10Var.w = i;
                if (i != 1) {
                    if (i == 2) {
                        hl.d3(this, 2000L);
                        break;
                    }
                } else {
                    j20 j20Var = n10Var.I;
                    j20Var.A2 = -1;
                    j20Var.B2 = MediaController.z().v0.b0;
                    n10Var.x = System.currentTimeMillis();
                    hl.d3(this, 2000L);
                    hl.c3(n10Var.F);
                    break;
                }
                break;
            default:
                j20 j20Var2 = n10Var.I;
                kfc kfcVar = MediaController.z().j0;
                long U = kfcVar == null ? 0L : kfcVar.U();
                if (U != 0 && U != -9223372036854775807L) {
                    float f = j20Var2.B2;
                    long currentTimeMillis = System.currentTimeMillis();
                    long j = currentTimeMillis - n10Var.x;
                    n10Var.x = currentTimeMillis;
                    long j2 = currentTimeMillis - n10Var.y;
                    int i2 = n10Var.w;
                    float f2 = ((long) ((f * r2) - (j * (i2 == 1 ? 3L : i2 == 2 ? 6L : 12L)))) / U;
                    if (f2 < 0.0f) {
                        f2 = 0.0f;
                    }
                    j20Var2.B2 = f2;
                    r47 r47Var = MediaController.z().v0;
                    if (r47Var != null && r47Var.I3()) {
                        j20Var2.X0(r47Var, false);
                    }
                    if (j20Var2.A2 == -1 && n10Var.w > 0) {
                        if (j2 > 200 || j20Var2.B2 == 0.0f) {
                            n10Var.y = currentTimeMillis;
                            if (j20Var2.B2 == 0.0f) {
                                MediaController.z().k0(MediaController.z().v0, 0.0f);
                                kfc kfcVar2 = MediaController.z().j0;
                                if (kfcVar2 != null) {
                                    kfcVar2.f0();
                                }
                            } else {
                                MediaController.z().k0(MediaController.z().v0, f2);
                            }
                        }
                        if (n10Var.w > 0 && j20Var2.B2 > 0.0f) {
                            hl.d3(n10Var.F, 16L);
                            break;
                        }
                    }
                } else {
                    n10Var.x = System.currentTimeMillis();
                    break;
                }
                break;
        }
    }
}
