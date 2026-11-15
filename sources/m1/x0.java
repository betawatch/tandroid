package m1;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
        return this.d.I(this);
    }
}
