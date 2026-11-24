// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class gb4 extends gw2 {
    public hb4 a;
    public Object b;
    public Object c;
    public sb4 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ hb4 f;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gb4(hb4 hb4Var, gw2 gw2Var) {
        super(gw2Var);
        this.f = hb4Var;
    }

    @Override // of0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.h |= TLObject.FLAG_31;
        return this.f.b(null, this);
    }
}
