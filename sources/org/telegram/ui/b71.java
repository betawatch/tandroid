package org.telegram.ui;

import android.graphics.Point;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
