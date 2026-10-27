package db;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class a extends nd.c {
    public Object a;
    public le.a b;
    public /* synthetic */ Object c;
    public final /* synthetic */ d d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, nd.c cVar) {
        super(cVar);
        this.d = dVar;
    }

    @Override // nd.a
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= TLObject.FLAG_31;
        return this.d.c(this);
    }
}
