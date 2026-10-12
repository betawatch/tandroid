package org.telegram.ui.Components;

import android.graphics.Point;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class d00 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h00 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ d00(h00 h00Var, int i10, int i11, int i12) {
        this.a = i12;
        this.b = h00Var;
        this.c = i10;
        this.d = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        switch (this.a) {
            case 0:
                h00 h00Var = this.b;
                int i11 = this.c;
                int i12 = this.d;
                if (h00Var.W != i11 || h00Var.X != i12) {
                    h00Var.W = i11;
                    h00Var.X = i12;
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
                    if (SharedConfig.getDevicePerformanceClass() == 0 && ((i10 = h00Var.W) > 1280 || h00Var.X > 1280)) {
                        h00Var.W = i10 / 2;
                        h00Var.X /= 2;
                    }
                    int i14 = h00Var.W;
                    if (i14 > i13 || h00Var.X > i13) {
                        int i15 = h00Var.X;
                        if (i14 > i15) {
                            h00Var.X = (int) (i15 / (i13 / i14));
                            h00Var.W = i13;
                        } else {
                            h00Var.W = (int) (i14 / (i13 / i15));
                            h00Var.X = i13;
                        }
                    }
                    h00Var.Z = false;
                    h00Var.g();
                    h00Var.d0.run();
                    break;
                }
                break;
            case 1:
                h00 h00Var2 = this.b;
                int i16 = this.c;
                int i17 = this.d;
                h00Var2.n = i16;
                h00Var2.r = i17;
                break;
            default:
                h00 h00Var3 = this.b;
                int i18 = this.c;
                int i19 = this.d;
                ra raVar = h00Var3.I;
                raVar.l = i18;
                raVar.m = i19;
                break;
        }
    }
}
