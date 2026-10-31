package li;

import android.os.Handler;
import j$.util.Objects;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l b;
    public final /* synthetic */ q0 c;
    public final /* synthetic */ long d;

    public /* synthetic */ b(l lVar, q0 q0Var, long j10, int i10) {
        this.a = i10;
        this.b = lVar;
        this.c = q0Var;
        this.d = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                l lVar = this.b;
                lVar.c.post(new b(lVar, this.c, this.d, 1));
                break;
            default:
                l lVar2 = this.b;
                q0 q0Var = this.c;
                long j10 = this.d;
                if (lVar2.V && lVar2.G == q0Var) {
                    lVar2.j.b("camera switch first preview frame: path=DUAL_ACTIVE, totalElapsedMs=" + l.z(j10));
                    x0 x0Var = (x0) lVar2.k.b;
                    Handler handler = x0Var.i;
                    k2.m0 m0Var = x0Var.d;
                    Objects.requireNonNull(m0Var);
                    handler.post(new lg.s(m0Var, 3));
                    break;
                }
                break;
        }
    }
}
