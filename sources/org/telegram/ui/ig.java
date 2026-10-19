package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class ig implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qn b;
    public final /* synthetic */ TLRPC.User c;

    public /* synthetic */ ig(qn qnVar, TLRPC.User user, int i10) {
        this.a = i10;
        this.b = qnVar;
        this.c = user;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                qn qnVar = this.b;
                qnVar.getClass();
                qnVar.presentFragment(qn.W9(this.c.id));
                break;
            default:
                this.b.ra(this.c);
                break;
        }
    }
}
