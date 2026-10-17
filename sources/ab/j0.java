package ab;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public final class j0 extends md.c {
    public k0 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ k0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(k0 k0Var, md.c cVar) {
        super(cVar);
        this.c = k0Var;
    }

    @Override // md.a
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= TLObject.FLAG_31;
        return k0.b(this.c, this);
    }
}
