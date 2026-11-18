package org.telegram.ui;

import android.graphics.Point;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class f71 extends c8.ia {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.fs b;

    public /* synthetic */ f71(org.telegram.messenger.fs fsVar, int i7) {
        this.a = i7;
        this.b = fsVar;
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
