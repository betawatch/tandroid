package org.telegram.ui;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class f71 implements n71 {
    public boolean a;
    public final /* synthetic */ bn b;

    public f71(bn bnVar, boolean z10) {
        this.b = bnVar;
        this.a = z10;
    }

    @Override // org.telegram.ui.n71
    public final boolean O0() {
        return true;
    }

    @Override // org.telegram.ui.n71
    public final boolean b() {
        return this.a;
    }

    @Override // org.telegram.ui.n71
    public final void b1(boolean z10) {
        boolean z11 = !this.a;
        this.a = z11;
        zm zmVar = this.b.Ba;
        zmVar.r(zmVar.f, zmVar.g, z10, Boolean.valueOf(z11), false);
    }
}
