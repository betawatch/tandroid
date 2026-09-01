package k7;

import com.google.mlkit.vision.segmentation.subject.internal.zzd;
import java.util.concurrent.Executor;
import n7.de;
import n7.gb;
import n7.hb;
import n7.ib;
import n7.xf;
import n7.zf;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public abstract class r {
    public static zzd a(mb.e eVar) {
        nb.b bVar = (nb.b) cb.h.c().a(nb.b.class);
        nb.e eVar2 = (nb.e) bVar.a.F(eVar);
        Executor executor = (Executor) bVar.b.a.get();
        xf b10 = zf.b();
        zzd zzdVar = new zzd(eVar2, executor);
        m.r3 r3Var = new m.r3();
        r3Var.c = gb.b;
        n7.qa qaVar = new n7.qa(1);
        qaVar.c = eVar.a();
        qaVar.b = hb.b;
        r3Var.d = new de(qaVar);
        cb.o.a.execute(new c2.p(b10, new b4.e0(r3Var, 1), ib.K4, b10.c(), false, 7));
        return zzdVar;
    }
}
