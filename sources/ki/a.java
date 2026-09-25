package ki;

import android.os.Handler;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i b;

    public /* synthetic */ a(i iVar, int i10) {
        this.a = i10;
        this.b = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        l lVar;
        boolean z10;
        switch (this.a) {
            case 0:
                this.b.j();
                return;
            case 1:
                i iVar = this.b;
                Handler handler = iVar.n;
                if (handler != null) {
                    handler.post(new a(iVar, 2));
                    return;
                }
                return;
            case 2:
                i iVar2 = this.b;
                if (!iVar2.S || iVar2.z == null || (lVar = iVar2.w) == null) {
                    return;
                }
                synchronized (lVar) {
                    z10 = lVar.z;
                }
                if (z10) {
                    return;
                }
                try {
                    l lVar2 = iVar2.w;
                    iVar2.x = lVar2;
                    Handler handler2 = iVar2.n;
                    if (handler2 != null) {
                        handler2.removeCallbacks(iVar2.N0);
                        handler2.postDelayed(iVar2.N0, 3000L);
                    }
                    lVar2.p(new c(iVar2, lVar2, 0), new c(iVar2, lVar2, 1));
                    iVar2.j.b("first camera frame received; audio startup requested: segmentElapsedMs=" + i.m(iVar2.f0));
                    return;
                } catch (RuntimeException e) {
                    iVar2.d();
                    iVar2.t(e);
                    return;
                }
            case 3:
                i iVar3 = this.b;
                l lVar3 = iVar3.x;
                if (!iVar3.S || iVar3.Y || lVar3 == null || iVar3.w != lVar3) {
                    return;
                }
                iVar3.x = null;
                iVar3.t(new IllegalStateException("Timed out waiting for synchronized audio and video start"));
                return;
            case 4:
                this.b.a();
                return;
            case 5:
                this.b.r();
                return;
            case 6:
                i iVar4 = this.b;
                iVar4.S = false;
                iVar4.d();
                l lVar4 = iVar4.w;
                if (lVar4 != null) {
                    long l4 = lVar4.l();
                    q qVar = iVar4.v;
                    if (qVar != null && l4 != Long.MAX_VALUE) {
                        qVar.i = Math.max(0L, l4) * 1000;
                        Handler handler3 = qVar.m;
                        if (handler3 != null) {
                            handler3.removeCallbacks(qVar.e0);
                        }
                    }
                }
                iVar4.h();
                l lVar5 = iVar4.w;
                if (lVar5 != null) {
                    lVar5.q();
                    iVar4.w = null;
                }
                iVar4.Y = false;
                s0 s0Var = (s0) iVar4.k.b;
                s0Var.h.post(new b0(s0Var, 3));
                return;
            default:
                this.b.G();
                return;
        }
    }
}
