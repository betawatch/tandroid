package org.telegram.ui.Components;

import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class i7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j7 b;

    public /* synthetic */ i7(j7 j7Var, int i7) {
        this.a = i7;
        this.b = j7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                j7 j7Var = this.b;
                int i7 = j7Var.w + 1;
                j7Var.w = i7;
                if (i7 != 1) {
                    if (i7 == 2) {
                        org.telegram.messenger.g0.i3(this, 2000L);
                        break;
                    }
                } else {
                    a8 a8Var = j7Var.H;
                    a8Var.A2 = -1;
                    a8Var.B2 = MediaController.B().u0.b0;
                    j7Var.x = System.currentTimeMillis();
                    org.telegram.messenger.g0.i3(this, 2000L);
                    org.telegram.messenger.g0.h3(j7Var.E);
                    break;
                }
                break;
            default:
                j7 j7Var2 = this.b;
                a8 a8Var2 = j7Var2.H;
                t51 t51Var = MediaController.B().i0;
                long U = t51Var == null ? 0L : t51Var.U();
                if (U != 0 && U != -9223372036854775807L) {
                    float f10 = a8Var2.B2;
                    long currentTimeMillis = System.currentTimeMillis();
                    long j3 = currentTimeMillis - j7Var2.x;
                    j7Var2.x = currentTimeMillis;
                    long j10 = currentTimeMillis - j7Var2.y;
                    int i10 = j7Var2.w;
                    float f11 = ((long) ((f10 * r5) - (j3 * (i10 == 1 ? 3L : i10 == 2 ? 6L : 12L)))) / U;
                    if (f11 < 0.0f) {
                        f11 = 0.0f;
                    }
                    a8Var2.B2 = f11;
                    org.telegram.messenger.ij ijVar = MediaController.B().u0;
                    if (ijVar != null && ijVar.I3()) {
                        a8Var2.b1(ijVar, false);
                    }
                    if (a8Var2.A2 == -1 && j7Var2.w > 0) {
                        if (j10 > 200 || a8Var2.B2 == 0.0f) {
                            j7Var2.y = currentTimeMillis;
                            if (a8Var2.B2 == 0.0f) {
                                MediaController.B().i0(MediaController.B().u0, 0.0f);
                                t51 t51Var2 = MediaController.B().i0;
                                if (t51Var2 != null) {
                                    t51Var2.g0();
                                }
                            } else {
                                MediaController.B().i0(MediaController.B().u0, f11);
                            }
                        }
                        if (j7Var2.w > 0 && a8Var2.B2 > 0.0f) {
                            org.telegram.messenger.g0.i3(j7Var2.E, 16L);
                            break;
                        }
                    }
                } else {
                    j7Var2.x = System.currentTimeMillis();
                    break;
                }
                break;
        }
    }
}
