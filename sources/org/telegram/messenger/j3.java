package org.telegram.messenger;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final /* synthetic */ class j3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r3 b;

    public /* synthetic */ j3(r3 r3Var, int i7) {
        this.a = i7;
        this.b = r3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        int i10 = 2;
        r3 r3Var = this.b;
        switch (i7) {
            case 0:
                qs.f(r3Var.C.a).k(qs.w2, Long.valueOf(r3Var.c), Long.valueOf(r3Var.b.id), Boolean.FALSE);
                break;
            case 1:
                r3Var.E = false;
                r3Var.d();
                qs.f(r3Var.C.a).k(qs.C2, new Object[0]);
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
