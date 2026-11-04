package l1;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class z extends hd.c {
    public kotlin.jvm.internal.p a;
    public /* synthetic */ Object b;
    public final /* synthetic */ b0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(b0 b0Var, hd.c cVar) {
        super(cVar);
        this.c = b0Var;
    }

    @Override // hd.a
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= TLObject.FLAG_31;
        return this.c.j(null, false, this);
    }
}
