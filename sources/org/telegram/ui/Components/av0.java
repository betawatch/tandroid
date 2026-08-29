package org.telegram.ui.Components;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class av0 extends o1.j {
    public final yu0 a;
    public final zu0 b;
    public float c = 1.0f;

    public av0(yu0 yu0Var, zu0 zu0Var) {
        this.a = yu0Var;
        this.b = zu0Var;
    }

    @Override // o1.j
    public final float a(Object obj) {
        return this.a.get(obj) * this.c;
    }

    @Override // o1.j
    public final void b(Object obj, float f9) {
        this.b.b(obj, f9 / this.c);
    }
}
