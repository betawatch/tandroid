package ce;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class a extends kd.c {
    public de.g a;
    public /* synthetic */ Object b;
    public final /* synthetic */ a4.m c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(a4.m mVar, kd.c cVar) {
        super(cVar);
        this.c = mVar;
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= TLObject.FLAG_31;
        return this.c.z(null, this);
    }
}
