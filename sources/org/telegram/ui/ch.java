package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class ch implements MessagesStorage.IntCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ co b;

    public /* synthetic */ ch(co coVar, int i10) {
        this.a = i10;
        this.b = coVar;
    }

    @Override // org.telegram.messenger.MessagesStorage.IntCallback
    public final void run(int i10) {
        switch (this.a) {
            case 0:
                co coVar = this.b;
                if (coVar.getParentActivity() != null && coVar.fragmentView != null && i10 > 0) {
                    org.telegram.ui.Components.yc.a0(coVar).m(org.telegram.ui.Components.xc.r, i10, 0, 0, coVar.ea).j();
                    break;
                }
                break;
            case 1:
                co coVar2 = this.b;
                if (i10 != 0) {
                    coVar2.F(i10, 0, 0, 0, false, true);
                    break;
                } else {
                    coVar2.m6 = false;
                    coVar2.H9();
                    break;
                }
            default:
                co coVar3 = this.b;
                if (i10 != 0) {
                    coVar3.finishFragment();
                    break;
                } else {
                    coVar3.Qc(true);
                    break;
                }
        }
    }
}
