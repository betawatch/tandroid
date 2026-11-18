package a8;

import android.content.Context;
import c8.qf;
import c8.sf;
import c8.uf;
import java.util.ArrayList;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class ab extends com.google.android.gms.common.api.q {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ab(int i7) {
        super(4);
        this.b = i7;
    }

    @Override // com.google.android.gms.common.api.q
    public final Object Q0(Object obj) {
        switch (this.b) {
            case 0:
                pb.g c10 = pb.g.c();
                return new ua(c10.b(), (pb.k) c10.a(pb.k.class), new oa(pb.g.c().b(), (na) obj));
            case 1:
                pb.g c11 = pb.g.c();
                return new uf(c11.b(), (pb.k) c11.a(pb.k.class), new sf(pb.g.c().b(), (qf) obj));
            case 2:
                pb.g c12 = pb.g.c();
                Context b10 = pb.g.c().b();
                ArrayList arrayList = new ArrayList();
                ((w7.o) obj).getClass();
                qb.a aVar = new qb.a(27);
                m5.a aVar2 = m5.a.e;
                o5.s.b(b10);
                o5.s.a().c(aVar2);
                m5.a.d.contains(new l5.c("json"));
                arrayList.add(aVar);
                return new w7.p(c12.b(), (pb.k) c12.a(pb.k.class));
            case 3:
                y7.a9 a9Var = (y7.a9) obj;
                pb.g c13 = pb.g.c();
                return new y7.d9(c13.b(), (pb.k) c13.a(pb.k.class), new y7.b9(pb.g.c().b(), a9Var), a9Var.a);
            default:
                pb.g c14 = pb.g.c();
                return new z7.ma(c14.b(), (pb.k) c14.a(pb.k.class), new z7.la(pb.g.c().b(), (z7.ja) obj));
        }
    }
}
