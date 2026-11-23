package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public abstract class e7 extends rg.b {
    public final int d;
    public final ArrayList e = new ArrayList();

    public e7(int i7) {
        this.d = i7;
    }

    public abstract void F();

    @Override // v4.i0
    public final int b() {
        return this.e.size();
    }

    @Override // v4.i0
    public final int d(int i7) {
        return ((l7) this.e.get(i7)).a;
    }
}
