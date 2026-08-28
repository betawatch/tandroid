package kd;

import hd.g1;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class l extends sc.c {
    public m a;
    public c b;
    public o c;
    public g1 d;
    public Object e;
    public /* synthetic */ Object f;
    public final /* synthetic */ m h;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, sc.c cVar) {
        super(cVar);
        this.h = mVar;
    }

    @Override // sc.a
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.n |= TLObject.FLAG_31;
        this.h.q(null, this);
        return rc.a.a;
    }
}
