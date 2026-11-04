package l1;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class i extends hd.c {
    public Object a;
    public Object b;
    public Object c;
    public kotlin.jvm.internal.r d;
    public b0 e;
    public /* synthetic */ Object f;
    public final /* synthetic */ j h;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, hd.c cVar) {
        super(cVar);
        this.h = jVar;
    }

    @Override // hd.a
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.n |= TLObject.FLAG_31;
        return this.h.a(null, this);
    }
}
