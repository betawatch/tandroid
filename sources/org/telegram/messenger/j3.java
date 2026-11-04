package org.telegram.messenger;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class j3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r3 b;

    public /* synthetic */ j3(r3 r3Var, int i3) {
        this.a = i3;
        this.b = r3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        int i10 = 2;
        r3 r3Var = this.b;
        switch (i3) {
            case 0:
                hs.f(r3Var.C.a).k(hs.w2, Long.valueOf(r3Var.c), Long.valueOf(r3Var.b.id), Boolean.FALSE);
                break;
            case 1:
                r3Var.E = false;
                r3Var.d();
                hs.f(r3Var.C.a).k(hs.C2, new Object[0]);
                break;
            default:
                r3Var.M = null;
                if (r3Var.I != 0 && System.currentTimeMillis() - r3Var.I >= 1500) {
                    if (r2.a) {
                        a8.b("QUEUE GROUP CALL UPDATES WAIT TIMEOUT - CHECK QUEUE");
                    }
                    r3Var.r();
                }
                if (!r3Var.H.isEmpty()) {
                    j3 j3Var = new j3(r3Var, i10);
                    r3Var.M = j3Var;
                    g0.i3(j3Var, 1000L);
                    break;
                }
                break;
        }
    }
}
