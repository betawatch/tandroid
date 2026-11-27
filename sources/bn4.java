// default package

import org.telegram.tgnet.TLObject;

/* loaded from: classes.dex */
public final class bn4 extends ax2 {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ um4 c;
    public xm4 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bn4(um4 um4Var, zw2 zw2Var) {
        super(zw2Var);
        this.c = um4Var;
    }

    @Override // qf0
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= TLObject.FLAG_31;
        return this.c.k(null, this);
    }
}
