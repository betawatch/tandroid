package org.telegram.ui;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class h71 implements o71 {
    public boolean a;
    public final /* synthetic */ cn b;

    public h71(cn cnVar, boolean z9) {
        this.b = cnVar;
        this.a = z9;
    }

    @Override // org.telegram.ui.o71
    public final boolean a() {
        return this.a;
    }

    @Override // org.telegram.ui.o71
    public final boolean a1() {
        return true;
    }

    @Override // org.telegram.ui.o71
    public final void t1(boolean z9) {
        boolean z10 = !this.a;
        this.a = z10;
        an anVar = this.b.za;
        anVar.r(anVar.f, anVar.g, z9, Boolean.valueOf(z10), false);
    }
}
