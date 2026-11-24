// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class jo5 extends gw2 {
    public Object a;
    public /* synthetic */ Object b;
    public final /* synthetic */ cff c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jo5(cff cffVar, gw2 gw2Var) {
        super(gw2Var);
        this.c = cffVar;
    }

    @Override // of0
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= TLObject.FLAG_31;
        return this.c.A(null, this);
    }
}
