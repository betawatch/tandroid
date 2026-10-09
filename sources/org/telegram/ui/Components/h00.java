package org.telegram.ui.Components;

import android.graphics.Point;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h00 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l00 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ h00(l00 l00Var, int i10, int i11, int i12) {
        this.a = i12;
        this.b = l00Var;
        this.c = i10;
        this.d = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        switch (this.a) {
            case 0:
                l00 l00Var = this.b;
                int i11 = this.c;
                int i12 = this.d;
                if (l00Var.W != i11 || l00Var.X != i12) {
                    l00Var.W = i11;
                    l00Var.X = i12;
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
                    if (SharedConfig.getDevicePerformanceClass() == 0 && ((i10 = l00Var.W) > 1280 || l00Var.X > 1280)) {
                        l00Var.W = i10 / 2;
                        l00Var.X /= 2;
                    }
                    int i14 = l00Var.W;
                    if (i14 > i13 || l00Var.X > i13) {
                        int i15 = l00Var.X;
                        if (i14 > i15) {
                            l00Var.X = (int) (i15 / (i13 / i14));
                            l00Var.W = i13;
                        } else {
                            l00Var.W = (int) (i14 / (i13 / i15));
                            l00Var.X = i13;
                        }
                    }
                    l00Var.Z = false;
                    l00Var.g();
                    l00Var.d0.run();
                    break;
                }
                break;
            case 1:
                l00 l00Var2 = this.b;
                int i16 = this.c;
                int i17 = this.d;
                l00Var2.n = i16;
                l00Var2.r = i17;
                break;
            default:
                l00 l00Var3 = this.b;
                int i18 = this.c;
                int i19 = this.d;
                sa saVar = l00Var3.I;
                saVar.l = i18;
                saVar.m = i19;
                break;
        }
    }
}
