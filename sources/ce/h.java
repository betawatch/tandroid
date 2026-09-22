package ce;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class h extends kd.c {
    public i a;
    public Object b;
    public /* synthetic */ Object c;
    public final /* synthetic */ i d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, kd.c cVar) {
        super(cVar);
        this.d = iVar;
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= TLObject.FLAG_31;
        return this.d.a(null, this);
    }
}
