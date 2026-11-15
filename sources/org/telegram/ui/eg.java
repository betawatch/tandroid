package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class eg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ an b;
    public final /* synthetic */ TLRPC.User c;

    public /* synthetic */ eg(an anVar, TLRPC.User user, int i7) {
        this.a = i7;
        this.b = anVar;
        this.c = user;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                an anVar = this.b;
                anVar.getClass();
                anVar.presentFragment(an.ua(this.c.id));
                break;
            default:
                this.b.Pa(this.c);
                break;
        }
    }
}
