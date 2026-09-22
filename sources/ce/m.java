package ce;

import org.telegram.tgnet.TLObject;
import zd.f1;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final class m extends kd.c {
    public n a;
    public c b;
    public p c;
    public f1 d;
    public Object e;
    public /* synthetic */ Object f;
    public final /* synthetic */ n h;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, kd.c cVar) {
        super(cVar);
        this.h = nVar;
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.n |= TLObject.FLAG_31;
        this.h.u(null, this);
        return jd.a.a;
    }
}
