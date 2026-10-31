package ki;

import android.os.SystemClock;
import java.io.File;
import m.p3;
import z7.fb;
import z7.fe;
import z7.gb;
import z7.ge;
import z7.wf;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class g implements wf {
    public final long a;
    public final Object b;
    public final Object c;

    public /* synthetic */ g(ub.d dVar, gb gbVar, long j10) {
        this.b = dVar;
        this.c = gbVar;
        this.a = j10;
    }

    @Override // z7.wf
    public a5.a zza() {
        ub.d dVar = (ub.d) this.b;
        gb gbVar = (gb) this.c;
        p3 p3Var = new p3();
        p3Var.c = fb.b;
        fe feVar = new fe();
        feVar.c = dVar.e.a();
        feVar.a = gbVar;
        feVar.b = Long.valueOf((SystemClock.elapsedRealtime() - this.a) & Long.MAX_VALUE);
        p3Var.e = new ge(feVar);
        return new a5.a(p3Var, 0);
    }

    public g(File file, long j10, byte[] bArr) {
        this.b = file;
        this.a = j10;
        this.c = bArr == null ? null : (byte[]) bArr.clone();
    }

    public g(long j10, j jVar, k kVar) {
        this.c = kVar;
        this.a = j10;
        this.b = jVar;
    }
}
