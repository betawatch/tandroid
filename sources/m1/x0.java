package m1;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
