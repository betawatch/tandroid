package org.telegram.ui.Components;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class qw0 extends o1.i {
    public final ow0 a;
    public final pw0 b;
    public float c = 1.0f;

    public qw0(ow0 ow0Var, pw0 pw0Var) {
        this.a = ow0Var;
        this.b = pw0Var;
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
