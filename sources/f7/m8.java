package f7;

import com.google.mlkit.vision.segmentation.subject.internal.zzd;
import j7.ce;
import j7.fb;
import j7.gb;
import j7.hb;
import j7.wf;
import j7.yf;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class m8 {
    public static zzd a(ib.e eVar) {
        jb.b bVar = (jb.b) ya.g.c().a(jb.b.class);
        jb.f fVar = (jb.f) bVar.a.G(eVar);
        Executor executor = (Executor) bVar.b.a.get();
        wf b10 = yf.b();
        zzd zzdVar = new zzd(fVar, executor);
        m.t3 t3Var = new m.t3();
        t3Var.c = fb.b;
        g5.b bVar2 = new g5.b(12);
        bVar2.c = eVar.a();
        bVar2.b = gb.b;
        t3Var.d = new ce(bVar2);
        ya.m.a.execute(new af.f(b10, new a6.a(t3Var, 1), hb.J4, b10.c(), false, 6));
        return zzdVar;
    }
}
