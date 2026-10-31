package org.telegram.messenger;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class o00 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x00 b;
    public final /* synthetic */ long c;

    public /* synthetic */ o00(x00 x00Var, long j10, int i10) {
        this.a = i10;
        this.b = x00Var;
        this.c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        long j10 = this.c;
        x00 x00Var = this.b;
        switch (i10) {
            case 0:
                x00Var.c.put(j10, 0);
                x00Var.getNotificationCenter().k(zs.q5, Long.valueOf(j10), Boolean.FALSE);
                break;
            default:
                x00Var.n(0, j10, false);
                break;
        }
    }
}
