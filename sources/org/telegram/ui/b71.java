package org.telegram.ui;

import android.graphics.Point;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class b71 extends c8.ga {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.is b;

    public /* synthetic */ b71(org.telegram.messenger.is isVar, int i7) {
        this.a = i7;
        this.b = isVar;
    }

    @Override // c8.ga
    public void a() {
        switch (this.a) {
            case 1:
                ((ec1) this.b).w.invalidate();
                break;
        }
    }

    @Override // c8.ga
    public void b(int i7, int i10) {
        switch (this.a) {
            case 0:
                Point point = org.telegram.messenger.g0.q;
                if ((point.x <= point.y) == (i7 <= i10)) {
                    ((t71) this.b).z0.invalidate();
                    break;
                }
                break;
        }
    }
}
