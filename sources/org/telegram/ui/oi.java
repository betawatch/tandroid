package org.telegram.ui;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class oi extends gh.b {
    public final /* synthetic */ int s;
    public final /* synthetic */ an w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oi(an anVar, org.telegram.ui.ActionBar.e6 e6Var, int i7, int i10) {
        super(i7, e6Var);
        this.s = i10;
        this.w = anVar;
    }

    @Override // gh.b, gh.a
    public final int A2() {
        int i7;
        int i10;
        switch (this.s) {
            case 0:
                an anVar = this.w;
                i7 = ((org.telegram.ui.ActionBar.e2) anVar).currentAccount;
                if (!c8.g0.c(i7, anVar.Aa)) {
                    return i0.a.o(anVar.getThemedColor(org.telegram.ui.ActionBar.j6.Je), org.telegram.messenger.ns.e4);
                }
                ym ymVar = anVar.Aa;
                if (ymVar == null || ymVar.a()) {
                    a();
                    return this.d;
                }
                a();
                return i0.a.o(this.d, org.telegram.messenger.ns.t3);
            case 1:
                return this.w.x.A2();
            default:
                an anVar2 = this.w;
                i10 = ((org.telegram.ui.ActionBar.e2) anVar2).currentAccount;
                if (!c8.g0.c(i10, anVar2.Aa)) {
                    return i0.a.o(anVar2.getThemedColor(org.telegram.ui.ActionBar.j6.d6), org.telegram.messenger.ns.e4);
                }
                ym ymVar2 = anVar2.Aa;
                if (ymVar2 == null || ymVar2.a()) {
                    a();
                    return this.d;
                }
                a();
                return i0.a.o(this.d, org.telegram.messenger.ns.t3);
        }
    }
}
