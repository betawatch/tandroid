package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wn b;
    public final /* synthetic */ TLRPC.User c;

    public /* synthetic */ mg(wn wnVar, TLRPC.User user, int i10) {
        this.a = i10;
        this.b = wnVar;
        this.c = user;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                wn wnVar = this.b;
                wnVar.getClass();
                wnVar.presentFragment(wn.R9(this.c.id));
                break;
            default:
                this.b.ma(this.c);
                break;
        }
    }
}
