package org.telegram.ui;

import android.graphics.Point;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class f71 extends c8.ea {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.ls b;

    public /* synthetic */ f71(org.telegram.messenger.ls lsVar, int i7) {
        this.a = i7;
        this.b = lsVar;
    }

    @Override // c8.ea
    public void a() {
        switch (this.a) {
            case 1:
                ((ic1) this.b).w.invalidate();
                break;
        }
    }

    @Override // c8.ea
    public void b(int i7, int i10) {
        switch (this.a) {
            case 0:
                Point point = org.telegram.messenger.g0.q;
                if ((point.x <= point.y) == (i7 <= i10)) {
                    ((w71) this.b).y0.invalidate();
                    break;
                }
                break;
        }
    }
}
