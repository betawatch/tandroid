package ee;

import be.g1;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class l extends md.c {
    public m a;
    public c b;
    public o c;
    public g1 d;
    public Object e;
    public /* synthetic */ Object f;
    public final /* synthetic */ m h;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, md.c cVar) {
        super(cVar);
        this.h = mVar;
    }

    @Override // md.a
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.n |= TLObject.FLAG_31;
        this.h.q(null, this);
        return ld.a.a;
    }
}
