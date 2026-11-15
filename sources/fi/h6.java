package fi;

import org.telegram.messenger.ns;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class h6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k6 b;

    public /* synthetic */ h6(k6 k6Var, int i7) {
        this.a = i7;
        this.b = k6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        k6 k6Var = this.b;
        switch (i7) {
            case 0:
                ns.f(k6Var.c).k(ns.x5, k6Var);
                break;
            case 1:
                k6Var.u = false;
                k6Var.w = true;
                ns.f(k6Var.c).k(ns.x5, k6Var, Boolean.FALSE);
                break;
            case 2:
                k6Var.z = false;
                break;
            default:
                k6Var.k.clear();
                k6Var.d(true);
                break;
        }
    }
}
