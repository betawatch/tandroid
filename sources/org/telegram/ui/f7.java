package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes3.dex */
public abstract class f7 extends pg.b {
    public final int d;
    public final ArrayList e = new ArrayList();

    public f7(int i10) {
        this.d = i10;
    }

    public abstract void F();

    @Override // s4.h0
    public final int h() {
        return this.e.size();
    }

    @Override // s4.h0
    public final int j(int i10) {
        return ((m7) this.e.get(i10)).a;
    }
}
