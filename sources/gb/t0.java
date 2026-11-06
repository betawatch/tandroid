package gb;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class t0 extends kd.c {
    public /* synthetic */ Object a;
    public final /* synthetic */ u0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(u0 u0Var, kd.c cVar) {
        super(cVar);
        this.b = u0Var;
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= TLObject.FLAG_31;
        return u0.a(this.b, this);
    }
}
