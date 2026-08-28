package kd;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class f extends sc.c {
    public g a;
    public /* synthetic */ Object b;
    public final /* synthetic */ g c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, sc.c cVar) {
        super(cVar);
        this.c = gVar;
    }

    @Override // sc.a
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= TLObject.FLAG_31;
        return this.c.c(null, this);
    }
}
