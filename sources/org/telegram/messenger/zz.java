package org.telegram.messenger;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final /* synthetic */ class zz implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h00 b;
    public final /* synthetic */ long c;

    public /* synthetic */ zz(h00 h00Var, long j3, int i7) {
        this.a = i7;
        this.b = h00Var;
        this.c = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        long j3 = this.c;
        h00 h00Var = this.b;
        switch (i7) {
            case 0:
                h00Var.c.put(j3, 0);
                h00Var.getNotificationCenter().k(ns.q5, Long.valueOf(j3), Boolean.FALSE);
                break;
            default:
                h00Var.n(0, j3, false);
                break;
        }
    }
}
