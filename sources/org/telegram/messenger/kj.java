package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class kj extends jj {
    public final /* synthetic */ int p3;
    public final /* synthetic */ nj q3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kj(nj njVar, int i10, TLRPC.TL_message tL_message, int i11) {
        super(i10, tL_message, true, false);
        this.q3 = njVar;
        this.p3 = i11;
    }

    @Override // org.telegram.messenger.jj
    public final void n0(TLRPC.User user) {
        super.n0(user);
        if (this.p3 == 2) {
            this.q3.b(this);
        }
    }

    @Override // org.telegram.messenger.jj
    public final boolean n5() {
        if (this.q3.k) {
            return false;
        }
        return super.n5();
    }
}
