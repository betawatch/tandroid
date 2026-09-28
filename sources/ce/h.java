package ce;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
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
