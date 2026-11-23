package org.telegram.ui;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class cg implements org.telegram.messenger.nr {
    public final /* synthetic */ int a;
    public final /* synthetic */ bn b;

    public /* synthetic */ cg(bn bnVar, int i7) {
        this.a = i7;
        this.b = bnVar;
    }

    @Override // org.telegram.messenger.nr
    public final void a(int i7) {
        switch (this.a) {
            case 0:
                bn bnVar = this.b;
                if (bnVar.getParentActivity() != null && bnVar.fragmentView != null && i7 > 0) {
                    org.telegram.ui.Components.kc.b0(bnVar).m(org.telegram.ui.Components.jc.r, i7, 0, 0, bnVar.Ba).j();
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
