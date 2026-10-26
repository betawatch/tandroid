package k1;

import java.io.Serializable;
import java.util.Iterator;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class q extends nd.c {
    public z a;
    public Object b;
    public Serializable c;
    public Object d;
    public s e;
    public Iterator f;
    public /* synthetic */ Object h;
    public final /* synthetic */ z n;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(z zVar, nd.c cVar) {
        super(cVar);
        this.n = zVar;
    }

    @Override // nd.a
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.r |= TLObject.FLAG_31;
        return this.n.c(this);
    }
}
