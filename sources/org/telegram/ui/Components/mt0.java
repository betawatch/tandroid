package org.telegram.ui.Components;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class mt0 extends r1.e {
    public final kt0 a;
    public final lt0 b;
    public float c = 1.0f;

    public mt0(kt0 kt0Var, lt0 lt0Var) {
        this.a = kt0Var;
        this.b = lt0Var;
    }

    @Override // r1.e
    public final float a(Object obj) {
        return this.a.get(obj) * this.c;
    }

    @Override // r1.e
    public final void b(Object obj, float f10) {
        this.b.f(obj, f10 / this.c);
    }
}
