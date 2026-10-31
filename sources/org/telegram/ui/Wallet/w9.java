package org.telegram.ui.Wallet;

import org.telegram.messenger.cd;
import org.telegram.ui.Components.cc;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class w9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ba b;

    public /* synthetic */ w9(ba baVar, int i10) {
        this.a = i10;
        this.b = baVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        ba baVar = this.b;
        switch (i10) {
            case 0:
                baVar.d0 = null;
                break;
            default:
                cc.a0(baVar).N(cd.L0(2131745878, null), cd.L0(2131751106, null)).j();
                break;
        }
    }
}
