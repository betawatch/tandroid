package li;

import android.os.Handler;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
        v vVar;
        switch (this.a) {
            case 0:
                l lVar = this.b;
                d dVar = new d(lVar, this.c, 3);
                Handler handler = lVar.n;
                if (handler != null) {
                    handler.post(dVar);
                    return;
                }
                return;
            case 1:
                l lVar2 = this.b;
                d dVar2 = new d(lVar2, this.c, 2);
                Handler handler2 = lVar2.n;
                if (handler2 != null) {
                    handler2.post(dVar2);
                    return;
                }
                return;
            case 2:
                l lVar3 = this.b;
                o oVar = this.c;
                if (lVar3.V && !lVar3.b0 && lVar3.x == oVar) {
                    lVar3.k();
                    if (lVar3.i0 == 0) {
                        lVar3.i0 = oVar.e;
                    }
                    lVar3.j.b("common A/V start completed: segmentElapsedMs=" + l.z(lVar3.F0));
                    x0 x0Var = (x0) lVar3.k.b;
                    x0Var.i.post(new l0(x0Var, 2));
                    return;
                }
                return;
            default:
                l lVar4 = this.b;
                o oVar2 = this.c;
                if (!lVar4.V || lVar4.b0 || lVar4.x != oVar2 || lVar4.A == null || (vVar = lVar4.w) == null) {
                    return;
                }
                try {
                    long j10 = oVar2.F;
                    if (j10 <= 0) {
                        throw new IllegalArgumentException("Invalid recording time origin");
                    }
                    vVar.p = j10;
                    vVar.Q = -1L;
                    vVar.R = 0L;
                    vVar.S = -1L;
                    vVar.q = Long.MAX_VALUE;
                    vVar.s0 = true;
                    lVar4.j.b("common A/V start armed; waiting for next camera frame: segmentElapsedMs=" + l.z(lVar4.F0));
                    return;
                } catch (RuntimeException e) {
                    lVar4.k();
                    lVar4.N(e);
                    return;
                }
        }
    }
}
