package l1;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class o extends hd.c {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ db.z0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(db.z0 z0Var, fd.c cVar) {
        super(cVar);
        this.c = z0Var;
    }

    @Override // hd.a
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= TLObject.FLAG_31;
        return this.c.b(null, this);
    }
}
