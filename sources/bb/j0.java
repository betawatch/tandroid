package bb;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class j0 extends nd.c {
    public k0 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ k0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(k0 k0Var, nd.c cVar) {
        super(cVar);
        this.c = k0Var;
    }

    @Override // nd.a
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= TLObject.FLAG_31;
        return k0.b(this.c, this);
    }
}
