package org.telegram.ui.Components;

import android.graphics.Point;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class yy implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cz b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ yy(cz czVar, int i7, int i10, int i11) {
        this.a = i11;
        this.b = czVar;
        this.c = i7;
        this.d = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7;
        switch (this.a) {
            case 0:
                cz czVar = this.b;
                int i10 = this.c;
                int i11 = this.d;
                if (czVar.X != i10 || czVar.Y != i11) {
                    czVar.X = i10;
                    czVar.Y = i11;
                    int o4 = org.telegram.messenger.bz.o();
                    int i12 = 1920;
                    if (o4 != 1) {
                        if (o4 != 2) {
                            i12 = 720;
                        } else {
                            Point point = org.telegram.messenger.g0.q;
                            i12 = Math.min(1920, Math.max(point.x, point.y));
                        }
                    }
                    if (org.telegram.messenger.bz.o() == 0 && ((i7 = czVar.X) > 1280 || czVar.Y > 1280)) {
                        czVar.X = i7 / 2;
                        czVar.Y /= 2;
                    }
                    int i13 = czVar.X;
                    if (i13 > i12 || czVar.Y > i12) {
                        int i14 = czVar.Y;
                        if (i13 > i14) {
                            czVar.Y = (int) (i14 / (i12 / i13));
                            czVar.X = i12;
                        } else {
                            czVar.X = (int) (i13 / (i12 / i14));
                            czVar.Y = i12;
                        }
                    }
                    czVar.a0 = false;
                    czVar.f();
                    czVar.e0.run();
                    break;
                }
                break;
            case 1:
                cz czVar2 = this.b;
                int i15 = this.c;
                int i16 = this.d;
                czVar2.n = i15;
                czVar2.r = i16;
                break;
            default:
                cz czVar3 = this.b;
                int i17 = this.c;
                int i18 = this.d;
                ha haVar = czVar3.J;
                haVar.l = i17;
                haVar.m = i18;
                break;
        }
    }
}
