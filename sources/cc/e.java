package cc;

import android.os.SystemClock;
import m.s3;
import ri.j;
import ri.p;
import t0.h;
import z7.gb;
import z7.ge;
import z7.hb;
import z7.wf;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements wf {
    public final /* synthetic */ long a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e(f fVar, hb hbVar, long j10) {
        this.b = fVar;
        this.c = hbVar;
        this.a = j10;
    }

    @Override // z7.wf
    public a5.a zza() {
        f fVar = (f) this.b;
        hb hbVar = (hb) this.c;
        s3 s3Var = new s3();
        s3Var.c = gb.b;
        h hVar = new h(20, false);
        hVar.d = fVar.e.a();
        hVar.b = hbVar;
        hVar.c = Long.valueOf((SystemClock.elapsedRealtime() - this.a) & Long.MAX_VALUE);
        s3Var.e = new ge(hVar);
        return new a5.a(s3Var, 0);
    }

    public e(p pVar, j jVar, long j10) {
        this.c = pVar;
        this.b = jVar;
        this.a = j10;
    }
}
