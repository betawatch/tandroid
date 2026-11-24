// default package

import org.telegram.tgnet.TLObject;

/* loaded from: classes.dex */
public final class ok4 extends gw2 {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ lv6 c;
    public lv6 d;
    public ik4 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ok4(lv6 lv6Var, fw2 fw2Var) {
        super(fw2Var);
        this.c = lv6Var;
    }

    @Override // of0
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= TLObject.FLAG_31;
        return this.c.h(null, this);
    }
}
