package ce;

import org.telegram.tgnet.TLObject;
import zd.f1;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
        this.h.l(null, this);
        return jd.a.a;
    }
}
