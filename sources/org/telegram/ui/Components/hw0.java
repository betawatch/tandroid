package org.telegram.ui.Components;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
