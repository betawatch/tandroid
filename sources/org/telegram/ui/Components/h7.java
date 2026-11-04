package org.telegram.ui.Components;

import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class h7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i7 b;

    public /* synthetic */ h7(i7 i7Var, int i3) {
        this.a = i3;
        this.b = i7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                i7 i7Var = this.b;
                int i3 = i7Var.w + 1;
                i7Var.w = i3;
                if (i3 != 1) {
                    if (i3 == 2) {
                        org.telegram.messenger.g0.i3(this, 2000L);
                        break;
                    }
                } else {
                    z7 z7Var = i7Var.I;
                    z7Var.y2 = -1;
                    z7Var.z2 = MediaController.B().v0.b0;
                    i7Var.x = System.currentTimeMillis();
                    org.telegram.messenger.g0.i3(this, 2000L);
                    org.telegram.messenger.g0.h3(i7Var.F);
                    break;
                }
                break;
            default:
                i7 i7Var2 = this.b;
                z7 z7Var2 = i7Var2.I;
                m51 m51Var = MediaController.B().j0;
                long U = m51Var == null ? 0L : m51Var.U();
                if (U != 0 && U != -9223372036854775807L) {
                    float f10 = z7Var2.z2;
                    long currentTimeMillis = System.currentTimeMillis();
                    long j10 = currentTimeMillis - i7Var2.x;
                    i7Var2.x = currentTimeMillis;
                    long j11 = currentTimeMillis - i7Var2.y;
                    int i10 = i7Var2.w;
                    float f11 = ((long) ((f10 * r5) - (j10 * (i10 == 1 ? 3L : i10 == 2 ? 6L : 12L)))) / U;
                    if (f11 < 0.0f) {
                        f11 = 0.0f;
                    }
                    z7Var2.z2 = f11;
                    org.telegram.messenger.zi ziVar = MediaController.B().v0;
                    if (ziVar != null && ziVar.J3()) {
                        z7Var2.b1(ziVar, false);
                    }
                    if (z7Var2.y2 == -1 && i7Var2.w > 0) {
                        if (j11 > 200 || z7Var2.z2 == 0.0f) {
                            i7Var2.y = currentTimeMillis;
                            if (z7Var2.z2 == 0.0f) {
                                MediaController.B().i0(MediaController.B().v0, 0.0f);
                                m51 m51Var2 = MediaController.B().j0;
                                if (m51Var2 != null) {
                                    m51Var2.g0();
                                }
                            } else {
                                MediaController.B().i0(MediaController.B().v0, f11);
                            }
                        }
                        if (i7Var2.w > 0 && z7Var2.z2 > 0.0f) {
                            org.telegram.messenger.g0.i3(i7Var2.F, 16L);
                            break;
                        }
                    }
                } else {
                    i7Var2.x = System.currentTimeMillis();
                    break;
                }
                break;
        }
    }
}
