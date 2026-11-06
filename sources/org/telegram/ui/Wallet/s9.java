package org.telegram.ui.Wallet;

import org.telegram.messenger.hd;
import org.telegram.ui.Components.hc;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x9 b;

    public /* synthetic */ s9(x9 x9Var, int i7) {
        this.a = i7;
        this.b = x9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        x9 x9Var = this.b;
        switch (i7) {
            case 0:
                x9Var.d0 = null;
                break;
            default:
                hc.a0(x9Var).N(hd.M0(2131745862, null), hd.M0(2131751106, null)).j();
                break;
        }
    }
}
