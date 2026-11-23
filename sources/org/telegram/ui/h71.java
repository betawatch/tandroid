package org.telegram.ui;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class h71 implements p71 {
    public boolean a;
    public final /* synthetic */ bn b;

    public h71(bn bnVar, boolean z10) {
        this.b = bnVar;
        this.a = z10;
    }

    @Override // org.telegram.ui.p71
    public final boolean Y0() {
        return true;
    }

    @Override // org.telegram.ui.p71
    public final boolean d() {
        return this.a;
    }

    @Override // org.telegram.ui.p71
    public final void l1(boolean z10) {
        boolean z11 = !this.a;
        this.a = z11;
        zm zmVar = this.b.Ba;
        zmVar.r(zmVar.f, zmVar.g, z10, Boolean.valueOf(z11), false);
    }
}
