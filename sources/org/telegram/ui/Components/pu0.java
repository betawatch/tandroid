package org.telegram.ui.Components;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class pu0 extends o1.h {
    public final nu0 a;
    public final ou0 b;
    public float c = 1.0f;

    public pu0(nu0 nu0Var, ou0 ou0Var) {
        this.a = nu0Var;
        this.b = ou0Var;
    }

    @Override // o1.h
    public final float a(Object obj) {
        return this.a.get(obj) * this.c;
    }

    @Override // o1.h
    public final void b(Object obj, float f7) {
        this.b.b(obj, f7 / this.c);
    }
}
