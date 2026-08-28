package kd;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class h extends sc.c {
    public i a;
    public Object b;
    public /* synthetic */ Object c;
    public final /* synthetic */ i d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, sc.c cVar) {
        super(cVar);
        this.d = iVar;
    }

    @Override // sc.a
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= TLObject.FLAG_31;
        return this.d.c(null, this);
    }
}
