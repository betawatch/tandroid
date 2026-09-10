package org.telegram.ui.Components;

import android.graphics.Point;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class yz implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c00 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ yz(c00 c00Var, int i10, int i11, int i12) {
        this.a = i12;
        this.b = c00Var;
        this.c = i10;
        this.d = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        switch (this.a) {
            case 0:
                c00 c00Var = this.b;
                int i11 = this.c;
                int i12 = this.d;
                if (c00Var.W != i11 || c00Var.X != i12) {
                    c00Var.W = i11;
                    c00Var.X = i12;
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
                    if (SharedConfig.getDevicePerformanceClass() == 0 && ((i10 = c00Var.W) > 1280 || c00Var.X > 1280)) {
                        c00Var.W = i10 / 2;
                        c00Var.X /= 2;
                    }
                    int i14 = c00Var.W;
                    if (i14 > i13 || c00Var.X > i13) {
                        int i15 = c00Var.X;
                        if (i14 > i15) {
                            c00Var.X = (int) (i15 / (i13 / i14));
                            c00Var.W = i13;
                        } else {
                            c00Var.W = (int) (i14 / (i13 / i15));
                            c00Var.X = i13;
                        }
                    }
                    c00Var.Z = false;
                    c00Var.g();
                    c00Var.d0.run();
                    break;
                }
                break;
            case 1:
                c00 c00Var2 = this.b;
                int i16 = this.c;
                int i17 = this.d;
                c00Var2.n = i16;
                c00Var2.r = i17;
                break;
            default:
                c00 c00Var3 = this.b;
                int i18 = this.c;
                int i19 = this.d;
                oa oaVar = c00Var3.I;
                oaVar.l = i18;
                oaVar.m = i19;
                break;
        }
    }
}
