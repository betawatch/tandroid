package ce;

import org.telegram.tgnet.TLObject;
import zd.f1;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class n extends kd.c {
    public o a;
    public c b;
    public q c;
    public f1 d;
    public Object e;
    public /* synthetic */ Object f;
    public final /* synthetic */ o h;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, kd.c cVar) {
        super(cVar);
        this.h = oVar;
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.n |= TLObject.FLAG_31;
        this.h.u(null, this);
        return jd.a.a;
    }
}
