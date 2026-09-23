package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class ah implements MessagesStorage.IntCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ xn b;

    public /* synthetic */ ah(xn xnVar, int i10) {
        this.a = i10;
        this.b = xnVar;
    }

    @Override // org.telegram.messenger.MessagesStorage.IntCallback
    public final void run(int i10) {
        switch (this.a) {
            case 0:
                xn xnVar = this.b;
                if (xnVar.getParentActivity() != null && xnVar.fragmentView != null && i10 > 0) {
                    org.telegram.ui.Components.xc.a0(xnVar).m(org.telegram.ui.Components.wc.r, i10, 0, 0, xnVar.ea).j();
                    break;
                }
                break;
            case 1:
                xn xnVar2 = this.b;
                if (i10 != 0) {
                    xnVar2.F(i10, 0, 0, 0, false, true);
                    break;
                } else {
                    xnVar2.m6 = false;
                    xnVar2.H9();
                    break;
                }
            default:
                xn xnVar3 = this.b;
                if (i10 != 0) {
                    xnVar3.finishFragment();
                    break;
                } else {
                    xnVar3.Qc(true);
                    break;
                }
        }
    }
}
