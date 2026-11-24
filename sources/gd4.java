// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class gd4 extends qx2 {
    public hd4 a;
    public Object b;
    public Object c;
    public sd4 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ hd4 f;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gd4(hd4 hd4Var, qx2 qx2Var) {
        super(qx2Var);
        this.f = hd4Var;
    }

    @Override // og0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.h |= TLObject.FLAG_31;
        return this.f.b(null, this);
    }
}
