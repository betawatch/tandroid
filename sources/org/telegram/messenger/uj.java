package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
