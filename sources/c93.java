// default package

import java.io.Serializable;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class c93 extends qx2 {
    public Object a;
    public Object b;
    public Serializable c;
    public e79 d;
    public boolean e;
    public int f;
    public /* synthetic */ Object h;
    public final /* synthetic */ h93 n;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c93(h93 h93Var, qx2 qx2Var) {
        super(qx2Var);
        this.n = h93Var;
    }

    @Override // og0
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.r |= TLObject.FLAG_31;
        return this.n.h(false, this);
    }
}
