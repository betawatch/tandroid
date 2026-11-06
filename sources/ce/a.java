package ce;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class a extends kd.c {
    public de.h a;
    public /* synthetic */ Object b;
    public final /* synthetic */ d6.i c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d6.i iVar, kd.c cVar) {
        super(cVar);
        this.c = iVar;
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= TLObject.FLAG_31;
        return this.c.B(null, this);
    }
}
