// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class h8a extends qx2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ i8a b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h8a(i8a i8aVar, qx2 qx2Var) {
        super(qx2Var);
        this.b = i8aVar;
    }

    @Override // og0
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= TLObject.FLAG_31;
        return this.b.a(this);
    }
}
