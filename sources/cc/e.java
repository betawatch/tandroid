package cc;

import android.os.SystemClock;
import m.s3;
import ri.i;
import ri.o;
import z7.fb;
import z7.fe;
import z7.gb;
import z7.vf;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
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
        s3 s3Var = new s3();
        s3Var.c = fb.b;
        u2.c cVar = new u2.c(19, false);
        cVar.d = fVar.e.a();
        cVar.b = gbVar;
        cVar.c = Long.valueOf((SystemClock.elapsedRealtime() - this.a) & Long.MAX_VALUE);
        s3Var.e = new fe(cVar);
        return new a5.a(s3Var, 0);
    }

    public e(long j10, i iVar, o oVar) {
        this.c = oVar;
        this.a = j10;
        this.b = iVar;
    }
}
