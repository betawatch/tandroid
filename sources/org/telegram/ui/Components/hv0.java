package org.telegram.ui.Components;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class hv0 extends o1.i {
    public final fv0 a;
    public final gv0 b;
    public float c = 1.0f;

    public hv0(fv0 fv0Var, gv0 gv0Var) {
        this.a = fv0Var;
        this.b = gv0Var;
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
