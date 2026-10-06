package org.telegram.ui.Components;

import android.graphics.Point;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class uz implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yz b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ uz(yz yzVar, int i10, int i11, int i12) {
        this.a = i12;
        this.b = yzVar;
        this.c = i10;
        this.d = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        switch (this.a) {
            case 0:
                yz yzVar = this.b;
                int i11 = this.c;
                int i12 = this.d;
                if (yzVar.W != i11 || yzVar.X != i12) {
                    yzVar.W = i11;
                    yzVar.X = i12;
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
                    if (SharedConfig.getDevicePerformanceClass() == 0 && ((i10 = yzVar.W) > 1280 || yzVar.X > 1280)) {
                        yzVar.W = i10 / 2;
                        yzVar.X /= 2;
                    }
                    int i14 = yzVar.W;
                    if (i14 > i13 || yzVar.X > i13) {
                        int i15 = yzVar.X;
                        if (i14 > i15) {
                            yzVar.X = (int) (i15 / (i13 / i14));
                            yzVar.W = i13;
                        } else {
                            yzVar.W = (int) (i14 / (i13 / i15));
                            yzVar.X = i13;
                        }
                    }
                    yzVar.Z = false;
                    yzVar.g();
                    yzVar.d0.run();
                    break;
                }
                break;
            case 1:
                yz yzVar2 = this.b;
                int i16 = this.c;
                int i17 = this.d;
                yzVar2.n = i16;
                yzVar2.r = i17;
                break;
            default:
                yz yzVar3 = this.b;
                int i18 = this.c;
                int i19 = this.d;
                qa qaVar = yzVar3.I;
                qaVar.l = i18;
                qaVar.m = i19;
                break;
        }
    }
}
