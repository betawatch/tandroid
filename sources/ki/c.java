package ki;

import android.os.Handler;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j b;
    public final /* synthetic */ m c;

    public /* synthetic */ c(j jVar, m mVar, int i10) {
        this.a = i10;
        this.b = jVar;
        this.c = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r rVar;
        switch (this.a) {
            case 0:
                j jVar = this.b;
                c cVar = new c(jVar, this.c, 2);
                Handler handler = jVar.n;
                if (handler != null) {
                    handler.post(cVar);
                    return;
                }
                return;
            case 1:
                j jVar2 = this.b;
                c cVar2 = new c(jVar2, this.c, 3);
                Handler handler2 = jVar2.n;
                if (handler2 != null) {
                    handler2.post(cVar2);
                    return;
                }
                return;
            case 2:
                j jVar3 = this.b;
                m mVar = this.c;
                if (!jVar3.S || jVar3.Y || jVar3.w != mVar || jVar3.z == null || (rVar = jVar3.v) == null) {
                    return;
                }
                try {
                    long j3 = mVar.A;
                    if (j3 <= 0) {
                        throw new IllegalArgumentException("Invalid recording time origin");
                    }
                    rVar.h = j3;
                    rVar.A = -1L;
                    rVar.B = 0L;
                    rVar.C = -1L;
                    rVar.i = Long.MAX_VALUE;
                    rVar.a0 = true;
                    jVar3.j.b("common A/V start armed; waiting for next camera frame: segmentElapsedMs=" + j.s(jVar3.s0));
                    return;
                } catch (RuntimeException e7) {
                    jVar3.g();
                    jVar3.C(e7);
                    return;
                }
            default:
                j jVar4 = this.b;
                m mVar2 = this.c;
                if (jVar4.S && !jVar4.Y && jVar4.w == mVar2) {
                    jVar4.g();
                    jVar4.j.b("common A/V start completed: segmentElapsedMs=" + j.s(jVar4.s0));
                    t0 t0Var = (t0) jVar4.k.b;
                    t0Var.i.post(new c0(t0Var, 2));
                    return;
                }
                return;
        }
    }
}
