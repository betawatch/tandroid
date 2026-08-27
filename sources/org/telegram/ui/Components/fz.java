package org.telegram.ui.Components;

import android.graphics.Point;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fz implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ jz b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ fz(jz jzVar, int i10, int i11, int i12) {
        this.a = i12;
        this.b = jzVar;
        this.c = i10;
        this.d = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        switch (this.a) {
            case 0:
                jz jzVar = this.b;
                int i11 = this.c;
                int i12 = this.d;
                if (jzVar.S != i11 || jzVar.T != i12) {
                    jzVar.S = i11;
                    jzVar.T = i12;
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
                    if (SharedConfig.getDevicePerformanceClass() == 0 && ((i10 = jzVar.S) > 1280 || jzVar.T > 1280)) {
                        jzVar.S = i10 / 2;
                        jzVar.T /= 2;
                    }
                    int i14 = jzVar.S;
                    if (i14 > i13 || jzVar.T > i13) {
                        int i15 = jzVar.T;
                        if (i14 > i15) {
                            jzVar.T = (int) (i15 / (i13 / i14));
                            jzVar.S = i13;
                        } else {
                            jzVar.S = (int) (i14 / (i13 / i15));
                            jzVar.T = i13;
                        }
                    }
                    jzVar.V = false;
                    jzVar.g();
                    jzVar.Z.run();
                    break;
                }
                break;
            case 1:
                jz jzVar2 = this.b;
                int i16 = this.c;
                int i17 = this.d;
                jzVar2.n = i16;
                jzVar2.r = i17;
                break;
            default:
                jz jzVar3 = this.b;
                int i18 = this.c;
                int i19 = this.d;
                fa faVar = jzVar3.E;
                faVar.l = i18;
                faVar.m = i19;
                break;
        }
    }
}
