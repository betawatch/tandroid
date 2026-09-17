package org.telegram.ui.Components;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
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
