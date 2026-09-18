package org.telegram.ui.Components;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class uv0 extends o1.i {
    public final sv0 a;
    public final tv0 b;
    public float c = 1.0f;

    public uv0(sv0 sv0Var, tv0 tv0Var) {
        this.a = sv0Var;
        this.b = tv0Var;
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
