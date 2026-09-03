package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ng implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zn b;
    public final /* synthetic */ TLRPC.User c;

    public /* synthetic */ ng(zn znVar, TLRPC.User user, int i10) {
        this.a = i10;
        this.b = znVar;
        this.c = user;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                zn znVar = this.b;
                znVar.getClass();
                znVar.presentFragment(zn.R9(this.c.id));
                break;
            default:
                this.b.ma(this.c);
                break;
        }
    }
}
