package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class dh implements MessagesStorage.IntCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ eo b;

    public /* synthetic */ dh(eo eoVar, int i10) {
        this.a = i10;
        this.b = eoVar;
    }

    @Override // org.telegram.messenger.MessagesStorage.IntCallback
    public final void run(int i10) {
        switch (this.a) {
            case 0:
                eo eoVar = this.b;
                if (eoVar.getParentActivity() != null && eoVar.fragmentView != null && i10 > 0) {
                    org.telegram.ui.Components.wc.a0(eoVar).m(org.telegram.ui.Components.vc.r, i10, 0, 0, eoVar.ea).j();
                    break;
                }
                break;
            case 1:
                eo eoVar2 = this.b;
                if (i10 != 0) {
                    eoVar2.E(i10, 0, 0, 0, false, true);
                    break;
                } else {
                    eoVar2.m6 = false;
                    eoVar2.H9();
                    break;
                }
            default:
                eo eoVar3 = this.b;
                if (i10 != 0) {
                    eoVar3.finishFragment();
                    break;
                } else {
                    eoVar3.Qc(true);
                    break;
                }
        }
    }
}
