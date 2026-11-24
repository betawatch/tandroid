// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class jya extends qx2 {
    public kya a;
    public jm4 b;
    public lya c;
    public av5 d;
    public Object e;
    public /* synthetic */ Object f;
    public final /* synthetic */ kya h;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jya(kya kyaVar, px2 px2Var) {
        super(px2Var);
        this.h = kyaVar;
    }

    @Override // og0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.n |= TLObject.FLAG_31;
        this.h.g(null, this);
        return ly2.a;
    }
}
