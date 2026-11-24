// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class i83 extends qx2 {
    public e7a a;
    public /* synthetic */ Object b;
    public final /* synthetic */ e7a c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i83(e7a e7aVar, qx2 qx2Var) {
        super(qx2Var);
        this.c = e7aVar;
    }

    @Override // og0
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= TLObject.FLAG_31;
        return this.c.l(this);
    }
}
