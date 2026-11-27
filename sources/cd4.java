// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class cd4 extends ax2 {
    public ed4 a;
    public lc4 b;
    public boolean c;
    public /* synthetic */ Object d;
    public final /* synthetic */ ed4 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cd4(ed4 ed4Var, ax2 ax2Var) {
        super(ax2Var);
        this.e = ed4Var;
    }

    @Override // qf0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= TLObject.FLAG_31;
        return this.e.a(null, this);
    }
}
