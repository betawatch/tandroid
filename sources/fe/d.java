package fe;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
