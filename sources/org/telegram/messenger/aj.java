package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class aj extends zi {
    public final /* synthetic */ int s3;
    public final /* synthetic */ dj t3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aj(dj djVar, int i3, TLRPC.TL_message tL_message, int i10) {
        super(i3, tL_message, true, false);
        this.t3 = djVar;
        this.s3 = i10;
    }

    @Override // org.telegram.messenger.zi
    public final void n0(TLRPC.User user) {
        super.n0(user);
        if (this.s3 == 2) {
            this.t3.b(this);
        }
    }

    @Override // org.telegram.messenger.zi
    public final boolean o5() {
        if (this.t3.k) {
            return false;
        }
        return super.o5();
    }
}
