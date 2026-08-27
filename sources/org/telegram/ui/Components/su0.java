package org.telegram.ui.Components;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class su0 extends o1.i {
    public final qu0 a;
    public final ru0 b;
    public float c = 1.0f;

    public su0(qu0 qu0Var, ru0 ru0Var) {
        this.a = qu0Var;
        this.b = ru0Var;
    }

    @Override // o1.i
    public final float a(Object obj) {
        return this.a.get(obj) * this.c;
    }

    @Override // o1.i
    public final void b(Object obj, float f10) {
        this.b.b(obj, f10 / this.c);
    }
}
