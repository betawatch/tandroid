package org.telegram.ui.Components;

import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class g7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h7 b;

    public /* synthetic */ g7(h7 h7Var, int i7) {
        this.a = i7;
        this.b = h7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                h7 h7Var = this.b;
                int i7 = h7Var.w + 1;
                h7Var.w = i7;
                if (i7 != 1) {
                    if (i7 == 2) {
                        org.telegram.messenger.g0.i3(this, 2000L);
                        break;
                    }
                } else {
                    y7 y7Var = h7Var.I;
                    y7Var.B2 = -1;
                    y7Var.C2 = MediaController.B().v0.b0;
                    h7Var.x = System.currentTimeMillis();
                    org.telegram.messenger.g0.i3(this, 2000L);
                    org.telegram.messenger.g0.h3(h7Var.F);
                    break;
                }
                break;
            default:
                h7 h7Var2 = this.b;
                y7 y7Var2 = h7Var2.I;
                u51 u51Var = MediaController.B().j0;
                long U = u51Var == null ? 0L : u51Var.U();
                if (U != 0 && U != -9223372036854775807L) {
                    float f10 = y7Var2.C2;
                    long currentTimeMillis = System.currentTimeMillis();
                    long j3 = currentTimeMillis - h7Var2.x;
                    h7Var2.x = currentTimeMillis;
                    long j10 = currentTimeMillis - h7Var2.y;
                    int i10 = h7Var2.w;
                    float f11 = ((long) ((f10 * r5) - (j3 * (i10 == 1 ? 3L : i10 == 2 ? 6L : 12L)))) / U;
                    if (f11 < 0.0f) {
                        f11 = 0.0f;
                    }
                    y7Var2.C2 = f11;
                    org.telegram.messenger.gj gjVar = MediaController.B().v0;
                    if (gjVar != null && gjVar.I3()) {
                        y7Var2.b1(gjVar, false);
                    }
                    if (y7Var2.B2 == -1 && h7Var2.w > 0) {
                        if (j10 > 200 || y7Var2.C2 == 0.0f) {
                            h7Var2.y = currentTimeMillis;
                            if (y7Var2.C2 == 0.0f) {
                                MediaController.B().i0(MediaController.B().v0, 0.0f);
                                u51 u51Var2 = MediaController.B().j0;
                                if (u51Var2 != null) {
                                    u51Var2.g0();
                                }
                            } else {
                                MediaController.B().i0(MediaController.B().v0, f11);
                            }
                        }
                        if (h7Var2.w > 0 && y7Var2.C2 > 0.0f) {
                            org.telegram.messenger.g0.i3(h7Var2.F, 16L);
                            break;
                        }
                    }
                } else {
                    h7Var2.x = System.currentTimeMillis();
                    break;
                }
                break;
        }
    }
}
