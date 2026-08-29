package i7;

import com.google.mlkit.vision.segmentation.subject.internal.zzd;
import java.util.concurrent.Executor;
import l7.ce;
import l7.fb;
import l7.gb;
import l7.hb;
import l7.wf;
import l7.yf;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class g {
    public static zzd a(kb.e eVar) {
        lb.b bVar = (lb.b) ab.h.c().a(lb.b.class);
        lb.e eVar2 = (lb.e) bVar.a.G(eVar);
        Executor executor = (Executor) bVar.b.a.get();
        wf b10 = yf.b();
        zzd zzdVar = new zzd(eVar2, executor);
        m.s3 s3Var = new m.s3();
        s3Var.c = fb.b;
        g9.l lVar = new g9.l(18, (byte) 0);
        lVar.c = eVar.a();
        lVar.b = gb.b;
        s3Var.d = new ce(lVar);
        ab.q.a.execute(new c2.p(b10, new ag.j2(s3Var, 1), hb.J4, b10.c(), false, 7));
        return zzdVar;
    }
}
