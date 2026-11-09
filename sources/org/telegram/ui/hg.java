package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class hg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cn b;
    public final /* synthetic */ TLRPC.User c;

    public /* synthetic */ hg(cn cnVar, TLRPC.User user, int i7) {
        this.a = i7;
        this.b = cnVar;
        this.c = user;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                cn cnVar = this.b;
                cnVar.getClass();
                cnVar.presentFragment(cn.ta(this.c.id));
                break;
            default:
                this.b.Oa(this.c);
                break;
        }
    }
}
