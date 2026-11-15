package org.telegram.messenger;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
