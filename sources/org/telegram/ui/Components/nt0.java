package org.telegram.ui.Components;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class nt0 extends r1.e {
    public final lt0 a;
    public final mt0 b;
    public float c = 1.0f;

    public nt0(lt0 lt0Var, mt0 mt0Var) {
        this.a = lt0Var;
        this.b = mt0Var;
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
