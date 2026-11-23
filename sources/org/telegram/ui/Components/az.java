package org.telegram.ui.Components;

import android.graphics.Point;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class az implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ez b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ az(ez ezVar, int i7, int i10, int i11) {
        this.a = i11;
        this.b = ezVar;
        this.c = i7;
        this.d = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7;
        switch (this.a) {
            case 0:
                ez ezVar = this.b;
                int i10 = this.c;
                int i11 = this.d;
                if (ezVar.X != i10 || ezVar.Y != i11) {
                    ezVar.X = i10;
                    ezVar.Y = i11;
                    int o4 = org.telegram.messenger.cz.o();
                    int i12 = 1920;
                    if (o4 != 1) {
                        if (o4 != 2) {
                            i12 = 720;
                        } else {
                            Point point = org.telegram.messenger.g0.q;
                            i12 = Math.min(1920, Math.max(point.x, point.y));
                        }
                    }
                    if (org.telegram.messenger.cz.o() == 0 && ((i7 = ezVar.X) > 1280 || ezVar.Y > 1280)) {
                        ezVar.X = i7 / 2;
                        ezVar.Y /= 2;
                    }
                    int i13 = ezVar.X;
                    if (i13 > i12 || ezVar.Y > i12) {
                        int i14 = ezVar.Y;
                        if (i13 > i14) {
                            ezVar.Y = (int) (i14 / (i12 / i13));
                            ezVar.X = i12;
                        } else {
                            ezVar.X = (int) (i13 / (i12 / i14));
                            ezVar.Y = i12;
                        }
                    }
                    ezVar.a0 = false;
                    ezVar.f();
                    ezVar.e0.run();
                    break;
                }
                break;
            case 1:
                ez ezVar2 = this.b;
                int i15 = this.c;
                int i16 = this.d;
                ezVar2.n = i15;
                ezVar2.r = i16;
                break;
            default:
                ez ezVar3 = this.b;
                int i17 = this.c;
                int i18 = this.d;
                ha haVar = ezVar3.J;
                haVar.l = i17;
                haVar.m = i18;
                break;
        }
    }
}
