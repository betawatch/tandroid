package org.telegram.ui;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class dg implements org.telegram.messenger.sr {
    public final /* synthetic */ int a;
    public final /* synthetic */ cn b;

    public /* synthetic */ dg(cn cnVar, int i7) {
        this.a = i7;
        this.b = cnVar;
    }

    @Override // org.telegram.messenger.sr
    public final void a(int i7) {
        switch (this.a) {
            case 0:
                cn cnVar = this.b;
                if (cnVar.getParentActivity() != null && cnVar.fragmentView != null && i7 > 0) {
                    org.telegram.ui.Components.hc.a0(cnVar).m(org.telegram.ui.Components.gc.r, i7, 0, 0, cnVar.za).j();
                    break;
                }
                break;
            case 1:
                cn cnVar2 = this.b;
                if (i7 != 0) {
                    cnVar2.l(i7, 0, false, 0, true, 0);
                    break;
                } else {
                    cnVar2.C6 = false;
                    cnVar2.ja();
                    break;
                }
            default:
                cn cnVar3 = this.b;
                if (i7 != 0) {
                    cnVar3.finishFragment();
                    break;
                } else {
                    cnVar3.yd(true);
                    break;
                }
        }
    }
}
