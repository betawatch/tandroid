package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class gj extends fj {
    public final /* synthetic */ int u3;
    public final /* synthetic */ jj v3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gj(jj jjVar, int i7, TLRPC.TL_message tL_message, int i10) {
        super(i7, tL_message, true, false);
        this.v3 = jjVar;
        this.u3 = i10;
    }

    @Override // org.telegram.messenger.fj
    public final void n0(TLRPC.User user) {
        super.n0(user);
        if (this.u3 == 2) {
            this.v3.b(this);
        }
    }

    @Override // org.telegram.messenger.fj
    public final boolean n5() {
        if (this.v3.k) {
            return false;
        }
        return super.n5();
    }
}
