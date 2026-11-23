package org.telegram.messenger;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final /* synthetic */ class wz implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f00 b;
    public final /* synthetic */ long c;

    public /* synthetic */ wz(f00 f00Var, long j3, int i7) {
        this.a = i7;
        this.b = f00Var;
        this.c = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        long j3 = this.c;
        f00 f00Var = this.b;
        switch (i7) {
            case 0:
                f00Var.c.put(j3, 0);
                f00Var.getNotificationCenter().k(ls.t5, Long.valueOf(j3), Boolean.FALSE);
                break;
            default:
                f00Var.n(0, j3, false);
                break;
        }
    }
}
