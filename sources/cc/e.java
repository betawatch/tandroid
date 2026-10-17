package cc;

import android.os.SystemClock;
import m.s3;
import ri.j;
import ri.p;
import z7.hb;
import z7.he;
import z7.ib;
import z7.xf;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements xf {
    public final /* synthetic */ long a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e(f fVar, ib ibVar, long j10) {
        this.b = fVar;
        this.c = ibVar;
        this.a = j10;
    }

    @Override // z7.xf
    public a5.a zza() {
        f fVar = (f) this.b;
        ib ibVar = (ib) this.c;
        s3 s3Var = new s3();
        s3Var.c = hb.b;
        u2.c cVar = new u2.c(19, false);
        cVar.d = fVar.e.a();
        cVar.b = ibVar;
        cVar.c = Long.valueOf((SystemClock.elapsedRealtime() - this.a) & Long.MAX_VALUE);
        s3Var.e = new he(cVar);
        return new a5.a(s3Var, 0);
    }

    public e(p pVar, j jVar, long j10) {
        this.c = pVar;
        this.b = jVar;
        this.a = j10;
    }
}
