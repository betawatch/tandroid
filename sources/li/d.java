package li;

import android.os.Handler;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l b;
    public final /* synthetic */ o c;

    public /* synthetic */ d(l lVar, o oVar, int i10) {
        this.a = i10;
        this.b = lVar;
        this.c = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        u uVar;
        switch (this.a) {
            case 0:
                l lVar = this.b;
                d dVar = new d(lVar, this.c, 2);
                Handler handler = lVar.n;
                if (handler != null) {
                    handler.post(dVar);
                    return;
                }
                return;
            case 1:
                l lVar2 = this.b;
                d dVar2 = new d(lVar2, this.c, 3);
                Handler handler2 = lVar2.n;
                if (handler2 != null) {
                    handler2.post(dVar2);
                    return;
                }
                return;
            case 2:
                l lVar3 = this.b;
                o oVar = this.c;
                if (!lVar3.V || lVar3.b0 || lVar3.x != oVar || lVar3.A == null || (uVar = lVar3.w) == null) {
                    return;
                }
                try {
                    long j10 = oVar.A;
                    if (j10 <= 0) {
                        throw new IllegalArgumentException("Invalid recording time origin");
                    }
                    uVar.p = j10;
                    uVar.Q = -1L;
                    uVar.R = 0L;
                    uVar.S = -1L;
                    uVar.q = Long.MAX_VALUE;
                    uVar.s0 = true;
                    lVar3.j.b("common A/V start armed; waiting for next camera frame: segmentElapsedMs=" + l.z(lVar3.E0));
                    return;
                } catch (RuntimeException e) {
                    lVar3.k();
                    lVar3.N(e);
                    return;
                }
            default:
                l lVar4 = this.b;
                o oVar2 = this.c;
                if (lVar4.V && !lVar4.b0 && lVar4.x == oVar2) {
                    lVar4.k();
                    lVar4.j.b("common A/V start completed: segmentElapsedMs=" + l.z(lVar4.E0));
                    u0 u0Var = (u0) lVar4.k.b;
                    u0Var.i.post(new f0(u0Var, 2));
                    return;
                }
                return;
        }
    }
}
