package org.telegram.ui.Components;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final class hv0 extends o1.i {
    public final fv0 a;
    public final gv0 b;
    public float c = 1.0f;

    public hv0(fv0 fv0Var, gv0 gv0Var) {
        this.a = fv0Var;
        this.b = gv0Var;
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
