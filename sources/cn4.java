// default package

import org.telegram.tgnet.TLObject;

/* loaded from: classes.dex */
public final class cn4 extends ax2 {
    public xm4 a;
    public /* synthetic */ Object b;
    public int c;
    public final /* synthetic */ xm4 d;
    public Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cn4(xm4 xm4Var, zw2 zw2Var) {
        super(zw2Var);
        this.d = xm4Var;
    }

    @Override // qf0
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.c |= TLObject.FLAG_31;
        return this.d.c(null, this);
    }
}
