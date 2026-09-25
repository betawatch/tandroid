package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
