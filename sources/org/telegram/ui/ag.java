package org.telegram.ui;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class ag implements org.telegram.messenger.pr {
    public final /* synthetic */ int a;
    public final /* synthetic */ an b;

    public /* synthetic */ ag(an anVar, int i7) {
        this.a = i7;
        this.b = anVar;
    }

    @Override // org.telegram.messenger.pr
    public final void a(int i7) {
        switch (this.a) {
            case 0:
                an anVar = this.b;
                if (anVar.getParentActivity() != null && anVar.fragmentView != null && i7 > 0) {
                    org.telegram.ui.Components.cc.a0(anVar).m(org.telegram.ui.Components.bc.r, i7, 0, 0, anVar.Aa).j();
                    break;
                }
                break;
            case 1:
                an anVar2 = this.b;
                if (i7 != 0) {
                    anVar2.l(i7, 0, false, 0, true, 0);
                    break;
                } else {
                    anVar2.D6 = false;
                    anVar2.ka();
                    break;
                }
            default:
                an anVar3 = this.b;
                if (i7 != 0) {
                    anVar3.finishFragment();
                    break;
                } else {
                    anVar3.zd(true);
                    break;
                }
        }
    }
}
