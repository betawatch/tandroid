package ce;

import org.telegram.tgnet.TLObject;

/* loaded from: classes.dex */
public final class g extends kd.c {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ h c;
    public Object d;
    public d e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, kd.c cVar) {
        super(cVar);
        this.c = hVar;
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= TLObject.FLAG_31;
        return this.c.B(null, this);
    }
}
