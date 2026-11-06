package org.telegram.ui.Components;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
