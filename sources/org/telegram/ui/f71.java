package org.telegram.ui;

import android.graphics.Point;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
