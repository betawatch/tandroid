package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public abstract class f7 extends rg.b {
    public final int d;
    public final ArrayList e = new ArrayList();

    public f7(int i7) {
        this.d = i7;
    }

    public abstract void F();

    @Override // v4.g0
    public final int b() {
        return this.e.size();
    }

    @Override // v4.g0
    public final int d(int i7) {
        return ((m7) this.e.get(i7)).a;
    }
}
