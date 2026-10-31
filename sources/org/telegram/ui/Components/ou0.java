package org.telegram.ui.Components;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ou0 extends o1.h {
    public final mu0 a;
    public final nu0 b;
    public float c = 1.0f;

    public ou0(mu0 mu0Var, nu0 nu0Var) {
        this.a = mu0Var;
        this.b = nu0Var;
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
