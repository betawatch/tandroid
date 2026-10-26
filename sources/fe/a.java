package fe;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
