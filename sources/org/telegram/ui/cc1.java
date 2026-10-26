package org.telegram.ui;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class cc1 implements kc1 {
    public boolean a;
    public final /* synthetic */ un b;

    public cc1(un unVar, boolean z10) {
        this.b = unVar;
        this.a = z10;
    }

    @Override // org.telegram.ui.kc1
    public final boolean X0() {
        return true;
    }

    @Override // org.telegram.ui.kc1
    public final boolean a() {
        return this.a;
    }

    @Override // org.telegram.ui.kc1
    public final void j1(boolean z10) {
        boolean z11 = !this.a;
        this.a = z11;
        sn snVar = this.b.qa;
        snVar.q(snVar.f, snVar.g, z10, Boolean.valueOf(z11), false);
    }
}
