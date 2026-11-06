package ce;

import org.telegram.tgnet.TLObject;

/* loaded from: classes.dex */
public final class q extends kd.c {
    public m a;
    public /* synthetic */ Object b;
    public int c;
    public final /* synthetic */ m d;
    public Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(m mVar, id.c cVar) {
        super(cVar);
        this.d = mVar;
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.c |= TLObject.FLAG_31;
        return this.d.a(null, this);
    }
}
