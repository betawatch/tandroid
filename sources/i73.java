// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class i73 extends gw2 {
    public v73 a;
    public nh7 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ v73 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i73(v73 v73Var, gw2 gw2Var) {
        super(gw2Var);
        this.d = v73Var;
    }

    @Override // of0
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= TLObject.FLAG_31;
        return this.d.b(this);
    }
}
