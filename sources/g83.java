// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class g83 extends ax2 {
    public o83 a;
    public i0b b;
    public boolean c;
    public /* synthetic */ Object d;
    public final /* synthetic */ o83 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g83(o83 o83Var, zw2 zw2Var) {
        super(zw2Var);
        this.e = o83Var;
    }

    @Override // qf0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= TLObject.FLAG_31;
        return this.e.g(false, this);
    }
}
