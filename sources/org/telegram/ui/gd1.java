package org.telegram.ui;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class gd1 implements nd1 {
    public boolean a;
    public final /* synthetic */ bo b;

    public gd1(bo boVar, boolean z10) {
        this.b = boVar;
        this.a = z10;
    }

    @Override // org.telegram.ui.nd1
    public final boolean Y0() {
        return true;
    }

    @Override // org.telegram.ui.nd1
    public final boolean a() {
        return this.a;
    }

    @Override // org.telegram.ui.nd1
    public final void o1(boolean z10) {
        boolean z11 = !this.a;
        this.a = z11;
        zn znVar = this.b.ea;
        znVar.i(znVar.f, znVar.h, z10, Boolean.valueOf(z11), false);
    }
}
