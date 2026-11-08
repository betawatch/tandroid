package org.telegram.messenger;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final /* synthetic */ class c00 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k00 b;
    public final /* synthetic */ long c;

    public /* synthetic */ c00(k00 k00Var, long j3, int i7) {
        this.a = i7;
        this.b = k00Var;
        this.c = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        long j3 = this.c;
        k00 k00Var = this.b;
        switch (i7) {
            case 0:
                k00Var.c.put(j3, 0);
                k00Var.getNotificationCenter().k(qs.q5, Long.valueOf(j3), Boolean.FALSE);
                break;
            default:
                k00Var.n(0, j3, false);
                break;
        }
    }
}
