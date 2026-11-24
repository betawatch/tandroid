// default package

import org.telegram.tgnet.TLObject;

/* loaded from: classes.dex */
public final class nk4 extends gw2 {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ tg2 c;
    public tg2 d;
    public ik4 e;
    public oo9 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nk4(tg2 tg2Var, fw2 fw2Var) {
        super(fw2Var);
        this.c = tg2Var;
    }

    @Override // of0
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= TLObject.FLAG_31;
        return this.c.h(null, this);
    }
}
