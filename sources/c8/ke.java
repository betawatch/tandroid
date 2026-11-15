package c8;

import com.google.mlkit.vision.segmentation.subject.internal.zzd;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
        q4.q qVar = new q4.q(9, false);
        qVar.c = dVar.a();
        qVar.b = eb.b;
        dVar2.e = new ae(qVar);
        pb.n.a.execute(new a8.qa(b10, new a8.xa(dVar2, 1), fb.O4, b10.c(), 1));
        return zzdVar;
    }
}
