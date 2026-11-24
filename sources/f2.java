// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class f2 extends gw2 {
    public oo9 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ v39 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(v39 v39Var, fw2 fw2Var) {
        super(fw2Var);
        this.c = v39Var;
    }

    @Override // of0
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= TLObject.FLAG_31;
        return this.c.h(null, this);
    }
}
