package org.telegram.ui;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class ac1 implements hc1 {
    public boolean a;
    public final /* synthetic */ sn b;

    public ac1(sn snVar, boolean z10) {
        this.b = snVar;
        this.a = z10;
    }

    @Override // org.telegram.ui.hc1
    public final boolean I0() {
        return true;
    }

    @Override // org.telegram.ui.hc1
    public final boolean a() {
        return this.a;
    }

    @Override // org.telegram.ui.hc1
    public final void c1(boolean z10) {
        boolean z11 = !this.a;
        this.a = z11;
        qn qnVar = this.b.qa;
        qnVar.q(qnVar.f, qnVar.g, z10, Boolean.valueOf(z11), false);
    }
}
