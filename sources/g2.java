// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class g2 extends ax2 {
    public gs9 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ k09 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(k09 k09Var, zw2 zw2Var) {
        super(zw2Var);
        this.c = k09Var;
    }

    @Override // qf0
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= TLObject.FLAG_31;
        return this.c.k(null, this);
    }
}
