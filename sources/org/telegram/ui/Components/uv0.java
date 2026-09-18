package org.telegram.ui.Components;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class uv0 extends o1.i {
    public final sv0 a;
    public final tv0 b;
    public float c = 1.0f;

    public uv0(sv0 sv0Var, tv0 tv0Var) {
        this.a = sv0Var;
        this.b = tv0Var;
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
