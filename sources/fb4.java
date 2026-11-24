// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class fb4 extends gw2 {
    public hb4 a;
    public oa4 b;
    public boolean c;
    public /* synthetic */ Object d;
    public final /* synthetic */ hb4 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fb4(hb4 hb4Var, gw2 gw2Var) {
        super(gw2Var);
        this.e = hb4Var;
    }

    @Override // of0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= TLObject.FLAG_31;
        return this.e.a(null, this);
    }
}
