package org.telegram.ui.Components;

import android.graphics.Point;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class xy implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bz b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ xy(bz bzVar, int i7, int i10, int i11) {
        this.a = i11;
        this.b = bzVar;
        this.c = i7;
        this.d = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7;
        switch (this.a) {
            case 0:
                bz bzVar = this.b;
                int i10 = this.c;
                int i11 = this.d;
                if (bzVar.X != i10 || bzVar.Y != i11) {
                    bzVar.X = i10;
                    bzVar.Y = i11;
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
                    if (org.telegram.messenger.bz.o() == 0 && ((i7 = bzVar.X) > 1280 || bzVar.Y > 1280)) {
                        bzVar.X = i7 / 2;
                        bzVar.Y /= 2;
                    }
                    int i13 = bzVar.X;
                    if (i13 > i12 || bzVar.Y > i12) {
                        int i14 = bzVar.Y;
                        if (i13 > i14) {
                            bzVar.Y = (int) (i14 / (i12 / i13));
                            bzVar.X = i12;
                        } else {
                            bzVar.X = (int) (i13 / (i12 / i14));
                            bzVar.Y = i12;
                        }
                    }
                    bzVar.a0 = false;
                    bzVar.f();
                    bzVar.e0.run();
                    break;
                }
                break;
            case 1:
                bz bzVar2 = this.b;
                int i15 = this.c;
                int i16 = this.d;
                bzVar2.n = i15;
                bzVar2.r = i16;
                break;
            default:
                bz bzVar3 = this.b;
                int i17 = this.c;
                int i18 = this.d;
                ga gaVar = bzVar3.J;
                gaVar.l = i17;
                gaVar.m = i18;
                break;
        }
    }
}
