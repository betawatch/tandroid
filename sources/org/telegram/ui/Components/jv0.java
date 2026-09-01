package org.telegram.ui.Components;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class jv0 extends o1.i {
    public final hv0 a;
    public final iv0 b;
    public float c = 1.0f;

    public jv0(hv0 hv0Var, iv0 iv0Var) {
        this.a = hv0Var;
        this.b = iv0Var;
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
