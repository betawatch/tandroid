package org.telegram.ui.Components;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
