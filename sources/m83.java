// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class m83 extends ax2 {
    public n89 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ o83 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m83(o83 o83Var, ax2 ax2Var) {
        super(ax2Var);
        this.c = o83Var;
    }

    @Override // qf0
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= TLObject.FLAG_31;
        return this.c.i(null, false, this);
    }
}
