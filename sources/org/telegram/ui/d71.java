package org.telegram.ui;

import android.graphics.Point;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class d71 extends c8.ja {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.fs b;

    public /* synthetic */ d71(org.telegram.messenger.fs fsVar, int i7) {
        this.a = i7;
        this.b = fsVar;
    }

    @Override // c8.ja
    public void a() {
        switch (this.a) {
            case 1:
                ((fc1) this.b).w.invalidate();
                break;
        }
    }

    @Override // c8.ja
    public void b(int i7, int i10) {
        switch (this.a) {
            case 0:
                Point point = org.telegram.messenger.g0.q;
                if ((point.x <= point.y) == (i7 <= i10)) {
                    ((v71) this.b).z0.invalidate();
                    break;
                }
                break;
        }
    }
}
