package org.telegram.ui.Components;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class fn0 extends s4.o {
    public final /* synthetic */ jn0 b;

    public fn0(jn0 jn0Var) {
        this.b = jn0Var;
    }

    @Override // s4.o
    public final boolean a(int i10, int i11) {
        jn0 jn0Var = this.b;
        return ((gn0) jn0Var.n.get(i10)).equals(jn0Var.r.get(i11));
    }

    @Override // s4.o
    public final boolean b(int i10, int i11) {
        jn0 jn0Var = this.b;
        return ((gn0) jn0Var.n.get(i10)).a.h == ((gn0) jn0Var.r.get(i11)).a.h;
    }

    @Override // s4.o
    public final int d() {
        return this.b.r.size();
    }

    @Override // s4.o
    public final int e() {
        return this.b.n.size();
    }
}
