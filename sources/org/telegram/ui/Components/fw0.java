package org.telegram.ui.Components;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class fw0 extends o1.i {
    public final dw0 a;
    public final ew0 b;
    public float c = 1.0f;

    public fw0(dw0 dw0Var, ew0 ew0Var) {
        this.a = dw0Var;
        this.b = ew0Var;
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
