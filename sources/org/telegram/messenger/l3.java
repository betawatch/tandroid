package org.telegram.messenger;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final /* synthetic */ class l3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t3 b;

    public /* synthetic */ l3(t3 t3Var, int i7) {
        this.a = i7;
        this.b = t3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        int i10 = 2;
        t3 t3Var = this.b;
        switch (i7) {
            case 0:
                ks.f(t3Var.C.a).k(ks.w2, Long.valueOf(t3Var.c), Long.valueOf(t3Var.b.id), Boolean.FALSE);
                break;
            case 1:
                t3Var.E = false;
                t3Var.d();
                ks.f(t3Var.C.a).k(ks.C2, new Object[0]);
                break;
            default:
                t3Var.M = null;
                if (t3Var.I != 0 && System.currentTimeMillis() - t3Var.I >= 1500) {
                    if (s2.a) {
                        a8.b("QUEUE GROUP CALL UPDATES WAIT TIMEOUT - CHECK QUEUE");
                    }
                    t3Var.r();
                }
                if (!t3Var.H.isEmpty()) {
                    l3 l3Var = new l3(t3Var, i10);
                    t3Var.M = l3Var;
                    g0.h3(l3Var, 1000L);
                    break;
                }
                break;
        }
    }
}
