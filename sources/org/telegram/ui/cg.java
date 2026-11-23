package org.telegram.ui;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cg implements org.telegram.messenger.or {
    public final /* synthetic */ int a;
    public final /* synthetic */ bn b;

    public /* synthetic */ cg(bn bnVar, int i7) {
        this.a = i7;
        this.b = bnVar;
    }

    @Override // org.telegram.messenger.or
    public final void a(int i7) {
        switch (this.a) {
            case 0:
                bn bnVar = this.b;
                if (bnVar.getParentActivity() != null && bnVar.fragmentView != null && i7 > 0) {
                    org.telegram.ui.Components.lc.b0(bnVar).m(org.telegram.ui.Components.kc.r, i7, 0, 0, bnVar.Ba).j();
                    break;
                }
                break;
            case 1:
                bn bnVar2 = this.b;
                if (i7 != 0) {
                    bnVar2.l(i7, 0, false, 0, true, 0);
                    break;
                } else {
                    bnVar2.E6 = false;
                    bnVar2.ka();
                    break;
                }
            default:
                bn bnVar3 = this.b;
                if (i7 != 0) {
                    bnVar3.finishFragment();
                    break;
                } else {
                    bnVar3.zd(true);
                    break;
                }
        }
    }
}
