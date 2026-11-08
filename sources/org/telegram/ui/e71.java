package org.telegram.ui;

import android.graphics.Point;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
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
