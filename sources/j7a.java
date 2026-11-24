// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class j7a extends gw2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ k7a b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j7a(k7a k7aVar, gw2 gw2Var) {
        super(gw2Var);
        this.b = k7aVar;
    }

    @Override // of0
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= TLObject.FLAG_31;
        return this.b.b(this);
    }
}
