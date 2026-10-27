package bb;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class h0 extends nd.c {
    public /* synthetic */ Object a;
    public final /* synthetic */ k0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(k0 k0Var, nd.c cVar) {
        super(cVar);
        this.b = k0Var;
    }

    @Override // nd.a
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= TLObject.FLAG_31;
        return k0.a(this.b, this);
    }
}
