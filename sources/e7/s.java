package e7;

import android.content.Context;
import g7.b9;
import g7.y8;
import g7.z8;
import h7.ha;
import h7.ja;
import h7.ka;
import i7.ga;
import java.util.ArrayList;
import k7.sf;
import k7.uf;
import k7.wf;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class s extends b8.a {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(int i10) {
        super(8);
        this.b = i10;
    }

    @Override // b8.a
    public final Object F(Object obj) {
        switch (this.b) {
            case 0:
                za.g c10 = za.g.c();
                Context b10 = za.g.c().b();
                ArrayList arrayList = new ArrayList();
                ((o) obj).getClass();
                xa.a aVar = new xa.a(5);
                u2.a aVar2 = u2.a.e;
                w2.q.b(b10);
                w2.q.a().c(aVar2);
                u2.a.d.contains(new t2.c("json"));
                arrayList.add(aVar);
                return new r(c10.b(), (za.k) c10.a(za.k.class));
            case 1:
                y8 y8Var = (y8) obj;
                za.g c11 = za.g.c();
                return new b9(c11.b(), (za.k) c11.a(za.k.class), new z8(za.g.c().b(), y8Var), y8Var.a);
            case 2:
                za.g c12 = za.g.c();
                return new ka(c12.b(), (za.k) c12.a(za.k.class), new ja(za.g.c().b(), (ha) obj));
            case 3:
                za.g c13 = za.g.c();
                return new i7.ka(c13.b(), (za.k) c13.a(za.k.class), new i7.ha(za.g.c().b(), (ga) obj));
            default:
                za.g c14 = za.g.c();
                return new wf(c14.b(), (za.k) c14.a(za.k.class), new uf(za.g.c().b(), (sf) obj));
        }
    }
}
