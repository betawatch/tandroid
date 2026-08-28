package org.telegram.ui.Components;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class pu0 extends o1.i {
    public final nu0 a;
    public final ou0 b;
    public float c = 1.0f;

    public pu0(nu0 nu0Var, ou0 ou0Var) {
        this.a = nu0Var;
        this.b = ou0Var;
    }

    @Override // o1.i
    public final float a(Object obj) {
        return this.a.get(obj) * this.c;
    }

    @Override // o1.i
    public final void b(Object obj, float f10) {
        this.b.b(obj, f10 / this.c);
    }
}
