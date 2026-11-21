package org.telegram.ui.Components;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class xt0 extends r1.e {
    public final vt0 a;
    public final wt0 b;
    public float c = 1.0f;

    public xt0(vt0 vt0Var, wt0 wt0Var) {
        this.a = vt0Var;
        this.b = wt0Var;
    }

    @Override // r1.e
    public final float a(Object obj) {
        return this.a.get(obj) * this.c;
    }

    @Override // r1.e
    public final void b(Object obj, float f10) {
        this.b.c(obj, f10 / this.c);
    }
}
