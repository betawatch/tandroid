package org.telegram.ui;

import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
                zc.Z(zcVar);
                break;
            default:
                org.telegram.messenger.m5.n(null, 2131752260, org.telegram.ui.Components.cc.a0(zcVar), R.raw.done, 36);
                break;
        }
    }
}
