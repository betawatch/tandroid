package ki;

import android.os.Handler;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j b;

    public /* synthetic */ a(j jVar, int i10) {
        this.a = i10;
        this.b = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        m mVar;
        boolean z10;
        switch (this.a) {
            case 0:
                this.b.o();
                return;
            case 1:
                j jVar = this.b;
                Handler handler = jVar.n;
                if (handler != null) {
                    handler.post(new a(jVar, 2));
                    return;
                }
                return;
            case 2:
                j jVar2 = this.b;
                if (!jVar2.S || jVar2.z == null || (mVar = jVar2.w) == null) {
                    return;
                }
                synchronized (mVar) {
                    z10 = mVar.z;
                }
                if (z10) {
                    return;
                }
                try {
                    m mVar2 = jVar2.w;
                    jVar2.x = mVar2;
                    Handler handler2 = jVar2.n;
                    if (handler2 != null) {
                        handler2.removeCallbacks(jVar2.a1);
                        handler2.postDelayed(jVar2.a1, 3000L);
                    }
                    mVar2.p(new c(jVar2, mVar2, 0), new c(jVar2, mVar2, 1));
                    jVar2.j.b("first camera frame received; audio startup requested: segmentElapsedMs=" + j.s(jVar2.s0));
                    return;
                } catch (RuntimeException e7) {
                    jVar2.g();
                    jVar2.C(e7);
                    return;
                }
            case 3:
                j jVar3 = this.b;
                m mVar3 = jVar3.x;
                if (!jVar3.S || jVar3.Y || mVar3 == null || jVar3.w != mVar3) {
                    return;
                }
                jVar3.x = null;
                jVar3.C(new IllegalStateException("Timed out waiting for synchronized audio and video start"));
                return;
            case 4:
                this.b.c();
                return;
            case 5:
                this.b.y();
                return;
            case 6:
                j jVar4 = this.b;
                jVar4.S = false;
                jVar4.g();
                m mVar4 = jVar4.w;
                if (mVar4 != null) {
                    long l4 = mVar4.l();
                    r rVar = jVar4.v;
                    if (rVar != null && l4 != Long.MAX_VALUE) {
                        rVar.i = Math.max(0L, l4) * 1000;
                        Handler handler3 = rVar.m;
                        if (handler3 != null) {
                            handler3.removeCallbacks(rVar.e0);
                        }
                    }
                }
                jVar4.l();
                m mVar5 = jVar4.w;
                if (mVar5 != null) {
                    mVar5.q();
                    jVar4.w = null;
                }
                jVar4.Y = false;
                t0 t0Var = (t0) jVar4.k.b;
                t0Var.i.post(new c0(t0Var, 3));
                return;
            default:
                this.b.Q();
                return;
        }
    }
}
