package org.telegram.ui;

import android.graphics.Point;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class d71 extends c8.ea {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.ls b;

    public /* synthetic */ d71(org.telegram.messenger.ls lsVar, int i7) {
        this.a = i7;
        this.b = lsVar;
    }

    @Override // c8.ea
    public void a() {
        switch (this.a) {
            case 1:
                ((ec1) this.b).w.invalidate();
                break;
        }
    }

    @Override // c8.ea
    public void b(int i7, int i10) {
        switch (this.a) {
            case 0:
                Point point = org.telegram.messenger.g0.q;
                if ((point.x <= point.y) == (i7 <= i10)) {
                    ((u71) this.b).y0.invalidate();
                    break;
                }
                break;
        }
    }
}
