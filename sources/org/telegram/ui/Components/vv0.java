package org.telegram.ui.Components;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
