package org.telegram.ui;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class oi extends gh.b {
    public final /* synthetic */ int s;
    public final /* synthetic */ an w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oi(an anVar, org.telegram.ui.ActionBar.f6 f6Var, int i7, int i10) {
        super(i7, f6Var);
        this.s = i10;
        this.w = anVar;
    }

    @Override // gh.b, gh.a
    public final int e1() {
        int i7;
        int i10;
        switch (this.s) {
            case 0:
                an anVar = this.w;
                i7 = ((org.telegram.ui.ActionBar.f2) anVar).currentAccount;
                if (!c8.g0.c(i7, anVar.xa)) {
                    return i0.a.o(anVar.getThemedColor(org.telegram.ui.ActionBar.k6.Ge), org.telegram.messenger.qs.e4);
                }
                ym ymVar = anVar.xa;
                if (ymVar == null || ymVar.a()) {
                    a();
                    return this.d;
                }
                a();
                return i0.a.o(this.d, org.telegram.messenger.qs.t3);
            case 1:
                return this.w.x.e1();
            default:
                an anVar2 = this.w;
                i10 = ((org.telegram.ui.ActionBar.f2) anVar2).currentAccount;
                if (!c8.g0.c(i10, anVar2.xa)) {
                    return i0.a.o(anVar2.getThemedColor(org.telegram.ui.ActionBar.k6.d6), org.telegram.messenger.qs.e4);
                }
                ym ymVar2 = anVar2.xa;
                if (ymVar2 == null || ymVar2.a()) {
                    a();
                    return this.d;
                }
                a();
                return i0.a.o(this.d, org.telegram.messenger.qs.t3);
        }
    }
}
