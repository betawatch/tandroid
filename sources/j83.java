// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class j83 extends qx2 {
    public Object a;
    public Object b;
    public Object c;
    public e79 d;
    public h93 e;
    public /* synthetic */ Object f;
    public final /* synthetic */ k83 h;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j83(k83 k83Var, qx2 qx2Var) {
        super(qx2Var);
        this.h = k83Var;
    }

    @Override // og0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.n |= TLObject.FLAG_31;
        return this.h.a(null, this);
    }
}
