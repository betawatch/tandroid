package org.telegram.ui.Components;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class hw0 extends o1.i {
    public final fw0 a;
    public final gw0 b;
    public float c = 1.0f;

    public hw0(fw0 fw0Var, gw0 gw0Var) {
        this.a = fw0Var;
        this.b = gw0Var;
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
