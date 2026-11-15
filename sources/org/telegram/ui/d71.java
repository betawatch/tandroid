package org.telegram.ui;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
