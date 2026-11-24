// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class f93 extends qx2 {
    public c79 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ h93 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f93(h93 h93Var, qx2 qx2Var) {
        super(qx2Var);
        this.c = h93Var;
    }

    @Override // og0
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= TLObject.FLAG_31;
        return this.c.i(null, false, this);
    }
}
