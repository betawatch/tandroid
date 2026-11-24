// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class eo9 extends gw2 {
    public c5a a;
    public nh7 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ c5a d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eo9(c5a c5aVar, gw2 gw2Var) {
        super(gw2Var);
        this.d = c5aVar;
    }

    @Override // of0
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= TLObject.FLAG_31;
        return this.d.M(this);
    }
}
