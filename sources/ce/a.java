package ce;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final class a extends kd.c {
    public de.g a;
    public /* synthetic */ Object b;
    public final /* synthetic */ xa.c c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(xa.c cVar, kd.c cVar2) {
        super(cVar2);
        this.c = cVar;
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= TLObject.FLAG_31;
        return this.c.u(null, this);
    }
}
