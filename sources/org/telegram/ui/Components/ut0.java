package org.telegram.ui.Components;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class ut0 extends r1.e {
    public final st0 a;
    public final tt0 b;
    public float c = 1.0f;

    public ut0(st0 st0Var, tt0 tt0Var) {
        this.a = st0Var;
        this.b = tt0Var;
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
