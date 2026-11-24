// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class f2 extends qx2 {
    public pq9 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ oo8 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(oo8 oo8Var, px2 px2Var) {
        super(px2Var);
        this.c = oo8Var;
    }

    @Override // og0
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= TLObject.FLAG_31;
        return this.c.g(null, this);
    }
}
