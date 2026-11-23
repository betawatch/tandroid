package c8;

import com.google.mlkit.vision.segmentation.subject.internal.zzd;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public abstract class oe {
    public static zzd a(zb.d dVar) {
        ac.b bVar = (ac.b) pb.g.c().a(ac.b.class);
        ac.f fVar = (ac.f) bVar.a.R0(dVar);
        Executor executor = (Executor) bVar.b.a.get();
        uf b10 = wf.b();
        zzd zzdVar = new zzd(fVar, executor);
        ga.d dVar2 = new ga.d();
        dVar2.c = db.b;
        q4.q qVar = new q4.q(9, false);
        qVar.c = dVar.a();
        qVar.b = eb.b;
        dVar2.d = new ae(qVar);
        pb.n.a.execute(new a8.qa(b10, new a8.xa(dVar2, 1), fb.O4, b10.c(), 1));
        return zzdVar;
    }
}
