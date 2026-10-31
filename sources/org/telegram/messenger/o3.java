package org.telegram.messenger;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class o3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u3 b;

    public /* synthetic */ o3(u3 u3Var, int i10) {
        this.a = i10;
        this.b = u3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        int i11 = 2;
        u3 u3Var = this.b;
        switch (i10) {
            case 0:
                zs.f(u3Var.C.a).k(zs.w2, Long.valueOf(u3Var.c), Long.valueOf(u3Var.b.id), Boolean.FALSE);
                break;
            case 1:
                u3Var.E = false;
                u3Var.d();
                zs.f(u3Var.C.a).k(zs.C2, new Object[0]);
                break;
            default:
                u3Var.M = null;
                if (u3Var.I != 0 && System.currentTimeMillis() - u3Var.I >= 1500) {
                    if (v2.a) {
                        f8.b("QUEUE GROUP CALL UPDATES WAIT TIMEOUT - CHECK QUEUE");
                    }
                    u3Var.r();
                }
                if (!u3Var.H.isEmpty()) {
                    o3 o3Var = new o3(u3Var, i11);
                    u3Var.M = o3Var;
                    i0.h3(o3Var, 1000L);
                    break;
                }
                break;
        }
    }
}
