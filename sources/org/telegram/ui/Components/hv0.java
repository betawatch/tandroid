package org.telegram.ui.Components;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
