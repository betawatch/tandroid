package org.telegram.ui.Components;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class wt0 extends r1.e {
    public final ut0 a;
    public final vt0 b;
    public float c = 1.0f;

    public wt0(ut0 ut0Var, vt0 vt0Var) {
        this.a = ut0Var;
        this.b = vt0Var;
    }

    @Override // r1.e
    public final float a(Object obj) {
        return this.a.get(obj) * this.c;
    }

    @Override // r1.e
    public final void b(Object obj, float f10) {
        this.b.d(obj, f10 / this.c);
    }
}
