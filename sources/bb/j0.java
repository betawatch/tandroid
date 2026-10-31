package bb;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class j0 extends ed.c {
    public k0 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ k0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(k0 k0Var, ed.c cVar) {
        super(cVar);
        this.c = k0Var;
    }

    @Override // ed.a
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= TLObject.FLAG_31;
        return k0.b(this.c, this);
    }
}
