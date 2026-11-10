package org.telegram.ui;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class i71 implements p71 {
    public boolean a;
    public final /* synthetic */ cn b;

    public i71(cn cnVar, boolean z9) {
        this.b = cnVar;
        this.a = z9;
    }

    @Override // org.telegram.ui.p71
    public final boolean a() {
        return this.a;
    }

    @Override // org.telegram.ui.p71
    public final boolean a1() {
        return true;
    }

    @Override // org.telegram.ui.p71
    public final void t1(boolean z9) {
        boolean z10 = !this.a;
        this.a = z10;
        an anVar = this.b.za;
        anVar.r(anVar.f, anVar.g, z9, Boolean.valueOf(z10), false);
    }
}
