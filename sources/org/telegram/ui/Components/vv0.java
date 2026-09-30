package org.telegram.ui.Components;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class vv0 extends o1.i {
    public final tv0 a;
    public final uv0 b;
    public float c = 1.0f;

    public vv0(tv0 tv0Var, uv0 uv0Var) {
        this.a = tv0Var;
        this.b = uv0Var;
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
