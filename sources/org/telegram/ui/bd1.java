package org.telegram.ui;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class bd1 implements id1 {
    public boolean a;
    public final /* synthetic */ yn b;

    public bd1(yn ynVar, boolean z10) {
        this.b = ynVar;
        this.a = z10;
    }

    @Override // org.telegram.ui.id1
    public final boolean a() {
        return this.a;
    }

    @Override // org.telegram.ui.id1
    public final boolean a1() {
        return true;
    }

    @Override // org.telegram.ui.id1
    public final void q1(boolean z10) {
        boolean z11 = !this.a;
        this.a = z11;
        wn wnVar = this.b.ca;
        wnVar.i(wnVar.f, wnVar.h, z10, Boolean.valueOf(z11), false);
    }
}
