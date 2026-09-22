package ki;

import android.os.Handler;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h b;

    public /* synthetic */ b(h hVar, int i10) {
        this.a = i10;
        this.b = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j jVar;
        boolean z10;
        switch (this.a) {
            case 0:
                h hVar = this.b;
                Handler handler = hVar.n;
                if (handler != null) {
                    handler.post(new b(hVar, 2));
                    return;
                }
                return;
            case 1:
                this.b.k();
                return;
            case 2:
                h hVar2 = this.b;
                if (!hVar2.R || hVar2.y == null || (jVar = hVar2.w) == null) {
                    return;
                }
                synchronized (jVar) {
                    z10 = jVar.t;
                }
                if (z10) {
                    return;
                }
                try {
                    hVar2.w.n();
                    o oVar = hVar2.v;
                    if (oVar != null) {
                        long j3 = hVar2.w.u;
                        if (j3 <= 0) {
                            throw new IllegalArgumentException("Invalid recording time origin");
                        }
                        oVar.g = j3;
                        oVar.z = -1L;
                        oVar.A = 0L;
                        oVar.B = -1L;
                        oVar.V = true;
                    }
                    hVar2.j.b("first camera frame received; codecs started: segmentElapsedMs=" + h.n(hVar2.d0));
                    q0 q0Var = (q0) hVar2.k.b;
                    q0Var.h.post(new y(q0Var, 3));
                    return;
                } catch (RuntimeException e) {
                    hVar2.u(e);
                    return;
                }
            case 3:
                this.b.a();
                return;
            case 4:
                this.b.s();
                return;
            case 5:
                h hVar3 = this.b;
                hVar3.R = false;
                hVar3.h();
                j jVar2 = hVar3.w;
                if (jVar2 != null) {
                    jVar2.o();
                    hVar3.w = null;
                }
                hVar3.X = false;
                q0 q0Var2 = (q0) hVar3.k.b;
                q0Var2.h.post(new y(q0Var2, 2));
                return;
            default:
                this.b.H();
                return;
        }
    }
}
