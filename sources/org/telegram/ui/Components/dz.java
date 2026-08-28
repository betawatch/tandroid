package org.telegram.ui.Components;

import android.graphics.Point;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dz implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hz b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ dz(hz hzVar, int i9, int i10, int i11) {
        this.a = i11;
        this.b = hzVar;
        this.c = i9;
        this.d = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i9;
        switch (this.a) {
            case 0:
                hz hzVar = this.b;
                int i10 = this.c;
                int i11 = this.d;
                if (hzVar.S != i10 || hzVar.T != i11) {
                    hzVar.S = i10;
                    hzVar.T = i11;
                    int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
                    int i12 = 1920;
                    if (devicePerformanceClass != 1) {
                        if (devicePerformanceClass != 2) {
                            i12 = 720;
                        } else {
                            Point point = AndroidUtilities.displaySize;
                            i12 = Math.min(1920, Math.max(point.x, point.y));
                        }
                    }
                    if (SharedConfig.getDevicePerformanceClass() == 0 && ((i9 = hzVar.S) > 1280 || hzVar.T > 1280)) {
                        hzVar.S = i9 / 2;
                        hzVar.T /= 2;
                    }
                    int i13 = hzVar.S;
                    if (i13 > i12 || hzVar.T > i12) {
                        int i14 = hzVar.T;
                        if (i13 > i14) {
                            hzVar.T = (int) (i14 / (i12 / i13));
                            hzVar.S = i12;
                        } else {
                            hzVar.S = (int) (i13 / (i12 / i14));
                            hzVar.T = i12;
                        }
                    }
                    hzVar.V = false;
                    hzVar.g();
                    hzVar.Z.run();
                    break;
                }
                break;
            case 1:
                hz hzVar2 = this.b;
                int i15 = this.c;
                int i16 = this.d;
                hzVar2.n = i15;
                hzVar2.r = i16;
                break;
            default:
                hz hzVar3 = this.b;
                int i17 = this.c;
                int i18 = this.d;
                ha haVar = hzVar3.E;
                haVar.l = i17;
                haVar.m = i18;
                break;
        }
    }
}
