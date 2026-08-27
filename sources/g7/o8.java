package g7;

import com.google.mlkit.vision.segmentation.subject.internal.zzd;
import java.util.concurrent.Executor;
import k7.ce;
import k7.fb;
import k7.gb;
import k7.hb;
import k7.wf;
import k7.yf;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public abstract class o8 {
    public static zzd a(jb.e eVar) {
        kb.b bVar = (kb.b) za.g.c().a(kb.b.class);
        kb.e eVar2 = (kb.e) bVar.a.G(eVar);
        Executor executor = (Executor) bVar.b.a.get();
        wf b10 = yf.b();
        zzd zzdVar = new zzd(eVar2, executor);
        m.t3 t3Var = new m.t3();
        t3Var.c = fb.b;
        g5.b bVar2 = new g5.b(13);
        bVar2.c = eVar.a();
        bVar2.b = gb.b;
        t3Var.d = new ce(bVar2);
        za.m.a.execute(new bf.e(b10, new b6.a(t3Var, 1), hb.J4, b10.c(), false, 6));
        return zzdVar;
    }
}
