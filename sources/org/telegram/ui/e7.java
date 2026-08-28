package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class e7 extends wf.b {
    public final int d;
    public final ArrayList e = new ArrayList();

    public e7(int i9) {
        this.d = i9;
    }

    public abstract void F();

    @Override // f2.r0
    public final int h() {
        return this.e.size();
    }

    @Override // f2.r0
    public final int j(int i9) {
        return ((l7) this.e.get(i9)).a;
    }
}
