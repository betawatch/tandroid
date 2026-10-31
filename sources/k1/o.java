package k1;

import org.telegram.tgnet.TLObject;

/* loaded from: classes.dex */
public final class o extends ed.c {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ bb.a0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(bb.a0 a0Var, ed.c cVar) {
        super(cVar);
        this.c = a0Var;
    }

    @Override // ed.a
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= TLObject.FLAG_31;
        return this.c.b(null, this);
    }
}
