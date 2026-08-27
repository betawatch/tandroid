package ia;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class i0 extends tc.c {
    public /* synthetic */ Object a;
    public final /* synthetic */ l0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(l0 l0Var, tc.c cVar) {
        super(cVar);
        this.b = l0Var;
    }

    @Override // tc.a
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= TLObject.FLAG_31;
        return l0.a(this.b, this);
    }
}
