package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final class hj extends gj {
    public final /* synthetic */ int u3;
    public final /* synthetic */ kj v3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hj(kj kjVar, int i7, TLRPC.TL_message tL_message, int i10) {
        super(i7, tL_message, true, false);
        this.v3 = kjVar;
        this.u3 = i10;
    }

    @Override // org.telegram.messenger.gj
    public final void n0(TLRPC.User user) {
        super.n0(user);
        if (this.u3 == 2) {
            this.v3.b(this);
        }
    }

    @Override // org.telegram.messenger.gj
    public final boolean n5() {
        if (this.v3.k) {
            return false;
        }
        return super.n5();
    }
}
