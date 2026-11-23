package org.telegram.ui.Components;

import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class m7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n7 b;

    public /* synthetic */ m7(n7 n7Var, int i7) {
        this.a = i7;
        this.b = n7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                n7 n7Var = this.b;
                int i7 = n7Var.w + 1;
                n7Var.w = i7;
                if (i7 != 1) {
                    if (i7 == 2) {
                        org.telegram.messenger.g0.h3(this, 2000L);
                        break;
                    }
                } else {
                    e8 e8Var = n7Var.I;
                    e8Var.B2 = -1;
                    e8Var.C2 = MediaController.B().v0.b0;
                    n7Var.x = System.currentTimeMillis();
                    org.telegram.messenger.g0.h3(this, 2000L);
                    org.telegram.messenger.g0.g3(n7Var.F);
                    break;
                }
                break;
            default:
                n7 n7Var2 = this.b;
                e8 e8Var2 = n7Var2.I;
                h61 h61Var = MediaController.B().j0;
                long U = h61Var == null ? 0L : h61Var.U();
                if (U != 0 && U != -9223372036854775807L) {
                    float f10 = e8Var2.C2;
                    long currentTimeMillis = System.currentTimeMillis();
                    long j3 = currentTimeMillis - n7Var2.x;
                    n7Var2.x = currentTimeMillis;
                    long j10 = currentTimeMillis - n7Var2.y;
                    int i10 = n7Var2.w;
                    float f11 = ((long) ((f10 * r5) - (j3 * (i10 == 1 ? 3L : i10 == 2 ? 6L : 12L)))) / U;
                    if (f11 < 0.0f) {
                        f11 = 0.0f;
                    }
                    e8Var2.C2 = f11;
                    org.telegram.messenger.fj fjVar = MediaController.B().v0;
                    if (fjVar != null && fjVar.I3()) {
                        e8Var2.c1(fjVar, false);
                    }
                    if (e8Var2.B2 == -1 && n7Var2.w > 0) {
                        if (j10 > 200 || e8Var2.C2 == 0.0f) {
                            n7Var2.y = currentTimeMillis;
                            if (e8Var2.C2 == 0.0f) {
                                MediaController.B().i0(MediaController.B().v0, 0.0f);
                                h61 h61Var2 = MediaController.B().j0;
                                if (h61Var2 != null) {
                                    h61Var2.g0();
                                }
                            } else {
                                MediaController.B().i0(MediaController.B().v0, f11);
                            }
                        }
                        if (n7Var2.w > 0 && e8Var2.C2 > 0.0f) {
                            org.telegram.messenger.g0.h3(n7Var2.F, 16L);
                            break;
                        }
                    }
                } else {
                    n7Var2.x = System.currentTimeMillis();
                    break;
                }
                break;
        }
    }
}
