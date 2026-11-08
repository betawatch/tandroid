package org.telegram.ui;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fg implements org.telegram.messenger.sr {
    public final /* synthetic */ int a;
    public final /* synthetic */ an b;

    public /* synthetic */ fg(an anVar, int i7) {
        this.a = i7;
        this.b = anVar;
    }

    @Override // org.telegram.messenger.sr
    public final void a(int i7) {
        switch (this.a) {
            case 0:
                an anVar = this.b;
                if (anVar.getParentActivity() != null && anVar.fragmentView != null && i7 > 0) {
                    org.telegram.ui.Components.hc.a0(anVar).m(org.telegram.ui.Components.gc.r, i7, 0, 0, anVar.xa).j();
                    break;
                }
                break;
            case 1:
                an anVar2 = this.b;
                if (i7 != 0) {
                    anVar2.l(i7, 0, false, 0, true, 0);
                    break;
                } else {
                    anVar2.C6 = false;
                    anVar2.ha();
                    break;
                }
            default:
                an anVar3 = this.b;
                if (i7 != 0) {
                    anVar3.finishFragment();
                    break;
                } else {
                    anVar3.vd(true);
                    break;
                }
        }
    }
}
