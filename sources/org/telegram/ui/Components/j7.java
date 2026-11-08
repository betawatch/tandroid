package org.telegram.ui.Components;

import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class j7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k7 b;

    public /* synthetic */ j7(k7 k7Var, int i7) {
        this.a = i7;
        this.b = k7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                k7 k7Var = this.b;
                int i7 = k7Var.w + 1;
                k7Var.w = i7;
                if (i7 != 1) {
                    if (i7 == 2) {
                        org.telegram.messenger.g0.i3(this, 2000L);
                        break;
                    }
                } else {
                    b8 b8Var = k7Var.H;
                    b8Var.x2 = -1;
                    b8Var.y2 = MediaController.B().u0.b0;
                    k7Var.x = System.currentTimeMillis();
                    org.telegram.messenger.g0.i3(this, 2000L);
                    org.telegram.messenger.g0.h3(k7Var.E);
                    break;
                }
                break;
            default:
                k7 k7Var2 = this.b;
                b8 b8Var2 = k7Var2.H;
                t51 t51Var = MediaController.B().i0;
                long U = t51Var == null ? 0L : t51Var.U();
                if (U != 0 && U != -9223372036854775807L) {
                    float f10 = b8Var2.y2;
                    long currentTimeMillis = System.currentTimeMillis();
                    long j3 = currentTimeMillis - k7Var2.x;
                    k7Var2.x = currentTimeMillis;
                    long j10 = currentTimeMillis - k7Var2.y;
                    int i10 = k7Var2.w;
                    float f11 = ((long) ((f10 * r5) - (j3 * (i10 == 1 ? 3L : i10 == 2 ? 6L : 12L)))) / U;
                    if (f11 < 0.0f) {
                        f11 = 0.0f;
                    }
                    b8Var2.y2 = f11;
                    org.telegram.messenger.ij ijVar = MediaController.B().u0;
                    if (ijVar != null && ijVar.J3()) {
                        b8Var2.b1(ijVar, false);
                    }
                    if (b8Var2.x2 == -1 && k7Var2.w > 0) {
                        if (j10 > 200 || b8Var2.y2 == 0.0f) {
                            k7Var2.y = currentTimeMillis;
                            if (b8Var2.y2 == 0.0f) {
                                MediaController.B().i0(MediaController.B().u0, 0.0f);
                                t51 t51Var2 = MediaController.B().i0;
                                if (t51Var2 != null) {
                                    t51Var2.g0();
                                }
                            } else {
                                MediaController.B().i0(MediaController.B().u0, f11);
                            }
                        }
                        if (k7Var2.w > 0 && b8Var2.y2 > 0.0f) {
                            org.telegram.messenger.g0.i3(k7Var2.E, 16L);
                            break;
                        }
                    }
                } else {
                    k7Var2.x = System.currentTimeMillis();
                    break;
                }
                break;
        }
    }
}
