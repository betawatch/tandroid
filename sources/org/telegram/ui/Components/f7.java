package org.telegram.ui.Components;

import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class f7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g7 b;

    public /* synthetic */ f7(g7 g7Var, int i10) {
        this.a = i10;
        this.b = g7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                g7 g7Var = this.b;
                int i10 = g7Var.w + 1;
                g7Var.w = i10;
                if (i10 != 1) {
                    if (i10 == 2) {
                        org.telegram.messenger.i0.h3(this, 2000L);
                        break;
                    }
                } else {
                    w7 w7Var = g7Var.H;
                    w7Var.x2 = -1;
                    w7Var.y2 = MediaController.B().u0.b0;
                    g7Var.x = System.currentTimeMillis();
                    org.telegram.messenger.i0.h3(this, 2000L);
                    org.telegram.messenger.i0.g3(g7Var.E);
                    break;
                }
                break;
            default:
                g7 g7Var2 = this.b;
                w7 w7Var2 = g7Var2.H;
                u61 u61Var = MediaController.B().i0;
                long U = u61Var == null ? 0L : u61Var.U();
                if (U != 0 && U != -9223372036854775807L) {
                    float f7 = w7Var2.y2;
                    long currentTimeMillis = System.currentTimeMillis();
                    long j10 = currentTimeMillis - g7Var2.x;
                    g7Var2.x = currentTimeMillis;
                    long j11 = currentTimeMillis - g7Var2.y;
                    int i11 = g7Var2.w;
                    float f10 = ((long) ((f7 * r5) - (j10 * (i11 == 1 ? 3L : i11 == 2 ? 6L : 12L)))) / U;
                    if (f10 < 0.0f) {
                        f10 = 0.0f;
                    }
                    w7Var2.y2 = f10;
                    org.telegram.messenger.jj jjVar = MediaController.B().u0;
                    if (jjVar != null && jjVar.I3()) {
                        w7Var2.b1(jjVar, false);
                    }
                    if (w7Var2.x2 == -1 && g7Var2.w > 0) {
                        if (j11 > 200 || w7Var2.y2 == 0.0f) {
                            g7Var2.y = currentTimeMillis;
                            if (w7Var2.y2 == 0.0f) {
                                MediaController.B().i0(MediaController.B().u0, 0.0f);
                                u61 u61Var2 = MediaController.B().i0;
                                if (u61Var2 != null) {
                                    u61Var2.g0();
                                }
                            } else {
                                MediaController.B().i0(MediaController.B().u0, f10);
                            }
                        }
                        if (g7Var2.w > 0 && w7Var2.y2 > 0.0f) {
                            org.telegram.messenger.i0.h3(g7Var2.E, 16L);
                            break;
                        }
                    }
                } else {
                    g7Var2.x = System.currentTimeMillis();
                    break;
                }
                break;
        }
    }
}
