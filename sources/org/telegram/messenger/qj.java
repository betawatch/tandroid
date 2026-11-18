package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final /* synthetic */ class qj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ mp b;
    public final /* synthetic */ TLRPC.User c;

    public /* synthetic */ qj(mp mpVar, TLRPC.User user, int i7) {
        this.a = i7;
        this.b = mpVar;
        this.c = user;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                mp mpVar = this.b;
                mpVar.c3(this.c, mpVar.u1, true, null);
                break;
            case 1:
                this.b.r1.remove(Long.valueOf(this.c.id));
                break;
            default:
                this.b.getContactsController().a(this.c);
                break;
        }
    }
}
