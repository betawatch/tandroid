package org.telegram.ui.Components;

import android.graphics.Point;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class sy implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wy b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ sy(wy wyVar, int i7, int i10, int i11) {
        this.a = i11;
        this.b = wyVar;
        this.c = i7;
        this.d = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7;
        switch (this.a) {
            case 0:
                wy wyVar = this.b;
                int i10 = this.c;
                int i11 = this.d;
                if (wyVar.X != i10 || wyVar.Y != i11) {
                    wyVar.X = i10;
                    wyVar.Y = i11;
                    int o4 = org.telegram.messenger.gz.o();
                    int i12 = 1920;
                    if (o4 != 1) {
                        if (o4 != 2) {
                            i12 = 720;
                        } else {
                            Point point = org.telegram.messenger.g0.q;
                            i12 = Math.min(1920, Math.max(point.x, point.y));
                        }
                    }
                    if (org.telegram.messenger.gz.o() == 0 && ((i7 = wyVar.X) > 1280 || wyVar.Y > 1280)) {
                        wyVar.X = i7 / 2;
                        wyVar.Y /= 2;
                    }
                    int i13 = wyVar.X;
                    if (i13 > i12 || wyVar.Y > i12) {
                        int i14 = wyVar.Y;
                        if (i13 > i14) {
                            wyVar.Y = (int) (i14 / (i12 / i13));
                            wyVar.X = i12;
                        } else {
                            wyVar.X = (int) (i13 / (i12 / i14));
                            wyVar.Y = i12;
                        }
                    }
                    wyVar.a0 = false;
                    wyVar.f();
                    wyVar.e0.run();
                    break;
                }
                break;
            case 1:
                wy wyVar2 = this.b;
                int i15 = this.c;
                int i16 = this.d;
                wyVar2.n = i15;
                wyVar2.r = i16;
                break;
            default:
                wy wyVar3 = this.b;
                int i17 = this.c;
                int i18 = this.d;
                z9 z9Var = wyVar3.J;
                z9Var.l = i17;
                z9Var.m = i18;
                break;
        }
    }
}
