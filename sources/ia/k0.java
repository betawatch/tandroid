package ia;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class k0 extends tc.c {
    public l0 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ l0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(l0 l0Var, tc.c cVar) {
        super(cVar);
        this.c = l0Var;
    }

    @Override // tc.a
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= TLObject.FLAG_31;
        return l0.b(this.c, this);
    }
}
