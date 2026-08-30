package org.telegram.ui.Components;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class iv0 extends o1.i {
    public final gv0 a;
    public final hv0 b;
    public float c = 1.0f;

    public iv0(gv0 gv0Var, hv0 hv0Var) {
        this.a = gv0Var;
        this.b = hv0Var;
    }

    @Override // o1.i
    public final float a(Object obj) {
        return this.a.get(obj) * this.c;
    }

    @Override // o1.i
    public final void b(Object obj, float f10) {
        this.b.b(obj, f10 / this.c);
    }
}
