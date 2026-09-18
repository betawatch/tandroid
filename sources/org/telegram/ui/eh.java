package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class eh implements MessagesStorage.IntCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ bo b;

    public /* synthetic */ eh(bo boVar, int i10) {
        this.a = i10;
        this.b = boVar;
    }

    @Override // org.telegram.messenger.MessagesStorage.IntCallback
    public final void run(int i10) {
        switch (this.a) {
            case 0:
                bo boVar = this.b;
                if (boVar.getParentActivity() != null && boVar.fragmentView != null && i10 > 0) {
                    org.telegram.ui.Components.vc.a0(boVar).m(org.telegram.ui.Components.uc.r, i10, 0, 0, boVar.ea).j();
                    break;
                }
                break;
            case 1:
                bo boVar2 = this.b;
                if (i10 != 0) {
                    boVar2.F(i10, 0, 0, 0, false, true);
                    break;
                } else {
                    boVar2.m6 = false;
                    boVar2.H9();
                    break;
                }
            default:
                bo boVar3 = this.b;
                if (i10 != 0) {
                    boVar3.finishFragment();
                    break;
                } else {
                    boVar3.Qc(true);
                    break;
                }
        }
    }
}
