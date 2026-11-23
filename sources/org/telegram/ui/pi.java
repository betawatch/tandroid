package org.telegram.ui;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class pi extends gh.b {
    public final /* synthetic */ int s;
    public final /* synthetic */ bn w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pi(bn bnVar, org.telegram.ui.ActionBar.h6 h6Var, int i7, int i10) {
        super(i7, h6Var);
        this.s = i10;
        this.w = bnVar;
    }

    @Override // gh.b, gh.a
    public final int A2() {
        int i7;
        int i10;
        switch (this.s) {
            case 0:
                bn bnVar = this.w;
                i7 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
                if (!c8.i0.d(i7, bnVar.Ba)) {
                    return i0.a.o(bnVar.getThemedColor(org.telegram.ui.ActionBar.m6.Je), org.telegram.messenger.ls.e4);
                }
                zm zmVar = bnVar.Ba;
                if (zmVar == null || zmVar.d()) {
                    a();
                    return this.d;
                }
                a();
                return i0.a.o(this.d, org.telegram.messenger.ls.t3);
            case 1:
                return this.w.x.A2();
            default:
                bn bnVar2 = this.w;
                i10 = ((org.telegram.ui.ActionBar.g2) bnVar2).currentAccount;
                if (!c8.i0.d(i10, bnVar2.Ba)) {
                    return i0.a.o(bnVar2.getThemedColor(org.telegram.ui.ActionBar.m6.d6), org.telegram.messenger.ls.e4);
                }
                zm zmVar2 = bnVar2.Ba;
                if (zmVar2 == null || zmVar2.d()) {
                    a();
                    return this.d;
                }
                a();
                return i0.a.o(this.d, org.telegram.messenger.ls.t3);
        }
    }
}
