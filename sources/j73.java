// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class j73 extends gw2 {
    public Object a;
    public v73 b;
    public cp2 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ v73 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j73(v73 v73Var, gw2 gw2Var) {
        super(gw2Var);
        this.e = v73Var;
    }

    @Override // of0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= TLObject.FLAG_31;
        return this.e.d(null, this);
    }
}
