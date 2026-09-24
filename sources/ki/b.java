package ki;

import android.os.Handler;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
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
        k kVar;
        boolean z10;
        switch (this.a) {
            case 0:
                h hVar = this.b;
                Handler handler = hVar.n;
                if (handler != null) {
                    handler.post(new b(hVar, 1));
                    return;
                }
                return;
            case 1:
                h hVar2 = this.b;
                if (!hVar2.R || hVar2.y == null || (kVar = hVar2.w) == null) {
                    return;
                }
                synchronized (kVar) {
                    z10 = kVar.v;
                }
                if (z10) {
                    return;
                }
                try {
                    hVar2.w.n();
                    q qVar = hVar2.v;
                    if (qVar != null) {
                        long j3 = hVar2.w.w;
                        if (j3 <= 0) {
                            throw new IllegalArgumentException("Invalid recording time origin");
                        }
                        qVar.h = j3;
                        qVar.A = -1L;
                        qVar.B = 0L;
                        qVar.C = -1L;
                        qVar.W = true;
                    }
                    hVar2.j.b("first camera frame received; codecs started: segmentElapsedMs=" + h.l(hVar2.e0));
                    r0 r0Var = (r0) hVar2.k.b;
                    r0Var.h.post(new b0(r0Var, 3));
                    return;
                } catch (RuntimeException e) {
                    hVar2.s(e);
                    return;
                }
            case 2:
                this.b.a();
                return;
            case 3:
                this.b.q();
                return;
            case 4:
                h hVar3 = this.b;
                hVar3.R = false;
                hVar3.g();
                k kVar2 = hVar3.w;
                if (kVar2 != null) {
                    kVar2.o();
                    hVar3.w = null;
                }
                hVar3.X = false;
                r0 r0Var2 = (r0) hVar3.k.b;
                r0Var2.h.post(new b0(r0Var2, 2));
                return;
            case 5:
                this.b.i();
                return;
            default:
                this.b.F();
                return;
        }
    }
}
