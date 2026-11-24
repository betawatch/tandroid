// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
