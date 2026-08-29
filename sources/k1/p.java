package k1;

import org.telegram.tgnet.TLObject;

/* loaded from: classes.dex */
public final class p extends uc.c {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ ja.a0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(ja.a0 a0Var, uc.c cVar) {
        super(cVar);
        this.c = a0Var;
    }

    @Override // uc.a
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= TLObject.FLAG_31;
        return this.c.c(null, this);
    }
}
