package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class yj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vp b;
    public final /* synthetic */ TLRPC.User c;

    public /* synthetic */ yj(vp vpVar, TLRPC.User user, int i10) {
        this.a = i10;
        this.b = vpVar;
        this.c = user;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.q1.remove(Long.valueOf(this.c.id));
                break;
            default:
                this.b.getContactsController().a(this.c);
                break;
        }
    }
}
