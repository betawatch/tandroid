package org.telegram.ui.Components;

import android.graphics.Point;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ny implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ry b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ ny(ry ryVar, int i7, int i10, int i11) {
        this.a = i11;
        this.b = ryVar;
        this.c = i7;
        this.d = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7;
        switch (this.a) {
            case 0:
                ry ryVar = this.b;
                int i10 = this.c;
                int i11 = this.d;
                if (ryVar.W != i10 || ryVar.X != i11) {
                    ryVar.W = i10;
                    ryVar.X = i11;
                    int o4 = org.telegram.messenger.iz.o();
                    int i12 = 1920;
                    if (o4 != 1) {
                        if (o4 != 2) {
                            i12 = 720;
                        } else {
                            Point point = org.telegram.messenger.g0.q;
                            i12 = Math.min(1920, Math.max(point.x, point.y));
                        }
                    }
                    if (org.telegram.messenger.iz.o() == 0 && ((i7 = ryVar.W) > 1280 || ryVar.X > 1280)) {
                        ryVar.W = i7 / 2;
                        ryVar.X /= 2;
                    }
                    int i13 = ryVar.W;
                    if (i13 > i12 || ryVar.X > i12) {
                        int i14 = ryVar.X;
                        if (i13 > i14) {
                            ryVar.X = (int) (i14 / (i12 / i13));
                            ryVar.W = i12;
                        } else {
                            ryVar.W = (int) (i13 / (i12 / i14));
                            ryVar.X = i12;
                        }
                    }
                    ryVar.Z = false;
                    ryVar.f();
                    ryVar.d0.run();
                    break;
                }
                break;
            case 1:
                ry ryVar2 = this.b;
                int i15 = this.c;
                int i16 = this.d;
                ryVar2.n = i15;
                ryVar2.r = i16;
                break;
            default:
                ry ryVar3 = this.b;
                int i17 = this.c;
                int i18 = this.d;
                ca caVar = ryVar3.I;
                caVar.l = i17;
                caVar.m = i18;
                break;
        }
    }
}
