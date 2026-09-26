package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public abstract class f7 extends og.b {
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
