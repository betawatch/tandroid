package k7;

import com.google.mlkit.vision.segmentation.subject.internal.zzd;
import java.util.concurrent.Executor;
import n7.de;
import n7.gb;
import n7.hb;
import n7.ib;
import n7.xf;
import n7.zf;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public abstract class q {
    public static zzd a(mb.e eVar) {
        nb.b bVar = (nb.b) cb.h.c().a(nb.b.class);
        nb.e eVar2 = (nb.e) bVar.a.F(eVar);
        Executor executor = (Executor) bVar.b.a.get();
        xf b10 = zf.b();
        zzd zzdVar = new zzd(eVar2, executor);
        m.s3 s3Var = new m.s3();
        s3Var.c = gb.b;
        n7.qa qaVar = new n7.qa(1);
        qaVar.c = eVar.a();
        qaVar.b = hb.b;
        s3Var.d = new de(qaVar);
        cb.o.a.execute(new c2.p(b10, new b4.e0(s3Var, 1), ib.K4, b10.c(), false, 7));
        return zzdVar;
    }
}
