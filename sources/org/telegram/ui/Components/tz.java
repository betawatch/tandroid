package org.telegram.ui.Components;

import android.graphics.Point;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
                if (xzVar.T != i11 || xzVar.U != i12) {
                    xzVar.T = i11;
                    xzVar.U = i12;
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
                    if (SharedConfig.getDevicePerformanceClass() == 0 && ((i10 = xzVar.T) > 1280 || xzVar.U > 1280)) {
                        xzVar.T = i10 / 2;
                        xzVar.U /= 2;
                    }
                    int i14 = xzVar.T;
                    if (i14 > i13 || xzVar.U > i13) {
                        int i15 = xzVar.U;
                        if (i14 > i15) {
                            xzVar.U = (int) (i15 / (i13 / i14));
                            xzVar.T = i13;
                        } else {
                            xzVar.T = (int) (i14 / (i13 / i15));
                            xzVar.U = i13;
                        }
                    }
                    xzVar.W = false;
                    xzVar.g();
                    xzVar.a0.run();
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
                ha haVar = xzVar3.F;
                haVar.l = i18;
                haVar.m = i19;
                break;
        }
    }
}
