package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class lj extends kj {
    public final /* synthetic */ int p3;
    public final /* synthetic */ oj q3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lj(oj ojVar, int i10, TLRPC.TL_message tL_message, int i11) {
        super(i10, tL_message, true, false);
        this.q3 = ojVar;
        this.p3 = i11;
    }

    @Override // org.telegram.messenger.kj
    public final void n0(TLRPC.User user) {
        super.n0(user);
        if (this.p3 == 2) {
            this.q3.b(this);
        }
    }

    @Override // org.telegram.messenger.kj
    public final boolean n5() {
        if (this.q3.k) {
            return false;
        }
        return super.n5();
    }
}
