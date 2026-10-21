package cc;

import android.os.SystemClock;
import m.s3;
import ri.i;
import ri.o;
import z7.gb;
import z7.ge;
import z7.hb;
import z7.wf;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
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
        u2.c cVar = new u2.c(19, false);
        cVar.d = fVar.e.a();
        cVar.b = hbVar;
        cVar.c = Long.valueOf((SystemClock.elapsedRealtime() - this.a) & Long.MAX_VALUE);
        s3Var.e = new ge(cVar);
        return new a5.a(s3Var, 0);
    }

    public e(long j10, i iVar, o oVar) {
        this.c = oVar;
        this.a = j10;
        this.b = iVar;
    }
}
