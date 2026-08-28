package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qn b;
    public final /* synthetic */ TLRPC.User c;

    public /* synthetic */ hg(qn qnVar, TLRPC.User user, int i9) {
        this.a = i9;
        this.b = qnVar;
        this.c = user;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                qn qnVar = this.b;
                qnVar.getClass();
                qnVar.presentFragment(qn.R9(this.c.id));
                break;
            default:
                this.b.ma(this.c);
                break;
        }
    }
}
