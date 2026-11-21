package org.telegram.ui.Components;

import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class n7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o7 b;

    public /* synthetic */ n7(o7 o7Var, int i7) {
        this.a = i7;
        this.b = o7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                o7 o7Var = this.b;
                int i7 = o7Var.w + 1;
                o7Var.w = i7;
                if (i7 != 1) {
                    if (i7 == 2) {
                        org.telegram.messenger.g0.h3(this, 2000L);
                        break;
                    }
                } else {
                    f8 f8Var = o7Var.I;
                    f8Var.B2 = -1;
                    f8Var.C2 = MediaController.B().v0.b0;
                    o7Var.x = System.currentTimeMillis();
                    org.telegram.messenger.g0.h3(this, 2000L);
                    org.telegram.messenger.g0.g3(o7Var.F);
                    break;
                }
                break;
            default:
                o7 o7Var2 = this.b;
                f8 f8Var2 = o7Var2.I;
                i61 i61Var = MediaController.B().j0;
                long U = i61Var == null ? 0L : i61Var.U();
                if (U != 0 && U != -9223372036854775807L) {
                    float f10 = f8Var2.C2;
                    long currentTimeMillis = System.currentTimeMillis();
                    long j3 = currentTimeMillis - o7Var2.x;
                    o7Var2.x = currentTimeMillis;
                    long j10 = currentTimeMillis - o7Var2.y;
                    int i10 = o7Var2.w;
                    float f11 = ((long) ((f10 * r5) - (j3 * (i10 == 1 ? 3L : i10 == 2 ? 6L : 12L)))) / U;
                    if (f11 < 0.0f) {
                        f11 = 0.0f;
                    }
                    f8Var2.C2 = f11;
                    org.telegram.messenger.fj fjVar = MediaController.B().v0;
                    if (fjVar != null && fjVar.I3()) {
                        f8Var2.c1(fjVar, false);
                    }
                    if (f8Var2.B2 == -1 && o7Var2.w > 0) {
                        if (j10 > 200 || f8Var2.C2 == 0.0f) {
                            o7Var2.y = currentTimeMillis;
                            if (f8Var2.C2 == 0.0f) {
                                MediaController.B().i0(MediaController.B().v0, 0.0f);
                                i61 i61Var2 = MediaController.B().j0;
                                if (i61Var2 != null) {
                                    i61Var2.g0();
                                }
                            } else {
                                MediaController.B().i0(MediaController.B().v0, f11);
                            }
                        }
                        if (o7Var2.w > 0 && f8Var2.C2 > 0.0f) {
                            org.telegram.messenger.g0.h3(o7Var2.F, 16L);
                            break;
                        }
                    }
                } else {
                    o7Var2.x = System.currentTimeMillis();
                    break;
                }
                break;
        }
    }
}
