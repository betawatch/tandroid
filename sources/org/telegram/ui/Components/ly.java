package org.telegram.ui.Components;

import android.graphics.Point;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ly implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ py b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ ly(py pyVar, int i3, int i10, int i11) {
        this.a = i11;
        this.b = pyVar;
        this.c = i3;
        this.d = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3;
        switch (this.a) {
            case 0:
                py pyVar = this.b;
                int i10 = this.c;
                int i11 = this.d;
                if (pyVar.X != i10 || pyVar.Y != i11) {
                    pyVar.X = i10;
                    pyVar.Y = i11;
                    int o10 = org.telegram.messenger.az.o();
                    int i12 = 1920;
                    if (o10 != 1) {
                        if (o10 != 2) {
                            i12 = 720;
                        } else {
                            Point point = org.telegram.messenger.g0.q;
                            i12 = Math.min(1920, Math.max(point.x, point.y));
                        }
                    }
                    if (org.telegram.messenger.az.o() == 0 && ((i3 = pyVar.X) > 1280 || pyVar.Y > 1280)) {
                        pyVar.X = i3 / 2;
                        pyVar.Y /= 2;
                    }
                    int i13 = pyVar.X;
                    if (i13 > i12 || pyVar.Y > i12) {
                        int i14 = pyVar.Y;
                        if (i13 > i14) {
                            pyVar.Y = (int) (i14 / (i12 / i13));
                            pyVar.X = i12;
                        } else {
                            pyVar.X = (int) (i13 / (i12 / i14));
                            pyVar.Y = i12;
                        }
                    }
                    pyVar.a0 = false;
                    pyVar.f();
                    pyVar.e0.run();
                    break;
                }
                break;
            case 1:
                py pyVar2 = this.b;
                int i15 = this.c;
                int i16 = this.d;
                pyVar2.n = i15;
                pyVar2.r = i16;
                break;
            default:
                py pyVar3 = this.b;
                int i17 = this.c;
                int i18 = this.d;
                ca caVar = pyVar3.J;
                caVar.l = i17;
                caVar.m = i18;
                break;
        }
    }
}
