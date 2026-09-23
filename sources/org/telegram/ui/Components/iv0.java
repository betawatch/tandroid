package org.telegram.ui.Components;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
        this.b.a(obj, f7 / this.c);
    }
}
