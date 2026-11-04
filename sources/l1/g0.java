package l1;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class g0 extends hd.c {
    public i0 a;
    public d0 b;
    public boolean c;
    public /* synthetic */ Object d;
    public final /* synthetic */ i0 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(i0 i0Var, hd.c cVar) {
        super(cVar);
        this.e = i0Var;
    }

    @Override // hd.a
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= TLObject.FLAG_31;
        return this.e.a(null, this);
    }
}
