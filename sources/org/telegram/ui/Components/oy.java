package org.telegram.ui.Components;

import android.graphics.Point;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class oy implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sy b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ oy(sy syVar, int i7, int i10, int i11) {
        this.a = i11;
        this.b = syVar;
        this.c = i7;
        this.d = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7;
        switch (this.a) {
            case 0:
                sy syVar = this.b;
                int i10 = this.c;
                int i11 = this.d;
                if (syVar.W != i10 || syVar.X != i11) {
                    syVar.W = i10;
                    syVar.X = i11;
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
                    if (org.telegram.messenger.iz.o() == 0 && ((i7 = syVar.W) > 1280 || syVar.X > 1280)) {
                        syVar.W = i7 / 2;
                        syVar.X /= 2;
                    }
                    int i13 = syVar.W;
                    if (i13 > i12 || syVar.X > i12) {
                        int i14 = syVar.X;
                        if (i13 > i14) {
                            syVar.X = (int) (i14 / (i12 / i13));
                            syVar.W = i12;
                        } else {
                            syVar.W = (int) (i13 / (i12 / i14));
                            syVar.X = i12;
                        }
                    }
                    syVar.Z = false;
                    syVar.f();
                    syVar.d0.run();
                    break;
                }
                break;
            case 1:
                sy syVar2 = this.b;
                int i15 = this.c;
                int i16 = this.d;
                syVar2.n = i15;
                syVar2.r = i16;
                break;
            default:
                sy syVar3 = this.b;
                int i17 = this.c;
                int i18 = this.d;
                da daVar = syVar3.I;
                daVar.l = i17;
                daVar.m = i18;
                break;
        }
    }
}
