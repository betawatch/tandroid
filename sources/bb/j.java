package bb;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final class j extends kd.c {
    public /* synthetic */ Object a;
    public final /* synthetic */ l b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l lVar, kd.c cVar) {
        super(cVar);
        this.b = lVar;
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= TLObject.FLAG_31;
        return this.b.c(null, null, this);
    }
}
