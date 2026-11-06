package org.telegram.ui.Components;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class lt0 extends r1.e {
    public final jt0 a;
    public final kt0 b;
    public float c = 1.0f;

    public lt0(jt0 jt0Var, kt0 kt0Var) {
        this.a = jt0Var;
        this.b = kt0Var;
    }

    @Override // r1.e
    public final float a(Object obj) {
        return this.a.get(obj) * this.c;
    }

    @Override // r1.e
    public final void b(Object obj, float f10) {
        this.b.f(obj, f10 / this.c);
    }
}
