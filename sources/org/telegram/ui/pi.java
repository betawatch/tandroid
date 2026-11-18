package org.telegram.ui;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class pi extends gh.b {
    public final /* synthetic */ int s;
    public final /* synthetic */ bn w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pi(bn bnVar, org.telegram.ui.ActionBar.i6 i6Var, int i7, int i10) {
        super(i7, i6Var);
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
                i7 = ((org.telegram.ui.ActionBar.h2) bnVar).currentAccount;
                if (!c8.i0.d(i7, bnVar.Ba)) {
                    return i0.a.o(bnVar.getThemedColor(org.telegram.ui.ActionBar.n6.Je), org.telegram.messenger.ks.e4);
                }
                zm zmVar = bnVar.Ba;
                if (zmVar == null || zmVar.d()) {
                    a();
                    return this.d;
                }
                a();
                return i0.a.o(this.d, org.telegram.messenger.ks.t3);
            case 1:
                return this.w.x.A2();
            default:
                bn bnVar2 = this.w;
                i10 = ((org.telegram.ui.ActionBar.h2) bnVar2).currentAccount;
                if (!c8.i0.d(i10, bnVar2.Ba)) {
                    return i0.a.o(bnVar2.getThemedColor(org.telegram.ui.ActionBar.n6.d6), org.telegram.messenger.ks.e4);
                }
                zm zmVar2 = bnVar2.Ba;
                if (zmVar2 == null || zmVar2.d()) {
                    a();
                    return this.d;
                }
                a();
                return i0.a.o(this.d, org.telegram.messenger.ks.t3);
        }
    }
}
