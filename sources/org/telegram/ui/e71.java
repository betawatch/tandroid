package org.telegram.ui;

import android.graphics.Point;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class e71 extends c8.ea {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.ls b;

    public /* synthetic */ e71(org.telegram.messenger.ls lsVar, int i7) {
        this.a = i7;
        this.b = lsVar;
    }

    @Override // c8.ea
    public void a() {
        switch (this.a) {
            case 1:
                ((fc1) this.b).w.invalidate();
                break;
        }
    }

    @Override // c8.ea
    public void b(int i7, int i10) {
        switch (this.a) {
            case 0:
                Point point = org.telegram.messenger.g0.q;
                if ((point.x <= point.y) == (i7 <= i10)) {
                    ((v71) this.b).y0.invalidate();
                    break;
                }
                break;
        }
    }
}
