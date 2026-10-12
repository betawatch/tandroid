package k1;

import org.telegram.tgnet.TLObject;

/* loaded from: classes.dex */
public final class o extends md.c {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ ab.a0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(ab.a0 a0Var, md.c cVar) {
        super(cVar);
        this.c = a0Var;
    }

    @Override // md.a
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= TLObject.FLAG_31;
        return this.c.a(null, this);
    }
}
