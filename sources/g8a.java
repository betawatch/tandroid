// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class g8a extends gw2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ h8a b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g8a(h8a h8aVar, gw2 gw2Var) {
        super(gw2Var);
        this.b = h8aVar;
    }

    @Override // of0
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= TLObject.FLAG_31;
        return this.b.c(null, this);
    }
}
