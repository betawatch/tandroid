package fe;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class a extends nd.c {
    public ge.g a;
    public /* synthetic */ Object b;
    public final /* synthetic */ a4.l c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(a4.l lVar, nd.c cVar) {
        super(cVar);
        this.c = lVar;
    }

    @Override // nd.a
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= TLObject.FLAG_31;
        return this.c.C(null, this);
    }
}
