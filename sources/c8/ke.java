package c8;

import com.google.mlkit.vision.segmentation.subject.internal.zzd;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public abstract class ke {
    public static zzd a(zb.d dVar) {
        ac.b bVar = (ac.b) pb.g.c().a(ac.b.class);
        ac.f fVar = (ac.f) bVar.a.R0(dVar);
        Executor executor = (Executor) bVar.b.a.get();
        uf b10 = wf.b();
        zzd zzdVar = new zzd(fVar, executor);
        ga.d dVar2 = new ga.d(1);
        dVar2.d = db.b;
        q4.q qVar = new q4.q(10, false);
        qVar.c = dVar.a();
        qVar.b = eb.b;
        dVar2.e = new ae(qVar);
        pb.m.a.execute(new a8.pa(b10, new a8.wa(dVar2, 1), fb.N4, b10.c(), 1));
        return zzdVar;
    }
}
