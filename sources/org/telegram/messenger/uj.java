package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final /* synthetic */ class uj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qp b;
    public final /* synthetic */ TLRPC.User c;

    public /* synthetic */ uj(qp qpVar, TLRPC.User user, int i7) {
        this.a = i7;
        this.b = qpVar;
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
