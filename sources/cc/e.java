package cc;

import android.os.SystemClock;
import m.q3;
import ri.k;
import ri.q;
import z7.fb;
import z7.fe;
import z7.gb;
import z7.vf;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
        q3 q3Var = new q3();
        q3Var.c = fb.b;
        u2.c cVar = new u2.c(19, false);
        cVar.d = fVar.e.a();
        cVar.b = gbVar;
        cVar.c = Long.valueOf((SystemClock.elapsedRealtime() - this.a) & Long.MAX_VALUE);
        q3Var.e = new fe(cVar);
        return new a5.a(q3Var, 0);
    }

    public e(q qVar, k kVar, long j10) {
        this.c = qVar;
        this.b = kVar;
        this.a = j10;
    }
}
