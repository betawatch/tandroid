package org.telegram.ui.Components;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class lw0 extends o1.i {
    public final jw0 a;
    public final kw0 b;
    public float c = 1.0f;

    public lw0(jw0 jw0Var, kw0 kw0Var) {
        this.a = jw0Var;
        this.b = kw0Var;
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
