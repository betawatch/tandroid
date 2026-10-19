package org.telegram.ui.Components;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class dw0 extends o1.i {
    public final bw0 a;
    public final cw0 b;
    public float c = 1.0f;

    public dw0(bw0 bw0Var, cw0 cw0Var) {
        this.a = bw0Var;
        this.b = cw0Var;
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
