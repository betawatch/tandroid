package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
