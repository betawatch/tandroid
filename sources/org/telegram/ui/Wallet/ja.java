package org.telegram.ui.Wallet;

import org.telegram.messenger.gd;
import org.telegram.ui.Components.kc;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class ja implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ oa b;

    public /* synthetic */ ja(oa oaVar, int i7) {
        this.a = i7;
        this.b = oaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        oa oaVar = this.b;
        switch (i7) {
            case 0:
                oaVar.e0 = null;
                break;
            default:
                kc.b0(oaVar).N(gd.N0(2131745665, null), gd.N0(2131751093, null)).j();
                break;
        }
    }
}
