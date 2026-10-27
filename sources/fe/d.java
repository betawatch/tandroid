package fe;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class d extends nd.c {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ rf.b c;
    public rf.b d;
    public c e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(rf.b bVar, nd.c cVar) {
        super(cVar);
        this.c = bVar;
    }

    @Override // nd.a
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= TLObject.FLAG_31;
        return this.c.C(null, this);
    }
}
