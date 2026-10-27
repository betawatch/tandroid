package db;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class i extends nd.c {
    public /* synthetic */ Object a;
    public final /* synthetic */ k b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k kVar, nd.c cVar) {
        super(cVar);
        this.b = kVar;
    }

    @Override // nd.a
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= TLObject.FLAG_31;
        return this.b.c(null, null, this);
    }
}
