// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class m69 extends gw2 {
    public nh7 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ n69 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m69(n69 n69Var, gw2 gw2Var) {
        super(gw2Var);
        this.c = n69Var;
    }

    @Override // of0
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= TLObject.FLAG_31;
        return this.c.a(this);
    }
}
