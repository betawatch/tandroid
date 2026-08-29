package org.telegram.ui.Components;

import android.graphics.Point;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mz implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qz b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ mz(qz qzVar, int i10, int i11, int i12) {
        this.a = i12;
        this.b = qzVar;
        this.c = i10;
        this.d = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        switch (this.a) {
            case 0:
                qz qzVar = this.b;
                int i11 = this.c;
                int i12 = this.d;
                if (qzVar.S != i11 || qzVar.T != i12) {
                    qzVar.S = i11;
                    qzVar.T = i12;
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
                    if (SharedConfig.getDevicePerformanceClass() == 0 && ((i10 = qzVar.S) > 1280 || qzVar.T > 1280)) {
                        qzVar.S = i10 / 2;
                        qzVar.T /= 2;
                    }
                    int i14 = qzVar.S;
                    if (i14 > i13 || qzVar.T > i13) {
                        int i15 = qzVar.T;
                        if (i14 > i15) {
                            qzVar.T = (int) (i15 / (i13 / i14));
                            qzVar.S = i13;
                        } else {
                            qzVar.S = (int) (i14 / (i13 / i15));
                            qzVar.T = i13;
                        }
                    }
                    qzVar.V = false;
                    qzVar.g();
                    qzVar.Z.run();
                    break;
                }
                break;
            case 1:
                qz qzVar2 = this.b;
                int i16 = this.c;
                int i17 = this.d;
                qzVar2.n = i16;
                qzVar2.r = i17;
                break;
            default:
                qz qzVar3 = this.b;
                int i18 = this.c;
                int i19 = this.d;
                ma maVar = qzVar3.E;
                maVar.l = i18;
                maVar.m = i19;
                break;
        }
    }
}
