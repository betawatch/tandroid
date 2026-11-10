package org.telegram.ui;

import android.graphics.Point;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class g71 extends c8.ea {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.ls b;

    public /* synthetic */ g71(org.telegram.messenger.ls lsVar, int i7) {
        this.a = i7;
        this.b = lsVar;
    }

    @Override // c8.ea
    public void a() {
        switch (this.a) {
            case 1:
                ((jc1) this.b).w.invalidate();
                break;
        }
    }

    @Override // c8.ea
    public void b(int i7, int i10) {
        switch (this.a) {
            case 0:
                Point point = org.telegram.messenger.g0.q;
                if ((point.x <= point.y) == (i7 <= i10)) {
                    ((x71) this.b).y0.invalidate();
                    break;
                }
                break;
        }
    }
}
