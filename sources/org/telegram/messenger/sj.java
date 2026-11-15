package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class sj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ np b;
    public final /* synthetic */ TLRPC.User c;

    public /* synthetic */ sj(np npVar, TLRPC.User user, int i7) {
        this.a = i7;
        this.b = npVar;
        this.c = user;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.r1.remove(Long.valueOf(this.c.id));
                break;
            default:
                this.b.getContactsController().a(this.c);
                break;
        }
    }
}
