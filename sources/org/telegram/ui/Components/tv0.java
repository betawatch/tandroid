package org.telegram.ui.Components;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class tv0 extends o1.i {
    public final rv0 a;
    public final sv0 b;
    public float c = 1.0f;

    public tv0(rv0 rv0Var, sv0 sv0Var) {
        this.a = rv0Var;
        this.b = sv0Var;
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
