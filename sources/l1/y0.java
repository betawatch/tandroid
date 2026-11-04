package l1;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class y0 extends hd.c {
    public za.p a;
    public fe.a b;
    public /* synthetic */ Object c;
    public final /* synthetic */ za.p d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(za.p pVar, hd.c cVar) {
        super(cVar);
        this.d = pVar;
    }

    @Override // hd.a
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= TLObject.FLAG_31;
        return this.d.A(this);
    }
}
