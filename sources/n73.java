// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class n73 extends gw2 {
    public v73 a;
    public fwa b;
    public boolean c;
    public /* synthetic */ Object d;
    public final /* synthetic */ v73 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n73(v73 v73Var, fw2 fw2Var) {
        super(fw2Var);
        this.e = v73Var;
    }

    @Override // of0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= TLObject.FLAG_31;
        return this.e.g(false, this);
    }
}
