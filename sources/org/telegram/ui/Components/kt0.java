package org.telegram.ui.Components;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class kt0 extends q1.e {
    public final it0 a;
    public final jt0 b;
    public float c = 1.0f;

    public kt0(it0 it0Var, jt0 jt0Var) {
        this.a = it0Var;
        this.b = jt0Var;
    }

    @Override // q1.e
    public final float a(Object obj) {
        return this.a.get(obj) * this.c;
    }

    @Override // q1.e
    public final void b(Object obj, float f10) {
        this.b.c(obj, f10 / this.c);
    }
}
