package ce;

import org.telegram.tgnet.TLObject;

/* loaded from: classes.dex */
public final class i extends kd.c {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ q4.q c;
    public q4.q d;
    public d e;
    public de.h f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(q4.q qVar, kd.c cVar) {
        super(cVar);
        this.c = qVar;
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= TLObject.FLAG_31;
        return this.c.B(null, this);
    }
}
