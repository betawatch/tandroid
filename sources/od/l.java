package od;

import ld.f1;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class l extends wc.c {
    public m a;
    public c b;
    public o c;
    public f1 d;
    public Object e;
    public /* synthetic */ Object f;
    public final /* synthetic */ m h;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, wc.c cVar) {
        super(cVar);
        this.h = mVar;
    }

    @Override // wc.a
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.n |= TLObject.FLAG_31;
        this.h.z(null, this);
        return vc.a.a;
    }
}
