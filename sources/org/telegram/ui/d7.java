package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public abstract class d7 extends zf.b {
    public final int d;
    public final ArrayList e = new ArrayList();

    public d7(int i10) {
        this.d = i10;
    }

    public abstract void F();

    @Override // f2.p0
    public final int h() {
        return this.e.size();
    }

    @Override // f2.p0
    public final int j(int i10) {
        return ((k7) this.e.get(i10)).a;
    }
}
