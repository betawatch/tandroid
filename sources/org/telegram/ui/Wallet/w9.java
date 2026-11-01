package org.telegram.ui.Wallet;

import org.telegram.messenger.dd;
import org.telegram.ui.Components.cc;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
                cc.a0(baVar).N(dd.L0(2131745878, null), dd.L0(2131751106, null)).j();
                break;
        }
    }
}
