package cc;

import android.os.SystemClock;
import m.t3;
import qi.k;
import qi.q;
import z7.fb;
import z7.fe;
import z7.gb;
import z7.vf;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements vf {
    public final /* synthetic */ long a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e(f fVar, gb gbVar, long j10) {
        this.b = fVar;
        this.c = gbVar;
        this.a = j10;
    }

    @Override // z7.vf
    public a5.a zza() {
        f fVar = (f) this.b;
        gb gbVar = (gb) this.c;
        t3 t3Var = new t3();
        t3Var.c = fb.b;
        u2.c cVar = new u2.c(19, false);
        cVar.d = fVar.e.a();
        cVar.b = gbVar;
        cVar.c = Long.valueOf((SystemClock.elapsedRealtime() - this.a) & Long.MAX_VALUE);
        t3Var.e = new fe(cVar);
        return new a5.a(t3Var, 0);
    }

    public e(q qVar, k kVar, long j10) {
        this.c = qVar;
        this.b = kVar;
        this.a = j10;
    }
}
