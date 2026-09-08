package bb;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class k extends kd.c {
    public /* synthetic */ Object a;
    public final /* synthetic */ m b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(m mVar, kd.c cVar) {
        super(cVar);
        this.b = mVar;
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= TLObject.FLAG_31;
        return this.b.c(null, null, this);
    }
}
