package m1;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class r0 extends kd.c {
    public Object a;
    public Object b;
    public Object c;
    public /* synthetic */ Object d;
    public final /* synthetic */ t0 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(t0 t0Var, kd.c cVar) {
        super(cVar);
        this.e = t0Var;
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= TLObject.FLAG_31;
        return this.e.c(null, this);
    }
}
