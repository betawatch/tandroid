package org.telegram.ui;

import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class dc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zc b;

    public /* synthetic */ dc(zc zcVar, int i10) {
        this.a = i10;
        this.b = zcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        zc zcVar = this.b;
        switch (i10) {
            case 0:
                zc.Y(zcVar);
                break;
            default:
                org.telegram.messenger.m5.n(null, 2131752260, org.telegram.ui.Components.cc.a0(zcVar), R.raw.done, 36);
                break;
        }
    }
}
