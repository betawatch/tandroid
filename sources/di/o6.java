package di;

import org.telegram.messenger.qs;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class o6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r6 b;

    public /* synthetic */ o6(r6 r6Var, int i7) {
        this.a = i7;
        this.b = r6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        r6 r6Var = this.b;
        switch (i7) {
            case 0:
                qs.f(r6Var.c).k(qs.x5, r6Var);
                break;
            case 1:
                r6Var.u = false;
                r6Var.w = true;
                qs.f(r6Var.c).k(qs.x5, r6Var, Boolean.FALSE);
                break;
            case 2:
                r6Var.z = false;
                break;
            default:
                r6Var.k.clear();
                r6Var.d(true);
                break;
        }
    }
}
