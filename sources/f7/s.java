package f7;

import android.content.Context;
import h7.a9;
import h7.x8;
import h7.y8;
import i7.ha;
import i7.ja;
import i7.ka;
import j7.ia;
import j7.la;
import java.util.ArrayList;
import l7.sf;
import l7.uf;
import l7.wf;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class s extends ab.e {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(int i10) {
        super(0);
        this.b = i10;
    }

    @Override // ab.e
    public final Object F(Object obj) {
        switch (this.b) {
            case 0:
                ab.h c3 = ab.h.c();
                Context b10 = ab.h.c().b();
                ArrayList arrayList = new ArrayList();
                ((o) obj).getClass();
                ya.a aVar = new ya.a(6);
                w2.a aVar2 = w2.a.e;
                y2.q.b(b10);
                y2.q.a().c(aVar2);
                w2.a.d.contains(new v2.c("json"));
                arrayList.add(aVar);
                return new r(c3.b(), (ab.l) c3.a(ab.l.class));
            case 1:
                x8 x8Var = (x8) obj;
                ab.h c6 = ab.h.c();
                return new a9(c6.b(), (ab.l) c6.a(ab.l.class), new y8(ab.h.c().b(), x8Var), x8Var.a);
            case 2:
                ab.h c10 = ab.h.c();
                return new ka(c10.b(), (ab.l) c10.a(ab.l.class), new ja(ab.h.c().b(), (ha) obj));
            case 3:
                ab.h c11 = ab.h.c();
                return new la(c11.b(), (ab.l) c11.a(ab.l.class), new ia(ab.h.c().b(), (j7.ha) obj));
            default:
                ab.h c12 = ab.h.c();
                return new wf(c12.b(), (ab.l) c12.a(ab.l.class), new uf(ab.h.c().b(), (sf) obj));
        }
    }
}
