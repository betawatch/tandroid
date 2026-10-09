package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bh implements MessagesStorage.IntCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ zn b;

    public /* synthetic */ bh(zn znVar, int i10) {
        this.a = i10;
        this.b = znVar;
    }

    @Override // org.telegram.messenger.MessagesStorage.IntCallback
    public final void run(int i10) {
        switch (this.a) {
            case 0:
                zn znVar = this.b;
                if (znVar.getParentActivity() != null && znVar.fragmentView != null && i10 > 0) {
                    org.telegram.ui.Components.ad.a0(znVar).m(org.telegram.ui.Components.zc.r, i10, 0, 0, znVar.ea).j();
                    break;
                }
                break;
            case 1:
                zn znVar2 = this.b;
                if (i10 != 0) {
                    znVar2.F(i10, 0, 0, 0, false, true);
                    break;
                } else {
                    znVar2.m6 = false;
                    znVar2.M9();
                    break;
                }
            default:
                zn znVar3 = this.b;
                if (i10 != 0) {
                    znVar3.finishFragment();
                    break;
                } else {
                    znVar3.Uc(true);
                    break;
                }
        }
    }
}
