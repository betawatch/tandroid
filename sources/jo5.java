// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
