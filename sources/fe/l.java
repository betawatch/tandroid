package fe;

import ce.g1;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class l extends nd.c {
    public m a;
    public c b;
    public o c;
    public g1 d;
    public Object e;
    public /* synthetic */ Object f;
    public final /* synthetic */ m h;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, nd.c cVar) {
        super(cVar);
        this.h = mVar;
    }

    @Override // nd.a
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.n |= TLObject.FLAG_31;
        this.h.C(null, this);
        return md.a.a;
    }
}
