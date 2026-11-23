package org.telegram.ui;

import android.graphics.Point;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class f71 extends c8.ia {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.gs b;

    public /* synthetic */ f71(org.telegram.messenger.gs gsVar, int i7) {
        this.a = i7;
        this.b = gsVar;
    }

    @Override // c8.ia
    public void a() {
        switch (this.a) {
            case 1:
                ((hc1) this.b).w.invalidate();
                break;
        }
    }

    @Override // c8.ia
    public void b(int i7, int i10) {
        switch (this.a) {
            case 0:
                Point point = org.telegram.messenger.g0.q;
                if ((point.x <= point.y) == (i7 <= i10)) {
                    ((x71) this.b).z0.invalidate();
                    break;
                }
                break;
        }
    }
}
