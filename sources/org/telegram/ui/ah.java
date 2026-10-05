package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ah implements MessagesStorage.IntCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ yn b;

    public /* synthetic */ ah(yn ynVar, int i10) {
        this.a = i10;
        this.b = ynVar;
    }

    @Override // org.telegram.messenger.MessagesStorage.IntCallback
    public final void run(int i10) {
        switch (this.a) {
            case 0:
                yn ynVar = this.b;
                if (ynVar.getParentActivity() != null && ynVar.fragmentView != null && i10 > 0) {
                    org.telegram.ui.Components.yc.a0(ynVar).m(org.telegram.ui.Components.xc.r, i10, 0, 0, ynVar.ca).j();
                    break;
                }
                break;
            case 1:
                yn ynVar2 = this.b;
                if (i10 != 0) {
                    ynVar2.finishFragment();
                    break;
                } else {
                    ynVar2.Pc(true);
                    break;
                }
            default:
                yn ynVar3 = this.b;
                if (i10 != 0) {
                    ynVar3.D(i10, 0, 0, 0, false, true);
                    break;
                } else {
                    ynVar3.k6 = false;
                    ynVar3.G9();
                    break;
                }
        }
    }
}
