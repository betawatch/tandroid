package org.telegram.ui.Components;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class jv0 extends o1.i {
    public final hv0 a;
    public final iv0 b;
    public float c = 1.0f;

    public jv0(hv0 hv0Var, iv0 iv0Var) {
        this.a = hv0Var;
        this.b = iv0Var;
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
