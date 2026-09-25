package org.telegram.ui.Components;

import android.graphics.Point;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sz implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wz b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ sz(wz wzVar, int i10, int i11, int i12) {
        this.a = i12;
        this.b = wzVar;
        this.c = i10;
        this.d = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        switch (this.a) {
            case 0:
                wz wzVar = this.b;
                int i11 = this.c;
                int i12 = this.d;
                if (wzVar.W != i11 || wzVar.X != i12) {
                    wzVar.W = i11;
                    wzVar.X = i12;
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
                    if (SharedConfig.getDevicePerformanceClass() == 0 && ((i10 = wzVar.W) > 1280 || wzVar.X > 1280)) {
                        wzVar.W = i10 / 2;
                        wzVar.X /= 2;
                    }
                    int i14 = wzVar.W;
                    if (i14 > i13 || wzVar.X > i13) {
                        int i15 = wzVar.X;
                        if (i14 > i15) {
                            wzVar.X = (int) (i15 / (i13 / i14));
                            wzVar.W = i13;
                        } else {
                            wzVar.W = (int) (i14 / (i13 / i15));
                            wzVar.X = i13;
                        }
                    }
                    wzVar.Z = false;
                    wzVar.g();
                    wzVar.d0.run();
                    break;
                }
                break;
            case 1:
                wz wzVar2 = this.b;
                int i16 = this.c;
                int i17 = this.d;
                wzVar2.n = i16;
                wzVar2.r = i17;
                break;
            default:
                wz wzVar3 = this.b;
                int i18 = this.c;
                int i19 = this.d;
                pa paVar = wzVar3.I;
                paVar.l = i18;
                paVar.m = i19;
                break;
        }
    }
}
