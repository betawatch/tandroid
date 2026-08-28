package d7;

import android.content.Context;
import f7.a9;
import f7.c9;
import f7.z8;
import g7.ha;
import g7.ja;
import g7.ka;
import h7.ga;
import j7.sf;
import j7.uf;
import j7.wf;
import java.util.ArrayList;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class s extends a8.a {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(int i9) {
        super(8);
        this.b = i9;
    }

    @Override // a8.a
    public final Object F(Object obj) {
        switch (this.b) {
            case 0:
                ya.g c10 = ya.g.c();
                Context b10 = ya.g.c().b();
                ArrayList arrayList = new ArrayList();
                ((o) obj).getClass();
                za.a aVar = new za.a(4);
                u2.a aVar2 = u2.a.e;
                w2.q.b(b10);
                w2.q.a().c(aVar2);
                u2.a.d.contains(new t2.c("json"));
                arrayList.add(aVar);
                return new r(c10.b(), (ya.k) c10.a(ya.k.class));
            case 1:
                z8 z8Var = (z8) obj;
                ya.g c11 = ya.g.c();
                return new c9(c11.b(), (ya.k) c11.a(ya.k.class), new a9(ya.g.c().b(), z8Var), z8Var.a);
            case 2:
                ya.g c12 = ya.g.c();
                return new ka(c12.b(), (ya.k) c12.a(ya.k.class), new ja(ya.g.c().b(), (ha) obj));
            case 3:
                ya.g c13 = ya.g.c();
                return new h7.ka(c13.b(), (ya.k) c13.a(ya.k.class), new h7.ha(ya.g.c().b(), (ga) obj));
            default:
                ya.g c14 = ya.g.c();
                return new wf(c14.b(), (ya.k) c14.a(ya.k.class), new uf(ya.g.c().b(), (sf) obj));
        }
    }
}
