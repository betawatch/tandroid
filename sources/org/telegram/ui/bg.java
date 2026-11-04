package org.telegram.ui;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bg implements org.telegram.messenger.kr {
    public final /* synthetic */ int a;
    public final /* synthetic */ wm b;

    public /* synthetic */ bg(wm wmVar, int i3) {
        this.a = i3;
        this.b = wmVar;
    }

    @Override // org.telegram.messenger.kr
    public final void a(int i3) {
        switch (this.a) {
            case 0:
                wm wmVar = this.b;
                if (wmVar.getParentActivity() != null && wmVar.fragmentView != null && i3 > 0) {
                    org.telegram.ui.Components.fc.a0(wmVar).m(org.telegram.ui.Components.ec.r, i3, 0, 0, wmVar.ya).j();
                    break;
                }
                break;
            case 1:
                wm wmVar2 = this.b;
                if (i3 != 0) {
                    wmVar2.l(i3, 0, false, 0, true, 0);
                    break;
                } else {
                    wmVar2.D6 = false;
                    wmVar2.ha();
                    break;
                }
            default:
                wm wmVar3 = this.b;
                if (i3 != 0) {
                    wmVar3.finishFragment();
                    break;
                } else {
                    wmVar3.vd(true);
                    break;
                }
        }
    }
}
