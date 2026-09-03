package org.telegram.ui.Components;

import android.graphics.Point;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rz implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vz b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ rz(vz vzVar, int i10, int i11, int i12) {
        this.a = i12;
        this.b = vzVar;
        this.c = i10;
        this.d = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        switch (this.a) {
            case 0:
                vz vzVar = this.b;
                int i11 = this.c;
                int i12 = this.d;
                if (vzVar.T != i11 || vzVar.U != i12) {
                    vzVar.T = i11;
                    vzVar.U = i12;
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
                    if (SharedConfig.getDevicePerformanceClass() == 0 && ((i10 = vzVar.T) > 1280 || vzVar.U > 1280)) {
                        vzVar.T = i10 / 2;
                        vzVar.U /= 2;
                    }
                    int i14 = vzVar.T;
                    if (i14 > i13 || vzVar.U > i13) {
                        int i15 = vzVar.U;
                        if (i14 > i15) {
                            vzVar.U = (int) (i15 / (i13 / i14));
                            vzVar.T = i13;
                        } else {
                            vzVar.T = (int) (i14 / (i13 / i15));
                            vzVar.U = i13;
                        }
                    }
                    vzVar.W = false;
                    vzVar.g();
                    vzVar.a0.run();
                    break;
                }
                break;
            case 1:
                vz vzVar2 = this.b;
                int i16 = this.c;
                int i17 = this.d;
                vzVar2.n = i16;
                vzVar2.r = i17;
                break;
            default:
                vz vzVar3 = this.b;
                int i18 = this.c;
                int i19 = this.d;
                ha haVar = vzVar3.F;
                haVar.l = i18;
                haVar.m = i19;
                break;
        }
    }
}
