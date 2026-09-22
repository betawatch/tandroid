package org.telegram.ui.Components;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
    public final void b(Object obj, float f7) {
        this.b.b(obj, f7 / this.c);
    }
}
