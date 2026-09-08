package k1;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class y extends kd.c {
    public a0 a;
    public Object b;
    public Object c;
    public /* synthetic */ Object d;
    public final /* synthetic */ a0 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(a0 a0Var, kd.c cVar) {
        super(cVar);
        this.e = a0Var;
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= TLObject.FLAG_31;
        return this.e.i(null, null, this);
    }
}
