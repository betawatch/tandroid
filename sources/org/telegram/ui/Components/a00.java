package org.telegram.ui.Components;

import android.graphics.Point;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class a00 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e00 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ a00(e00 e00Var, int i10, int i11, int i12) {
        this.a = i12;
        this.b = e00Var;
        this.c = i10;
        this.d = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        switch (this.a) {
            case 0:
                e00 e00Var = this.b;
                int i11 = this.c;
                int i12 = this.d;
                if (e00Var.W != i11 || e00Var.X != i12) {
                    e00Var.W = i11;
                    e00Var.X = i12;
                    int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
                    int i13 = 1920;
                    if (devicePerformanceClass != 1) {
                        if (devicePerformanceClass != 2) {
                            i13 = 720;
                        } else {
                            Point point = AndroidUtilities.displaySize;
                            i13 = Math.min(1920, Math.max(point.x, point.y));
                        }
                    }
                    if (SharedConfig.getDevicePerformanceClass() == 0 && ((i10 = e00Var.W) > 1280 || e00Var.X > 1280)) {
                        e00Var.W = i10 / 2;
                        e00Var.X /= 2;
                    }
                    int i14 = e00Var.W;
                    if (i14 > i13 || e00Var.X > i13) {
                        int i15 = e00Var.X;
                        if (i14 > i15) {
                            e00Var.X = (int) (i15 / (i13 / i14));
                            e00Var.W = i13;
                        } else {
                            e00Var.W = (int) (i14 / (i13 / i15));
                            e00Var.X = i13;
                        }
                    }
                    e00Var.Z = false;
                    e00Var.g();
                    e00Var.d0.run();
                    break;
                }
                break;
            case 1:
                e00 e00Var2 = this.b;
                int i16 = this.c;
                int i17 = this.d;
                e00Var2.n = i16;
                e00Var2.r = i17;
                break;
            default:
                e00 e00Var3 = this.b;
                int i18 = this.c;
                int i19 = this.d;
                pa paVar = e00Var3.I;
                paVar.l = i18;
                paVar.m = i19;
                break;
        }
    }
}
