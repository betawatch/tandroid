package k1;

import java.io.Serializable;
import java.util.Iterator;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class u extends wc.c {
    public d0 a;
    public Object b;
    public Serializable c;
    public Object d;
    public w e;
    public Iterator f;
    public /* synthetic */ Object h;
    public final /* synthetic */ d0 n;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(d0 d0Var, wc.c cVar) {
        super(cVar);
        this.n = d0Var;
    }

    @Override // wc.a
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.r |= TLObject.FLAG_31;
        return this.n.c(this);
    }
}
