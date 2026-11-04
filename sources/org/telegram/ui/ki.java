package org.telegram.ui;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ki extends hh.b {
    public final /* synthetic */ int s;
    public final /* synthetic */ wm w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ki(wm wmVar, org.telegram.ui.ActionBar.e6 e6Var, int i3, int i10) {
        super(i3, e6Var);
        this.s = i10;
        this.w = wmVar;
    }

    @Override // hh.b, hh.a
    public final int w0() {
        int i3;
        int i10;
        switch (this.s) {
            case 0:
                wm wmVar = this.w;
                i3 = ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount;
                if (!b8.cd.c(i3, wmVar.ya)) {
                    return i0.a.o(wmVar.getThemedColor(org.telegram.ui.ActionBar.k6.Ge), org.telegram.messenger.hs.e4);
                }
                um umVar = wmVar.ya;
                if (umVar == null || umVar.a()) {
                    a();
                    return this.d;
                }
                a();
                return i0.a.o(this.d, org.telegram.messenger.hs.t3);
            case 1:
                return this.w.x.w0();
            default:
                wm wmVar2 = this.w;
                i10 = ((org.telegram.ui.ActionBar.d2) wmVar2).currentAccount;
                if (!b8.cd.c(i10, wmVar2.ya)) {
                    return i0.a.o(wmVar2.getThemedColor(org.telegram.ui.ActionBar.k6.d6), org.telegram.messenger.hs.e4);
                }
                um umVar2 = wmVar2.ya;
                if (umVar2 == null || umVar2.a()) {
                    a();
                    return this.d;
                }
                a();
                return i0.a.o(this.d, org.telegram.messenger.hs.t3);
        }
    }
}
