// default package

import org.telegram.tgnet.TLObject;

/* loaded from: classes.dex */
public final class om4 extends qx2 {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ mj4 c;
    public mj4 d;
    public jm4 e;
    public pq9 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public om4(mj4 mj4Var, px2 px2Var) {
        super(px2Var);
        this.c = mj4Var;
    }

    @Override // og0
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= TLObject.FLAG_31;
        return this.c.g(null, this);
    }
}
