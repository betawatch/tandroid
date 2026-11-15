package org.telegram.ui;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class d71 implements l71 {
    public boolean a;
    public final /* synthetic */ an b;

    public d71(an anVar, boolean z10) {
        this.b = anVar;
        this.a = z10;
    }

    @Override // org.telegram.ui.l71
    public final boolean Y0() {
        return true;
    }

    @Override // org.telegram.ui.l71
    public final boolean a() {
        return this.a;
    }

    @Override // org.telegram.ui.l71
    public final void m1(boolean z10) {
        boolean z11 = !this.a;
        this.a = z11;
        ym ymVar = this.b.Aa;
        ymVar.r(ymVar.f, ymVar.g, z10, Boolean.valueOf(z11), false);
    }
}
