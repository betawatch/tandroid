package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class jj extends ij {
    public final /* synthetic */ int s3;
    public final /* synthetic */ mj t3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jj(mj mjVar, int i7, TLRPC.TL_message tL_message, int i10) {
        super(i7, tL_message, true, false);
        this.t3 = mjVar;
        this.s3 = i10;
    }

    @Override // org.telegram.messenger.ij
    public final void n0(TLRPC.User user) {
        super.n0(user);
        if (this.s3 == 2) {
            this.t3.b(this);
        }
    }

    @Override // org.telegram.messenger.ij
    public final boolean n5() {
        if (this.t3.k) {
            return false;
        }
        return super.n5();
    }
}
