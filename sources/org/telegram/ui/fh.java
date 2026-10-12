package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class fh implements MessagesStorage.IntCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ fo b;

    public /* synthetic */ fh(fo foVar, int i10) {
        this.a = i10;
        this.b = foVar;
    }

    @Override // org.telegram.messenger.MessagesStorage.IntCallback
    public final void run(int i10) {
        switch (this.a) {
            case 0:
                fo foVar = this.b;
                if (foVar.getParentActivity() != null && foVar.fragmentView != null && i10 > 0) {
                    org.telegram.ui.Components.zc.a0(foVar).m(org.telegram.ui.Components.yc.r, i10, 0, 0, foVar.ea).j();
                    break;
                }
                break;
            case 1:
                fo foVar2 = this.b;
                if (i10 != 0) {
                    foVar2.j(i10, 0, false, 0, true, 0);
                    break;
                } else {
                    foVar2.m6 = false;
                    foVar2.M9();
                    break;
                }
            default:
                fo foVar3 = this.b;
                if (i10 != 0) {
                    foVar3.finishFragment();
                    break;
                } else {
                    foVar3.Uc(true);
                    break;
                }
        }
    }
}
