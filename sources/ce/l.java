package ce;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class l extends kd.c {
    public m a;
    public /* synthetic */ Object b;
    public final /* synthetic */ m c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, id.c cVar) {
        super(cVar);
        this.c = mVar;
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= TLObject.FLAG_31;
        return this.c.a(null, this);
    }
}
