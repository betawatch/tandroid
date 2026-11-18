package m1;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class x0 extends kd.c {
    public ab.c0 a;
    public ie.a b;
    public /* synthetic */ Object c;
    public final /* synthetic */ ab.c0 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(ab.c0 c0Var, kd.c cVar) {
        super(cVar);
        this.d = c0Var;
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= TLObject.FLAG_31;
        return this.d.L(this);
    }
}
