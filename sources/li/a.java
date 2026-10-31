package li;

import android.os.Handler;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l b;

    public /* synthetic */ a(l lVar, int i10) {
        this.a = i10;
        this.b = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o oVar;
        boolean z10;
        switch (this.a) {
            case 0:
                this.b.u();
                return;
            case 1:
                this.b.d0();
                return;
            case 2:
                l lVar = this.b;
                Handler handler = lVar.n;
                if (handler != null) {
                    handler.post(new a(lVar, 3));
                    return;
                }
                return;
            case 3:
                l lVar2 = this.b;
                if (!lVar2.V || lVar2.A == null || (oVar = lVar2.x) == null) {
                    return;
                }
                synchronized (oVar) {
                    z10 = oVar.E;
                }
                if (z10) {
                    return;
                }
                try {
                    o oVar2 = lVar2.x;
                    lVar2.y = oVar2;
                    Handler handler2 = lVar2.n;
                    if (handler2 != null) {
                        handler2.removeCallbacks(lVar2.n1);
                        handler2.postDelayed(lVar2.n1, 3000L);
                    }
                    oVar2.t(new d(lVar2, oVar2, 0), new d(lVar2, oVar2, 1));
                    lVar2.j.b("first camera frame received; audio startup requested: segmentElapsedMs=" + l.z(lVar2.F0));
                    return;
                } catch (RuntimeException e) {
                    lVar2.k();
                    lVar2.N(e);
                    return;
                }
            case 4:
                l lVar3 = this.b;
                o oVar3 = lVar3.y;
                if (!lVar3.V || lVar3.b0 || oVar3 == null || lVar3.x != oVar3) {
                    return;
                }
                lVar3.y = null;
                lVar3.N(new IllegalStateException("Timed out waiting for synchronized audio and video start"));
                return;
            case 5:
                this.b.g();
                return;
            case 6:
                l lVar4 = this.b;
                lVar4.V = false;
                lVar4.k();
                o oVar4 = lVar4.x;
                if (oVar4 != null) {
                    long p5 = oVar4.p();
                    v vVar = lVar4.w;
                    if (vVar != null && p5 != Long.MAX_VALUE) {
                        vVar.q = Math.max(0L, p5) * 1000;
                        Handler handler3 = vVar.u;
                        if (handler3 != null) {
                            handler3.removeCallbacks(vVar.x0);
                        }
                    }
                }
                lVar4.p();
                o oVar5 = lVar4.x;
                if (oVar5 != null) {
                    oVar5.u();
                    lVar4.x = null;
                }
                lVar4.b0 = false;
                x0 x0Var = (x0) lVar4.k.b;
                x0Var.i.post(new l0(x0Var, 3));
                return;
            case 7:
                this.b.I();
                return;
            default:
                this.b.d0();
                return;
        }
    }
}
