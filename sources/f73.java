// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class f73 extends gw2 {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ g73 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f73(g73 g73Var, fw2 fw2Var) {
        super(fw2Var);
        this.c = g73Var;
    }

    @Override // of0
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= TLObject.FLAG_31;
        return this.c.c(null, this);
    }
}
