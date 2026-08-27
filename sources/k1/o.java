package k1;

import org.telegram.tgnet.TLObject;

/* loaded from: classes.dex */
public final class o extends tc.c {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ ia.b0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(ia.b0 b0Var, tc.c cVar) {
        super(cVar);
        this.c = b0Var;
    }

    @Override // tc.a
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= TLObject.FLAG_31;
        return this.c.c(null, this);
    }
}
