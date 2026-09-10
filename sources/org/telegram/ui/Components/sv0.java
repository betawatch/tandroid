package org.telegram.ui.Components;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class sv0 extends o1.i {
    public final qv0 a;
    public final rv0 b;
    public float c = 1.0f;

    public sv0(qv0 qv0Var, rv0 rv0Var) {
        this.a = qv0Var;
        this.b = rv0Var;
    }

    @Override // o1.i
    public final float a(Object obj) {
        return this.a.get(obj) * this.c;
    }

    @Override // o1.i
    public final void b(Object obj, float f7) {
        this.b.b(obj, f7 / this.c);
    }
}
