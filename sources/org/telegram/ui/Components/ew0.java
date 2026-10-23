package org.telegram.ui.Components;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class ew0 extends o1.i {
    public final cw0 a;
    public final dw0 b;
    public float c = 1.0f;

    public ew0(cw0 cw0Var, dw0 dw0Var) {
        this.a = cw0Var;
        this.b = dw0Var;
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
