package org.telegram.ui.Components;

import android.graphics.Point;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class cz implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gz b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ cz(gz gzVar, int i10, int i11, int i12) {
        this.a = i12;
        this.b = gzVar;
        this.c = i10;
        this.d = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        switch (this.a) {
            case 0:
                gz gzVar = this.b;
                int i11 = this.c;
                int i12 = this.d;
                if (gzVar.W != i11 || gzVar.X != i12) {
                    gzVar.W = i11;
                    gzVar.X = i12;
                    int o10 = org.telegram.messenger.tz.o();
                    int i13 = 1920;
                    if (o10 != 1) {
                        if (o10 != 2) {
                            i13 = 720;
                        } else {
                            Point point = org.telegram.messenger.i0.q;
                            i13 = Math.min(1920, Math.max(point.x, point.y));
                        }
                    }
                    if (org.telegram.messenger.tz.o() == 0 && ((i10 = gzVar.W) > 1280 || gzVar.X > 1280)) {
                        gzVar.W = i10 / 2;
                        gzVar.X /= 2;
                    }
                    int i14 = gzVar.W;
                    if (i14 > i13 || gzVar.X > i13) {
                        int i15 = gzVar.X;
                        if (i14 > i15) {
                            gzVar.X = (int) (i15 / (i13 / i14));
                            gzVar.W = i13;
                        } else {
                            gzVar.W = (int) (i14 / (i13 / i15));
                            gzVar.X = i13;
                        }
                    }
                    gzVar.Z = false;
                    gzVar.f();
                    gzVar.d0.run();
                    break;
                }
                break;
            case 1:
                gz gzVar2 = this.b;
                int i16 = this.c;
                int i17 = this.d;
                gzVar2.n = i16;
                gzVar2.r = i17;
                break;
            default:
                gz gzVar3 = this.b;
                int i18 = this.c;
                int i19 = this.d;
                x9 x9Var = gzVar3.I;
                x9Var.l = i18;
                x9Var.m = i19;
                break;
        }
    }
}
