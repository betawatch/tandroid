package k1;

import org.telegram.tgnet.TLObject;

/* loaded from: classes.dex */
public final class o extends ld.c {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ p c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar, ld.c cVar) {
        super(cVar);
        this.c = pVar;
    }

    @Override // ld.a
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= TLObject.FLAG_31;
        return this.c.b(null, this);
    }
}
