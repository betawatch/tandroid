package ce;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
