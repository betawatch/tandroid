package org.telegram.messenger;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final /* synthetic */ class vz implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e00 b;
    public final /* synthetic */ long c;

    public /* synthetic */ vz(e00 e00Var, long j3, int i7) {
        this.a = i7;
        this.b = e00Var;
        this.c = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        long j3 = this.c;
        e00 e00Var = this.b;
        switch (i7) {
            case 0:
                e00Var.c.put(j3, 0);
                e00Var.getNotificationCenter().k(ks.t5, Long.valueOf(j3), Boolean.FALSE);
                break;
            default:
                e00Var.n(0, j3, false);
                break;
        }
    }
}
