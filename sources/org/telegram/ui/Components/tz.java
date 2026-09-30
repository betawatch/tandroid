package org.telegram.ui.Components;

import android.graphics.Point;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tz implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xz b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ tz(xz xzVar, int i10, int i11, int i12) {
        this.a = i12;
        this.b = xzVar;
        this.c = i10;
        this.d = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        switch (this.a) {
            case 0:
                xz xzVar = this.b;
                int i11 = this.c;
                int i12 = this.d;
                if (xzVar.W != i11 || xzVar.X != i12) {
                    xzVar.W = i11;
                    xzVar.X = i12;
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
                    if (SharedConfig.getDevicePerformanceClass() == 0 && ((i10 = xzVar.W) > 1280 || xzVar.X > 1280)) {
                        xzVar.W = i10 / 2;
                        xzVar.X /= 2;
                    }
                    int i14 = xzVar.W;
                    if (i14 > i13 || xzVar.X > i13) {
                        int i15 = xzVar.X;
                        if (i14 > i15) {
                            xzVar.X = (int) (i15 / (i13 / i14));
                            xzVar.W = i13;
                        } else {
                            xzVar.W = (int) (i14 / (i13 / i15));
                            xzVar.X = i13;
                        }
                    }
                    xzVar.Z = false;
                    xzVar.g();
                    xzVar.d0.run();
                    break;
                }
                break;
            case 1:
                xz xzVar2 = this.b;
                int i16 = this.c;
                int i17 = this.d;
                xzVar2.n = i16;
                xzVar2.r = i17;
                break;
            default:
                xz xzVar3 = this.b;
                int i18 = this.c;
                int i19 = this.d;
                pa paVar = xzVar3.I;
                paVar.l = i18;
                paVar.m = i19;
                break;
        }
    }
}
