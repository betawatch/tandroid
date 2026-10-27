package a8;

import com.google.mlkit.vision.segmentation.subject.internal.zzd;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public abstract class y9 {
    public static zzd a(cc.e eVar) {
        dc.b bVar = (dc.b) sb.g.c().a(dc.b.class);
        dc.f fVar = (dc.f) bVar.a.R0(eVar);
        Executor executor = (Executor) bVar.b.a.get();
        kg c10 = rg.c();
        zzd zzdVar = new zzd(fVar, executor);
        m.r3 r3Var = new m.r3();
        r3Var.c = ob.b;
        rf.b bVar2 = new rf.b(3, false);
        bVar2.c = eVar.a();
        bVar2.b = qb.b;
        r3Var.d = new ke(bVar2);
        sb.m.a.execute(new fg(c10, new ng(r3Var, 1), rb.N4, c10.c(), 0));
        return zzdVar;
    }
}
