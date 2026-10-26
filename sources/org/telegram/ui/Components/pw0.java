package org.telegram.ui.Components;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class pw0 extends o1.i {
    public final nw0 a;
    public final ow0 b;
    public float c = 1.0f;

    public pw0(nw0 nw0Var, ow0 ow0Var) {
        this.a = nw0Var;
        this.b = ow0Var;
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
