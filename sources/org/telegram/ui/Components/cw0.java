package org.telegram.ui.Components;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class cw0 extends o1.i {
    public final aw0 a;
    public final bw0 b;
    public float c = 1.0f;

    public cw0(aw0 aw0Var, bw0 bw0Var) {
        this.a = aw0Var;
        this.b = bw0Var;
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
