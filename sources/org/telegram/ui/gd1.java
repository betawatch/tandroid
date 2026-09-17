package org.telegram.ui;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final class gd1 implements nd1 {
    public boolean a;
    public final /* synthetic */ co b;

    public gd1(co coVar, boolean z10) {
        this.b = coVar;
        this.a = z10;
    }

    @Override // org.telegram.ui.nd1
    public final boolean Z0() {
        return true;
    }

    @Override // org.telegram.ui.nd1
    public final boolean a() {
        return this.a;
    }

    @Override // org.telegram.ui.nd1
    public final void p1(boolean z10) {
        boolean z11 = !this.a;
        this.a = z11;
        ao aoVar = this.b.ea;
        aoVar.i(aoVar.f, aoVar.h, z10, Boolean.valueOf(z11), false);
    }
}
