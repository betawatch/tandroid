package org.telegram.ui.Components;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class hw0 extends o1.i {
    public final fw0 a;
    public final gw0 b;
    public float c = 1.0f;

    public hw0(fw0 fw0Var, gw0 gw0Var) {
        this.a = fw0Var;
        this.b = gw0Var;
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
