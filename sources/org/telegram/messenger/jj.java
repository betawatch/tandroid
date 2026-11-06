package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
    public final boolean o5() {
        if (this.t3.k) {
            return false;
        }
        return super.o5();
    }
}
