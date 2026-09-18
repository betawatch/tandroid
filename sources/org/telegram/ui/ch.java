package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ch implements MessagesStorage.IntCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ zn b;

    public /* synthetic */ ch(zn znVar, int i10) {
        this.a = i10;
        this.b = znVar;
    }

    @Override // org.telegram.messenger.MessagesStorage.IntCallback
    public final void run(int i10) {
        switch (this.a) {
            case 0:
                zn znVar = this.b;
                if (znVar.getParentActivity() != null && znVar.fragmentView != null && i10 > 0) {
                    org.telegram.ui.Components.xc.a0(znVar).m(org.telegram.ui.Components.wc.r, i10, 0, 0, znVar.ea).j();
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
                    znVar2.H9();
                    break;
                }
            default:
                zn znVar3 = this.b;
                if (i10 != 0) {
                    znVar3.finishFragment();
                    break;
                } else {
                    znVar3.Qc(true);
                    break;
                }
        }
    }
}
