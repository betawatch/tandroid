package ei;

import org.telegram.messenger.hs;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r6 b;

    public /* synthetic */ o6(r6 r6Var, int i3) {
        this.a = i3;
        this.b = r6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        r6 r6Var = this.b;
        switch (i3) {
            case 0:
                hs.f(r6Var.c).k(hs.x5, r6Var);
                break;
            case 1:
                r6Var.u = false;
                r6Var.w = true;
                hs.f(r6Var.c).k(hs.x5, r6Var, Boolean.FALSE);
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
