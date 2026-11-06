package di;

import org.telegram.messenger.qs;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q6 b;

    public /* synthetic */ n6(q6 q6Var, int i7) {
        this.a = i7;
        this.b = q6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        q6 q6Var = this.b;
        switch (i7) {
            case 0:
                qs.f(q6Var.c).k(qs.x5, q6Var);
                break;
            case 1:
                q6Var.u = false;
                q6Var.w = true;
                qs.f(q6Var.c).k(qs.x5, q6Var, Boolean.FALSE);
                break;
            case 2:
                q6Var.z = false;
                break;
            default:
                q6Var.k.clear();
                q6Var.d(true);
                break;
        }
    }
}
