package org.telegram.ui.Components;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
