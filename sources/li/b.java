package li;

import android.os.Handler;
import j$.util.Objects;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l b;
    public final /* synthetic */ n0 c;
    public final /* synthetic */ long d;

    public /* synthetic */ b(l lVar, n0 n0Var, long j10, int i10) {
        this.a = i10;
        this.b = lVar;
        this.c = n0Var;
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
                n0 n0Var = this.c;
                long j10 = this.d;
                if (lVar2.V && lVar2.G == n0Var) {
                    lVar2.j.b("camera switch first preview frame: path=DUAL_ACTIVE, totalElapsedMs=" + l.z(j10));
                    u0 u0Var = (u0) lVar2.k.b;
                    Handler handler = u0Var.i;
                    l2.f fVar = u0Var.d;
                    Objects.requireNonNull(fVar);
                    handler.post(new ig.t0(fVar, 16));
                    break;
                }
                break;
        }
    }
}
