package org.telegram.messenger;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class p00 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y00 b;
    public final /* synthetic */ long c;

    public /* synthetic */ p00(y00 y00Var, long j10, int i10) {
        this.a = i10;
        this.b = y00Var;
        this.c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        long j10 = this.c;
        y00 y00Var = this.b;
        switch (i10) {
            case 0:
                y00Var.c.put(j10, 0);
                y00Var.getNotificationCenter().k(at.q5, Long.valueOf(j10), Boolean.FALSE);
                break;
            default:
                y00Var.n(0, j10, false);
                break;
        }
    }
}
